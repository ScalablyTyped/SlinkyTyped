package typingsSlinky.devtoolsProtocol.mod.Protocol.Emulation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetFocusEmulationEnabledRequest extends js.Object {
  
  /**
    * Whether to enable to disable focus emulation.
    */
  var enabled: Boolean = js.native
}
object SetFocusEmulationEnabledRequest {
  
  @scala.inline
  def apply(enabled: Boolean): SetFocusEmulationEnabledRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFocusEmulationEnabledRequest]
  }
  
  @scala.inline
  implicit class SetFocusEmulationEnabledRequestOps[Self <: SetFocusEmulationEnabledRequest] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
  }
}
