package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IWebXRInputOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRInput")
@js.native
class WebXRInput protected ()
  extends typingsSlinky.babylonjs.BABYLON.WebXRInput {
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
  xrSessionManager: typingsSlinky.babylonjs.BABYLON.WebXRSessionManager,
    /**
    * the WebXR camera for this session. Mainly used for teleportation
    */
  xrCamera: typingsSlinky.babylonjs.BABYLON.WebXRCamera
  ) = this()
  def this(
    /**
    * the xr session manager for this session
    */
  xrSessionManager: typingsSlinky.babylonjs.BABYLON.WebXRSessionManager,
    /**
    * the WebXR camera for this session. Mainly used for teleportation
    */
  xrCamera: typingsSlinky.babylonjs.BABYLON.WebXRCamera,
    options: IWebXRInputOptions
  ) = this()
}
