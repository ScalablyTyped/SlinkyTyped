package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotKeltnerchannelsBottomLineOptions extends js.Object {
  /**
    * (Highstock) Styles for a bottom line.
    */
  var styles: js.UndefOr[PlotKeltnerchannelsBottomLineStylesOptions] = js.native
}

object PlotKeltnerchannelsBottomLineOptions {
  @scala.inline
  def apply(): PlotKeltnerchannelsBottomLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotKeltnerchannelsBottomLineOptions]
  }
  @scala.inline
  implicit class PlotKeltnerchannelsBottomLineOptionsOps[Self <: PlotKeltnerchannelsBottomLineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyles(value: PlotKeltnerchannelsBottomLineStylesOptions): Self = {
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

