package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotGanttConnectorsAnimationOptions extends js.Object {
  var reversed: js.UndefOr[Boolean] = js.native
}

object PlotGanttConnectorsAnimationOptions {
  @scala.inline
  def apply(): PlotGanttConnectorsAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotGanttConnectorsAnimationOptions]
  }
  @scala.inline
  implicit class PlotGanttConnectorsAnimationOptionsOps[Self <: PlotGanttConnectorsAnimationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(js.undefined)
        ret
    }
  }
  
}

