package typingsSlinky.chartist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.chartist.AnonAreaBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILineChartOptions extends IChartOptions {
  var areaBase: js.UndefOr[Double] = js.native
  var axisX: js.UndefOr[IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis] = js.native
  var axisY: js.UndefOr[IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis] = js.native
  var chartPadding: js.UndefOr[IChartPadding] = js.native
  var classNames: js.UndefOr[ILineChartClasses] = js.native
  var fullWidth: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var high: js.UndefOr[Double] = js.native
  var lineSmooth: js.UndefOr[js.Function | Boolean] = js.native
  var low: js.UndefOr[Double] = js.native
  var series: js.UndefOr[StringDictionary[AnonAreaBase]] = js.native
  var showArea: js.UndefOr[Boolean] = js.native
  var showLine: js.UndefOr[Boolean] = js.native
  var showPoint: js.UndefOr[Boolean] = js.native
  var ticks: js.UndefOr[js.Array[String | Double]] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object ILineChartOptions {
  @scala.inline
  def apply(): ILineChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILineChartOptions]
  }
  @scala.inline
  implicit class ILineChartOptionsOps[Self <: ILineChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreaBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreaBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaBase")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisX(value: IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisX")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisY(value: IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisY")(js.undefined)
        ret
    }
    @scala.inline
    def withChartPadding(value: IChartPadding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNames(value: ILineChartClasses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(js.undefined)
        ret
    }
    @scala.inline
    def withFullWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHigh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(js.undefined)
        ret
    }
    @scala.inline
    def withLineSmooth(value: js.Function | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSmooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineSmooth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSmooth")(js.undefined)
        ret
    }
    @scala.inline
    def withLow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: StringDictionary[AnonAreaBase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withShowArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArea")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLine")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withTicks(value: js.Array[String | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

