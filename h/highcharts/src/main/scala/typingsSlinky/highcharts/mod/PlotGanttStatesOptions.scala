package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotGanttStatesOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Options for the hovered point. These
    * settings override the normal state options when a point is moused over or
    * touched.
    */
  var hover: js.UndefOr[PlotGanttStatesHoverOptions] = js.native
  /**
    * (Gantt) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotGanttStatesInactiveOptions] = js.native
  /**
    * (Gantt) The normal state of a series, or for point items in column, pie
    * and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotGanttStatesNormalOptions] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Options for the selected point. These
    * settings override the normal state options when a point is selected.
    */
  var select: js.UndefOr[PlotGanttStatesSelectOptions] = js.native
}

object PlotGanttStatesOptions {
  @scala.inline
  def apply(): PlotGanttStatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotGanttStatesOptions]
  }
  @scala.inline
  implicit class PlotGanttStatesOptionsOps[Self <: PlotGanttStatesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHover(value: PlotGanttStatesHoverOptions): Self = {
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
    def withInactive(value: PlotGanttStatesInactiveOptions): Self = {
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
    def withNormal(value: PlotGanttStatesNormalOptions): Self = {
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
    def withSelect(value: PlotGanttStatesSelectOptions): Self = {
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

