package typingsSlinky.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualRouterSpecListener extends js.Object {
  
  /**
    * The port mapping information for the listener.
    */
  var portMapping: VirtualRouterSpecListenerPortMapping = js.native
}
object VirtualRouterSpecListener {
  
  @scala.inline
  def apply(portMapping: VirtualRouterSpecListenerPortMapping): VirtualRouterSpecListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterSpecListener]
  }
  
  @scala.inline
  implicit class VirtualRouterSpecListenerOps[Self <: VirtualRouterSpecListener] (val x: Self) extends AnyVal {
    
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
    def setPortMapping(value: VirtualRouterSpecListenerPortMapping): Self = this.set("portMapping", value.asInstanceOf[js.Any])
  }
}
