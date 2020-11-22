package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteSpecHttp2Route extends js.Object {
  
  /**
    * The action to take if a match is determined.
    */
  var action: Input[GatewayRouteSpecHttp2RouteAction] = js.native
  
  /**
    * The criteria for determining a request match.
    */
  var `match`: Input[GatewayRouteSpecHttp2RouteMatch] = js.native
}
object GatewayRouteSpecHttp2Route {
  
  @scala.inline
  def apply(action: Input[GatewayRouteSpecHttp2RouteAction], `match`: Input[GatewayRouteSpecHttp2RouteMatch]): GatewayRouteSpecHttp2Route = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttp2Route]
  }
  
  @scala.inline
  implicit class GatewayRouteSpecHttp2RouteOps[Self <: GatewayRouteSpecHttp2Route] (val x: Self) extends AnyVal {
    
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
    def setAction(value: Input[GatewayRouteSpecHttp2RouteAction]): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: Input[GatewayRouteSpecHttp2RouteMatch]): Self = this.set("match", value.asInstanceOf[js.Any])
  }
}
