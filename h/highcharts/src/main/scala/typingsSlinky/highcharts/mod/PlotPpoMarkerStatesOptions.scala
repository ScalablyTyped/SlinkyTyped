package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotPpoMarkerStatesOptions extends js.Object {
  /**
    * (Highstock) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotPpoMarkerStatesHoverOptions] = js.native
  var inactive: js.UndefOr[PlotPpoMarkerStatesInactiveOptions] = js.native
  /**
    * (Highstock) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotPpoMarkerStatesNormalOptions] = js.native
  /**
    * (Highstock) The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the `series.allowPointSelect` option to
    * true.
    */
  var select: js.UndefOr[PlotPpoMarkerStatesSelectOptions] = js.native
}

object PlotPpoMarkerStatesOptions {
  @scala.inline
  def apply(): PlotPpoMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPpoMarkerStatesOptions]
  }
  @scala.inline
  implicit class PlotPpoMarkerStatesOptionsOps[Self <: PlotPpoMarkerStatesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHover(value: PlotPpoMarkerStatesHoverOptions): Self = {
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
    def withInactive(value: PlotPpoMarkerStatesInactiveOptions): Self = {
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
    def withNormal(value: PlotPpoMarkerStatesNormalOptions): Self = {
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
    def withSelect(value: PlotPpoMarkerStatesSelectOptions): Self = {
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

