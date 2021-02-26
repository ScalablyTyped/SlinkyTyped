package typingsSlinky.roll

import typingsSlinky.roll.anon.Quantity
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("roll", JSImport.Namespace)
  @js.native
  class ^ () extends Roll {
    def this(seed: js.Function0[Double]) = this()
  }
  
  @js.native
  trait InvalidInputError extends Error {
    
    @JSName("name")
    var name_InvalidInputError: typingsSlinky.roll.rollStrings.InvalidInputError = js.native
  }
  object InvalidInputError {
    
    /* static member */
    @JSImport("roll", "InvalidInputError")
    @js.native
    val ^ : InvalidInputError = js.native
    
    @scala.inline
    implicit class InvalidInputErrorMutableBuilder[Self <: InvalidInputError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.roll.rollStrings.InvalidInputError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Roll extends StObject {
    
    /**
      * Parse a string into a roll object
      * @throws InvalidInputError
      */
    def parse(input: String): Quantity = js.native
    
    /**
      * Roll based on a string or roll object
      */
    def roll(input: String): RollOutput = js.native
    def roll(input: RollObject): RollOutput = js.native
    
    /**
      * Validate user input
      */
    def validate(input: String): Boolean = js.native
  }
  
  @js.native
  trait RollObject extends StObject {
    
    var quantity: Double = js.native
    
    var sides: Double = js.native
    
    var transformations: js.Array[RollTransformation] = js.native
  }
  object RollObject {
    
    @scala.inline
    def apply(quantity: Double, sides: Double, transformations: js.Array[RollTransformation]): RollObject = {
      val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any], transformations = transformations.asInstanceOf[js.Any])
      __obj.asInstanceOf[RollObject]
    }
    
    @scala.inline
    implicit class RollObjectMutableBuilder[Self <: RollObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSides(value: Double): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformations(value: js.Array[RollTransformation]): Self = StObject.set(x, "transformations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformationsVarargs(value: RollTransformation*): Self = StObject.set(x, "transformations", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RollOutput extends StObject {
    
    var calculations: js.Array[Double] = js.native
    
    var input: RollObject = js.native
    
    var result: Double = js.native
    
    var rolled: js.Array[Double] = js.native
  }
  object RollOutput {
    
    @scala.inline
    def apply(calculations: js.Array[Double], input: RollObject, result: Double, rolled: js.Array[Double]): RollOutput = {
      val __obj = js.Dynamic.literal(calculations = calculations.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], rolled = rolled.asInstanceOf[js.Any])
      __obj.asInstanceOf[RollOutput]
    }
    
    @scala.inline
    implicit class RollOutputMutableBuilder[Self <: RollOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalculations(value: js.Array[Double]): Self = StObject.set(x, "calculations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalculationsVarargs(value: Double*): Self = StObject.set(x, "calculations", js.Array(value :_*))
      
      @scala.inline
      def setInput(value: RollObject): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: Double): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolled(value: js.Array[Double]): Self = StObject.set(x, "rolled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolledVarargs(value: Double*): Self = StObject.set(x, "rolled", js.Array(value :_*))
    }
  }
  
  type RollTransformation = RollTransformationKey | (js.Tuple2[RollTransformationKey, Double]) | (js.Function1[/* results */ js.Array[Double], js.Array[Double]])
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.roll.rollStrings.sum
    - typingsSlinky.roll.rollStrings.add
    - typingsSlinky.roll.rollStrings.subtract
    - typingsSlinky.roll.rollStrings.multiply
    - typingsSlinky.roll.rollStrings.divide
    - typingsSlinky.roll.rollStrings.`best-of`
    - typingsSlinky.roll.rollStrings.`worst-of`
  */
  trait RollTransformationKey extends StObject
  object RollTransformationKey {
    
    @scala.inline
    def add: typingsSlinky.roll.rollStrings.add = "add".asInstanceOf[typingsSlinky.roll.rollStrings.add]
    
    @scala.inline
    def `best-of`: typingsSlinky.roll.rollStrings.`best-of` = "best-of".asInstanceOf[typingsSlinky.roll.rollStrings.`best-of`]
    
    @scala.inline
    def divide: typingsSlinky.roll.rollStrings.divide = "divide".asInstanceOf[typingsSlinky.roll.rollStrings.divide]
    
    @scala.inline
    def multiply: typingsSlinky.roll.rollStrings.multiply = "multiply".asInstanceOf[typingsSlinky.roll.rollStrings.multiply]
    
    @scala.inline
    def subtract: typingsSlinky.roll.rollStrings.subtract = "subtract".asInstanceOf[typingsSlinky.roll.rollStrings.subtract]
    
    @scala.inline
    def sum: typingsSlinky.roll.rollStrings.sum = "sum".asInstanceOf[typingsSlinky.roll.rollStrings.sum]
    
    @scala.inline
    def `worst-of`: typingsSlinky.roll.rollStrings.`worst-of` = "worst-of".asInstanceOf[typingsSlinky.roll.rollStrings.`worst-of`]
  }
}
