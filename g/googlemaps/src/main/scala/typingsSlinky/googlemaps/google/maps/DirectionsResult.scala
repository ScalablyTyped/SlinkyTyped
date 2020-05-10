package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsResult extends js.Object {
  var geocoded_waypoints: js.Array[DirectionsGeocodedWaypoint] = js.native
  var routes: js.Array[DirectionsRoute] = js.native
}

object DirectionsResult {
  @scala.inline
  def apply(geocoded_waypoints: js.Array[DirectionsGeocodedWaypoint], routes: js.Array[DirectionsRoute]): DirectionsResult = {
    val __obj = js.Dynamic.literal(geocoded_waypoints = geocoded_waypoints.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsResult]
  }
  @scala.inline
  implicit class DirectionsResultOps[Self <: DirectionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeocoded_waypoints(value: js.Array[DirectionsGeocodedWaypoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geocoded_waypoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutes(value: js.Array[DirectionsRoute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

