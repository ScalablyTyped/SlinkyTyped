package typingsSlinky.babylonjs.xRIndexMod

import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typingsSlinky.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRMicrosoftMixedRealityController")
@js.native
class WebXRMicrosoftMixedRealityController protected ()
  extends typingsSlinky.babylonjs.motionControllerIndexMod.WebXRMicrosoftMixedRealityController {
  def this(scene: Scene, gamepadObject: IMinimalMotionControllerObject, handness: MotionControllerHandness) = this()
}
/* static members */
@JSImport("babylonjs/XR/index", "WebXRMicrosoftMixedRealityController")
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
