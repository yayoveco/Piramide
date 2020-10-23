
package piramide;

import java.util.Scanner;


public class Piramide {

  
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        qw q=new qw();
        int op=0;
        
        do{
            System.out.println("1.-Suma \n"
                    + "2.-Resta  \n"
                    + "3.-Salir");
            
            op=l.nextInt();
            
            switch(op){
                case 1:
                    q.suma(5,5);
                    break;
                    
                case 2:
                    q.resta(5,5);
                    break;
            }
            
        }while(op!=3);
        
    }
    
}
