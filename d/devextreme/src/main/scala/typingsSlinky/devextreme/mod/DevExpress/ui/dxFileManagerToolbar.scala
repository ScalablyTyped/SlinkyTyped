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
trait dxFileManagerToolbar extends js.Object {
  /** Configures settings of the toolbar items that are visible when users select files. */
  var fileSelectionItems: js.UndefOr[
    js.Array[
      dxFileManagerToolbarItem | showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator
    ]
  ] = js.native
  /** Configures toolbar items' settings. */
  var items: js.UndefOr[
    js.Array[
      dxFileManagerToolbarItem | showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator
    ]
  ] = js.native
}

object dxFileManagerToolbar {
  @scala.inline
  def apply(): dxFileManagerToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerToolbar]
  }
  @scala.inline
  implicit class dxFileManagerToolbarOps[Self <: dxFileManagerToolbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileSelectionItems(
      value: js.Array[
          dxFileManagerToolbarItem | showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSelectionItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSelectionItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSelectionItems")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(
      value: js.Array[
          dxFileManagerToolbarItem | showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator
        ]
    ): Self = {
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

