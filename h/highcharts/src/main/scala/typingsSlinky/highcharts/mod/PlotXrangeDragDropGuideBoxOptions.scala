package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotXrangeDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Style options for the guide box default
    * state.
    */
  var default: js.UndefOr[PlotXrangeDragDropGuideBoxDefaultOptions] = js.native
}

object PlotXrangeDragDropGuideBoxOptions {
  @scala.inline
  def apply(): PlotXrangeDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotXrangeDragDropGuideBoxOptions]
  }
  @scala.inline
  implicit class PlotXrangeDragDropGuideBoxOptionsOps[Self <: PlotXrangeDragDropGuideBoxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: PlotXrangeDragDropGuideBoxDefaultOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
  }
  
}

