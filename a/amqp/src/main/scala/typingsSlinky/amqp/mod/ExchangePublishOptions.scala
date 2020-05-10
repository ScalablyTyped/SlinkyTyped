package typingsSlinky.amqp.mod

import typingsSlinky.amqp.amqpNumbers.`0`
import typingsSlinky.amqp.amqpNumbers.`1`
import typingsSlinky.amqp.amqpNumbers.`2`
import typingsSlinky.amqp.amqpNumbers.`3`
import typingsSlinky.amqp.amqpNumbers.`4`
import typingsSlinky.amqp.amqpNumbers.`5`
import typingsSlinky.amqp.amqpNumbers.`6`
import typingsSlinky.amqp.amqpNumbers.`7`
import typingsSlinky.amqp.amqpNumbers.`8`
import typingsSlinky.amqp.amqpNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExchangePublishOptions extends js.Object {
  /**
    * Default: null
    *
    * Creating application id
    */
  var appId: js.UndefOr[String] = js.native
  /**
    * Default: null
    */
  var contentEncoding: js.UndefOr[String] = js.native
  /**
    * Default: 'application/octet-stream'
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * Application correlation identifier
    */
  var correlationId: js.UndefOr[String] = js.native
  /**
    * 1: Non-persistent
    * 2: Persistent
    */
  var deliveryMode: js.UndefOr[`1` | `2`] = js.native
  /**
    * Default: null
    *
    * Message expiration specification -- ISO date string?
    */
  var expiration: js.UndefOr[String] = js.native
  /**
    * Default: {}
    *
    * Arbitrary application-specific message headers
    */
  var headers: js.UndefOr[js.Any] = js.native
  /**
    * Default: false
    *
    * This flag tells the server how to react if the message cannot be routed to a queue consumer immediately.
    *
    * If this flag is set, the server will return an undeliverable message with a Return method.
    *
    * If this flag is false, the server will queue the message, but with no guarantee that it will ever be consumed
    */
  var immediate: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    *
    * This flag tells the server how to react if the message cannot be routed to a queue.
    *
    * If this flag is set, the server will return an unroutable message with a Return method.
    *
    * If this flag is false, the server silently drops the message
    */
  var mandatory: js.UndefOr[Boolean] = js.native
  /**
    * Default: null
    *
    * Application message identifier
    */
  var messageId: js.UndefOr[String] = js.native
  var priority: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.native
  /**
    * Usually used to name a reply queue for a request message
    */
  var replyTo: js.UndefOr[String] = js.native
  /**
    * Default: null
    *
    * Message timestamp
    *
    * ISO date string?
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * Default: null
    *
    * Message type name
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Default: null
    *
    * Creating user id
    */
  var userId: js.UndefOr[String] = js.native
}

object ExchangePublishOptions {
  @scala.inline
  def apply(): ExchangePublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangePublishOptions]
  }
  @scala.inline
  implicit class ExchangePublishOptionsOps[Self <: ExchangePublishOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(js.undefined)
        ret
    }
    @scala.inline
    def withContentEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEncoding")(js.undefined)
        ret
    }
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
    def withCorrelationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrelationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryMode(value: `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryMode")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withImmediate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmediate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(js.undefined)
        ret
    }
    @scala.inline
    def withMandatory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandatory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMandatory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandatory")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyTo")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

