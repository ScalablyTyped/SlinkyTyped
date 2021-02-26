package typingsSlinky.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object WebXRControllerPhysics {
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXRControllerPhysics.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the webxr specs version
    */
  @JSGlobal("BABYLON.WebXRControllerPhysics.Version")
  @js.native
  val Version: Double = js.native
}
