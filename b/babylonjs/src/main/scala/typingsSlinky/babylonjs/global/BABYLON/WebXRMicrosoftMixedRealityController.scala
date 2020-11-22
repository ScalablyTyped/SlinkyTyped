package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IMinimalMotionControllerObject
import typingsSlinky.babylonjs.BABYLON.MotionControllerHandedness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRMicrosoftMixedRealityController")
@js.native
class WebXRMicrosoftMixedRealityController protected ()
  extends typingsSlinky.babylonjs.BABYLON.WebXRMicrosoftMixedRealityController {
  def this(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handedness: MotionControllerHandedness
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.WebXRMicrosoftMixedRealityController")
@js.native
object WebXRMicrosoftMixedRealityController extends js.Object {
  
  /**
    * The base url used to load the left and right controller models
    */
  var MODEL_BASE_URL: String = js.native
  
  /**
    * The name of the left controller model file
    */
  var MODEL_LEFT_FILENAME: String = js.native
  
  /**
    * The name of the right controller model file
    */
  var MODEL_RIGHT_FILENAME: String = js.native
}
