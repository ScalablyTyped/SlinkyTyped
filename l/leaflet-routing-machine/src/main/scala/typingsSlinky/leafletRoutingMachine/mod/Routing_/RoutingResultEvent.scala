package typingsSlinky.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoutingResultEvent extends js.Object {
  var routes: js.Array[IRoute] = js.native
  var waypoints: js.Array[Waypoint_] = js.native
}

object RoutingResultEvent {
  @scala.inline
  def apply(routes: js.Array[IRoute], waypoints: js.Array[Waypoint_]): RoutingResultEvent = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingResultEvent]
  }
  @scala.inline
  implicit class RoutingResultEventOps[Self <: RoutingResultEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoutes(value: js.Array[IRoute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaypoints(value: js.Array[Waypoint_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

