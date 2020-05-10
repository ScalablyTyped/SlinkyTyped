package typingsSlinky.reactNativeChartsWrapper

import typingsSlinky.reactNativeChartsWrapper.mod.Color
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT_BOTTOM
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT_TOP
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT_BOTTOM
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT_TOP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLabel extends js.Object {
  var label: js.UndefOr[String] = js.native
  var labelPosition: js.UndefOr[LEFT_TOP | LEFT_BOTTOM | RIGHT_TOP | RIGHT_BOTTOM] = js.native
  var limit: Double = js.native
  var lineColor: js.UndefOr[Color] = js.native
  var lineDashLengths: js.UndefOr[js.Array[Double]] = js.native
  var lineDashPhase: js.UndefOr[Double] = js.native
  var lineWidth: js.UndefOr[Double] = js.native
  var valueFont: js.UndefOr[String] = js.native
  var valueTextColor: js.UndefOr[Color] = js.native
}

object AnonLabel {
  @scala.inline
  def apply(limit: Double): AnonLabel = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
  @scala.inline
  implicit class AnonLabelOps[Self <: AnonLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPosition(value: LEFT_TOP | LEFT_BOTTOM | RIGHT_TOP | RIGHT_BOTTOM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withLineColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDashLengths(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashLengths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDashLengths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashLengths")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDashPhase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashPhase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDashPhase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashPhase")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFont")(js.undefined)
        ret
    }
    @scala.inline
    def withValueTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTextColor")(js.undefined)
        ret
    }
  }
  
}

