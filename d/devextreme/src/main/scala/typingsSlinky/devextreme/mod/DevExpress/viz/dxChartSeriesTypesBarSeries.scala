package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.allArgumentPoints
import typingsSlinky.devextreme.devextremeStrings.allSeriesPoints
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.onlyPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes settings supported by a series of the bar type. */
@js.native
trait dxChartSeriesTypesBarSeries extends dxChartSeriesTypesCommonSeries {
  /** Configures data aggregation for the series. */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesBarSeries: js.UndefOr[dxChartSeriesTypesBarSeriesAggregation] = js.native
  /** Specifies series elements to be highlighted when a user points to a series. */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesBarSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.native
  /** Configures point labels. */
  @JSName("label")
  var label_dxChartSeriesTypesBarSeries: js.UndefOr[dxChartSeriesTypesBarSeriesLabel] = js.native
  /** Specifies series elements to be highlighted when a user selects a bar. */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesBarSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.native
}

object dxChartSeriesTypesBarSeries {
  @scala.inline
  def apply(): dxChartSeriesTypesBarSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesBarSeries]
  }
  @scala.inline
  implicit class dxChartSeriesTypesBarSeriesOps[Self <: dxChartSeriesTypesBarSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregation(value: dxChartSeriesTypesBarSeriesAggregation): Self = {
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
    def withHoverMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = {
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
    def withLabel(value: dxChartSeriesTypesBarSeriesLabel): Self = {
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
    def withSelectionMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = {
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

