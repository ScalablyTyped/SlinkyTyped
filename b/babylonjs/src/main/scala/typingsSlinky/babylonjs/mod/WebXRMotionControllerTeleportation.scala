package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.webXRControllerTeleportationMod.IWebXRTeleportationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXRMotionControllerTeleportation")
@js.native
class WebXRMotionControllerTeleportation protected ()
  extends typingsSlinky.babylonjs.legacyMod.WebXRMotionControllerTeleportation {
  /**
    * constructs a new anchor system
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param _options configuration object for this feature
    */
  def this(
    _xrSessionManager: typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    _options: IWebXRTeleportationOptions
  ) = this()
}
/* static members */
@JSImport("babylonjs", "WebXRMotionControllerTeleportation")
@js.native
object WebXRMotionControllerTeleportation extends js.Object {
  
  /**
    * The module's name
    */
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the webxr specs version
    */
  val Version: Double = js.native
}
