package typingsSlinky.amqplib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class GetMessageFieldsOps[Self <: GetMessageFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

