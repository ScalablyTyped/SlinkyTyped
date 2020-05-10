package typingsSlinky.hapiHawk.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticateOptions extends js.Object {
  /**
    * optional host name override. Only used when passed a node request object.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * optional header field name, used to override the default 'Host' header when used
    * behind a cache of a proxy. Apache2 changes the value of the 'Host' header while preserving
    * the original (which is what the module must verify) in the 'x-forwarded-host' header field.
    * Only used when passed a node `http.ServerRequest` object.
    */
  var hostHeaderName: js.UndefOr[String] = js.native
  /**
    * Optional local clock time offset express in a number of milliseconds (positive or negative).
    * Defaults to 0.
    */
  var localtimeOffsetMsec: js.UndefOr[Double] = js.native
  /**
    * optional nonce validation function. The function signature is `async function(key, nonce, ts)`
    * and it must return no value for success or throw an error for invalid state.
    */
  var nonceFunc: js.UndefOr[NonceFunc] = js.native
  /**
    * optional payload for validation. The client calculates the hash value and includes it via the 'hash'
    * header attribute. The server always ensures the value provided has been included in the request
    * MAC. When this option is provided, it validates the hash value itself. Validation is done by calculating
    * a hash value over the entire payload (assuming it has already be normalized to the same format and
    * encoding used by the client to calculate the hash on request). If the payload is not available at the time
    * of authentication, the `authenticatePayload()` method can be used by passing it the credentials and
    * `attributes.hash` returned from `authenticate()`.
    */
  var payload: js.UndefOr[String] = js.native
  /**
    * optional port override. Only used when passed a node request object.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * optional number of seconds of permitted clock skew for incoming timestamps. Defaults to 60 seconds.
    * Provides a +/- skew which means actual allowed window is double the number of seconds.
    */
  var timestampSkewSec: js.UndefOr[Double] = js.native
}

object AuthenticateOptions {
  @scala.inline
  def apply(): AuthenticateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticateOptions]
  }
  @scala.inline
  implicit class AuthenticateOptionsOps[Self <: AuthenticateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withHostHeaderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostHeaderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostHeaderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostHeaderName")(js.undefined)
        ret
    }
    @scala.inline
    def withLocaltimeOffsetMsec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localtimeOffsetMsec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaltimeOffsetMsec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localtimeOffsetMsec")(js.undefined)
        ret
    }
    @scala.inline
    def withNonceFunc(value: (/* key */ String, /* nonce */ String, /* ts */ String) => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonceFunc")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutNonceFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonceFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampSkewSec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampSkewSec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampSkewSec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampSkewSec")(js.undefined)
        ret
    }
  }
  
}

