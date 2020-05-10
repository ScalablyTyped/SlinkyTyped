package typingsSlinky.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaypointsSplicedEvent extends js.Object {
  var added: js.Array[Waypoint_] = js.native
  var index: Double = js.native
  var nRemoved: Double = js.native
}

object WaypointsSplicedEvent {
  @scala.inline
  def apply(added: js.Array[Waypoint_], index: Double, nRemoved: Double): WaypointsSplicedEvent = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nRemoved = nRemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaypointsSplicedEvent]
  }
  @scala.inline
  implicit class WaypointsSplicedEventOps[Self <: WaypointsSplicedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdded(value: js.Array[Waypoint_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNRemoved(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nRemoved")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

