package typingsSlinky.jpm.toolbarMod

import typingsSlinky.jpm.FFAddonSDK.ActionButton
import typingsSlinky.jpm.FFAddonSDK.Frame
import typingsSlinky.jpm.FFAddonSDK.ToggleButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jpm.FFAddonSDK.Frame
  - typingsSlinky.jpm.FFAddonSDK.ActionButton
  - typingsSlinky.jpm.FFAddonSDK.ToggleButton
*/
trait ToolbarItem extends js.Object

object ToolbarItem {
  @scala.inline
  implicit def apply(value: ActionButton): ToolbarItem = value.asInstanceOf[ToolbarItem]
  @scala.inline
  implicit def apply(value: Frame): ToolbarItem = value.asInstanceOf[ToolbarItem]
  @scala.inline
  implicit def apply(value: ToggleButton): ToolbarItem = value.asInstanceOf[ToolbarItem]
}

