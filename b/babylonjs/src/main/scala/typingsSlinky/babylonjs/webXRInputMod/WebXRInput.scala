package typingsSlinky.babylonjs.webXRInputMod

import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.sceneMod.IDisposable
import typingsSlinky.babylonjs.webXRCameraMod.WebXRCamera
import typingsSlinky.babylonjs.webXRInputSourceMod.WebXRInputSource
import typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/webXRInput", "WebXRInput")
@js.native
class WebXRInput protected () extends IDisposable {
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
  xrSessionManager: WebXRSessionManager,
    /**
    * the WebXR camera for this session. Mainly used for teleportation
    */
  xrCamera: WebXRCamera
  ) = this()
  def this(
    /**
    * the xr session manager for this session
    */
  xrSessionManager: WebXRSessionManager,
    /**
    * the WebXR camera for this session. Mainly used for teleportation
    */
  xrCamera: WebXRCamera,
    options: IWebXRInputOptions
  ) = this()
  
  var _addAndRemoveControllers: js.Any = js.native
  
  var _frameObserver: js.Any = js.native
  
  var _onInputSourcesChange: js.Any = js.native
  
  var _sessionEndedObserver: js.Any = js.native
  
  var _sessionInitObserver: js.Any = js.native
  
  /**
    * XR controllers being tracked
    */
  var controllers: js.Array[WebXRInputSource] = js.native
  
  /**
    * Event when a controller has been connected/added
    */
  var onControllerAddedObservable: Observable[WebXRInputSource] = js.native
  
  /**
    * Event when a controller has been removed/disconnected
    */
  var onControllerRemovedObservable: Observable[WebXRInputSource] = js.native
  
  val options: js.Any = js.native
  
  /**
    * the WebXR camera for this session. Mainly used for teleportation
    */
  var xrCamera: WebXRCamera = js.native
  
  /**
    * the xr session manager for this session
    */
  var xrSessionManager: WebXRSessionManager = js.native
}
