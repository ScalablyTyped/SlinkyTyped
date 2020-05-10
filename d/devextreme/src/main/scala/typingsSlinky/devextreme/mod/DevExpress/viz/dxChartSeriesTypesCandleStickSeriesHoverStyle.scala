package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures the appearance adopted by the series when a user points to it. */
@js.native
trait dxChartSeriesTypesCandleStickSeriesHoverStyle extends dxChartSeriesTypesCommonSeriesHoverStyle {
  /** Configures hatching that applies when a user points to the series. */
  @JSName("hatching")
  var hatching_dxChartSeriesTypesCandleStickSeriesHoverStyle: js.UndefOr[dxChartSeriesTypesCandleStickSeriesHoverStyleHatching] = js.native
}

object dxChartSeriesTypesCandleStickSeriesHoverStyle {
  @scala.inline
  def apply(): dxChartSeriesTypesCandleStickSeriesHoverStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCandleStickSeriesHoverStyle]
  }
  @scala.inline
  implicit class dxChartSeriesTypesCandleStickSeriesHoverStyleOps[Self <: dxChartSeriesTypesCandleStickSeriesHoverStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHatching(value: dxChartSeriesTypesCandleStickSeriesHoverStyleHatching): Self = {
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

