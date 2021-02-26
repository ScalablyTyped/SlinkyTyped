package typingsSlinky.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait baseResponseArgs extends baseArgs {
  
  /**
    * The singleton client.
    */
  var client: typingsSlinky.fmWebsync.fm.websync.client = js.native
  
  /**
    * The ID of the singleton client.
    */
  var clientId: String = js.native
  
  /**
    * Extra meta data associated with the request/response.
    */
  var meta: js.Any = js.native
  
  /**
    * The date/time the message was processed on the server.
    */
  var timestamp: js.Date = js.native
}
object baseResponseArgs {
  
  @scala.inline
  def apply(client: client, clientId: String, meta: js.Any, timestamp: js.Date): baseResponseArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[baseResponseArgs]
  }
  
  @scala.inline
  implicit class baseResponseArgsMutableBuilder[Self <: baseResponseArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
