package typingsSlinky.activexLibreoffice.com_.sun.star.table

import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the line type for a single cell edge. */
@js.native
trait BorderLine extends js.Object {
  /** contains the color value of the line. */
  var Color: typingsSlinky.activexLibreoffice.com_.sun.star.util.Color = js.native
  /**
    * contains the width of the inner part of a double line (in 1/100 mm).
    *
    * If this value is zero, only a single line is drawn.
    */
  var InnerLineWidth: Double = js.native
  /** contains the distance between the inner and outer parts of a double line (in 1/100 mm). */
  var LineDistance: Double = js.native
  /**
    * contains the width of a single line or the width of outer part of a double line (in 1/100 mm).
    *
    * If this value is zero, no line is drawn.
    */
  var OuterLineWidth: Double = js.native
}

object BorderLine {
  @scala.inline
  def apply(Color: Color, InnerLineWidth: Double, LineDistance: Double, OuterLineWidth: Double): BorderLine = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], InnerLineWidth = InnerLineWidth.asInstanceOf[js.Any], LineDistance = LineDistance.asInstanceOf[js.Any], OuterLineWidth = OuterLineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderLine]
  }
  @scala.inline
  implicit class BorderLineOps[Self <: BorderLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InnerLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OuterLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

