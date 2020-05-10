package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single geocoded waypoint.
  */
@js.native
trait DirectionsGeocodedWaypoint extends js.Object {
  var partial_match: Boolean = js.native
  var place_id: String = js.native
  var types: js.Array[String] = js.native
}

object DirectionsGeocodedWaypoint {
  @scala.inline
  def apply(partial_match: Boolean, place_id: String, types: js.Array[String]): DirectionsGeocodedWaypoint = {
    val __obj = js.Dynamic.literal(partial_match = partial_match.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsGeocodedWaypoint]
  }
  @scala.inline
  implicit class DirectionsGeocodedWaypointOps[Self <: DirectionsGeocodedWaypoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartial_match(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partial_match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlace_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

