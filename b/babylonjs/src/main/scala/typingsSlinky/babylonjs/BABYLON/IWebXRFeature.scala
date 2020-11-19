package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRFeature extends IDisposable {
  
  /**
    * Attach the feature to the session
    * Will usually be called by the features manager
    *
    * @param force should attachment be forced (even when already attached)
    * @returns true if successful.
    */
  def attach(): Boolean = js.native
  def attach(force: Boolean): Boolean = js.native
  
  /**
    * Is this feature attached
    */
  var attached: Boolean = js.native
  
  /**
    * Detach the feature from the session
    * Will usually be called by the features manager
    *
    * @returns true if successful.
    */
  def detach(): Boolean = js.native
  
  /**
    * Should auto-attach be disabled?
    */
  var disableAutoAttach: Boolean = js.native
}
