package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.clearSelection
import typingsSlinky.devextreme.devextremeStrings.copy
import typingsSlinky.devextreme.devextremeStrings.create
import typingsSlinky.devextreme.devextremeStrings.delete
import typingsSlinky.devextreme.devextremeStrings.download
import typingsSlinky.devextreme.devextremeStrings.move
import typingsSlinky.devextreme.devextremeStrings.refresh
import typingsSlinky.devextreme.devextremeStrings.rename
import typingsSlinky.devextreme.devextremeStrings.separator
import typingsSlinky.devextreme.devextremeStrings.showNavPane
import typingsSlinky.devextreme.devextremeStrings.switchView
import typingsSlinky.devextreme.devextremeStrings.upload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFileManagerToolbar extends js.Object {
  /** @name dxFileManagerToolbar.fileSelectionItems */
  var fileSelectionItems: js.UndefOr[
    js.Array[
      dxFileManagerToolbarItem | showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator
    ]
  ] = js.native
  /** @name dxFileManagerToolbar.items */
  var items: js.UndefOr[
    js.Array[
      dxFileManagerToolbarItem | showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFileSelectionItemsVarargs(
      value: (dxFileManagerToolbarItem | showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator)*
    ): Self = this.set("fileSelectionItems", js.Array(value :_*))
    @scala.inline
    def setFileSelectionItems(
      value: js.Array[
          dxFileManagerToolbarItem | showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator
        ]
    ): Self = this.set("fileSelectionItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSelectionItems: Self = this.set("fileSelectionItems", js.undefined)
    @scala.inline
    def setItemsVarargs(
      value: (dxFileManagerToolbarItem | showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator)*
    ): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(
      value: js.Array[
          dxFileManagerToolbarItem | showNavPane | create | upload | refresh | switchView | download | move | copy | rename | delete | clearSelection | separator
        ]
    ): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

