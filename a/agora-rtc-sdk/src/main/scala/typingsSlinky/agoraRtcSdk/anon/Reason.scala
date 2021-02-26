package typingsSlinky.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @param uid ID of the remote user.
  * @param reason Reason why the user goes offline.
  * - "Quit": The user calls {@link Client.leave} and leaves the channel.
  * - "ServerTimeOut": The user drops offline.
  * - "BecomeAudience": The client role switches from `"host"` to `"audience"`.
  */
@js.native
trait Reason extends StObject {
  
  var reason: String = js.native
  
  var uid: String = js.native
}
object Reason {
  
  @scala.inline
  def apply(reason: String, uid: String): Reason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
  
  @scala.inline
  implicit class ReasonMutableBuilder[Self <: Reason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
