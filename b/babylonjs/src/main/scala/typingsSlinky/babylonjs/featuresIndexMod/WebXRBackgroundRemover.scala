package typingsSlinky.babylonjs.featuresIndexMod

import typingsSlinky.babylonjs.webXRBackgroundRemoverMod.IWebXRBackgroundRemoverOptions
import typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/index", "WebXRBackgroundRemover")
@js.native
class WebXRBackgroundRemover protected ()
  extends typingsSlinky.babylonjs.webXRBackgroundRemoverMod.WebXRBackgroundRemover {
  /**
    * constructs a new background remover module
    * @param _xrSessionManager the session manager for this module
    * @param options read-only options to be used in this module
    */
  def this(_xrSessionManager: WebXRSessionManager) = this()
  def this(
    _xrSessionManager: WebXRSessionManager,
    /**
    * read-only options to be used in this module
    */
  options: IWebXRBackgroundRemoverOptions
  ) = this()
}
/* static members */
@JSImport("babylonjs/XR/features/index", "WebXRBackgroundRemover")
@js.native
object WebXRBackgroundRemover extends js.Object {
  
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
