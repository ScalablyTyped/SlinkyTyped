package typingsSlinky.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelCubicBezierCurvePointInfo extends RaphaelCartesianCurvePoint {
  /**
    * The end point of the cubic bezier curve.
    */
  var end: RaphaelCartesianPoint = js.native
  /**
    * The left anchor point of the cubic bezier curve.
    */
  var m: RaphaelCartesianPoint = js.native
  /**
    * The right anchor point of the cubic bezier curve.
    */
  var n: RaphaelCartesianPoint = js.native
  /**
    * The start point of the cubic bezier curve.
    */
  var start: RaphaelCartesianPoint = js.native
}

object RaphaelCubicBezierCurvePointInfo {
  @scala.inline
  def apply(
    alpha: Double,
    end: RaphaelCartesianPoint,
    m: RaphaelCartesianPoint,
    n: RaphaelCartesianPoint,
    start: RaphaelCartesianPoint,
    x: Double,
    y: Double
  ): RaphaelCubicBezierCurvePointInfo = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelCubicBezierCurvePointInfo]
  }
  @scala.inline
  implicit class RaphaelCubicBezierCurvePointInfoOps[Self <: RaphaelCubicBezierCurvePointInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: RaphaelCartesianPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM(value: RaphaelCartesianPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN(value: RaphaelCartesianPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: RaphaelCartesianPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

