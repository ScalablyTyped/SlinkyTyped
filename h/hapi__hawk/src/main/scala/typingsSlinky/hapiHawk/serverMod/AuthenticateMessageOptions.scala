package typingsSlinky.hapiHawk.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@hapi/hawk.@hapi/hawk/lib/server.AuthenticateOptions, 'nonceFunc' | 'timestampSkewSec' | 'localtimeOffsetMsec'> */
@js.native
trait AuthenticateMessageOptions extends js.Object {
  var localtimeOffsetMsec: js.UndefOr[Double] = js.native
  var nonceFunc: js.UndefOr[NonceFunc] = js.native
  var timestampSkewSec: js.UndefOr[Double] = js.native
}

object AuthenticateMessageOptions {
  @scala.inline
  def apply(): AuthenticateMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticateMessageOptions]
  }
  @scala.inline
  implicit class AuthenticateMessageOptionsOps[Self <: AuthenticateMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

