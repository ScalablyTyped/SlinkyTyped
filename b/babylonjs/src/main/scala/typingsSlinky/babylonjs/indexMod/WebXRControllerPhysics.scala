package typingsSlinky.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXRControllerPhysics")
@js.native
class WebXRControllerPhysics protected ()
  extends typingsSlinky.babylonjs.xRIndexMod.WebXRControllerPhysics {
  /**
    * Construct a new Controller Physics Feature
    * @param _xrSessionManager the corresponding xr session manager
    * @param _options options to create this feature with
    */
  def this(
    _xrSessionManager: typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    _options: typingsSlinky.babylonjs.webXRControllerPhysicsMod.IWebXRControllerPhysicsOptions
  ) = this()
}
/* static members */
@JSImport("babylonjs/index", "WebXRControllerPhysics")
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
