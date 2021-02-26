package typingsSlinky.jqueryValidationUnobtrusive

import typingsSlinky.jqueryValidationUnobtrusive.MicrosoftJQueryUnobtrusiveValidation.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryValidation {
  
  @js.native
  trait ValidatorStatic extends StObject {
    
    var unobtrusive: Validator = js.native
  }
  object ValidatorStatic {
    
    @scala.inline
    def apply(unobtrusive: Validator): ValidatorStatic = {
      val __obj = js.Dynamic.literal(unobtrusive = unobtrusive.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidatorStatic]
    }
    
    @scala.inline
    implicit class ValidatorStaticMutableBuilder[Self <: ValidatorStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnobtrusive(value: Validator): Self = StObject.set(x, "unobtrusive", value.asInstanceOf[js.Any])
    }
  }
}
