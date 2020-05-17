package typingsSlinky.activexLibreoffice.com_.sun.star.table

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the style settings of the border lines of all cells in a cell range.
  *
  * In a queried structure, the flags in TableBorder::Is...LineValid indicate that not all lines of the boxes have the same values.
  *
  * In a structure which is used for setting, these flags determine if the corresponding line should be set or if the old value should be kept.
  */
@js.native
trait TableBorder extends js.Object {
  /** determines the line style at the bottom edge. */
  var BottomLine: BorderLine = js.native
  /** contains the distance between the lines and other contents. */
  var Distance: Double = js.native
  /** determines the line style of horizontal lines for the inner part of a cell range. */
  var HorizontalLine: BorderLine = js.native
  /** specifies whether the value of {@link TableBorder.BottomLine} is used. */
  var IsBottomLineValid: Boolean = js.native
  /** specifies whether the value of {@link TableBorder.Distance} is used. */
  var IsDistanceValid: Boolean = js.native
  /** specifies whether the value of {@link TableBorder.HorizontalLine} is used. */
  var IsHorizontalLineValid: Boolean = js.native
  /** specifies whether the value of {@link TableBorder.LeftLine} is used. */
  var IsLeftLineValid: Boolean = js.native
  /** specifies whether the value of {@link TableBorder.RightLine} is used. */
  var IsRightLineValid: Boolean = js.native
  /** specifies whether the value of {@link TableBorder.TopLine} is used. */
  var IsTopLineValid: Boolean = js.native
  /** specifies whether the value of {@link TableBorder.VerticalLine} is used. */
  var IsVerticalLineValid: Boolean = js.native
  /** determines the line style at the left edge. */
  var LeftLine: BorderLine = js.native
  /** determines the line style at the right edge. */
  var RightLine: BorderLine = js.native
  /** determines the line style at the top edge. */
  var TopLine: BorderLine = js.native
  /** determines the line style of vertical lines for the inner part of a cell range. */
  var VerticalLine: BorderLine = js.native
}

object TableBorder {
  @scala.inline
  def apply(
    BottomLine: BorderLine,
    Distance: Double,
    HorizontalLine: BorderLine,
    IsBottomLineValid: Boolean,
    IsDistanceValid: Boolean,
    IsHorizontalLineValid: Boolean,
    IsLeftLineValid: Boolean,
    IsRightLineValid: Boolean,
    IsTopLineValid: Boolean,
    IsVerticalLineValid: Boolean,
    LeftLine: BorderLine,
    RightLine: BorderLine,
    TopLine: BorderLine,
    VerticalLine: BorderLine
  ): TableBorder = {
    val __obj = js.Dynamic.literal(BottomLine = BottomLine.asInstanceOf[js.Any], Distance = Distance.asInstanceOf[js.Any], HorizontalLine = HorizontalLine.asInstanceOf[js.Any], IsBottomLineValid = IsBottomLineValid.asInstanceOf[js.Any], IsDistanceValid = IsDistanceValid.asInstanceOf[js.Any], IsHorizontalLineValid = IsHorizontalLineValid.asInstanceOf[js.Any], IsLeftLineValid = IsLeftLineValid.asInstanceOf[js.Any], IsRightLineValid = IsRightLineValid.asInstanceOf[js.Any], IsTopLineValid = IsTopLineValid.asInstanceOf[js.Any], IsVerticalLineValid = IsVerticalLineValid.asInstanceOf[js.Any], LeftLine = LeftLine.asInstanceOf[js.Any], RightLine = RightLine.asInstanceOf[js.Any], TopLine = TopLine.asInstanceOf[js.Any], VerticalLine = VerticalLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBorder]
  }
  @scala.inline
  implicit class TableBorderOps[Self <: TableBorder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomLine(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BottomLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalLine(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HorizontalLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBottomLineValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsBottomLineValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDistanceValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDistanceValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHorizontalLineValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsHorizontalLineValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLeftLineValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsLeftLineValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRightLineValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRightLineValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTopLineValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTopLineValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVerticalLineValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsVerticalLineValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftLine(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightLine(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopLine(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalLine(value: BorderLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerticalLine")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

