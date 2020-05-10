package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsStep extends js.Object {
  /**
    * contains the distance covered by this step until the next step. (See the discussion of this field in Directions Legs)
    *
    * This field may be undefined if the distance is unknown.
    */
  var distance: Distance = js.native
  /**
    * contains the typical time required to perform the step, until the next step. (See the description in Directions Legs)
    *
    * This field may be undefined if the duration is unknown
    */
  var duration: Duration = js.native
  /** contains the location of the last point of this step, as a single set of `lat` and `lng` fields. */
  var end_location: LatLngLiteral = js.native
  /** contains formatted instructions for this step, presented as an HTML text string. */
  var html_instructions: String = js.native
  /**
    * contains the action to take for the current step (turn left, merge, straight, etc.).
    * This field is used to determine which icon to display.
    */
  var maneuver: Maneuver = js.native
  /**
    * contains a single points object that holds an encoded polyline representation of the step.
    * This polyline is an approximate (smoothed) path of the step.
    */
  var polyline: String = js.native
  /** contains the location of the starting point of this step, as a single set of `lat` and `lng` fields. */
  var start_location: LatLngLiteral = js.native
  /**
    * contains detailed directions for walking or driving steps in transit directions.
    * Substeps are only available when `travel_mode` is set to "transit".
    * The inner `steps` array is of the same type as `steps`.
    */
  var steps: DirectionsStep = js.native
  /** contains transit specific information. This field is only returned with travel_mode is set to "transit". */
  var transit_details: TransitDetails = js.native
}

object DirectionsStep {
  @scala.inline
  def apply(
    distance: Distance,
    duration: Duration,
    end_location: LatLngLiteral,
    html_instructions: String,
    maneuver: Maneuver,
    polyline: String,
    start_location: LatLngLiteral,
    steps: DirectionsStep,
    transit_details: TransitDetails
  ): DirectionsStep = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], html_instructions = html_instructions.asInstanceOf[js.Any], maneuver = maneuver.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], transit_details = transit_details.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsStep]
  }
  @scala.inline
  implicit class DirectionsStepOps[Self <: DirectionsStep] (val x: Self) extends AnyVal {
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
    def withEnd_location(value: LatLngLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml_instructions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_instructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManeuver(value: Maneuver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maneuver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolyline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_location(value: LatLngLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSteps(value: DirectionsStep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransit_details(value: TransitDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transit_details")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

