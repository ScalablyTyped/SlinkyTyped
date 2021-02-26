package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IWebXRPlaneDetectorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRPlaneDetector")
@js.native
class WebXRPlaneDetector protected ()
  extends typingsSlinky.babylonjs.BABYLON.WebXRPlaneDetector {
  /**
    * construct a new Plane Detector
    * @param _xrSessionManager an instance of xr Session manager
    * @param _options configuration to use when constructing this feature
    */
  def this(_xrSessionManager: typingsSlinky.babylonjs.BABYLON.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typingsSlinky.babylonjs.BABYLON.WebXRSessionManager,
    _options: IWebXRPlaneDetectorOptions
  ) = this()
}
/* static members */
object WebXRPlaneDetector {
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXRPlaneDetector.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSGlobal("BABYLON.WebXRPlaneDetector.Version")
  @js.native
  val Version: Double = js.native
}
