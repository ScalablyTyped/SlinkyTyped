package typingsSlinky.primus.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.primus.anon.Authenticate
import typingsSlinky.primus.primusStrings.browserchannel
import typingsSlinky.primus.primusStrings.engineDotio
import typingsSlinky.primus.primusStrings.faye
import typingsSlinky.primus.primusStrings.sockjs
import typingsSlinky.primus.primusStrings.uws
import typingsSlinky.primus.primusStrings.websockets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimusOptions extends js.Object {
  var authorization: js.UndefOr[AuthorizationHandler] = js.native
  var compression: js.UndefOr[Boolean] = js.native
  var credentials: js.UndefOr[Boolean] = js.native
  var exposed: js.UndefOr[Boolean] = js.native
  var global: js.UndefOr[String] = js.native
  var headers: js.UndefOr[Boolean] = js.native
  var idGenerator: js.UndefOr[js.Function0[String]] = js.native
  var maxAge: js.UndefOr[String] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var methods: js.UndefOr[String] = js.native
  // Cors
  var origins: js.UndefOr[String] = js.native
  var parser: js.UndefOr[String | Parser] = js.native
  var pathname: js.UndefOr[String] = js.native
  var pingInterval: js.UndefOr[Double] = js.native
  var plugin: js.UndefOr[String | js.Object] = js.native
  var transformer: js.UndefOr[websockets | engineDotio | browserchannel | sockjs | faye | uws] = js.native
  var transport: js.UndefOr[js.Object] = js.native
}

object PrimusOptions {
  @scala.inline
  def apply(): PrimusOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimusOptions]
  }
  @scala.inline
  implicit class PrimusOptionsOps[Self <: PrimusOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorization(
      value: (/* req */ IncomingMessage, /* done */ js.Function1[/* err */ js.UndefOr[String | js.Error | Authenticate], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAuthorization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(js.undefined)
        ret
    }
    @scala.inline
    def withCompression(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withExposed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposed")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: Boolean): Self = {
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
    def withIdGenerator(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idGenerator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIdGenerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idGenerator")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMethods(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigins(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(js.undefined)
        ret
    }
    @scala.inline
    def withParser(value: String | Parser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.undefined)
        ret
    }
    @scala.inline
    def withPathname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(js.undefined)
        ret
    }
    @scala.inline
    def withPingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPingInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugin(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformer(value: websockets | engineDotio | browserchannel | sockjs | faye | uws): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformer")(js.undefined)
        ret
    }
    @scala.inline
    def withTransport(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(js.undefined)
        ret
    }
  }
  
}

