package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IWebXRControllerPointerSelectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRControllerPointerSelection")
@js.native
class WebXRControllerPointerSelection protected ()
  extends typingsSlinky.babylonjs.BABYLON.WebXRControllerPointerSelection {
  /**
    * constructs a new background remover module
    * @param _xrSessionManager the session manager for this module
    * @param _options read-only options to be used in this module
    */
  def this(
    _xrSessionManager: typingsSlinky.babylonjs.BABYLON.WebXRSessionManager,
    _options: IWebXRControllerPointerSelectionOptions
  ) = this()
}
/* static members */
object WebXRControllerPointerSelection {
  
  @JSGlobal("BABYLON.WebXRControllerPointerSelection")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXRControllerPointerSelection.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSGlobal("BABYLON.WebXRControllerPointerSelection.Version")
  @js.native
  val Version: Double = js.native
  
  @JSGlobal("BABYLON.WebXRControllerPointerSelection._idCounter")
  @js.native
  def _idCounter: js.Any = js.native
  @scala.inline
  def _idCounter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_idCounter")(x.asInstanceOf[js.Any])
}
