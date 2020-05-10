package typingsSlinky.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuSettings extends js.Object {
  /** Gets or sets a value that indicates whether to add custom contextMenu items.
    * @Default {Array}
    */
  var customMenuItems: js.UndefOr[js.Array[ContextMenuSettingsCustomMenuItem]] = js.native
  /** Gets or sets a value that indicates the list of items needs to be disable from default context menu items.
    * @Default {Array}
    */
  var disableDefaultItems: js.UndefOr[js.Array[_]] = js.native
  /** To enable context menu.All default context menu will show.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** Its used to add specific default context menu items.
    * @Default {Array}
    */
  var menuItems: js.UndefOr[js.Array[_]] = js.native
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
    def withCustomMenuItems(value: js.Array[ContextMenuSettingsCustomMenuItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMenuItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMenuItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMenuItems")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableDefaultItems(value: js.Array[_]): Self = {
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
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItems")(js.undefined)
        ret
    }
  }
  
}

