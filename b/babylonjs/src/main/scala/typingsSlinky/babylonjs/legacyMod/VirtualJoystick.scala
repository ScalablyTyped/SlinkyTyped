package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.HTMLCanvasElement
import typingsSlinky.babylonjs.anon.PartialVirtualJoystickCus
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "VirtualJoystick")
@js.native
/**
  * Creates a new virtual joystick
  * @param leftJoystick defines that the joystick is for left hand (false by default)
  * @param customizations Defines the options we want to customize the VirtualJoystick
  */
class VirtualJoystick ()
  extends typingsSlinky.babylonjs.indexMod.VirtualJoystick {
  def this(leftJoystick: Boolean) = this()
  def this(leftJoystick: js.UndefOr[scala.Nothing], customizations: PartialVirtualJoystickCus) = this()
  def this(leftJoystick: Boolean, customizations: PartialVirtualJoystickCus) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "VirtualJoystick")
@js.native
object VirtualJoystick extends js.Object {
  
  /**
    * Canvas the virtual joystick will render onto, default z-index of this is 5
    */
  var Canvas: Nullable[HTMLCanvasElement] = js.native
  
  var _GetDefaultOptions: js.Any = js.native
  
  var _alwaysVisibleSticks: js.Any = js.native
  
  var _globalJoystickIndex: js.Any = js.native
  
  var halfWidth: js.Any = js.native
  
  var vjCanvasContext: js.Any = js.native
  
  var vjCanvasHeight: js.Any = js.native
  
  var vjCanvasWidth: js.Any = js.native
}
