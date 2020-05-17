package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IWebXRAnchorSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRAnchorSystem")
@js.native
class WebXRAnchorSystem protected ()
  extends typingsSlinky.babylonjs.BABYLON.WebXRAnchorSystem {
  /**
    * constructs a new anchor system
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param _options configuration object for this feature
    */
  def this(_xrSessionManager: typingsSlinky.babylonjs.BABYLON.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typingsSlinky.babylonjs.BABYLON.WebXRSessionManager,
    _options: IWebXRAnchorSystemOptions
  ) = this()
}

/* static members */
@JSGlobal("BABYLON.WebXRAnchorSystem")
@js.native
object WebXRAnchorSystem extends js.Object {
  /**
    * The module's name
    */
  val Name: String = js.native
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  val Version: Double = js.native
}

