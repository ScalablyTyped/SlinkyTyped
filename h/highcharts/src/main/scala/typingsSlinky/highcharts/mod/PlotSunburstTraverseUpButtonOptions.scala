package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotSunburstTraverseUpButtonOptions extends js.Object {
  /**
    * (Highcharts) The position of the button.
    */
  var position: js.UndefOr[PlotSunburstTraverseUpButtonPositionOptions] = js.native
}

object PlotSunburstTraverseUpButtonOptions {
  @scala.inline
  def apply(): PlotSunburstTraverseUpButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSunburstTraverseUpButtonOptions]
  }
  @scala.inline
  implicit class PlotSunburstTraverseUpButtonOptionsOps[Self <: PlotSunburstTraverseUpButtonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: PlotSunburstTraverseUpButtonPositionOptions): Self = {
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

