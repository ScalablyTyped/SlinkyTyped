package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typingsSlinky.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "WebXRHTCViveMotionController")
@js.native
class WebXRHTCViveMotionController protected ()
  extends typingsSlinky.babylonjs.indexMod.WebXRHTCViveMotionController {
  /**
    * Create a new Vive motion controller object
    * @param scene the scene to use to create this controller
    * @param gamepadObject the corresponding gamepad object
    * @param handness the handness of the controller
    */
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handness: MotionControllerHandness
  ) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "WebXRHTCViveMotionController")
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
