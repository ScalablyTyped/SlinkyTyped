package typingsSlinky.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait connectCompleteArgs extends baseResponseArgs {
  
  /**
    * Whether the call to client.connect was triggered by a reconnection after network failure.
    */
  var isReconnect: Boolean = js.native
}
object connectCompleteArgs {
  
  @scala.inline
  def apply(client: client, clientId: String, isReconnect: Boolean, meta: js.Any, timestamp: js.Date): connectCompleteArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], isReconnect = isReconnect.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[connectCompleteArgs]
  }
  
  @scala.inline
  implicit class connectCompleteArgsMutableBuilder[Self <: connectCompleteArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsReconnect(value: Boolean): Self = StObject.set(x, "isReconnect", value.asInstanceOf[js.Any])
  }
}
