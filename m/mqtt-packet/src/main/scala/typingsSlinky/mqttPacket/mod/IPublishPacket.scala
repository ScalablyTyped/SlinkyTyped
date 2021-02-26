package typingsSlinky.mqttPacket.mod

import typingsSlinky.mqttPacket.anon.CorrelationData
import typingsSlinky.mqttPacket.mqttPacketStrings.publish
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPublishPacket
  extends IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IPublishPacket: publish = js.native
  
  var dup: Boolean = js.native
  
  var payload: String | Buffer = js.native
  
  var properties: js.UndefOr[CorrelationData] = js.native
  
  var qos: QoS = js.native
  
  var retain: Boolean = js.native
  
  var topic: String = js.native
}
object IPublishPacket {
  
  @scala.inline
  def apply(cmd: publish, dup: Boolean, payload: String | Buffer, qos: QoS, retain: Boolean, topic: String): IPublishPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], dup = dup.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPublishPacket]
  }
  
  @scala.inline
  implicit class IPublishPacketMutableBuilder[Self <: IPublishPacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmd(value: publish): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDup(value: Boolean): Self = StObject.set(x, "dup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: String | Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: CorrelationData): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setQos(value: QoS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
