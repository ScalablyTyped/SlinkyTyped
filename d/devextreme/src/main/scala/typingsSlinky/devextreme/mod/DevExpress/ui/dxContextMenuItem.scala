package typingsSlinky.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxContextMenuItem extends dxMenuBaseItem {
  /** Specifies nested menu items. */
  @JSName("items")
  var items_dxContextMenuItem: js.UndefOr[js.Array[dxContextMenuItem]] = js.native
}

object dxContextMenuItem {
  @scala.inline
  def apply(): dxContextMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxContextMenuItem]
  }
  @scala.inline
  implicit class dxContextMenuItemOps[Self <: dxContextMenuItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[dxContextMenuItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
  }
  
}

