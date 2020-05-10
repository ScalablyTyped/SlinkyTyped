package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures the appearance adopted by the series when a user points to it. */
@js.native
trait dxChartSeriesTypesStepAreaSeriesHoverStyle extends dxChartSeriesTypesCommonSeriesHoverStyle {
  /** Configures the appearance adopted by the series border (in area-like series) or the series point border (in bar-like and bubble series) when a user points to the series. */
  @JSName("border")
  var border_dxChartSeriesTypesStepAreaSeriesHoverStyle: js.UndefOr[dxChartSeriesTypesStepAreaSeriesHoverStyleBorder] = js.native
}

object dxChartSeriesTypesStepAreaSeriesHoverStyle {
  @scala.inline
  def apply(): dxChartSeriesTypesStepAreaSeriesHoverStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesStepAreaSeriesHoverStyle]
  }
  @scala.inline
  implicit class dxChartSeriesTypesStepAreaSeriesHoverStyleOps[Self <: dxChartSeriesTypesStepAreaSeriesHoverStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: dxChartSeriesTypesStepAreaSeriesHoverStyleBorder): Self = {
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
  }
  
}

