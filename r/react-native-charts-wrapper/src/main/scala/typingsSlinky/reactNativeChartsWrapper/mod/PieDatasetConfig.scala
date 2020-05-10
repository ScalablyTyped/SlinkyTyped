package typingsSlinky.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PieDatasetConfig extends CommonDatasetConfig {
  var selectionShift: js.UndefOr[Double] = js.native
  var sliceSpace: js.UndefOr[Double] = js.native
  var valueLineColor: js.UndefOr[Color] = js.native
  var valueLinePart1Length: js.UndefOr[Double] = js.native
  var valueLinePart1OffsetPercentage: js.UndefOr[Double] = js.native
  var valueLinePart2Length: js.UndefOr[Double] = js.native
  var valueLineVariableLength: js.UndefOr[Boolean] = js.native
  var valueLineWidth: js.UndefOr[Double] = js.native
  var xValuePosition: js.UndefOr[PieValuePosition] = js.native
  var yValuePosition: js.UndefOr[PieValuePosition] = js.native
}

object PieDatasetConfig {
  @scala.inline
  def apply(): PieDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieDatasetConfig]
  }
  @scala.inline
  implicit class PieDatasetConfigOps[Self <: PieDatasetConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectionShift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionShift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionShift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionShift")(js.undefined)
        ret
    }
    @scala.inline
    def withSliceSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliceSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withValueLineColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withValueLinePart1Length(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLinePart1Length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueLinePart1Length: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLinePart1Length")(js.undefined)
        ret
    }
    @scala.inline
    def withValueLinePart1OffsetPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLinePart1OffsetPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueLinePart1OffsetPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLinePart1OffsetPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withValueLinePart2Length(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLinePart2Length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueLinePart2Length: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLinePart2Length")(js.undefined)
        ret
    }
    @scala.inline
    def withValueLineVariableLength(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLineVariableLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueLineVariableLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLineVariableLength")(js.undefined)
        ret
    }
    @scala.inline
    def withValueLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueLineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withXValuePosition(value: PieValuePosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xValuePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXValuePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xValuePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withYValuePosition(value: PieValuePosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yValuePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYValuePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yValuePosition")(js.undefined)
        ret
    }
  }
  
}

