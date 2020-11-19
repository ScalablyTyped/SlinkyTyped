package typingsSlinky.got.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelError
  extends StdError
     with GotError {
  
  @JSName("name")
  var name_CancelError: typingsSlinky.got.gotStrings.CancelError = js.native
}
object CancelError {
  
  @scala.inline
  def apply(message: String, name: typingsSlinky.got.gotStrings.CancelError): CancelError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelError]
  }
  
  @scala.inline
  implicit class CancelErrorOps[Self <: CancelError] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.got.gotStrings.CancelError): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
