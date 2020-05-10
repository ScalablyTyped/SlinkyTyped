package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsOptions extends js.Object {
  /**
    * (Highstock) Definitions of buttons in Stock Tools GUI.
    */
  var gui: js.UndefOr[StockToolsGuiOptions] = js.native
}

object StockToolsOptions {
  @scala.inline
  def apply(): StockToolsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsOptions]
  }
  @scala.inline
  implicit class StockToolsOptionsOps[Self <: StockToolsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGui(value: StockToolsGuiOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gui")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGui: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gui")(js.undefined)
        ret
    }
  }
  
}

