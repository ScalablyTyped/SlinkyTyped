package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuSettings extends js.Object {
  /** Gets or sets a value that indicates whether to add the default context menu actions as a context menu items If enableContextMenu is true it will show all the items related to the
    * target, if you want selected items from contextmenu you have to mention in the contextMenuItems
    * @Default {[]}
    */
  var contextMenuItems: js.UndefOr[js.Array[_]] = js.native
  /** Gets or sets a value that indicates whether to add custom contextMenu items within the toolbar to perform any action in the grid
    * @Default {[]}
    */
  var customContextMenuItems: js.UndefOr[js.Array[_]] = js.native
  /** Gets or sets a value that indicates whether to disable the default context menu items in the grid.
    * @Default {false}
    */
  var disableDefaultItems: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the context menu action in the grid.
    * @Default {false}
    */
  var enableContextMenu: js.UndefOr[Boolean] = js.native
  /** Used to get or set the subMenu to the corresponding custom context menu item.
    */
  var subContextMenu: js.UndefOr[js.Array[ContextMenuSettingsSubContextMenu]] = js.native
}

object ContextMenuSettings {
  @scala.inline
  def apply(): ContextMenuSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuSettings]
  }
  @scala.inline
  implicit class ContextMenuSettingsOps[Self <: ContextMenuSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextMenuItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenuItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuItems")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomContextMenuItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customContextMenuItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomContextMenuItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customContextMenuItems")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableDefaultItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDefaultItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDefaultItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDefaultItems")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableContextMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withSubContextMenu(value: js.Array[ContextMenuSettingsSubContextMenu]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subContextMenu")(js.undefined)
        ret
    }
  }
  
}

