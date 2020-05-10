package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotAroonAroonDownOptions extends js.Object {
  /**
    * (Highstock) Styles for an aroonDown line.
    */
  var styles: js.UndefOr[PlotAroonAroonDownStylesOptions] = js.native
}

object PlotAroonAroonDownOptions {
  @scala.inline
  def apply(): PlotAroonAroonDownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAroonAroonDownOptions]
  }
  @scala.inline
  implicit class PlotAroonAroonDownOptionsOps[Self <: PlotAroonAroonDownOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyles(value: PlotAroonAroonDownStylesOptions): Self = {
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

