package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotFunnel3dLastVisiblePriceLabelOptions extends js.Object {
  /**
    * (Highstock) Enable or disable the label.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object PlotFunnel3dLastVisiblePriceLabelOptions {
  @scala.inline
  def apply(): PlotFunnel3dLastVisiblePriceLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotFunnel3dLastVisiblePriceLabelOptions]
  }
  @scala.inline
  implicit class PlotFunnel3dLastVisiblePriceLabelOptionsOps[Self <: PlotFunnel3dLastVisiblePriceLabelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
  }
  
}

