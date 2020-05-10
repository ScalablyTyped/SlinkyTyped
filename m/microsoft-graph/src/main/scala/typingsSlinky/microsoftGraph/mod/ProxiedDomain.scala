package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxiedDomain extends js.Object {
  // The IP address or FQDN
  var ipAddressOrFQDN: js.UndefOr[String] = js.native
  // Proxy IP or FQDN
  var proxy: js.UndefOr[String] = js.native
}

object ProxiedDomain {
  @scala.inline
  def apply(): ProxiedDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxiedDomain]
  }
  @scala.inline
  implicit class ProxiedDomainOps[Self <: ProxiedDomain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpAddressOrFQDN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddressOrFQDN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddressOrFQDN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddressOrFQDN")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
  }
  
}

