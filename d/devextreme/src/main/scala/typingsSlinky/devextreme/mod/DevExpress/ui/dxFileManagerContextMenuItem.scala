package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.copy
import typingsSlinky.devextreme.devextremeStrings.create
import typingsSlinky.devextreme.devextremeStrings.delete
import typingsSlinky.devextreme.devextremeStrings.download
import typingsSlinky.devextreme.devextremeStrings.move
import typingsSlinky.devextreme.devextremeStrings.refresh
import typingsSlinky.devextreme.devextremeStrings.rename
import typingsSlinky.devextreme.devextremeStrings.upload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFileManagerContextMenuItem extends dxContextMenuItem {
  /**  */
  @JSName("items")
  var items_dxFileManagerContextMenuItem: js.UndefOr[js.Array[dxFileManagerContextMenuItem]] = js.native
  /** Specifies the context menu item's name. */
  var name: js.UndefOr[create | upload | refresh | download | move | copy | rename | delete | String] = js.native
}

object dxFileManagerContextMenuItem {
  @scala.inline
  def apply(): dxFileManagerContextMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerContextMenuItem]
  }
  @scala.inline
  implicit class dxFileManagerContextMenuItemOps[Self <: dxFileManagerContextMenuItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[dxFileManagerContextMenuItem]): Self = {
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
    @scala.inline
    def withName(value: create | upload | refresh | download | move | copy | rename | delete | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

