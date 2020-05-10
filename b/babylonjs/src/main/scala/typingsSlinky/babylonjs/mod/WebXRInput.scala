package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.webXRInputMod.IWebXRInputOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "WebXRInput")
@js.native
class WebXRInput protected ()
  extends typingsSlinky.babylonjs.legacyMod.WebXRInput {
  /**
    * Initializes the WebXRInput
    * @param xrSessionManager the xr session manager for this session
    * @param xrCamera the WebXR camera for this session. Mainly used for teleportation
    * @param options = initialization options for this xr input
    */
  def this(
    /**
    * the xr session manager for this session
    */
  xrSessionManager: typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    /**
    * the WebXR camera for this session. Mainly used for teleportation
    */
  xrCamera: typingsSlinky.babylonjs.webXRCameraMod.WebXRCamera
  ) = this()
  def this(
    /**
    * the xr session manager for this session
    */
  xrSessionManager: typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    /**
    * the WebXR camera for this session. Mainly used for teleportation
    */
  xrCamera: typingsSlinky.babylonjs.webXRCameraMod.WebXRCamera,
    options: IWebXRInputOptions
  ) = this()
}

