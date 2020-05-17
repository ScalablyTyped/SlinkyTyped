package typingsSlinky.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Leg extends js.Object {
  var leg: js.Array[Maneuver] = js.native
  var mode: Feature = js.native
  var shape: js.Array[String] = js.native
  var summary: BaseTime = js.native
  var waypoint: js.Array[Label] = js.native
}

object Leg {
  @scala.inline
  def apply(
    leg: js.Array[Maneuver],
    mode: Feature,
    shape: js.Array[String],
    summary: BaseTime,
    waypoint: js.Array[Label]
  ): Leg = {
    val __obj = js.Dynamic.literal(leg = leg.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], waypoint = waypoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leg]
  }
  @scala.inline
  implicit class LegOps[Self <: Leg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeg(value: js.Array[Maneuver]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: Feature): Self = {
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
    def withSummary(value: BaseTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaypoint(value: js.Array[Label]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypoint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

