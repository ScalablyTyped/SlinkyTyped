package typingsSlinky.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#stepmaneuver-object
  */
@js.native
trait StepManeuver extends js.Object {
  /**
    * The clockwise angle from true north to the direction of travel immediately after the maneuver. Range 0-359.
    */
  var bearing_after: Double = js.native
  /**
    * The clockwise angle from true north to the direction of travel immediately before the maneuver. Range 0-359.
    */
  var bearing_before: Double = js.native
  /**
    * A [longitude, latitude] pair describing the location of the turn.
    */
  var location: Coordinate = js.native
  /**
    * An optional string indicating the direction change of the maneuver.
    */
  var modifier: Indication = js.native
  /**
    * A string indicating the type of maneuver.
    * new identifiers might be introduced without API change Types unknown to the client should be handled like the turn type,
    * the existence of correct modifier values is guranteed.
    */
  var `type`: StepManeuverTypes = js.native
}

object StepManeuver {
  @scala.inline
  def apply(
    bearing_after: Double,
    bearing_before: Double,
    location: Coordinate,
    modifier: Indication,
    `type`: StepManeuverTypes
  ): StepManeuver = {
    val __obj = js.Dynamic.literal(bearing_after = bearing_after.asInstanceOf[js.Any], bearing_before = bearing_before.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], modifier = modifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepManeuver]
  }
  @scala.inline
  implicit class StepManeuverOps[Self <: StepManeuver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBearing_after(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearing_after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBearing_before(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearing_before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: Coordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifier(value: Indication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: StepManeuverTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

