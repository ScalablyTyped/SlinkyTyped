package typingsSlinky.parameter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateError extends js.Object {
  
  var code: String = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var message: String = js.native
}
object ValidateError {
  
  @scala.inline
  def apply(code: String, message: String): ValidateError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateError]
  }
  
  @scala.inline
  implicit class ValidateErrorOps[Self <: ValidateError] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
  }
}
