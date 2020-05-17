package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IWebXRTeleportationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRMotionControllerTeleportation")
@js.native
class WebXRMotionControllerTeleportation protected ()
  extends typingsSlinky.babylonjs.BABYLON.WebXRMotionControllerTeleportation {
  /**
    * constructs a new anchor system
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param _options configuration object for this feature
    */
  def this(
    _xrSessionManager: typingsSlinky.babylonjs.BABYLON.WebXRSessionManager,
    _options: IWebXRTeleportationOptions
  ) = this()
}

/* static members */
@JSGlobal("BABYLON.WebXRMotionControllerTeleportation")
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

