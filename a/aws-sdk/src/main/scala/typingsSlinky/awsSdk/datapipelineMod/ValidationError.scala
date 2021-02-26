package typingsSlinky.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationError extends StObject {
  
  /**
    * A description of the validation error.
    */
  var errors: js.UndefOr[validationMessages] = js.native
  
  /**
    * The identifier of the object that contains the validation error.
    */
  var id: js.UndefOr[typingsSlinky.awsSdk.datapipelineMod.id] = js.native
}
object ValidationError {
  
  @scala.inline
  def apply(): ValidationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationError]
  }
  
  @scala.inline
  implicit class ValidationErrorMutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: validationMessages): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: validationMessage*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setId(value: id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
