package typingsSlinky.chartist.mod

import typingsSlinky.chartist.chartistStrings.accumulate
import typingsSlinky.chartist.chartistStrings.overlap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBarChartOptions extends IChartOptions {
  var axisX: js.UndefOr[IBarChartAxis] = js.native
  var axisY: js.UndefOr[IBarChartAxis] = js.native
  var chartPadding: js.UndefOr[IChartPadding] = js.native
  /**
    * Override the class names that are used to generate the SVG structure of the chart
    */
  var classNames: js.UndefOr[IBarChartClasses] = js.native
  var distributeSeries: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var high: js.UndefOr[Double] = js.native
  var horizontalBars: js.UndefOr[Boolean] = js.native
  var low: js.UndefOr[Double] = js.native
  var onlyInteger: js.UndefOr[Boolean] = js.native
  var seriesBarDistance: js.UndefOr[Double] = js.native
  /**
    * If set to true this property will cause the series bars to be stacked and form a total for each series point. This will also influence the y-axis and the overall bounds of the chart. In stacked mode the seriesBarDistance property will have no effect.
    */
  var stackBars: js.UndefOr[Boolean] = js.native
  var stackMode: js.UndefOr[overlap | accumulate] = js.native
  var ticks: js.UndefOr[js.Array[String | Double]] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object IBarChartOptions {
  @scala.inline
  def apply(): IBarChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBarChartOptions]
  }
  @scala.inline
  implicit class IBarChartOptionsOps[Self <: IBarChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisX(value: IBarChartAxis): Self = {
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
    def withAxisY(value: IBarChartAxis): Self = {
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
    def withClassNames(value: IBarChartClasses): Self = {
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
    def withDistributeSeries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributeSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributeSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributeSeries")(js.undefined)
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
    def withHorizontalBars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalBars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalBars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalBars")(js.undefined)
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
    def withOnlyInteger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyInteger")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesBarDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesBarDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesBarDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesBarDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withStackBars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackBars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackBars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackBars")(js.undefined)
        ret
    }
    @scala.inline
    def withStackMode(value: overlap | accumulate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackMode")(js.undefined)
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

