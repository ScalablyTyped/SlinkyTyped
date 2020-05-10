package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartLegendInactiveItems extends js.Object {
  var labels: js.UndefOr[ChartLegendInactiveItemsLabels] = js.native
}

object ChartLegendInactiveItems {
  @scala.inline
  def apply(): ChartLegendInactiveItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendInactiveItems]
  }
  @scala.inline
  implicit class ChartLegendInactiveItemsOps[Self <: ChartLegendInactiveItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabels(value: ChartLegendInactiveItemsLabels): Self = {
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
  }
  
}

