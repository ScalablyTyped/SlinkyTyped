package typingsSlinky.devtoolsProtocol.mod.Protocol.Emulation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetDocumentCookieDisabledRequest extends js.Object {
  
  /**
    * Whether document.coookie API should be disabled.
    */
  var disabled: Boolean = js.native
}
object SetDocumentCookieDisabledRequest {
  
  @scala.inline
  def apply(disabled: Boolean): SetDocumentCookieDisabledRequest = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDocumentCookieDisabledRequest]
  }
  
  @scala.inline
  implicit class SetDocumentCookieDisabledRequestOps[Self <: SetDocumentCookieDisabledRequest] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
  }
}
