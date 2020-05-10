package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotMaplineStatesNormalOptions extends js.Object {
  /**
    * (Highmaps) Animation when returning to normal state after hovering.
    */
  var animation: js.UndefOr[Boolean] = js.native
}

object PlotMaplineStatesNormalOptions {
  @scala.inline
  def apply(): PlotMaplineStatesNormalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMaplineStatesNormalOptions]
  }
  @scala.inline
  implicit class PlotMaplineStatesNormalOptionsOps[Self <: PlotMaplineStatesNormalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: Boolean): Self = {
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

