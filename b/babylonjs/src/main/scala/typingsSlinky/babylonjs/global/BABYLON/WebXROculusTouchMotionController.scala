package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IMinimalMotionControllerObject
import typingsSlinky.babylonjs.BABYLON.MotionControllerHandness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXROculusTouchMotionController")
@js.native
class WebXROculusTouchMotionController protected ()
  extends typingsSlinky.babylonjs.BABYLON.WebXROculusTouchMotionController {
  def this(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handness: MotionControllerHandness
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handness: MotionControllerHandness,
    legacyMapping: Boolean
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handness: MotionControllerHandness,
    legacyMapping: js.UndefOr[scala.Nothing],
    _forceLegacyControllers: Boolean
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handness: MotionControllerHandness,
    legacyMapping: Boolean,
    _forceLegacyControllers: Boolean
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.WebXROculusTouchMotionController")
@js.native
object WebXROculusTouchMotionController extends js.Object {
  
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
  
  /**
    * Base Url for the Quest controller model.
    */
  var QUEST_MODEL_BASE_URL: String = js.native
}
