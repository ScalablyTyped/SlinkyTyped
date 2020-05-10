package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes settings supported by a series of the scatter type. */
@js.native
trait dxChartSeriesTypesScatterSeries extends dxChartSeriesTypesCommonSeries {
  /** Configures data aggregation for the series. */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesScatterSeries: js.UndefOr[dxChartSeriesTypesScatterSeriesAggregation] = js.native
  /** Configures point labels. */
  @JSName("label")
  var label_dxChartSeriesTypesScatterSeries: js.UndefOr[dxChartSeriesTypesScatterSeriesLabel] = js.native
}

object dxChartSeriesTypesScatterSeries {
  @scala.inline
  def apply(): dxChartSeriesTypesScatterSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesScatterSeries]
  }
  @scala.inline
  implicit class dxChartSeriesTypesScatterSeriesOps[Self <: dxChartSeriesTypesScatterSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregation(value: dxChartSeriesTypesScatterSeriesAggregation): Self = {
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
    def withLabel(value: dxChartSeriesTypesScatterSeriesLabel): Self = {
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
  }
  
}

