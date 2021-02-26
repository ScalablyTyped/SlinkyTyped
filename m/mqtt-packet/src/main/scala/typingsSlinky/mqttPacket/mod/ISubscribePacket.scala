package typingsSlinky.mqttPacket.mod

import typingsSlinky.mqttPacket.anon.ReasonString
import typingsSlinky.mqttPacket.mqttPacketStrings.subscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISubscribePacket
  extends IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_ISubscribePacket: subscribe = js.native
  
  var properties: js.UndefOr[ReasonString] = js.native
  
  var subscriptions: js.Array[ISubscription] = js.native
}
object ISubscribePacket {
  
  @scala.inline
  def apply(cmd: subscribe, subscriptions: js.Array[ISubscription]): ISubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscribePacket]
  }
  
  @scala.inline
  implicit class ISubscribePacketMutableBuilder[Self <: ISubscribePacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmd(value: subscribe): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: ReasonString): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setSubscriptions(value: js.Array[ISubscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsVarargs(value: ISubscription*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
  }
}
