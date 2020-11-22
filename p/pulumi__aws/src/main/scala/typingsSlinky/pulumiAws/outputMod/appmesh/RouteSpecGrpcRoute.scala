package typingsSlinky.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecGrpcRoute extends js.Object {
  
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
  implicit class RouteSpecGrpcRouteOps[Self <: RouteSpecGrpcRoute] (val x: Self) extends AnyVal {
    
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
    def setAction(value: RouteSpecGrpcRouteAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: RouteSpecGrpcRouteMatch): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryPolicy(value: RouteSpecGrpcRouteRetryPolicy): Self = this.set("retryPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryPolicy: Self = this.set("retryPolicy", js.undefined)
    
    @scala.inline
    def setTimeout(value: RouteSpecGrpcRouteTimeout): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
