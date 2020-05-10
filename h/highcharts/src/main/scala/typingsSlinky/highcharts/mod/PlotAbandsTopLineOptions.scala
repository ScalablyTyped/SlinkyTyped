package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotAbandsTopLineOptions extends js.Object {
  var styles: js.UndefOr[PlotAbandsTopLineStylesOptions] = js.native
}

object PlotAbandsTopLineOptions {
  @scala.inline
  def apply(): PlotAbandsTopLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAbandsTopLineOptions]
  }
  @scala.inline
  implicit class PlotAbandsTopLineOptionsOps[Self <: PlotAbandsTopLineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyles(value: PlotAbandsTopLineStylesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

