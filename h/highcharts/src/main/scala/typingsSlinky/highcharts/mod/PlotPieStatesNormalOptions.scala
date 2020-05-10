package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotPieStatesNormalOptions extends js.Object {
  /**
    * (Highcharts) Animation when returning to normal state after hovering.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.native
}

object PlotPieStatesNormalOptions {
  @scala.inline
  def apply(): PlotPieStatesNormalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPieStatesNormalOptions]
  }
  @scala.inline
  implicit class PlotPieStatesNormalOptionsOps[Self <: PlotPieStatesNormalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: Boolean | AnimationOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
  }
  
}

