package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a point on a Bezier curve.
  *
  * The two control points specify how the Bezier curve goes through the given position.
  * @deprecated Deprecated
  */
@js.native
trait BezierPoint extends js.Object {
  /** This is the position of the first control point. */
  var ControlPoint1: Point = js.native
  /** This is the position of the second control point. */
  var ControlPoint2: Point = js.native
  /** This is the position of this point. */
  var Position: Point = js.native
}

object BezierPoint {
  @scala.inline
  def apply(ControlPoint1: Point, ControlPoint2: Point, Position: Point): BezierPoint = {
    val __obj = js.Dynamic.literal(ControlPoint1 = ControlPoint1.asInstanceOf[js.Any], ControlPoint2 = ControlPoint2.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BezierPoint]
  }
  @scala.inline
  implicit class BezierPointOps[Self <: BezierPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlPoint1(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlPoint1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlPoint2(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlPoint2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

