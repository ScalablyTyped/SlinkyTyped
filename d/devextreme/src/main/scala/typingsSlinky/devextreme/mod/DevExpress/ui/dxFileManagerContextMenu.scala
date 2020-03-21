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

trait dxFileManagerContextMenu extends js.Object {
  /** Configures context menu items' settings. */
  var items: js.UndefOr[
    js.Array[
      dxFileManagerContextMenuItem | create | upload | refresh | download | move | copy | rename | delete
    ]
  ] = js.undefined
}

object dxFileManagerContextMenu {
  @scala.inline
  def apply(
    items: js.Array[
      dxFileManagerContextMenuItem | create | upload | refresh | download | move | copy | rename | delete
    ] = null
  ): dxFileManagerContextMenu = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFileManagerContextMenu]
  }
}

