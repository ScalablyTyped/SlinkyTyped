package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItem extends js.Object {
  var accelerator: String = js.native
  var checked: Boolean = js.native
  var click: js.Function = js.native
  var commandId: Double = js.native
  var enabled: Boolean = js.native
  var icon: NativeImage_ = js.native
  var id: String = js.native
  var label: String = js.native
  var menu: Menu = js.native
  var registerAccelerator: Boolean = js.native
  var role: String = js.native
  var sublabel: String = js.native
  var submenu: Menu = js.native
  var `type`: String = js.native
  var visible: Boolean = js.native
}

object MenuItem {
  @scala.inline
  def apply(
    accelerator: String,
    checked: Boolean,
    click: js.Function,
    commandId: Double,
    enabled: Boolean,
    icon: NativeImage_,
    id: String,
    label: String,
    menu: Menu,
    registerAccelerator: Boolean,
    role: String,
    sublabel: String,
    submenu: Menu,
    `type`: String,
    visible: Boolean
  ): MenuItem = {
    val __obj = js.Dynamic.literal(accelerator = accelerator.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], commandId = commandId.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], registerAccelerator = registerAccelerator.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], sublabel = sublabel.asInstanceOf[js.Any], submenu = submenu.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItem]
  }
  @scala.inline
  implicit class MenuItemOps[Self <: MenuItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommandId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: NativeImage_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenu(value: Menu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisterAccelerator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerAccelerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSublabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sublabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmenu(value: Menu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

