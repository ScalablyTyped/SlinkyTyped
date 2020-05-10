package typingsSlinky.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsURLOptions extends js.Object {
  var allow_protocol_relative_urls: js.UndefOr[Boolean] = js.native
  var allow_trailing_dot: js.UndefOr[Boolean] = js.native
  var allow_underscores: js.UndefOr[Boolean] = js.native
  var disallow_auth: js.UndefOr[Boolean] = js.native
  var host_blacklist: js.UndefOr[js.Array[String | js.RegExp]] = js.native
  var host_whitelist: js.UndefOr[js.Array[String | js.RegExp]] = js.native
  var protocols: js.UndefOr[js.Array[URLProtocol]] = js.native
  var require_host: js.UndefOr[Boolean] = js.native
  var require_protocol: js.UndefOr[Boolean] = js.native
  var require_tld: js.UndefOr[Boolean] = js.native
  var require_valid_protocol: js.UndefOr[Boolean] = js.native
}

object IsURLOptions {
  @scala.inline
  def apply(): IsURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsURLOptions]
  }
  @scala.inline
  implicit class IsURLOptionsOps[Self <: IsURLOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_protocol_relative_urls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_protocol_relative_urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_protocol_relative_urls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_protocol_relative_urls")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_trailing_dot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_trailing_dot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_trailing_dot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_trailing_dot")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_underscores(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_underscores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_underscores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_underscores")(js.undefined)
        ret
    }
    @scala.inline
    def withDisallow_auth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallow_auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisallow_auth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallow_auth")(js.undefined)
        ret
    }
    @scala.inline
    def withHost_blacklist(value: js.Array[String | js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host_blacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost_blacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host_blacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withHost_whitelist(value: js.Array[String | js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host_whitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost_whitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host_whitelist")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocols(value: js.Array[URLProtocol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(js.undefined)
        ret
    }
    @scala.inline
    def withRequire_host(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire_host: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_host")(js.undefined)
        ret
    }
    @scala.inline
    def withRequire_protocol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire_protocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withRequire_tld(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_tld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire_tld: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_tld")(js.undefined)
        ret
    }
    @scala.inline
    def withRequire_valid_protocol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_valid_protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire_valid_protocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_valid_protocol")(js.undefined)
        ret
    }
  }
  
}

