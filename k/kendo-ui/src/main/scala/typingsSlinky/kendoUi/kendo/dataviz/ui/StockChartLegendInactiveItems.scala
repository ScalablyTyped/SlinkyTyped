package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockChartLegendInactiveItems extends js.Object {
  var labels: js.UndefOr[StockChartLegendInactiveItemsLabels] = js.native
  var markers: js.UndefOr[StockChartLegendInactiveItemsMarkers] = js.native
}

object StockChartLegendInactiveItems {
  @scala.inline
  def apply(): StockChartLegendInactiveItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartLegendInactiveItems]
  }
  @scala.inline
  implicit class StockChartLegendInactiveItemsOps[Self <: StockChartLegendInactiveItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabels(value: StockChartLegendInactiveItemsLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkers(value: StockChartLegendInactiveItemsMarkers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(js.undefined)
        ret
    }
  }
  
}

