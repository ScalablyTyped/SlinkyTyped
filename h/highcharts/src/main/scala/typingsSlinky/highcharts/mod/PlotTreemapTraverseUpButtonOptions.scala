package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotTreemapTraverseUpButtonOptions extends js.Object {
  /**
    * (Highcharts) The position of the button.
    */
  var position: js.UndefOr[PlotTreemapTraverseUpButtonPositionOptions] = js.native
}

object PlotTreemapTraverseUpButtonOptions {
  @scala.inline
  def apply(): PlotTreemapTraverseUpButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapTraverseUpButtonOptions]
  }
  @scala.inline
  implicit class PlotTreemapTraverseUpButtonOptionsOps[Self <: PlotTreemapTraverseUpButtonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: PlotTreemapTraverseUpButtonPositionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

