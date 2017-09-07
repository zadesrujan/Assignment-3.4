package assignment4;
//package : Package is name that organizes a set of related classes and interfaces similar to 
//different folders on my computer
public class Typecasting {
//public : members which can access as public,public members are visible to all other classes.
//class : is a context of java that are used to create objects and to define object data types and methods.
	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		short s = 50;
		byte b = 30;
		int I = (int)s + (int)b;
	//the value of short and byte are converted into int by using casting and these values are added,
	//then value is assigned to I
				
		System.out.println("value of int I is  "+I);
		long L = (long)I + (long)s;
	//the values of int and short are converted into long by using casting and these values are added,
	//then the value is assigned to the variable of long that is L.	
		
		System.out.println("value of long L is  "+L);
		float F = (float)I + (float)L;  
	//the values of long and int are converted into float by using casting and these values are added,
	//then the value is assigned to the variable of float that is F.
		
		System.out.println("value of float F is  "+F);
		double D =(double)F + (double)L;
	//the values of float and long are converted into long by using casting and these values are added,
	//then the value is assigned to the value of double that is D.
		
		System.out.println("value of double D is  "+D);
	}

}
