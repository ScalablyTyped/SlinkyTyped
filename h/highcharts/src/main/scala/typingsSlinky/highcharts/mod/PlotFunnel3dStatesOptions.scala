package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotFunnel3dStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Options for the hovered point. These
    * settings override the normal state options when a point is moused over or
    * touched.
    */
  var hover: js.UndefOr[PlotFunnel3dStatesHoverOptions] = js.native
  /**
    * (Highcharts) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotFunnel3dStatesInactiveOptions] = js.native
  /**
    * (Highcharts) The normal state of a series, or for point items in column,
    * pie and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotFunnel3dStatesNormalOptions] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Options for the selected point. These
    * settings override the normal state options when a point is selected.
    */
  var select: js.UndefOr[PlotFunnel3dStatesSelectOptions] = js.native
}

object PlotFunnel3dStatesOptions {
  @scala.inline
  def apply(): PlotFunnel3dStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotFunnel3dStatesOptions]
  }
  @scala.inline
  implicit class PlotFunnel3dStatesOptionsOps[Self <: PlotFunnel3dStatesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHover(value: PlotFunnel3dStatesHoverOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.undefined)
        ret
    }
    @scala.inline
    def withInactive(value: PlotFunnel3dStatesInactiveOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactive")(js.undefined)
        ret
    }
    @scala.inline
    def withNormal(value: PlotFunnel3dStatesNormalOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: PlotFunnel3dStatesSelectOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
  }
  
}

