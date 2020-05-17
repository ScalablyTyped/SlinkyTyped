package typingsSlinky.activedirectory2.mod

import typingsSlinky.activedirectory2.anon.Ca
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LDAPjsReqProps extends js.Object {
  var connectionTimeout: js.UndefOr[Double] = js.native
  var idleTimeout: js.UndefOr[Double] = js.native
  var log: js.UndefOr[js.Any] = js.native
  var socketPath: js.UndefOr[String] = js.native
  var strictDN: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var tlsOptions: Ca = js.native
  var url: String = js.native
}

object LDAPjsReqProps {
  @scala.inline
  def apply(tlsOptions: Ca, url: String): LDAPjsReqProps = {
    val __obj = js.Dynamic.literal(tlsOptions = tlsOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDAPjsReqProps]
  }
  @scala.inline
  implicit class LDAPjsReqPropsOps[Self <: LDAPjsReqProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTlsOptions(value: Ca): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTimeout")(js.undefined)
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
    def withLog(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictDN(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictDN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictDN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictDN")(js.undefined)
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
  }
  
}

