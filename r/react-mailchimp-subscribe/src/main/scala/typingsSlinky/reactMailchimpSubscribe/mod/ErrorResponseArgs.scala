package typingsSlinky.reactMailchimpSubscribe.mod

import typingsSlinky.reactMailchimpSubscribe.reactMailchimpSubscribeStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorResponseArgs extends ResponseArgs {
  
  var message: String | js.Error = js.native
  
  var status: error = js.native
}
object ErrorResponseArgs {
  
  @scala.inline
  def apply(message: String | js.Error, status: error): ErrorResponseArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResponseArgs]
  }
  
  @scala.inline
  implicit class ErrorResponseArgsOps[Self <: ErrorResponseArgs] (val x: Self) extends AnyVal {
    
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
    def setMessageError(value: js.Error): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String | js.Error): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: error): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
