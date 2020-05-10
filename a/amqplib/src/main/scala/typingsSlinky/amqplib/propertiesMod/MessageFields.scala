package typingsSlinky.amqplib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageFields extends CommonMessageFields {
  var consumerTag: js.UndefOr[String] = js.native
  var messageCount: js.UndefOr[Double] = js.native
}

object MessageFields {
  @scala.inline
  def apply(deliveryTag: Double, exchange: String, redelivered: Boolean, routingKey: String): MessageFields = {
    val __obj = js.Dynamic.literal(deliveryTag = deliveryTag.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], redelivered = redelivered.asInstanceOf[js.Any], routingKey = routingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFields]
  }
  @scala.inline
  implicit class MessageFieldsOps[Self <: MessageFields] (val x: Self) extends AnyVal {
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
    def withoutConsumerTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerTag")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageCount")(js.undefined)
        ret
    }
  }
  
}

