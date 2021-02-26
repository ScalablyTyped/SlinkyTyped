package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.webXRControllerTeleportationMod.IWebXRTeleportationOptions
import org.scalablytyped.runtime.StObject
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
object WebXRMotionControllerTeleportation {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs", "WebXRMotionControllerTeleportation.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the webxr specs version
    */
  @JSImport("babylonjs", "WebXRMotionControllerTeleportation.Version")
  @js.native
  val Version: Double = js.native
}
