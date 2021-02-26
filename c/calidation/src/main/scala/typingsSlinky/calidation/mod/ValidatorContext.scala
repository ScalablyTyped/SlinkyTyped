package typingsSlinky.calidation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatorContext[T /* <: js.Object */] extends StObject {
  
  var errors: Errors[T] = js.native
  
  var fields: Fields[T] = js.native
  
  var isDirty: Boolean = js.native
}
object ValidatorContext {
  
  @scala.inline
  def apply[T /* <: js.Object */](errors: Errors[T], fields: Fields[T], isDirty: Boolean): ValidatorContext[T] = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorContext[T]]
  }
  
  @scala.inline
  implicit class ValidatorContextMutableBuilder[Self <: ValidatorContext[_], T /* <: js.Object */] (val x: Self with ValidatorContext[T]) extends AnyVal {
    
    @scala.inline
    def setErrors(value: Errors[T]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: Fields[T]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirty(value: Boolean): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
  }
}
