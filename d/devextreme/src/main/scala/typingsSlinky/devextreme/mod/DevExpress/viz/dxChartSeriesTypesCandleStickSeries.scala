package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.allArgumentPoints
import typingsSlinky.devextreme.devextremeStrings.allSeriesPoints
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.onlyPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes settings supported by a series of the candlestick type. */
@js.native
trait dxChartSeriesTypesCandleStickSeries extends dxChartSeriesTypesCommonSeries {
  /** Configures data aggregation for the series. */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesCandleStickSeries: js.UndefOr[dxChartSeriesTypesCandleStickSeriesAggregation] = js.native
  /** Specifies series elements to be highlighted when a user pauses on a series. */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesCandleStickSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.native
  /** Configures the appearance adopted by the series when a user points to it. */
  @JSName("hoverStyle")
  var hoverStyle_dxChartSeriesTypesCandleStickSeries: js.UndefOr[dxChartSeriesTypesCandleStickSeriesHoverStyle] = js.native
  /** Configures point labels. */
  @JSName("label")
  var label_dxChartSeriesTypesCandleStickSeries: js.UndefOr[dxChartSeriesTypesCandleStickSeriesLabel] = js.native
  /** Specifies series elements to be highlighted when a user selects a point. */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesCandleStickSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.native
  /** Configures the appearance adopted by the series when a user selects it. */
  @JSName("selectionStyle")
  var selectionStyle_dxChartSeriesTypesCandleStickSeries: js.UndefOr[dxChartSeriesTypesCandleStickSeriesSelectionStyle] = js.native
}

object dxChartSeriesTypesCandleStickSeries {
  @scala.inline
  def apply(): dxChartSeriesTypesCandleStickSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCandleStickSeries]
  }
  @scala.inline
  implicit class dxChartSeriesTypesCandleStickSeriesOps[Self <: dxChartSeriesTypesCandleStickSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregation(value: dxChartSeriesTypesCandleStickSeriesAggregation): Self = {
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
    def withHoverStyle(value: dxChartSeriesTypesCandleStickSeriesHoverStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: dxChartSeriesTypesCandleStickSeriesLabel): Self = {
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
    @scala.inline
    def withSelectionStyle(value: dxChartSeriesTypesCandleStickSeriesSelectionStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStyle")(js.undefined)
        ret
    }
  }
  
}

