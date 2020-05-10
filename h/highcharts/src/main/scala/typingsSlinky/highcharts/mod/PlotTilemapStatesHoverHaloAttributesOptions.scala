package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotTilemapStatesHoverHaloAttributesOptions extends js.Object {
  var zIndex: js.UndefOr[Double] = js.native
}

object PlotTilemapStatesHoverHaloAttributesOptions {
  @scala.inline
  def apply(): PlotTilemapStatesHoverHaloAttributesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTilemapStatesHoverHaloAttributesOptions]
  }
  @scala.inline
  implicit class PlotTilemapStatesHoverHaloAttributesOptionsOps[Self <: PlotTilemapStatesHoverHaloAttributesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

