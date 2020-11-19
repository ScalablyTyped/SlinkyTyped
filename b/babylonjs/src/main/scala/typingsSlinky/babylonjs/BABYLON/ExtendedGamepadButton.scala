package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.std.GamepadButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedGamepadButton extends GamepadButton
object ExtendedGamepadButton {
  
  @scala.inline
  def apply(pressed: Boolean, touched: Boolean, value: Double): ExtendedGamepadButton = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedGamepadButton]
  }
}
