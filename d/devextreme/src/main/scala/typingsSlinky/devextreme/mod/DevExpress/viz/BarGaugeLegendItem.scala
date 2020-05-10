package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarGaugeLegendItem extends BaseLegendItem {
  /** The bar that the legend item represents. */
  var item: js.UndefOr[BarGaugeBarInfo] = js.native
}

object BarGaugeLegendItem {
  @scala.inline
  def apply(): BarGaugeLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarGaugeLegendItem]
  }
  @scala.inline
  implicit class BarGaugeLegendItemOps[Self <: BarGaugeLegendItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: BarGaugeBarInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
  }
  
}

