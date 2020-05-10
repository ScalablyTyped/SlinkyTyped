package typingsSlinky.reactNativeChartsWrapper.mod

import typingsSlinky.reactNativeChartsWrapper.AnonColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PieChartProps extends PieRadarChartBase {
  var centerText: js.UndefOr[String] = js.native
  var centerTextRadiusPercent: js.UndefOr[Double] = js.native
  var data: js.UndefOr[PieData] = js.native
  var drawEntryLabels: js.UndefOr[Boolean] = js.native
  var entryLabelColor: js.UndefOr[Color] = js.native
  var entryLabelTextSize: js.UndefOr[Double] = js.native
  var holeColor: js.UndefOr[Color] = js.native
  var holeRadius: js.UndefOr[Double] = js.native
  var maxAngle: js.UndefOr[Double] = js.native
  var styledCenterText: js.UndefOr[AnonColor] = js.native
  var transparentCircleColor: js.UndefOr[Color] = js.native
  var transparentCircleRadius: js.UndefOr[Double] = js.native
  var usePercentValues: js.UndefOr[Boolean] = js.native
}

object PieChartProps {
  @scala.inline
  def apply(): PieChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartProps]
  }
  @scala.inline
  implicit class PieChartPropsOps[Self <: PieChartProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenterText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerText")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterTextRadiusPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerTextRadiusPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterTextRadiusPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerTextRadiusPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: PieData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawEntryLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawEntryLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawEntryLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawEntryLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryLabelColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryLabelColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryLabelColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryLabelColor")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryLabelTextSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryLabelTextSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryLabelTextSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryLabelTextSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHoleColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHoleRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holeRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoleRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holeRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withStyledCenterText(value: AnonColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styledCenterText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyledCenterText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styledCenterText")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparentCircleColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparentCircleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparentCircleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparentCircleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparentCircleRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparentCircleRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparentCircleRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparentCircleRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePercentValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePercentValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePercentValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePercentValues")(js.undefined)
        ret
    }
  }
  
}

