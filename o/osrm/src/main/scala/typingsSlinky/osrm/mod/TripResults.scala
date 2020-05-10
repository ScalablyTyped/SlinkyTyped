package typingsSlinky.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TripResults extends js.Object {
  var trips: js.Array[Route] = js.native
  var waypoints: js.Array[TripWaypoint] = js.native
}

object TripResults {
  @scala.inline
  def apply(trips: js.Array[Route], waypoints: js.Array[TripWaypoint]): TripResults = {
    val __obj = js.Dynamic.literal(trips = trips.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[TripResults]
  }
  @scala.inline
  implicit class TripResultsOps[Self <: TripResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrips(value: js.Array[Route]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaypoints(value: js.Array[TripWaypoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

