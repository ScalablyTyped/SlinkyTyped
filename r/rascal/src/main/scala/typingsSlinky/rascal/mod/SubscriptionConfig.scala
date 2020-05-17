package typingsSlinky.rascal.mod

import typingsSlinky.amqplib.propertiesMod.Options.Consume
import typingsSlinky.rascal.anon.Limit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionConfig extends js.Object {
  var autoCreated: js.UndefOr[Boolean] = js.native
  var contentType: js.UndefOr[String] = js.native
  var deferCloseChannel: js.UndefOr[Double] = js.native
  var encryption: js.UndefOr[String] = js.native
  var handler: js.UndefOr[String] = js.native
  var handlers: js.UndefOr[js.Array[String]] = js.native
  var options: js.UndefOr[Consume] = js.native
  var prefetch: js.UndefOr[Double] = js.native
  var queue: js.UndefOr[String] = js.native
  var recovery: js.UndefOr[js.Any] = js.native
  var redeliveries: js.UndefOr[Limit] = js.native
  var retry: js.UndefOr[RetryConfig | Boolean] = js.native
  var vhost: js.UndefOr[String] = js.native
}

object SubscriptionConfig {
  @scala.inline
  def apply(): SubscriptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionConfig]
  }
  @scala.inline
  implicit class SubscriptionConfigOps[Self <: SubscriptionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCreated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreated")(js.undefined)
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
    def withDeferCloseChannel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferCloseChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferCloseChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferCloseChannel")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryption")(js.undefined)
        ret
    }
    @scala.inline
    def withHandler(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.undefined)
        ret
    }
    @scala.inline
    def withHandlers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: Consume): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefetch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch")(js.undefined)
        ret
    }
    @scala.inline
    def withQueue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(js.undefined)
        ret
    }
    @scala.inline
    def withRecovery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecovery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recovery")(js.undefined)
        ret
    }
    @scala.inline
    def withRedeliveries(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redeliveries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedeliveries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redeliveries")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry(value: RetryConfig | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.undefined)
        ret
    }
    @scala.inline
    def withVhost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vhost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVhost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vhost")(js.undefined)
        ret
    }
  }
  
}

