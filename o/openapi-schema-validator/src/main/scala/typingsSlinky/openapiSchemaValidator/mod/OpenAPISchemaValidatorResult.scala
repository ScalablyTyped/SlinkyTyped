package typingsSlinky.openapiSchemaValidator.mod

import typingsSlinky.ajv.mod.ErrorObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenAPISchemaValidatorResult extends js.Object {
  
  var errors: js.Array[ErrorObject] = js.native
}
object OpenAPISchemaValidatorResult {
  
  @scala.inline
  def apply(errors: js.Array[ErrorObject]): OpenAPISchemaValidatorResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPISchemaValidatorResult]
  }
  
  @scala.inline
  implicit class OpenAPISchemaValidatorResultOps[Self <: OpenAPISchemaValidatorResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorsVarargs(value: ErrorObject*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[ErrorObject]): Self = this.set("errors", value.asInstanceOf[js.Any])
  }
}
