package typingsSlinky.passportWindowsauth.anon

import typingsSlinky.ldapjs.mod.Client
import typingsSlinky.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  var base: js.UndefOr[String] = js.native
  var bindCredentials: js.UndefOr[String] = js.native
  var bindDN: js.UndefOr[String] = js.native
  var binder: js.UndefOr[Client] = js.native
  var client: js.UndefOr[Client] = js.native
  var connectTimeout: js.UndefOr[Double] = js.native
  var idleTimeout: js.UndefOr[Double] = js.native
  var maxConnections: js.UndefOr[Double] = js.native
  var reconnect: js.UndefOr[Boolean | FailAfter] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var tlsOptions: js.UndefOr[TlsOptions] = js.native
  var url: js.UndefOr[String] = js.native
}

object Base {
  @scala.inline
  def apply(): Base = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Base]
  }
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withBindCredentials(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withBindDN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindDN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindDN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindDN")(js.undefined)
        ret
    }
    @scala.inline
    def withBinder(value: Client): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binder")(js.undefined)
        ret
    }
    @scala.inline
    def withClient(value: Client): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
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
    def withIdleTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdleTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConnections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnections")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnect(value: Boolean | FailAfter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTlsOptions(value: TlsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

