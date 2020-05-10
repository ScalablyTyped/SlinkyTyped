package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseDirectionsStep extends js.Object {
  var distance: Distance = js.native
  var duration: Duration = js.native
  var end_location: LatLng = js.native
  var instructions: String = js.native
  var path: js.Array[LatLng] = js.native
  var start_location: LatLng = js.native
  var transit: TransitDetails = js.native
  var travel_mode: TravelMode = js.native
}

object BaseDirectionsStep {
  @scala.inline
  def apply(
    distance: Distance,
    duration: Duration,
    end_location: LatLng,
    instructions: String,
    path: js.Array[LatLng],
    start_location: LatLng,
    transit: TransitDetails,
    travel_mode: TravelMode
  ): BaseDirectionsStep = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], travel_mode = travel_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseDirectionsStep]
  }
  @scala.inline
  implicit class BaseDirectionsStepOps[Self <: BaseDirectionsStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withEnd_location(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstructions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[LatLng]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_location(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransit(value: TransitDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTravel_mode(value: TravelMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("travel_mode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

