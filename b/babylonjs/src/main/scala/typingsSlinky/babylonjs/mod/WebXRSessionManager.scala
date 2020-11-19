package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.XRSessionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXRSessionManager")
@js.native
class WebXRSessionManager protected ()
  extends typingsSlinky.babylonjs.legacyMod.WebXRSessionManager {
  /**
    * Constructs a WebXRSessionManager, this must be initialized within a user action before usage
    * @param scene The scene which the session should be created for
    */
  def this(/** The scene which the session should be created for */
  scene: typingsSlinky.babylonjs.sceneMod.Scene) = this()
}
/* static members */
@JSImport("babylonjs", "WebXRSessionManager")
@js.native
object WebXRSessionManager extends js.Object {
  
  /**
    * Returns a promise that resolves with a boolean indicating if the provided session mode is supported by this browser
    * @param sessionMode defines the session to test
    * @returns a promise with boolean as final value
    */
  def IsSessionSupportedAsync(sessionMode: XRSessionMode): js.Promise[Boolean] = js.native
}
