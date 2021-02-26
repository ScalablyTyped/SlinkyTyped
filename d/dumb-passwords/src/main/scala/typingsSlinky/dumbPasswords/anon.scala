package typingsSlinky.dumbPasswords

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Frequency extends StObject {
    
    var frequency: Double = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var password: String = js.native
  }
  object Frequency {
    
    @scala.inline
    def apply(frequency: Double, password: String): Frequency = {
      val __obj = js.Dynamic.literal(frequency = frequency.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[Frequency]
    }
    
    @scala.inline
    implicit class FrequencyMutableBuilder[Self <: Frequency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
}
