package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotTrendlineStatesOptions extends js.Object {
  /**
    * (Highstock) Options for the hovered series. These settings override the
    * normal state options when a series is moused over or touched.
    */
  var hover: js.UndefOr[PlotTrendlineStatesHoverOptions] = js.native
  /**
    * (Highstock) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotTrendlineStatesInactiveOptions] = js.native
  /**
    * (Highstock) The normal state of a series, or for point items in column,
    * pie and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotTrendlineStatesNormalOptions] = js.native
  /**
    * (Highstock) Specific options for point in selected states, after being
    * selected by allowPointSelect or programmatically.
    */
  var select: js.UndefOr[PlotTrendlineStatesSelectOptions] = js.native
}

object PlotTrendlineStatesOptions {
  @scala.inline
  def apply(): PlotTrendlineStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTrendlineStatesOptions]
  }
  @scala.inline
  implicit class PlotTrendlineStatesOptionsOps[Self <: PlotTrendlineStatesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHover(value: PlotTrendlineStatesHoverOptions): Self = {
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
    def withInactive(value: PlotTrendlineStatesInactiveOptions): Self = {
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
    def withNormal(value: PlotTrendlineStatesNormalOptions): Self = {
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
    def withSelect(value: PlotTrendlineStatesSelectOptions): Self = {
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

