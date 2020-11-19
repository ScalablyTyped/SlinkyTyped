package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.GamePadFactory
import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PoseEnabledControllerHelper")
@js.native
class PoseEnabledControllerHelper ()
  extends typingsSlinky.babylonjs.BABYLON.PoseEnabledControllerHelper
/* static members */
@JSGlobal("BABYLON.PoseEnabledControllerHelper")
@js.native
object PoseEnabledControllerHelper extends js.Object {
  
  /**
    * Initializes a gamepad as the controller type it is specified as (eg. windows mixed reality controller)
    * @param vrGamepad the gamepad to initialized
    * @returns a vr controller of the type the gamepad identified as
    */
  def InitiateController(vrGamepad: js.Any): typingsSlinky.babylonjs.BABYLON.Gamepad = js.native
  
  /** @hidden */
  var _ControllerFactories: js.Array[GamePadFactory] = js.native
  
  /** @hidden */
  var _DefaultControllerFactory: Nullable[js.Function1[/* gamepadInfo */ _, typingsSlinky.babylonjs.BABYLON.Gamepad]] = js.native
}
