package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.webXRHitTestMod.IWebXRHitTestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXRHitTest")
@js.native
class WebXRHitTest protected ()
  extends typingsSlinky.babylonjs.xRIndexMod.WebXRHitTest {
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
object WebXRHitTest {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/index", "WebXRHitTest.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/index", "WebXRHitTest.Version")
  @js.native
  val Version: Double = js.native
}
