package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.excludePoints
import typingsSlinky.devextreme.devextremeStrings.includePoints
import typingsSlinky.devextreme.devextremeStrings.nearestPoint
import typingsSlinky.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes settings supported by a series of the stacked spline type. */
@js.native
trait dxChartSeriesTypesStackedSplineSeries extends dxChartSeriesTypesCommonSeries {
  /** Configures data aggregation for the series. */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesStackedSplineSeries: js.UndefOr[dxChartSeriesTypesStackedSplineSeriesAggregation] = js.native
  /** Specifies series elements to be highlighted when a user points to a series. */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesStackedSplineSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.native
  /** Configures point labels. */
  @JSName("label")
  var label_dxChartSeriesTypesStackedSplineSeries: js.UndefOr[dxChartSeriesTypesStackedSplineSeriesLabel] = js.native
  /** Specifies series elements to be highlighted when a user selects a series. */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesStackedSplineSeries: js.UndefOr[includePoints | excludePoints | none] = js.native
}

object dxChartSeriesTypesStackedSplineSeries {
  @scala.inline
  def apply(): dxChartSeriesTypesStackedSplineSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesStackedSplineSeries]
  }
  @scala.inline
  implicit class dxChartSeriesTypesStackedSplineSeriesOps[Self <: dxChartSeriesTypesStackedSplineSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregation(value: dxChartSeriesTypesStackedSplineSeriesAggregation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregation")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverMode")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: dxChartSeriesTypesStackedSplineSeriesLabel): Self = {
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
    def withSelectionMode(value: includePoints | excludePoints | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
  }
  
}

