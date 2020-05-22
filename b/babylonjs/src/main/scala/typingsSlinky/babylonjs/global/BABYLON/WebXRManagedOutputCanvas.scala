package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.WebGLRenderingContext
import typingsSlinky.babylonjs.XRSession
import typingsSlinky.babylonjs.XRWebGLLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRManagedOutputCanvas")
@js.native
class WebXRManagedOutputCanvas protected ()
  extends typingsSlinky.babylonjs.BABYLON.WebXRManagedOutputCanvas {
  /**
    * Initializes the canvas to be added/removed upon entering/exiting xr
    * @param _xrSessionManager The XR Session manager
    * @param _options optional configuration for this canvas output. defaults will be used if not provided
    */
  def this(_xrSessionManager: typingsSlinky.babylonjs.BABYLON.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typingsSlinky.babylonjs.BABYLON.WebXRSessionManager,
    _options: typingsSlinky.babylonjs.BABYLON.WebXRManagedOutputCanvasOptions
  ) = this()
  /* CompleteClass */
  override var _addCanvas: js.Any = js.native
  /* CompleteClass */
  override var _canvas: js.Any = js.native
  /* CompleteClass */
  override var _engine: js.Any = js.native
  /* CompleteClass */
  override var _options: js.Any = js.native
  /* CompleteClass */
  override var _removeCanvas: js.Any = js.native
  /* CompleteClass */
  override var _setManagedOutputCanvas: js.Any = js.native
  /**
    * xrpresent context of the canvas which can be used to display/mirror xr content
    */
  /* CompleteClass */
  override var canvasContext: WebGLRenderingContext = js.native
  /**
    * xr layer for the canvas
    */
  /* CompleteClass */
  override var xrLayer: Nullable[XRWebGLLayer] = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Initializes the xr layer for the session
    * @param xrSession xr session
    * @returns a promise that will resolve once the XR Layer has been created
    */
  /* CompleteClass */
  override def initializeXRLayerAsync(xrSession: XRSession): js.Promise[XRWebGLLayer] = js.native
}

