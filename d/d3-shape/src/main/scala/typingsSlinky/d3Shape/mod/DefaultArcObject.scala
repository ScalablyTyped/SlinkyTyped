package typingsSlinky.d3Shape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultArcObject extends js.Object {
  /**
    * End angle of arc. The angle is specified in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    */
  var endAngle: Double = js.native
  /**
    * Inner radius of arc.
    */
  var innerRadius: Double = js.native
  /**
    * Outer radius of arc.
    */
  var outerRadius: Double = js.native
  /**
    * Optional. Pad angle of arc in radians.
    */
  var padAngle: js.UndefOr[Double] = js.native
  /**
    * Start angle of arc. The angle is specified in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    */
  var startAngle: Double = js.native
}

object DefaultArcObject {
  @scala.inline
  def apply(endAngle: Double, innerRadius: Double, outerRadius: Double, startAngle: Double): DefaultArcObject = {
    val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultArcObject]
  }
  @scala.inline
  implicit class DefaultArcObjectOps[Self <: DefaultArcObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padAngle")(js.undefined)
        ret
    }
  }
  
}

