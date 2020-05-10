package typingsSlinky.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A step consists of a maneuver such as a turn or merge, followed by a distance of travel along a single way to the subsequent step.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#routestep-object
  */
@js.native
trait RouteStep extends js.Object {
  /**
    * The destinations of the way. Will be undefined if there are no destinations.
    */
  var destinations: String = js.native
  /**
    * The distance of travel from the maneuver to the subsequent step, in float meters.
    */
  var distance: Double = js.native
  /**
    * The estimated travel time, in float number of seconds.
    */
  var duration: Double = js.native
  /**
    * The exit numbers or names of the way. Will be undefined if there are no exit numbers or names.
    */
  var exits: String = js.native
  /**
    * The unsimplified geometry of the route segment, depending on the geometries parameter.
    */
  var geometry: Polyline | LineString = js.native
  /**
    * A list of Intersection objects that are passed along the segment, the very first belonging to the StepManeuver
    */
  var intersections: js.Array[Intersection] = js.native
  /**
    * A StepManeuver object representing the maneuver.
    */
  var maneuver: StepManeuver = js.native
  /**
    * A string signifying the mode of transportation.
    */
  var mode: String = js.native
  /**
    * The name of the way along which travel proceeds.
    */
  var name: String = js.native
  /**
    * The pronunciation hint of the way name. Will be undefined if there is no pronunciation hit.
    */
  var pronunciation: String = js.native
  /**
    * A reference number or code for the way. Optionally included, if ref data is available for the given way.
    */
  var ref: String = js.native
  /**
    * The name for the rotary. Optionally included, if the step is a rotary and a rotary name is available.
    */
  var rotary_name: String = js.native
  /**
    * The pronunciation hint of the rotary name. Optionally included, if the step is a rotary and a rotary pronunciation is available.
    */
  var rotary_pronunciation: String = js.native
  /**
    * The calculated weight of the step.
    */
  var weight: Double = js.native
}

object RouteStep {
  @scala.inline
  def apply(
    destinations: String,
    distance: Double,
    duration: Double,
    exits: String,
    geometry: Polyline | LineString,
    intersections: js.Array[Intersection],
    maneuver: StepManeuver,
    mode: String,
    name: String,
    pronunciation: String,
    ref: String,
    rotary_name: String,
    rotary_pronunciation: String,
    weight: Double
  ): RouteStep = {
    val __obj = js.Dynamic.literal(destinations = destinations.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], exits = exits.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], intersections = intersections.asInstanceOf[js.Any], maneuver = maneuver.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pronunciation = pronunciation.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], rotary_name = rotary_name.asInstanceOf[js.Any], rotary_pronunciation = rotary_pronunciation.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteStep]
  }
  @scala.inline
  implicit class RouteStepOps[Self <: RouteStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinations(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeometry(value: Polyline | LineString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntersections(value: js.Array[Intersection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManeuver(value: StepManeuver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maneuver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPronunciation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pronunciation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotary_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotary_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotary_pronunciation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotary_pronunciation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

