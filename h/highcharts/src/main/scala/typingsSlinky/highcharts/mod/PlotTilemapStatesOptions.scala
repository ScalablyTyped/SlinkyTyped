package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotTilemapStatesOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Options for the hovered series. These settings
    * override the normal state options when a series is moused over or
    * touched.
    */
  var hover: js.UndefOr[PlotTilemapStatesHoverOptions] = js.native
  /**
    * (Highcharts, Highmaps) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotTilemapStatesInactiveOptions] = js.native
  /**
    * (Highcharts, Highmaps) The normal state of a series, or for point items
    * in column, pie and similar series. Currently only used for setting
    * animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotTilemapStatesNormalOptions] = js.native
  /**
    * (Highcharts, Highmaps) Specific options for point in selected states,
    * after being selected by allowPointSelect or programmatically.
    */
  var select: js.UndefOr[PlotTilemapStatesSelectOptions] = js.native
}

object PlotTilemapStatesOptions {
  @scala.inline
  def apply(): PlotTilemapStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTilemapStatesOptions]
  }
  @scala.inline
  implicit class PlotTilemapStatesOptionsOps[Self <: PlotTilemapStatesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHover(value: PlotTilemapStatesHoverOptions): Self = {
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
    def withInactive(value: PlotTilemapStatesInactiveOptions): Self = {
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
    def withNormal(value: PlotTilemapStatesNormalOptions): Self = {
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
    def withSelect(value: PlotTilemapStatesSelectOptions): Self = {
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

