package typingsSlinky.amqplib.propertiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMessageFields extends CommonMessageFields {
  
  var messageCount: Double = js.native
}
object GetMessageFields {
  
  @scala.inline
  def apply(
    deliveryTag: Double,
    exchange: String,
    messageCount: Double,
    redelivered: Boolean,
    routingKey: String
  ): GetMessageFields = {
    val __obj = js.Dynamic.literal(deliveryTag = deliveryTag.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], messageCount = messageCount.asInstanceOf[js.Any], redelivered = redelivered.asInstanceOf[js.Any], routingKey = routingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMessageFields]
  }
  
  @scala.inline
  implicit class GetMessageFieldsMutableBuilder[Self <: GetMessageFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageCount(value: Double): Self = StObject.set(x, "messageCount", value.asInstanceOf[js.Any])
  }
}
