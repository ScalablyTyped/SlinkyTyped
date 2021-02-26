package typingsSlinky.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Success extends StObject {
  
  /**
    * - An empty string if `success` is `true`.
    * - The failure reason if `success` is `false`.
    */
  var reason: String = js.native
  
  /**
    * The result of republishing or re-subscribing to the stream.
    * - `true`: Success.
    * - `false`: Failure.
    */
  var success: Boolean = js.native
  
  /** The corresponding uid of the stream being republished or re-subscribed to. */
  var uid: Double | String = js.native
}
object Success {
  
  @scala.inline
  def apply(reason: String, success: Boolean, uid: Double | String): Success = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Success]
  }
  
  @scala.inline
  implicit class SuccessMutableBuilder[Self <: Success] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: Double | String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
