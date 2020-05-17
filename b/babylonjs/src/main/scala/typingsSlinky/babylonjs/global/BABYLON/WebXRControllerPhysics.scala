package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRControllerPhysics")
@js.native
class WebXRControllerPhysics protected ()
  extends typingsSlinky.babylonjs.BABYLON.WebXRControllerPhysics {
  /**
    * Construct a new Controller Physics Feature
    * @param _xrSessionManager the corresponding xr session manager
    * @param _options options to create this feature with
    */
  def this(
    _xrSessionManager: typingsSlinky.babylonjs.BABYLON.WebXRSessionManager,
    _options: typingsSlinky.babylonjs.BABYLON.IWebXRControllerPhysicsOptions
  ) = this()
}

/* static members */
@JSGlobal("BABYLON.WebXRControllerPhysics")
@js.native
object WebXRControllerPhysics extends js.Object {
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

