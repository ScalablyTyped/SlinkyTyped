package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.poseEnabledControllerMod.GamePadFactory
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PoseEnabledControllerHelper")
@js.native
class PoseEnabledControllerHelper ()
  extends typingsSlinky.babylonjs.indexMod.PoseEnabledControllerHelper
/* static members */
@JSImport("babylonjs/Legacy/legacy", "PoseEnabledControllerHelper")
@js.native
object PoseEnabledControllerHelper extends js.Object {
  
  /**
    * Initializes a gamepad as the controller type it is specified as (eg. windows mixed reality controller)
    * @param vrGamepad the gamepad to initialized
    * @returns a vr controller of the type the gamepad identified as
    */
  def InitiateController(vrGamepad: js.Any): typingsSlinky.babylonjs.gamepadMod.Gamepad = js.native
  
  /** @hidden */
  var _ControllerFactories: js.Array[GamePadFactory] = js.native
  
  /** @hidden */
  var _DefaultControllerFactory: Nullable[js.Function1[/* gamepadInfo */ _, typingsSlinky.babylonjs.gamepadMod.Gamepad]] = js.native
}
