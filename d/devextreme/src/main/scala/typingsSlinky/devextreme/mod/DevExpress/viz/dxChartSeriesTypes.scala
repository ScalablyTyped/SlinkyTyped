package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This section lists objects that define options used to configure series of specific types. */
@js.native
trait dxChartSeriesTypes extends js.Object {
  /** Describes settings supported by a series of the area type. */
  var AreaSeries: js.UndefOr[dxChartSeriesTypesAreaSeries] = js.native
  /** Describes settings supported by a series of the bar type. */
  var BarSeries: js.UndefOr[dxChartSeriesTypesBarSeries] = js.native
  /** Describes settings supported by a series of the bubble type. */
  var BubbleSeries: js.UndefOr[dxChartSeriesTypesBubbleSeries] = js.native
  /** Describes settings supported by a series of the candlestick type. */
  var CandleStickSeries: js.UndefOr[dxChartSeriesTypesCandleStickSeries] = js.native
  /** An object that defines configuration options for chart series. */
  var CommonSeries: js.UndefOr[dxChartSeriesTypesCommonSeries] = js.native
  /** Describes settings supported by a series of the full-stacked area type. */
  var FullStackedAreaSeries: js.UndefOr[dxChartSeriesTypesFullStackedAreaSeries] = js.native
  /** Describes settings supported by a series of the full-stacked bar type. */
  var FullStackedBarSeries: js.UndefOr[dxChartSeriesTypesFullStackedBarSeries] = js.native
  /** Describes settings supported by a series of the full-stacked line type. */
  var FullStackedLineSeries: js.UndefOr[dxChartSeriesTypesFullStackedLineSeries] = js.native
  /** Describes settings supported by a series of the full-stacked spline area type. */
  var FullStackedSplineAreaSeries: js.UndefOr[dxChartSeriesTypesFullStackedSplineAreaSeries] = js.native
  /** Describes settings supported by a series of the full-stacked spline area type. An object defining a series of the fullStackedSpline type. */
  var FullStackedSplineSeries: js.UndefOr[dxChartSeriesTypesFullStackedSplineSeries] = js.native
  /** Describes settings supported by a series of the line type. */
  var LineSeries: js.UndefOr[dxChartSeriesTypesLineSeries] = js.native
  /** Describes settings supported by a series of the range area type. */
  var RangeAreaSeries: js.UndefOr[dxChartSeriesTypesRangeAreaSeries] = js.native
  /** Describes settings supported by a series of the range bar type. */
  var RangeBarSeries: js.UndefOr[dxChartSeriesTypesRangeBarSeries] = js.native
  /** Describes settings supported by a series of the scatter type. */
  var ScatterSeries: js.UndefOr[dxChartSeriesTypesScatterSeries] = js.native
  /** Describes settings supported by a series of the spline area type. */
  var SplineAreaSeries: js.UndefOr[dxChartSeriesTypesSplineAreaSeries] = js.native
  /** Describes settings supported by a series of the spline type. */
  var SplineSeries: js.UndefOr[dxChartSeriesTypesSplineSeries] = js.native
  /** Describes settings supported by a series of the stacked area type. */
  var StackedAreaSeries: js.UndefOr[dxChartSeriesTypesStackedAreaSeries] = js.native
  /** Describes settings supported by a series of the stacked bar type. */
  var StackedBarSeries: js.UndefOr[dxChartSeriesTypesStackedBarSeries] = js.native
  /** Describes settings supported by a series of the stacked line type. */
  var StackedLineSeries: js.UndefOr[dxChartSeriesTypesStackedLineSeries] = js.native
  /** Describes settings supported by a series of the stacked spline area type. */
  var StackedSplineAreaSeries: js.UndefOr[dxChartSeriesTypesStackedSplineAreaSeries] = js.native
  /** Describes settings supported by a series of the stacked spline type. */
  var StackedSplineSeries: js.UndefOr[dxChartSeriesTypesStackedSplineSeries] = js.native
  /** Describes settings supported by a series of the step rea type. */
  var StepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeries] = js.native
  /** Describes settings supported by a series of the step line type. */
  var StepLineSeries: js.UndefOr[dxChartSeriesTypesStepLineSeries] = js.native
  /** Describes settings supported by a series of the stock type. */
  var StockSeries: js.UndefOr[dxChartSeriesTypesStockSeries] = js.native
}

object dxChartSeriesTypes {
  @scala.inline
  def apply(): dxChartSeriesTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypes]
  }
  @scala.inline
  implicit class dxChartSeriesTypesOps[Self <: dxChartSeriesTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreaSeries(value: dxChartSeriesTypesAreaSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AreaSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreaSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AreaSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withBarSeries(value: dxChartSeriesTypesBarSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BarSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BarSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbleSeries(value: dxChartSeriesTypesBubbleSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BubbleSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BubbleSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withCandleStickSeries(value: dxChartSeriesTypesCandleStickSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CandleStickSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCandleStickSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CandleStickSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withCommonSeries(value: dxChartSeriesTypesCommonSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withFullStackedAreaSeries(value: dxChartSeriesTypesFullStackedAreaSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullStackedAreaSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullStackedAreaSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullStackedAreaSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withFullStackedBarSeries(value: dxChartSeriesTypesFullStackedBarSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullStackedBarSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullStackedBarSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullStackedBarSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withFullStackedLineSeries(value: dxChartSeriesTypesFullStackedLineSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullStackedLineSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullStackedLineSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullStackedLineSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withFullStackedSplineAreaSeries(value: dxChartSeriesTypesFullStackedSplineAreaSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullStackedSplineAreaSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullStackedSplineAreaSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullStackedSplineAreaSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withFullStackedSplineSeries(value: dxChartSeriesTypesFullStackedSplineSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullStackedSplineSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullStackedSplineSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullStackedSplineSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withLineSeries(value: dxChartSeriesTypesLineSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeAreaSeries(value: dxChartSeriesTypesRangeAreaSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeAreaSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeAreaSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeAreaSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeBarSeries(value: dxChartSeriesTypesRangeBarSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeBarSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeBarSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeBarSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withScatterSeries(value: dxChartSeriesTypesScatterSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScatterSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScatterSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScatterSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withSplineAreaSeries(value: dxChartSeriesTypesSplineAreaSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplineAreaSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplineAreaSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplineAreaSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withSplineSeries(value: dxChartSeriesTypesSplineSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplineSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplineSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplineSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withStackedAreaSeries(value: dxChartSeriesTypesStackedAreaSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackedAreaSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedAreaSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackedAreaSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withStackedBarSeries(value: dxChartSeriesTypesStackedBarSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackedBarSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedBarSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackedBarSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withStackedLineSeries(value: dxChartSeriesTypesStackedLineSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackedLineSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedLineSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackedLineSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withStackedSplineAreaSeries(value: dxChartSeriesTypesStackedSplineAreaSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackedSplineAreaSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedSplineAreaSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackedSplineAreaSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withStackedSplineSeries(value: dxChartSeriesTypesStackedSplineSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackedSplineSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedSplineSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackedSplineSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withStepAreaSeries(value: dxChartSeriesTypesStepAreaSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepAreaSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepAreaSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepAreaSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withStepLineSeries(value: dxChartSeriesTypesStepLineSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepLineSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepLineSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepLineSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withStockSeries(value: dxChartSeriesTypesStockSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StockSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStockSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StockSeries")(js.undefined)
        ret
    }
  }
  
}

