package typingsSlinky.devextreme

import typingsSlinky.devextreme.mod.DevExpress.viz.dxFunnelItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemDxFunnelItem extends js.Object {
  var item: js.UndefOr[dxFunnelItem] = js.native
  var text: js.UndefOr[String] = js.native
}

object AnonItemDxFunnelItem {
  @scala.inline
  def apply(): AnonItemDxFunnelItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonItemDxFunnelItem]
  }
  @scala.inline
  implicit class AnonItemDxFunnelItemOps[Self <: AnonItemDxFunnelItem] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

