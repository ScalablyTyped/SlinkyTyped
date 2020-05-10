package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotTilemapDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotTilemapDragDropGuideBoxDefaultOptions] = js.native
}

object PlotTilemapDragDropGuideBoxOptions {
  @scala.inline
  def apply(): PlotTilemapDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTilemapDragDropGuideBoxOptions]
  }
  @scala.inline
  implicit class PlotTilemapDragDropGuideBoxOptionsOps[Self <: PlotTilemapDragDropGuideBoxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: PlotTilemapDragDropGuideBoxDefaultOptions): Self = {
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

