package typingsSlinky.protonNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaBezierProps extends AreaBaseProps {
  /**
    * The x coordinate of the curve's control point at the start.
    */
  var cx1: Double | String = js.native
  /**
    * The x coordinate of the curve's control point at the end.
    */
  var cx2: Double | String = js.native
  /**
    * The y coordinate of the curve's control point at the start.
    */
  var cy1: Double | String = js.native
  /**
    * The y coordinate of the curve's control point at the end.
    */
  var cy2: Double | String = js.native
  /**
    * The x coordinate of the curve's start point.
    */
  var x1: Double | String = js.native
  /**
    * The x coordinate of the curve's end point.
    */
  var x2: Double | String = js.native
  /**
    * The y coordinate of the curve's start point.
    */
  var y1: Double | String = js.native
  /**
    * The y coordinate of the curve's end point.
    */
  var y2: Double | String = js.native
}

object AreaBezierProps {
  @scala.inline
  def apply(
    cx1: Double | String,
    cx2: Double | String,
    cy1: Double | String,
    cy2: Double | String,
    x1: Double | String,
    x2: Double | String,
    y1: Double | String,
    y2: Double | String
  ): AreaBezierProps = {
    val __obj = js.Dynamic.literal(cx1 = cx1.asInstanceOf[js.Any], cx2 = cx2.asInstanceOf[js.Any], cy1 = cy1.asInstanceOf[js.Any], cy2 = cy2.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaBezierProps]
  }
  @scala.inline
  implicit class AreaBezierPropsOps[Self <: AreaBezierProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCx1(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCx2(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCy1(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cy1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCy2(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cy2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX1(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX2(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY1(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY2(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

