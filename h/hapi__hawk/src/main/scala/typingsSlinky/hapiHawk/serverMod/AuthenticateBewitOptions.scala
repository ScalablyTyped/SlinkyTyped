package typingsSlinky.hapiHawk.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@hapi/hawk.@hapi/hawk/lib/server.AuthenticateOptions, 'hostHeaderName' | 'localtimeOffsetMsec' | 'host' | 'port'> */
@js.native
trait AuthenticateBewitOptions extends js.Object {
  var host: js.UndefOr[String] = js.native
  var hostHeaderName: js.UndefOr[String] = js.native
  var localtimeOffsetMsec: js.UndefOr[Double] = js.native
  var port: js.UndefOr[Double] = js.native
}

object AuthenticateBewitOptions {
  @scala.inline
  def apply(): AuthenticateBewitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticateBewitOptions]
  }
  @scala.inline
  implicit class AuthenticateBewitOptionsOps[Self <: AuthenticateBewitOptions] (val x: Self) extends AnyVal {
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
  }
  
}

