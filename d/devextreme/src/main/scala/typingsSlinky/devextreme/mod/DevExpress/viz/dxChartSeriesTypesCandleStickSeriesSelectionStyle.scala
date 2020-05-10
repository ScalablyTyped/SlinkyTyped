package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures the appearance adopted by the series when a user selects it. */
@js.native
trait dxChartSeriesTypesCandleStickSeriesSelectionStyle extends dxChartSeriesTypesCommonSeriesSelectionStyle {
  /** Configures hatching that applies when a user selects the series. */
  @JSName("hatching")
  var hatching_dxChartSeriesTypesCandleStickSeriesSelectionStyle: js.UndefOr[dxChartSeriesTypesCandleStickSeriesSelectionStyleHatching] = js.native
}

object dxChartSeriesTypesCandleStickSeriesSelectionStyle {
  @scala.inline
  def apply(): dxChartSeriesTypesCandleStickSeriesSelectionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCandleStickSeriesSelectionStyle]
  }
  @scala.inline
  implicit class dxChartSeriesTypesCandleStickSeriesSelectionStyleOps[Self <: dxChartSeriesTypesCandleStickSeriesSelectionStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHatching(value: dxChartSeriesTypesCandleStickSeriesSelectionStyleHatching): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hatching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHatching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hatching")(js.undefined)
        ret
    }
  }
  
}

