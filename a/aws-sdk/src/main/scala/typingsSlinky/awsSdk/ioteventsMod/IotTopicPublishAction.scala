package typingsSlinky.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IotTopicPublishAction extends StObject {
  
  /**
    * The MQTT topic of the message. You can use a string expression that includes variables ($variable.&lt;variable-name&gt;) and input values ($input.&lt;input-name&gt;.&lt;path-to-datum&gt;) as the topic string.
    */
  var mqttTopic: MQTTTopic = js.native
  
  /**
    * You can configure the action payload when you publish a message to an AWS IoT Core topic.
    */
  var payload: js.UndefOr[Payload] = js.native
}
object IotTopicPublishAction {
  
  @scala.inline
  def apply(mqttTopic: MQTTTopic): IotTopicPublishAction = {
    val __obj = js.Dynamic.literal(mqttTopic = mqttTopic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotTopicPublishAction]
  }
  
  @scala.inline
  implicit class IotTopicPublishActionMutableBuilder[Self <: IotTopicPublishAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMqttTopic(value: MQTTTopic): Self = StObject.set(x, "mqttTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
