package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IWebXRInputOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /* CompleteClass */
  override var _addAndRemoveControllers: js.Any = js.native
  /* CompleteClass */
  override var _frameObserver: js.Any = js.native
  /* CompleteClass */
  override var _onInputSourcesChange: js.Any = js.native
  /* CompleteClass */
  override var _sessionEndedObserver: js.Any = js.native
  /* CompleteClass */
  override var _sessionInitObserver: js.Any = js.native
  /**
    * XR controllers being tracked
    */
  /* CompleteClass */
  override var controllers: js.Array[typingsSlinky.babylonjs.BABYLON.WebXRInputSource] = js.native
  /**
    * Event when a controller has been connected/added
    */
  /* CompleteClass */
  override var onControllerAddedObservable: typingsSlinky.babylonjs.BABYLON.Observable[typingsSlinky.babylonjs.BABYLON.WebXRInputSource] = js.native
  /**
    * Event when a controller has been removed/disconnected
    */
  /* CompleteClass */
  override var onControllerRemovedObservable: typingsSlinky.babylonjs.BABYLON.Observable[typingsSlinky.babylonjs.BABYLON.WebXRInputSource] = js.native
  /* CompleteClass */
  override val options: js.Any = js.native
  /**
    * the WebXR camera for this session. Mainly used for teleportation
    */
  /* CompleteClass */
  override var xrCamera: typingsSlinky.babylonjs.BABYLON.WebXRCamera = js.native
  /**
    * the xr session manager for this session
    */
  /* CompleteClass */
  override var xrSessionManager: typingsSlinky.babylonjs.BABYLON.WebXRSessionManager = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

