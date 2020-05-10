package typingsSlinky.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuSettings extends js.Object {
  /** Option for adding items to context menu.
    * @Default {[]}
    */
  var contextMenuItems: js.UndefOr[js.Array[ContextMenuItems | String]] = js.native
  /** Shows/hides the context menu.
    * @Default {false}
    */
  var showContextMenu: js.UndefOr[Boolean] = js.native
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
    def withContextMenuItems(value: js.Array[ContextMenuItems | String]): Self = {
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
    def withShowContextMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showContextMenu")(js.undefined)
        ret
    }
  }
  
}

