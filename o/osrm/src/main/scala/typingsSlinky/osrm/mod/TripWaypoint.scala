package typingsSlinky.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Each Waypoint object has the following additional properties,
  *
  * 1) trips_index: index to trips of the sub-trip the point was matched to, and
  * 2) waypoint_index: index of the point in the trip.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#trip
  */
@js.native
trait TripWaypoint extends Waypoint {
  
  var trips_index: Double = js.native
  
  var waypoint_index: Double = js.native
}
object TripWaypoint {
  
  @scala.inline
  def apply(
    distance: Double,
    hint: String,
    location: Coordinate,
    name: String,
    trips_index: Double,
    waypoint_index: Double
  ): TripWaypoint = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], trips_index = trips_index.asInstanceOf[js.Any], waypoint_index = waypoint_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[TripWaypoint]
  }
  
  @scala.inline
  implicit class TripWaypointOps[Self <: TripWaypoint] (val x: Self) extends AnyVal {
    
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
    def setTrips_index(value: Double): Self = this.set("trips_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypoint_index(value: Double): Self = this.set("waypoint_index", value.asInstanceOf[js.Any])
  }
}
