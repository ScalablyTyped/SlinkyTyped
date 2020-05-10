package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.excludePoints
import typingsSlinky.devextreme.devextremeStrings.includePoints
import typingsSlinky.devextreme.devextremeStrings.nearestPoint
import typingsSlinky.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes settings supported by a series of the step rea type. */
@js.native
trait dxChartSeriesTypesStepAreaSeries extends dxChartSeriesTypesCommonSeries {
  /** Configures data aggregation for the series. */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesAggregation] = js.native
  /** Configures the series border (in area-like series) or the series point border (in bar-like and bubble series). */
  @JSName("border")
  var border_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesBorder] = js.native
  /** Specifies series elements to be highlighted when a user points to a series. */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesStepAreaSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.native
  /** Configures the appearance adopted by the series when a user points to it. */
  @JSName("hoverStyle")
  var hoverStyle_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesHoverStyle] = js.native
  /** Configures point labels. */
  @JSName("label")
  var label_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesLabel] = js.native
  /** Configures series points in scatter, line- and area-like series. */
  @JSName("point")
  var point_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesPoint] = js.native
  /** Specifies series elements to be highlighted when a user selects a series. */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesStepAreaSeries: js.UndefOr[includePoints | excludePoints | none] = js.native
  /** Configures the appearance adopted by the series when a user selects it. */
  @JSName("selectionStyle")
  var selectionStyle_dxChartSeriesTypesStepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeriesSelectionStyle] = js.native
}

object dxChartSeriesTypesStepAreaSeries {
  @scala.inline
  def apply(): dxChartSeriesTypesStepAreaSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesStepAreaSeries]
  }
  @scala.inline
  implicit class dxChartSeriesTypesStepAreaSeriesOps[Self <: dxChartSeriesTypesStepAreaSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregation(value: dxChartSeriesTypesStepAreaSeriesAggregation): Self = {
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
    def withBorder(value: dxChartSeriesTypesStepAreaSeriesBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
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
    def withHoverStyle(value: dxChartSeriesTypesStepAreaSeriesHoverStyle): Self = {
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
    def withLabel(value: dxChartSeriesTypesStepAreaSeriesLabel): Self = {
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
    def withPoint(value: dxChartSeriesTypesStepAreaSeriesPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(js.undefined)
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
    @scala.inline
    def withSelectionStyle(value: dxChartSeriesTypesStepAreaSeriesSelectionStyle): Self = {
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

