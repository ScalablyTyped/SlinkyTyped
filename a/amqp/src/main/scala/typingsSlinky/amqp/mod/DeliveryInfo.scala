package typingsSlinky.amqp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryInfo extends js.Object {
  var consumerTag: String = js.native
  var contentType: String = js.native
  var deliveryTag: js.typedarray.Uint8Array = js.native
  var exchange: String = js.native
  var queue: String = js.native
  var redelivered: Boolean = js.native
  var routingKey: String = js.native
}

object DeliveryInfo {
  @scala.inline
  def apply(
    consumerTag: String,
    contentType: String,
    deliveryTag: js.typedarray.Uint8Array,
    exchange: String,
    queue: String,
    redelivered: Boolean,
    routingKey: String
  ): DeliveryInfo = {
    val __obj = js.Dynamic.literal(consumerTag = consumerTag.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], deliveryTag = deliveryTag.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], redelivered = redelivered.asInstanceOf[js.Any], routingKey = routingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryInfo]
  }
  @scala.inline
  implicit class DeliveryInfoOps[Self <: DeliveryInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumerTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeliveryTag(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExchange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedelivered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redelivered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutingKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

