package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunnelLegendItem extends BaseLegendItem {
  /** The funnel item that the legend item represents. */
  var item: js.UndefOr[dxFunnelItem] = js.native
}

object FunnelLegendItem {
  @scala.inline
  def apply(): FunnelLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunnelLegendItem]
  }
  @scala.inline
  implicit class FunnelLegendItemOps[Self <: FunnelLegendItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: dxFunnelItem): Self = {
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

