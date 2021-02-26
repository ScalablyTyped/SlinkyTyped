package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typingsSlinky.babylonjs.webXRAbstractMotionControllerMod.MotionControllerHandedness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXRGenericTriggerMotionController")
@js.native
class WebXRGenericTriggerMotionController protected ()
  extends typingsSlinky.babylonjs.xRIndexMod.WebXRGenericTriggerMotionController {
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handedness: MotionControllerHandedness
  ) = this()
}
/* static members */
object WebXRGenericTriggerMotionController {
  
  @JSImport("babylonjs/index", "WebXRGenericTriggerMotionController")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Static version of the profile id of this controller
    */
  @JSImport("babylonjs/index", "WebXRGenericTriggerMotionController.ProfileId")
  @js.native
  def ProfileId: String = js.native
  @scala.inline
  def ProfileId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProfileId")(x.asInstanceOf[js.Any])
}
