package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsLeg extends js.Object {
  var arrival_time: Time = js.native
  var departure_time: Time = js.native
  var distance: Distance = js.native
  var duration: Duration = js.native
  var duration_in_traffic: Duration = js.native
  var end_address: String = js.native
  var end_location: LatLng = js.native
  var start_address: String = js.native
  var start_location: LatLng = js.native
  var steps: js.Array[DirectionsStep] = js.native
  var via_waypoints: js.Array[LatLng] = js.native
}

object DirectionsLeg {
  @scala.inline
  def apply(
    arrival_time: Time,
    departure_time: Time,
    distance: Distance,
    duration: Duration,
    duration_in_traffic: Duration,
    end_address: String,
    end_location: LatLng,
    start_address: String,
    start_location: LatLng,
    steps: js.Array[DirectionsStep],
    via_waypoints: js.Array[LatLng]
  ): DirectionsLeg = {
    val __obj = js.Dynamic.literal(arrival_time = arrival_time.asInstanceOf[js.Any], departure_time = departure_time.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], duration_in_traffic = duration_in_traffic.asInstanceOf[js.Any], end_address = end_address.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], start_address = start_address.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], via_waypoints = via_waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsLeg]
  }
  @scala.inline
  implicit class DirectionsLegOps[Self <: DirectionsLeg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrival_time(value: Time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrival_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeparture_time(value: Time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("departure_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Distance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration_in_traffic(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration_in_traffic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd_address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd_location(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_location(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[DirectionsStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVia_waypoints(value: js.Array[LatLng]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("via_waypoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

