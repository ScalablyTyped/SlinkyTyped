package typingsSlinky.awsSdk.connectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Websocket extends StObject {
  
  /**
    * The URL expiration timestamp in ISO date format. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var ConnectionExpiry: js.UndefOr[ISO8601Datetime] = js.native
  
  /**
    * The URL of the websocket.
    */
  var Url: js.UndefOr[PreSignedConnectionUrl] = js.native
}
object Websocket {
  
  @scala.inline
  def apply(): Websocket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Websocket]
  }
  
  @scala.inline
  implicit class WebsocketMutableBuilder[Self <: Websocket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionExpiry(value: ISO8601Datetime): Self = StObject.set(x, "ConnectionExpiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionExpiryUndefined: Self = StObject.set(x, "ConnectionExpiry", js.undefined)
    
    @scala.inline
    def setUrl(value: PreSignedConnectionUrl): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
