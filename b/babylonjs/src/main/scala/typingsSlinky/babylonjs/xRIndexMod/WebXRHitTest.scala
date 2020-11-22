package typingsSlinky.babylonjs.xRIndexMod

import typingsSlinky.babylonjs.webXRHitTestMod.IWebXRHitTestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRHitTest")
@js.native
class WebXRHitTest protected ()
  extends typingsSlinky.babylonjs.featuresIndexMod.WebXRHitTest {
  /**
    * Creates a new instance of the hit test feature
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param options options to use when constructing this feature
    */
  def this(_xrSessionManager: typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    /**
    * options to use when constructing this feature
    */
  options: IWebXRHitTestOptions
  ) = this()
}
/* static members */
@JSImport("babylonjs/XR/index", "WebXRHitTest")
@js.native
object WebXRHitTest extends js.Object {
  
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
