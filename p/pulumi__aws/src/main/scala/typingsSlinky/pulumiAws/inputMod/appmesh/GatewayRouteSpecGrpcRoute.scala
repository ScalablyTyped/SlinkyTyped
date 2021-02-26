package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteSpecGrpcRoute extends StObject {
  
  /**
    * The action to take if a match is determined.
    */
  var action: Input[GatewayRouteSpecGrpcRouteAction] = js.native
  
  /**
    * The criteria for determining a request match.
    */
  var `match`: Input[GatewayRouteSpecGrpcRouteMatch] = js.native
}
object GatewayRouteSpecGrpcRoute {
  
  @scala.inline
  def apply(action: Input[GatewayRouteSpecGrpcRouteAction], `match`: Input[GatewayRouteSpecGrpcRouteMatch]): GatewayRouteSpecGrpcRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecGrpcRoute]
  }
  
  @scala.inline
  implicit class GatewayRouteSpecGrpcRouteMutableBuilder[Self <: GatewayRouteSpecGrpcRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Input[GatewayRouteSpecGrpcRouteAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: Input[GatewayRouteSpecGrpcRouteMatch]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
  }
}
