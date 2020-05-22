package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItem extends js.Object {
  var accelerator: String
  var checked: Boolean
  var click: js.Function
  var commandId: Double
  var enabled: Boolean
  var icon: NativeImage_
  var id: String
  var label: String
  var menu: Menu
  var registerAccelerator: Boolean
  var role: String
  var sublabel: String
  var submenu: Menu
  var `type`: String
  var visible: Boolean
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
}

