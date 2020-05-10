package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.clear
import typingsSlinky.devextreme.devextremeStrings.copy
import typingsSlinky.devextreme.devextremeStrings.create
import typingsSlinky.devextreme.devextremeStrings.delete
import typingsSlinky.devextreme.devextremeStrings.download
import typingsSlinky.devextreme.devextremeStrings.move
import typingsSlinky.devextreme.devextremeStrings.refresh
import typingsSlinky.devextreme.devextremeStrings.rename
import typingsSlinky.devextreme.devextremeStrings.separator
import typingsSlinky.devextreme.devextremeStrings.showNavPane
import typingsSlinky.devextreme.devextremeStrings.upload
import typingsSlinky.devextreme.devextremeStrings.viewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFileManagerToolbarItem extends dxToolbarItem {
  /** Specifies the toolbar item's name. */
  var name: js.UndefOr[
    showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator | String
  ] = js.native
}

object dxFileManagerToolbarItem {
  @scala.inline
  def apply(): dxFileManagerToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerToolbarItem]
  }
  @scala.inline
  implicit class dxFileManagerToolbarItemOps[Self <: dxFileManagerToolbarItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(
      value: showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator | String
    ): Self = {
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

