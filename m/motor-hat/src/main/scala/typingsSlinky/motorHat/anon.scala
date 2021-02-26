package typingsSlinky.motorHat

import typingsSlinky.motorHat.mod.Motor
import typingsSlinky.motorHat.mod.MotorPins
import typingsSlinky.motorHat.mod.PinDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait M1 extends StObject {
    
    var M1: MotorPins = js.native
    
    var M2: MotorPins = js.native
    
    var M3: MotorPins = js.native
    
    var M4: MotorPins = js.native
  }
  object M1 {
    
    @scala.inline
    def apply(M1: MotorPins, M2: MotorPins, M3: MotorPins, M4: MotorPins): M1 = {
      val __obj = js.Dynamic.literal(M1 = M1.asInstanceOf[js.Any], M2 = M2.asInstanceOf[js.Any], M3 = M3.asInstanceOf[js.Any], M4 = M4.asInstanceOf[js.Any])
      __obj.asInstanceOf[M1]
    }
    
    @scala.inline
    implicit class M1MutableBuilder[Self <: M1] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setM1(value: MotorPins): Self = StObject.set(x, "M1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM2(value: MotorPins): Self = StObject.set(x, "M2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM3(value: MotorPins): Self = StObject.set(x, "M3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM4(value: MotorPins): Self = StObject.set(x, "M4", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait W1 extends StObject {
    
    /**
      * Pin definition for winding 1 of the stepper
      */
    var W1: PinDefinition = js.native
    
    /**
      * Pin definition for winding 2 of the stepper
      */
    var W2: PinDefinition = js.native
  }
  object W1 {
    
    @scala.inline
    def apply(W1: PinDefinition, W2: PinDefinition): W1 = {
      val __obj = js.Dynamic.literal(W1 = W1.asInstanceOf[js.Any], W2 = W2.asInstanceOf[js.Any])
      __obj.asInstanceOf[W1]
    }
    
    @scala.inline
    implicit class W1MutableBuilder[Self <: W1] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setW1(value: PinDefinition): Self = StObject.set(x, "W1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW1Varargs(value: Double*): Self = StObject.set(x, "W1", js.Array(value :_*))
      
      @scala.inline
      def setW2(value: PinDefinition): Self = StObject.set(x, "W2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW2Varargs(value: Double*): Self = StObject.set(x, "W2", js.Array(value :_*))
    }
  }
  
  @js.native
  trait W2 extends StObject {
    
    var W1: Motor = js.native
    
    var W2: Motor = js.native
  }
  object W2 {
    
    @scala.inline
    def apply(W1: Motor, W2: Motor): W2 = {
      val __obj = js.Dynamic.literal(W1 = W1.asInstanceOf[js.Any], W2 = W2.asInstanceOf[js.Any])
      __obj.asInstanceOf[W2]
    }
    
    @scala.inline
    implicit class W2MutableBuilder[Self <: W2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setW1(value: Motor): Self = StObject.set(x, "W1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW2(value: Motor): Self = StObject.set(x, "W2", value.asInstanceOf[js.Any])
    }
  }
}
