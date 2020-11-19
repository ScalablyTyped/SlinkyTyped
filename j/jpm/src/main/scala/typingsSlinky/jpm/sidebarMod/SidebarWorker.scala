package typingsSlinky.jpm.sidebarMod

import typingsSlinky.jpm.FFAddonSDK.Port
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SidebarWorker extends js.Object {
  
  var port: Port = js.native
}
object SidebarWorker {
  
  @scala.inline
  def apply(port: Port): SidebarWorker = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarWorker]
  }
  
  @scala.inline
  implicit class SidebarWorkerOps[Self <: SidebarWorker] (val x: Self) extends AnyVal {
    
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
    def setPort(value: Port): Self = this.set("port", value.asInstanceOf[js.Any])
  }
}
