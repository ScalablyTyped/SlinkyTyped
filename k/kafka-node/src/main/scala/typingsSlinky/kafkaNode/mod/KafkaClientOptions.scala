package typingsSlinky.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KafkaClientOptions extends js.Object {
  var autoConnect: js.UndefOr[Boolean] = js.native
  var clientId: js.UndefOr[String] = js.native
  var connectRetryOptions: js.UndefOr[RetryOptions] = js.native
  var connectTimeout: js.UndefOr[Double] = js.native
  var idleConnection: js.UndefOr[Double] = js.native
  var kafkaHost: js.UndefOr[String] = js.native
  var maxAsyncRequests: js.UndefOr[Double] = js.native
  var reconnectOnIdle: js.UndefOr[Boolean] = js.native
  var requestTimeout: js.UndefOr[Double] = js.native
  var sasl: js.UndefOr[js.Any] = js.native
  var sslOptions: js.UndefOr[js.Any] = js.native
}

object KafkaClientOptions {
  @scala.inline
  def apply(): KafkaClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KafkaClientOptions]
  }
  @scala.inline
  implicit class KafkaClientOptionsOps[Self <: KafkaClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoConnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectRetryOptions(value: RetryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectRetryOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectRetryOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectRetryOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withIdleConnection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdleConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleConnection")(js.undefined)
        ret
    }
    @scala.inline
    def withKafkaHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kafkaHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKafkaHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kafkaHost")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAsyncRequests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAsyncRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAsyncRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAsyncRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectOnIdle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectOnIdle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectOnIdle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectOnIdle")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSasl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sasl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSasl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sasl")(js.undefined)
        ret
    }
    @scala.inline
    def withSslOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslOptions")(js.undefined)
        ret
    }
  }
  
}

