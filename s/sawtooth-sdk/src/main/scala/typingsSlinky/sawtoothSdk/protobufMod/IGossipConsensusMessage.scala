package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGossipConsensusMessage extends StObject {
  
  /** GossipConsensusMessage message */
  var message: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  
  /** GossipConsensusMessage senderId */
  var senderId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  
  /** GossipConsensusMessage timeToLive */
  var timeToLive: js.UndefOr[Double | Null] = js.native
}
object IGossipConsensusMessage {
  
  @scala.inline
  def apply(): IGossipConsensusMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipConsensusMessage]
  }
  
  @scala.inline
  implicit class IGossipConsensusMessageMutableBuilder[Self <: IGossipConsensusMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: js.typedarray.Uint8Array): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageNull: Self = StObject.set(x, "message", null)
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setSenderId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "senderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderIdNull: Self = StObject.set(x, "senderId", null)
    
    @scala.inline
    def setSenderIdUndefined: Self = StObject.set(x, "senderId", js.undefined)
    
    @scala.inline
    def setTimeToLive(value: Double): Self = StObject.set(x, "timeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToLiveNull: Self = StObject.set(x, "timeToLive", null)
    
    @scala.inline
    def setTimeToLiveUndefined: Self = StObject.set(x, "timeToLive", js.undefined)
  }
}
