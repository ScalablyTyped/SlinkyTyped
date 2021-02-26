package typingsSlinky.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecGrpcRoute extends StObject {
  
  /**
    * The action to take if a match is determined.
    */
  var action: RouteSpecGrpcRouteAction = js.native
  
  /**
    * The criteria for determining an gRPC request match.
    */
  var `match`: RouteSpecGrpcRouteMatch = js.native
  
  /**
    * The retry policy.
    */
  var retryPolicy: js.UndefOr[RouteSpecGrpcRouteRetryPolicy] = js.native
  
  /**
    * The types of timeouts.
    */
  var timeout: js.UndefOr[RouteSpecGrpcRouteTimeout] = js.native
}
object RouteSpecGrpcRoute {
  
  @scala.inline
  def apply(action: RouteSpecGrpcRouteAction, `match`: RouteSpecGrpcRouteMatch): RouteSpecGrpcRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecGrpcRoute]
  }
  
  @scala.inline
  implicit class RouteSpecGrpcRouteMutableBuilder[Self <: RouteSpecGrpcRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: RouteSpecGrpcRouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: RouteSpecGrpcRouteMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryPolicy(value: RouteSpecGrpcRouteRetryPolicy): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    @scala.inline
    def setTimeout(value: RouteSpecGrpcRouteTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
