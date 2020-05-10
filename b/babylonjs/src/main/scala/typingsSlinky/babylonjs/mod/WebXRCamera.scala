package typingsSlinky.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "WebXRCamera")
@js.native
class WebXRCamera protected ()
  extends typingsSlinky.babylonjs.legacyMod.WebXRCamera {
  /**
    * Creates a new webXRCamera, this should only be set at the camera after it has been updated by the xrSessionManager
    * @param name the name of the camera
    * @param scene the scene to add the camera to
    * @param _xrSessionManager a constructed xr session manager
    */
  def this(
    name: String,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    _xrSessionManager: typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager
  ) = this()
}

