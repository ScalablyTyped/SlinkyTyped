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

trait dxFileManagerToolbar extends js.Object {
  /** Configures settings of the toolbar items that are visible when users select files. */
  var fileSelectionItems: js.UndefOr[
    js.Array[
      dxFileManagerToolbarItem | showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator
    ]
  ] = js.undefined
  /** Configures toolbar items' settings. */
  var items: js.UndefOr[
    js.Array[
      dxFileManagerToolbarItem | showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator
    ]
  ] = js.undefined
}

object dxFileManagerToolbar {
  @scala.inline
  def apply(
    fileSelectionItems: js.Array[
      dxFileManagerToolbarItem | showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator
    ] = null,
    items: js.Array[
      dxFileManagerToolbarItem | showNavPane | create | upload | refresh | viewSwitcher | download | move | copy | rename | delete | clear | separator
    ] = null
  ): dxFileManagerToolbar = {
    val __obj = js.Dynamic.literal()
    if (fileSelectionItems != null) __obj.updateDynamic("fileSelectionItems")(fileSelectionItems.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFileManagerToolbar]
  }
}

