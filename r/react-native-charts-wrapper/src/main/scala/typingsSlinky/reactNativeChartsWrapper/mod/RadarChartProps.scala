package typingsSlinky.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadarChartProps extends PieRadarChartBase {
  var data: js.UndefOr[RadarData] = js.native
  var drawWeb: js.UndefOr[Boolean] = js.native
  var skipWebLineCount: js.UndefOr[Double] = js.native
  var webAlpha: js.UndefOr[Double] = js.native
  var webColor: js.UndefOr[Color] = js.native
  var webColorInner: js.UndefOr[Color] = js.native
  var webLineWidth: js.UndefOr[Double] = js.native
  var webLineWidthInner: js.UndefOr[Double] = js.native
  var yAxis: js.UndefOr[typingsSlinky.reactNativeChartsWrapper.mod.yAxis] = js.native
}

object RadarChartProps {
  @scala.inline
  def apply(): RadarChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadarChartProps]
  }
  @scala.inline
  implicit class RadarChartPropsOps[Self <: RadarChartProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: RadarData): Self = {
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
    def withDrawWeb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawWeb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawWeb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawWeb")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipWebLineCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipWebLineCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipWebLineCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipWebLineCount")(js.undefined)
        ret
    }
    @scala.inline
    def withWebAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withWebColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webColor")(js.undefined)
        ret
    }
    @scala.inline
    def withWebColorInner(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webColorInner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebColorInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webColorInner")(js.undefined)
        ret
    }
    @scala.inline
    def withWebLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webLineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withWebLineWidthInner(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webLineWidthInner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebLineWidthInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webLineWidthInner")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxis(value: yAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(js.undefined)
        ret
    }
  }
  
}

