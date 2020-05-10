package typingsSlinky.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecTcpRouteAction extends js.Object {
  /**
    * The targets that traffic is routed to when a request matches the route.
    * You can specify one or more targets and their relative weights with which to distribute traffic.
    */
  var weightedTargets: js.Array[RouteSpecTcpRouteActionWeightedTarget] = js.native
}

object RouteSpecTcpRouteAction {
  @scala.inline
  def apply(weightedTargets: js.Array[RouteSpecTcpRouteActionWeightedTarget]): RouteSpecTcpRouteAction = {
    val __obj = js.Dynamic.literal(weightedTargets = weightedTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecTcpRouteAction]
  }
  @scala.inline
  implicit class RouteSpecTcpRouteActionOps[Self <: RouteSpecTcpRouteAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWeightedTargets(value: js.Array[RouteSpecTcpRouteActionWeightedTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightedTargets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

