package typingsSlinky.amqp.amqpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryInfo extends js.Object {
  var consumerTag: String
  var contentType: String
  var deliveryTag: scala.scalajs.js.typedarray.Uint8Array
  var exchange: String
  var queue: String
  var redelivered: Boolean
  var routingKey: String
}

object DeliveryInfo {
  @scala.inline
  def apply(
    consumerTag: String,
    contentType: String,
    deliveryTag: scala.scalajs.js.typedarray.Uint8Array,
    exchange: String,
    queue: String,
    redelivered: Boolean,
    routingKey: String
  ): DeliveryInfo = {
    val __obj = js.Dynamic.literal(consumerTag = consumerTag.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], deliveryTag = deliveryTag.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], redelivered = redelivered.asInstanceOf[js.Any], routingKey = routingKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeliveryInfo]
  }
}

