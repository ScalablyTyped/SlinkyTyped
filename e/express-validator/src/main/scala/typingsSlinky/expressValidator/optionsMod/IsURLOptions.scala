package typingsSlinky.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllow_protocol_relative_urls(value: Boolean): Self = this.set("allow_protocol_relative_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_protocol_relative_urls: Self = this.set("allow_protocol_relative_urls", js.undefined)
    
    @scala.inline
    def setAllow_trailing_dot(value: Boolean): Self = this.set("allow_trailing_dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_trailing_dot: Self = this.set("allow_trailing_dot", js.undefined)
    
    @scala.inline
    def setAllow_underscores(value: Boolean): Self = this.set("allow_underscores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_underscores: Self = this.set("allow_underscores", js.undefined)
    
    @scala.inline
    def setDisallow_auth(value: Boolean): Self = this.set("disallow_auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisallow_auth: Self = this.set("disallow_auth", js.undefined)
    
    @scala.inline
    def setHost_blacklistVarargs(value: (String | js.RegExp)*): Self = this.set("host_blacklist", js.Array(value :_*))
    
    @scala.inline
    def setHost_blacklist(value: js.Array[String | js.RegExp]): Self = this.set("host_blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost_blacklist: Self = this.set("host_blacklist", js.undefined)
    
    @scala.inline
    def setHost_whitelistVarargs(value: (String | js.RegExp)*): Self = this.set("host_whitelist", js.Array(value :_*))
    
    @scala.inline
    def setHost_whitelist(value: js.Array[String | js.RegExp]): Self = this.set("host_whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost_whitelist: Self = this.set("host_whitelist", js.undefined)
    
    @scala.inline
    def setProtocolsVarargs(value: URLProtocol*): Self = this.set("protocols", js.Array(value :_*))
    
    @scala.inline
    def setProtocols(value: js.Array[URLProtocol]): Self = this.set("protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocols: Self = this.set("protocols", js.undefined)
    
    @scala.inline
    def setRequire_host(value: Boolean): Self = this.set("require_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequire_host: Self = this.set("require_host", js.undefined)
    
    @scala.inline
    def setRequire_protocol(value: Boolean): Self = this.set("require_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequire_protocol: Self = this.set("require_protocol", js.undefined)
    
    @scala.inline
    def setRequire_tld(value: Boolean): Self = this.set("require_tld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequire_tld: Self = this.set("require_tld", js.undefined)
    
    @scala.inline
    def setRequire_valid_protocol(value: Boolean): Self = this.set("require_valid_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequire_valid_protocol: Self = this.set("require_valid_protocol", js.undefined)
  }
}
