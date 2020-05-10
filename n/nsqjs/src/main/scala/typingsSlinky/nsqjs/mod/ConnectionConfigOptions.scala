package typingsSlinky.nsqjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionConfigOptions extends js.Object {
  var authSecret: js.UndefOr[String] = js.native
  var clientId: js.UndefOr[String] = js.native
  var deflate: js.UndefOr[Boolean] = js.native
  var deflateLevel: js.UndefOr[Double] = js.native
  var heartbeatInterval: js.UndefOr[Double] = js.native
  var maxInFlight: js.UndefOr[Double] = js.native
  var messageTimeout: js.UndefOr[Double] = js.native
  var outputBufferSize: js.UndefOr[Double] = js.native
  var outputBufferTimeout: js.UndefOr[Double] = js.native
  var requeueDelay: js.UndefOr[Double] = js.native
  var sampleRate: js.UndefOr[Double] = js.native
  var snappy: js.UndefOr[Boolean] = js.native
  var tls: js.UndefOr[Boolean] = js.native
  var tlsVerification: js.UndefOr[Boolean] = js.native
}

object ConnectionConfigOptions {
  @scala.inline
  def apply(): ConnectionConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionConfigOptions]
  }
  @scala.inline
  implicit class ConnectionConfigOptionsOps[Self <: ConnectionConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authSecret")(js.undefined)
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
    def withDeflate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeflate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflate")(js.undefined)
        ret
    }
    @scala.inline
    def withDeflateLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflateLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeflateLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deflateLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeatInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeatInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxInFlight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInFlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxInFlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInFlight")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputBufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputBufferSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputBufferTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputBufferTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputBufferTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputBufferTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRequeueDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requeueDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequeueDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requeueDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(js.undefined)
        ret
    }
    @scala.inline
    def withSnappy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snappy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnappy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snappy")(js.undefined)
        ret
    }
    @scala.inline
    def withTls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(js.undefined)
        ret
    }
    @scala.inline
    def withTlsVerification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsVerification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsVerification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsVerification")(js.undefined)
        ret
    }
  }
  
}

