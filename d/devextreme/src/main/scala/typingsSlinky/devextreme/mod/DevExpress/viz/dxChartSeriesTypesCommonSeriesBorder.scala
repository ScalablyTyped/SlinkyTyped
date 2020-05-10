package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.dash
import typingsSlinky.devextreme.devextremeStrings.dot
import typingsSlinky.devextreme.devextremeStrings.longDash
import typingsSlinky.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures the series border (in area-like series) or the series point border (in bar-like and bubble series). */
@js.native
trait dxChartSeriesTypesCommonSeriesBorder extends js.Object {
  /** Colors the series border (in area-like series) or the series point border (in bar-like and bubble series). */
  var color: js.UndefOr[String] = js.native
  /** Sets a dash style for the series border (in area-like series) or for the series point border (in bar-like and bubble series). */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.native
  /** Shows the series border (in area-like series) or the series point border (in bar-like and bubble series). */
  var visible: js.UndefOr[Boolean] = js.native
  /** Sets a pixel-measured width for the series border (in area-like series) or for the series point border (in bar-like and bubble series). */
  var width: js.UndefOr[Double] = js.native
}

object dxChartSeriesTypesCommonSeriesBorder {
  @scala.inline
  def apply(): dxChartSeriesTypesCommonSeriesBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesBorder]
  }
  @scala.inline
  implicit class dxChartSeriesTypesCommonSeriesBorderOps[Self <: dxChartSeriesTypesCommonSeriesBorder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
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

