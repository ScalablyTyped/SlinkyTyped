package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IMinimalMotionControllerObject
import typingsSlinky.babylonjs.BABYLON.MotionControllerHandedness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRHTCViveMotionController")
@js.native
class WebXRHTCViveMotionController protected ()
  extends typingsSlinky.babylonjs.BABYLON.WebXRHTCViveMotionController {
  /**
    * Create a new Vive motion controller object
    * @param scene the scene to use to create this controller
    * @param gamepadObject the corresponding gamepad object
    * @param handedness the handedness of the controller
    */
  def this(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handedness: MotionControllerHandedness
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.WebXRHTCViveMotionController")
@js.native
object WebXRHTCViveMotionController extends js.Object {
  
  /**
    * The base url used to load the left and right controller models
    */
  var MODEL_BASE_URL: String = js.native
  
  /**
    * File name for the controller model.
    */
  var MODEL_FILENAME: String = js.native
}
