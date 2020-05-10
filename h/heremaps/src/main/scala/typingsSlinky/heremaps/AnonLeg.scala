package typingsSlinky.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLeg extends js.Object {
  var leg: js.Array[AnonManeuver] = js.native
  var mode: AnonFeature = js.native
  var shape: js.Array[String] = js.native
  var summary: AnonBaseTime = js.native
  var waypoint: js.Array[AnonLabel] = js.native
}

object AnonLeg {
  @scala.inline
  def apply(
    leg: js.Array[AnonManeuver],
    mode: AnonFeature,
    shape: js.Array[String],
    summary: AnonBaseTime,
    waypoint: js.Array[AnonLabel]
  ): AnonLeg = {
    val __obj = js.Dynamic.literal(leg = leg.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], waypoint = waypoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeg]
  }
  @scala.inline
  implicit class AnonLegOps[Self <: AnonLeg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeg(value: js.Array[AnonManeuver]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: AnonFeature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummary(value: AnonBaseTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaypoint(value: js.Array[AnonLabel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypoint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

