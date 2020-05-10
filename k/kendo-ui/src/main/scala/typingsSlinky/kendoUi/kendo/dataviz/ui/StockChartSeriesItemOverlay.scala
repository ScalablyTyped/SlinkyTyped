package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockChartSeriesItemOverlay extends js.Object {
  var gradient: js.UndefOr[String] = js.native
}

object StockChartSeriesItemOverlay {
  @scala.inline
  def apply(): StockChartSeriesItemOverlay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartSeriesItemOverlay]
  }
  @scala.inline
  implicit class StockChartSeriesItemOverlayOps[Self <: StockChartSeriesItemOverlay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGradient(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(js.undefined)
        ret
    }
  }
  
}

