package typingsSlinky.mqttPacket

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCorrelationData extends js.Object {
  var contentType: js.UndefOr[String] = js.native
  var correlationData: js.UndefOr[Buffer] = js.native
  var messageExpiryInterval: js.UndefOr[Double] = js.native
  var payloadFormatIndicator: js.UndefOr[Boolean] = js.native
  var responseTopic: js.UndefOr[String] = js.native
  var subscriptionIdentifier: js.UndefOr[Double] = js.native
  var topicAlias: js.UndefOr[Double] = js.native
  var userProperties: js.UndefOr[js.Object] = js.native
}

object AnonCorrelationData {
  @scala.inline
  def apply(): AnonCorrelationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCorrelationData]
  }
  @scala.inline
  implicit class AnonCorrelationDataOps[Self <: AnonCorrelationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withCorrelationData(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrelationData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationData")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageExpiryInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageExpiryInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageExpiryInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageExpiryInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloadFormatIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadFormatIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloadFormatIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadFormatIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTopic")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionIdentifier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicAlias(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProperties(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProperties")(js.undefined)
        ret
    }
  }
  
}

