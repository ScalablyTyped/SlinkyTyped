package typingsSlinky.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "WebXRManagedOutputCanvas")
@js.native
class WebXRManagedOutputCanvas protected ()
  extends typingsSlinky.babylonjs.xRIndexMod.WebXRManagedOutputCanvas {
  /**
    * Initializes the canvas to be added/removed upon entering/exiting xr
    * @param _xrSessionManager The XR Session manager
    * @param _options optional configuration for this canvas output. defaults will be used if not provided
    */
  def this(_xrSessionManager: typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    _options: typingsSlinky.babylonjs.webXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions
  ) = this()
}

