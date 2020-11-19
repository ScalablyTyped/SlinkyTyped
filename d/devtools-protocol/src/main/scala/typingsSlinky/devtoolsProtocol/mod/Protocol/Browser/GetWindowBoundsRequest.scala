package typingsSlinky.devtoolsProtocol.mod.Protocol.Browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWindowBoundsRequest extends js.Object {
  
  /**
    * Browser window id.
    */
  var windowId: WindowID = js.native
}
object GetWindowBoundsRequest {
  
  @scala.inline
  def apply(windowId: WindowID): GetWindowBoundsRequest = {
    val __obj = js.Dynamic.literal(windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWindowBoundsRequest]
  }
  
  @scala.inline
  implicit class GetWindowBoundsRequestOps[Self <: GetWindowBoundsRequest] (val x: Self) extends AnyVal {
    
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
    def setWindowId(value: WindowID): Self = this.set("windowId", value.asInstanceOf[js.Any])
  }
}
