package typingsSlinky.activexLibreoffice.com_.sun.star.table

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the distance settings of the border lines of all cells in a cell range.
  *
  * In a queried structure, the flags in TableBorderDistances::Is...DistanceValid indicate that not all lines of the boxes have the same values.
  *
  * In a structure which is used for setting, these flags determine if the corresponding distance should be set or if the old value should be kept.
  */
@js.native
trait TableBorderDistances extends js.Object {
  /** contains the distance between the bottom lines and other contents. */
  var BottomDistance: Double = js.native
  /** specifies whether the value of TableBorder::BottomDistance is used. */
  var IsBottomDistanceValid: Boolean = js.native
  /** specifies whether the value of TableBorder::LeftDistance is used. */
  var IsLeftDistanceValid: Boolean = js.native
  /** specifies whether the value of TableBorder::RightDistance is used. */
  var IsRightDistanceValid: Boolean = js.native
  /** specifies whether the value of TableBorder::TopDistance is used. */
  var IsTopDistanceValid: Boolean = js.native
  /** contains the distance between the left lines and other contents. */
  var LeftDistance: Double = js.native
  /** contains the distance between the right lines and other contents. */
  var RightDistance: Double = js.native
  /** contains the distance between the top lines and other contents. */
  var TopDistance: Double = js.native
}

object TableBorderDistances {
  @scala.inline
  def apply(
    BottomDistance: Double,
    IsBottomDistanceValid: Boolean,
    IsLeftDistanceValid: Boolean,
    IsRightDistanceValid: Boolean,
    IsTopDistanceValid: Boolean,
    LeftDistance: Double,
    RightDistance: Double,
    TopDistance: Double
  ): TableBorderDistances = {
    val __obj = js.Dynamic.literal(BottomDistance = BottomDistance.asInstanceOf[js.Any], IsBottomDistanceValid = IsBottomDistanceValid.asInstanceOf[js.Any], IsLeftDistanceValid = IsLeftDistanceValid.asInstanceOf[js.Any], IsRightDistanceValid = IsRightDistanceValid.asInstanceOf[js.Any], IsTopDistanceValid = IsTopDistanceValid.asInstanceOf[js.Any], LeftDistance = LeftDistance.asInstanceOf[js.Any], RightDistance = RightDistance.asInstanceOf[js.Any], TopDistance = TopDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBorderDistances]
  }
  @scala.inline
  implicit class TableBorderDistancesOps[Self <: TableBorderDistances] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BottomDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBottomDistanceValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsBottomDistanceValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLeftDistanceValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsLeftDistanceValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRightDistanceValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRightDistanceValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTopDistanceValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTopDistanceValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopDistance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

