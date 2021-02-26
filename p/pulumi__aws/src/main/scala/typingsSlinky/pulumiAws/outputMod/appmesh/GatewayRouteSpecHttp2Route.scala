package typingsSlinky.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayRouteSpecHttp2Route extends StObject {
  
  /**
    * The action to take if a match is determined.
    */
  var action: GatewayRouteSpecHttp2RouteAction = js.native
  
  /**
    * The criteria for determining a request match.
    */
  var `match`: GatewayRouteSpecHttp2RouteMatch = js.native
}
object GatewayRouteSpecHttp2Route {
  
  @scala.inline
  def apply(action: GatewayRouteSpecHttp2RouteAction, `match`: GatewayRouteSpecHttp2RouteMatch): GatewayRouteSpecHttp2Route = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayRouteSpecHttp2Route]
  }
  
  @scala.inline
  implicit class GatewayRouteSpecHttp2RouteMutableBuilder[Self <: GatewayRouteSpecHttp2Route] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: GatewayRouteSpecHttp2RouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: GatewayRouteSpecHttp2RouteMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
  }
}
