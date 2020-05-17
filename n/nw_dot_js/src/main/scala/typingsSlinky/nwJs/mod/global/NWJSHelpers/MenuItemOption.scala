package typingsSlinky.nwJs.mod.global.NWJSHelpers

import typingsSlinky.nwJs.mod.global.nw.Menu
import typingsSlinky.nwJs.nwJsStrings.checkbox
import typingsSlinky.nwJs.nwJsStrings.normal
import typingsSlinky.nwJs.nwJsStrings.separator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for MenuItem.
  */
@js.native
trait MenuItemOption extends js.Object {
  /**
    * {boolean} (Optional) Whether the checkbox is checked or not. It"s set to false by default.
    */
  var checked: js.UndefOr[Boolean] = js.native
  /**
    * {Function} (Optional) The callback function when item is triggered by mouse click or keyboard shortcut
    */
  var click: js.UndefOr[js.Function] = js.native
  /**
    * {boolean} (Optional) Whether the item is enabled or disabled. It"s set to true by default.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * {string} (Optional) Icon for normal item or checkbox
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * {string} (Optional) The key of the shortcut
    */
  var key: js.UndefOr[String] = js.native
  /**
    * {string} (Optional) Label for normal item or checkbox
    */
  var label: js.UndefOr[String] = js.native
  /**
    * {string} (Optional) The modifiers of the shortcut
    */
  var modifiers: js.UndefOr[String] = js.native
  /**
    * {nw.Menu} (Optional) A submenu
    */
  var submenu: js.UndefOr[Menu] = js.native
  /**
    * {string} (Optional) Tooltip for normal item or checkbox
    */
  var tooltip: js.UndefOr[String] = js.native
  /**
    * {string} (Optional) The type of the item. Three types are accepted: normal, checkbox, separator
    */
  var `type`: js.UndefOr[String | normal | checkbox | separator] = js.native
}

object MenuItemOption {
  @scala.inline
  def apply(): MenuItemOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemOption]
  }
  @scala.inline
  implicit class MenuItemOptionOps[Self <: MenuItemOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmenu(value: Menu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenu")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String | normal | checkbox | separator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

