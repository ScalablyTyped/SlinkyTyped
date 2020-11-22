package typingsSlinky.babylonjs.featuresIndexMod

import typingsSlinky.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/index", "WebXRAbstractFeature")
@js.native
abstract class WebXRAbstractFeature protected ()
  extends typingsSlinky.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature {
  /**
    * Construct a new (abstract) WebXR feature
    * @param _xrSessionManager the xr session manager for this feature
    */
  def this(_xrSessionManager: WebXRSessionManager) = this()
}
