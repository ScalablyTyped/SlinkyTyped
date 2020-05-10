package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures the appearance adopted by the series when a user selects it. */
@js.native
trait dxChartSeriesTypesStepAreaSeriesSelectionStyle extends dxChartSeriesTypesCommonSeriesSelectionStyle {
  /** Configures the appearance adopted by the series border (in area-like series) or the series point border (in bar-like and bubble series) when a user selects the series. */
  @JSName("border")
  var border_dxChartSeriesTypesStepAreaSeriesSelectionStyle: js.UndefOr[dxChartSeriesTypesStepAreaSeriesSelectionStyleBorder] = js.native
}

object dxChartSeriesTypesStepAreaSeriesSelectionStyle {
  @scala.inline
  def apply(): dxChartSeriesTypesStepAreaSeriesSelectionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesStepAreaSeriesSelectionStyle]
  }
  @scala.inline
  implicit class dxChartSeriesTypesStepAreaSeriesSelectionStyleOps[Self <: dxChartSeriesTypesStepAreaSeriesSelectionStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: dxChartSeriesTypesStepAreaSeriesSelectionStyleBorder): Self = {
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

