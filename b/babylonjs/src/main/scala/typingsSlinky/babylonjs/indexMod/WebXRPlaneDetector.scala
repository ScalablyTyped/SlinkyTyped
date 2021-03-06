package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.webXRPlaneDetectorMod.IWebXRPlaneDetectorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXRPlaneDetector")
@js.native
class WebXRPlaneDetector protected ()
  extends typingsSlinky.babylonjs.xRIndexMod.WebXRPlaneDetector {
  /**
    * construct a new Plane Detector
    * @param _xrSessionManager an instance of xr Session manager
    * @param _options configuration to use when constructing this feature
    */
  def this(_xrSessionManager: typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    _options: IWebXRPlaneDetectorOptions
  ) = this()
}
/* static members */
object WebXRPlaneDetector {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/index", "WebXRPlaneDetector.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/index", "WebXRPlaneDetector.Version")
  @js.native
  val Version: Double = js.native
}
