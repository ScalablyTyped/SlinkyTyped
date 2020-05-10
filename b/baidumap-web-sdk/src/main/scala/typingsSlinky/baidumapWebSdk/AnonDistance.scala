package typingsSlinky.baidumapWebSdk

import typingsSlinky.baidumapWebSdk.BMap.Point
import typingsSlinky.baidumapWebSdk.BMap.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDistance extends js.Object {
  var distance: Double = js.native
  var points: js.Array[Point] = js.native
  var polylines: js.Array[Polyline] = js.native
  var target: js.Any = js.native
  var `type`: String = js.native
}

object AnonDistance {
  @scala.inline
  def apply(
    distance: Double,
    points: js.Array[Point],
    polylines: js.Array[Polyline],
    target: js.Any,
    `type`: String
  ): AnonDistance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], polylines = polylines.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDistance]
  }
  @scala.inline
  implicit class AnonDistanceOps[Self <: AnonDistance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[Point]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolylines(value: js.Array[Polyline]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

