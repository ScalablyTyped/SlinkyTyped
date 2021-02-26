package typingsSlinky.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "WebXRControllerPhysics")
@js.native
class WebXRControllerPhysics protected ()
  extends typingsSlinky.babylonjs.indexMod.WebXRControllerPhysics {
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
object WebXRControllerPhysics {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/Legacy/legacy", "WebXRControllerPhysics.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the webxr specs version
    */
  @JSImport("babylonjs/Legacy/legacy", "WebXRControllerPhysics.Version")
  @js.native
  val Version: Double = js.native
}
