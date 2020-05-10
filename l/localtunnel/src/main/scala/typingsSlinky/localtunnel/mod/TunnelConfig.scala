package typingsSlinky.localtunnel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TunnelConfig extends js.Object {
  var allow_invalid_cert: js.UndefOr[Boolean] = js.native
  var host: js.UndefOr[String] = js.native
  var local_ca: js.UndefOr[String] = js.native
  var local_cert: js.UndefOr[String] = js.native
  var local_host: js.UndefOr[String] = js.native
  var local_https: js.UndefOr[Boolean] = js.native
  var local_key: js.UndefOr[String] = js.native
  var subdomain: js.UndefOr[String] = js.native
}

object TunnelConfig {
  @scala.inline
  def apply(): TunnelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TunnelConfig]
  }
  @scala.inline
  implicit class TunnelConfigOps[Self <: TunnelConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_invalid_cert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_invalid_cert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_invalid_cert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_invalid_cert")(js.undefined)
        ret
    }
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
    def withLocal_ca(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_ca")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal_ca: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_ca")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal_cert(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_cert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal_cert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_cert")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal_host(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal_host: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_host")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal_https(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_https")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal_https: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_https")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_key")(js.undefined)
        ret
    }
    @scala.inline
    def withSubdomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdomain")(js.undefined)
        ret
    }
  }
  
}

