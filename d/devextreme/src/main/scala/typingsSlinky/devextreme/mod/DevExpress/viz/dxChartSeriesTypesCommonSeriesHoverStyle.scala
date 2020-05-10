package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.dash
import typingsSlinky.devextreme.devextremeStrings.dot
import typingsSlinky.devextreme.devextremeStrings.longDash
import typingsSlinky.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures the appearance adopted by the series when a user points to it. */
@js.native
trait dxChartSeriesTypesCommonSeriesHoverStyle extends js.Object {
  /** Configures the appearance adopted by the series border (in area-like series) or the series point border (in bar-like and bubble series) when a user points to the series. */
  var border: js.UndefOr[dxChartSeriesTypesCommonSeriesHoverStyleBorder] = js.native
  /** Specifies the color of the series in the hovered state. */
  var color: js.UndefOr[String] = js.native
  /** Specifies the dash style of the series line when the series is in the hovered state. Applies only to line-like series. */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.native
  /** Configures hatching that applies when a user points to the series. */
  var hatching: js.UndefOr[dxChartSeriesTypesCommonSeriesHoverStyleHatching] = js.native
  /** Specifies the pixel-measured width of the series line when the series is in the hovered state. */
  var width: js.UndefOr[Double] = js.native
}

object dxChartSeriesTypesCommonSeriesHoverStyle {
  @scala.inline
  def apply(): dxChartSeriesTypesCommonSeriesHoverStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesHoverStyle]
  }
  @scala.inline
  implicit class dxChartSeriesTypesCommonSeriesHoverStyleOps[Self <: dxChartSeriesTypesCommonSeriesHoverStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: dxChartSeriesTypesCommonSeriesHoverStyleBorder): Self = {
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
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDashStyle(value: dash | dot | longDash | solid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHatching(value: dxChartSeriesTypesCommonSeriesHoverStyleHatching): Self = {
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
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

