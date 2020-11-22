package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typingsSlinky.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandedness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "WebXROculusTouchMotionController")
@js.native
class WebXROculusTouchMotionController protected ()
  extends typingsSlinky.babylonjs.indexMod.WebXROculusTouchMotionController {
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handedness: MotionControllerHandedness
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handedness: MotionControllerHandedness,
    legacyMapping: Boolean
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handedness: MotionControllerHandedness,
    legacyMapping: js.UndefOr[scala.Nothing],
    _forceLegacyControllers: Boolean
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handedness: MotionControllerHandedness,
    legacyMapping: Boolean,
    _forceLegacyControllers: Boolean
  ) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "WebXROculusTouchMotionController")
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
