package typingsSlinky.jpm.panelMod

import typingsSlinky.jpm.FFAddonSDK.ToggleButton
import typingsSlinky.jpm.FFAddonSDK.Widget
import typingsSlinky.jpm.anon.Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jpm.FFAddonSDK.ToggleButton
  - typingsSlinky.jpm.FFAddonSDK.Widget
  - typingsSlinky.jpm.anon.Bottom
*/
trait PanelPosition extends js.Object

object PanelPosition {
  @scala.inline
  implicit def apply(value: Bottom): PanelPosition = value.asInstanceOf[PanelPosition]
  @scala.inline
  implicit def apply(value: ToggleButton): PanelPosition = value.asInstanceOf[PanelPosition]
  @scala.inline
  implicit def apply(value: Widget): PanelPosition = value.asInstanceOf[PanelPosition]
}

