package typingsSlinky.reactNativeChartsWrapper.mod

import typingsSlinky.reactNativeChartsWrapper.anon.Label
import typingsSlinky.reactNativeChartsWrapper.anon.LineLength
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.DAYS
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.HOURS
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.MILLISECONDS
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.MINUTES
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.SECONDS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axis extends js.Object {
  var axisLineColor: js.UndefOr[Color] = js.native
  var axisLineWidth: js.UndefOr[Double] = js.native
  var axisMaximum: js.UndefOr[Double] = js.native
  var axisMinimum: js.UndefOr[Double] = js.native
  var centerAxisLabels: js.UndefOr[Boolean] = js.native
  var drawAxisLines: js.UndefOr[Boolean] = js.native
  var drawGridLines: js.UndefOr[Boolean] = js.native
  var drawLabels: js.UndefOr[Boolean] = js.native
  var drawLimitLinesBehindData: js.UndefOr[Boolean] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontStyle: js.UndefOr[String] = js.native
  var fontWeight: js.UndefOr[Double] = js.native
  var granularity: js.UndefOr[Double] = js.native
  var granularityEnabled: js.UndefOr[Boolean] = js.native
  var gridColor: js.UndefOr[Color] = js.native
  var gridDashedLine: js.UndefOr[LineLength] = js.native
  var gridLineWidth: js.UndefOr[Double] = js.native
  var labelCount: js.UndefOr[Double] = js.native
  var labelCountForce: js.UndefOr[Boolean] = js.native
  var limitLines: js.UndefOr[js.Array[Label]] = js.native
  var since: js.UndefOr[Double] = js.native
  var textColor: js.UndefOr[Color] = js.native
  var textSize: js.UndefOr[Double] = js.native
  var timeUnit: js.UndefOr[MILLISECONDS | SECONDS | MINUTES | HOURS | DAYS] = js.native
  var valueFormatter: js.UndefOr[ValueFormatter] = js.native
  var valueFormatterPattern: js.UndefOr[String] = js.native
}

object Axis {
  @scala.inline
  def apply(): Axis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Axis]
  }
  @scala.inline
  implicit class AxisOps[Self <: Axis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisLineColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisMaximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisMaximum")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisMinimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisMinimum")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterAxisLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerAxisLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterAxisLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerAxisLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawAxisLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawAxisLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawAxisLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawAxisLines")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawGridLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawGridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawGridLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawGridLines")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawLimitLinesBehindData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawLimitLinesBehindData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawLimitLinesBehindData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawLimitLinesBehindData")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGranularity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGranularity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularity")(js.undefined)
        ret
    }
    @scala.inline
    def withGranularityEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularityEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGranularityEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularityEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGridColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGridDashedLine(value: LineLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridDashedLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridDashedLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridDashedLine")(js.undefined)
        ret
    }
    @scala.inline
    def withGridLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelCountForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCountForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelCountForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCountForce")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitLines(value: js.Array[Label]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitLines")(js.undefined)
        ret
    }
    @scala.inline
    def withSince(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeUnit(value: MILLISECONDS | SECONDS | MINUTES | HOURS | DAYS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFormatter(value: ValueFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFormatterPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormatterPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueFormatterPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormatterPattern")(js.undefined)
        ret
    }
  }
  
}

