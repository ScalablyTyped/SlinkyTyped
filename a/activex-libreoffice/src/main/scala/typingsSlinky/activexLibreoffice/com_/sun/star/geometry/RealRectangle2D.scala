package typingsSlinky.activexLibreoffice.com_.sun.star.geometry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains the necessary information for a two-dimensional rectangle.
  * @since OOo 2.0
  */
@js.native
trait RealRectangle2D extends js.Object {
  var X1: Double = js.native
  /**
    * X coordinate of lower right corner.
    *
    * Must be greater than x1 for non-empty rectangles.
    *
    * .
    */
  var X2: Double = js.native
  var Y1: Double = js.native
  /**
    * Y coordinate of lower right corner.
    *
    * Must be greater than y1 for non-empty rectangles.
    */
  var Y2: Double = js.native
}

object RealRectangle2D {
  @scala.inline
  def apply(X1: Double, X2: Double, Y1: Double, Y2: Double): RealRectangle2D = {
    val __obj = js.Dynamic.literal(X1 = X1.asInstanceOf[js.Any], X2 = X2.asInstanceOf[js.Any], Y1 = Y1.asInstanceOf[js.Any], Y2 = Y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealRectangle2D]
  }
  @scala.inline
  implicit class RealRectangle2DOps[Self <: RealRectangle2D] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Y1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Y2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

