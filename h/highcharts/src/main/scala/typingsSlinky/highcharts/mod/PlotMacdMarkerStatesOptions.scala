package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotMacdMarkerStatesOptions extends js.Object {
  /**
    * (Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotMacdMarkerStatesHoverOptions] = js.native
  var inactive: js.UndefOr[PlotMacdMarkerStatesInactiveOptions] = js.native
  /**
    * (Highstock) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotMacdMarkerStatesNormalOptions] = js.native
  /**
    * (Highstock) The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the `series.allowPointSelect` option to
    * true.
    */
  var select: js.UndefOr[PlotMacdMarkerStatesSelectOptions] = js.native
}

object PlotMacdMarkerStatesOptions {
  @scala.inline
  def apply(): PlotMacdMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMacdMarkerStatesOptions]
  }
  @scala.inline
  implicit class PlotMacdMarkerStatesOptionsOps[Self <: PlotMacdMarkerStatesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHover(value: PlotMacdMarkerStatesHoverOptions): Self = {
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
    def withInactive(value: PlotMacdMarkerStatesInactiveOptions): Self = {
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
    def withNormal(value: PlotMacdMarkerStatesNormalOptions): Self = {
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
    def withSelect(value: PlotMacdMarkerStatesSelectOptions): Self = {
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

