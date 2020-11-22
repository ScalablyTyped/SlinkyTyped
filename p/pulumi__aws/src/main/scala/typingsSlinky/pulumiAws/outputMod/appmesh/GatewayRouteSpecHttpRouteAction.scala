package typingsSlinky.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteSpecHttpRouteAction extends js.Object {
  
  /**
    * The target that traffic is routed to when a request matches the gateway route.
    */
  var target: GatewayRouteSpecHttpRouteActionTarget = js.native
}
object GatewayRouteSpecHttpRouteAction {
  
  @scala.inline
  def apply(target: GatewayRouteSpecHttpRouteActionTarget): GatewayRouteSpecHttpRouteAction = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttpRouteAction]
  }
  
  @scala.inline
  implicit class GatewayRouteSpecHttpRouteActionOps[Self <: GatewayRouteSpecHttpRouteAction] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: GatewayRouteSpecHttpRouteActionTarget): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
