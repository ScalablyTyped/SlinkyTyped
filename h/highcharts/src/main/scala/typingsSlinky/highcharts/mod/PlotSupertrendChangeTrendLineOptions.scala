package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotSupertrendChangeTrendLineOptions extends js.Object {
  var styles: js.UndefOr[PlotSupertrendChangeTrendLineStylesOptions] = js.native
}

object PlotSupertrendChangeTrendLineOptions {
  @scala.inline
  def apply(): PlotSupertrendChangeTrendLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSupertrendChangeTrendLineOptions]
  }
  @scala.inline
  implicit class PlotSupertrendChangeTrendLineOptionsOps[Self <: PlotSupertrendChangeTrendLineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyles(value: PlotSupertrendChangeTrendLineStylesOptions): Self = {
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

