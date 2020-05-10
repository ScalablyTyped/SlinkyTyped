package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRManagedOutputCanvas")
@js.native
class WebXRManagedOutputCanvas protected () extends WebXRRenderTarget {
  /**
    * Initializes the canvas to be added/removed upon entering/exiting xr
    * @param _xrSessionManager The XR Session manager
    * @param _options optional configuration for this canvas output. defaults will be used if not provided
    */
  def this(_xrSessionManager: WebXRSessionManager) = this()
  def this(_xrSessionManager: WebXRSessionManager, _options: WebXRManagedOutputCanvasOptions) = this()
  var _addCanvas: js.Any = js.native
  var _canvas: js.Any = js.native
  var _engine: js.Any = js.native
  var _options: js.Any = js.native
  var _removeCanvas: js.Any = js.native
  var _setManagedOutputCanvas: js.Any = js.native
}

