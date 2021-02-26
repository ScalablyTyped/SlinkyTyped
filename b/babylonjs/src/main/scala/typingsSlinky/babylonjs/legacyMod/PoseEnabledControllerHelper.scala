package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.poseEnabledControllerMod.GamePadFactory
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PoseEnabledControllerHelper")
@js.native
class PoseEnabledControllerHelper ()
  extends typingsSlinky.babylonjs.indexMod.PoseEnabledControllerHelper
/* static members */
object PoseEnabledControllerHelper {
  
  @JSImport("babylonjs/Legacy/legacy", "PoseEnabledControllerHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Initializes a gamepad as the controller type it is specified as (eg. windows mixed reality controller)
    * @param vrGamepad the gamepad to initialized
    * @returns a vr controller of the type the gamepad identified as
    */
  @JSImport("babylonjs/Legacy/legacy", "PoseEnabledControllerHelper.InitiateController")
  @js.native
  def InitiateController(vrGamepad: js.Any): typingsSlinky.babylonjs.gamepadMod.Gamepad = js.native
  
  /** @hidden */
  @JSImport("babylonjs/Legacy/legacy", "PoseEnabledControllerHelper._ControllerFactories")
  @js.native
  def _ControllerFactories: js.Array[GamePadFactory] = js.native
  @scala.inline
  def _ControllerFactories_=(x: js.Array[GamePadFactory]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ControllerFactories")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  @JSImport("babylonjs/Legacy/legacy", "PoseEnabledControllerHelper._DefaultControllerFactory")
  @js.native
  def _DefaultControllerFactory: Nullable[
    js.Function1[/* gamepadInfo */ js.Any, typingsSlinky.babylonjs.gamepadMod.Gamepad]
  ] = js.native
  @scala.inline
  def _DefaultControllerFactory_=(
    x: Nullable[
      js.Function1[/* gamepadInfo */ js.Any, typingsSlinky.babylonjs.gamepadMod.Gamepad]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultControllerFactory")(x.asInstanceOf[js.Any])
}
