package typingsSlinky.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPConfigProperties[M /* <: ManagedObject */, B, S, SL, L] extends js.Object {
  /** Gateway address used for the IP configuration. */
  var Gateway: js.UndefOr[S] = js.native
  /** The IP address for a connection. Can be IPv4 or IPv6 address, depending on value of Type. */
  var IPAddress: js.UndefOr[S] = js.native
  /** Array of addresses used for name servers. */
  var NameServers: js.UndefOr[SL] = js.native
  /** The routing prefix. */
  var RoutingPrefix: js.UndefOr[L] = js.native
  /** The IP configuration type. Can be IPv4 or IPv6. */
  var Type: js.UndefOr[IPConfigurationType | ManagedType[IPConfigurationType]] = js.native
  /** The URL for WEb Proxy Auto-Discovery, as reported over DHCP. */
  var WebProxyAutoDiscoveryUrl: js.UndefOr[S] = js.native
}

object IPConfigProperties {
  @scala.inline
  def apply[M, B, S, SL, L](): IPConfigProperties[M, B, S, SL, L] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPConfigProperties[M, B, S, SL, L]]
  }
  @scala.inline
  implicit class IPConfigPropertiesOps[Self[m, b, s, sl, l] <: IPConfigProperties[m, b, s, sl, l], M, B, S, SL, L] (val x: Self[M, B, S, SL, L]) extends AnyVal {
    @scala.inline
    def duplicate: Self[M, B, S, SL, L] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[M, B, S, SL, L]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[M, B, S, SL, L]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[M, B, S, SL, L]) with Other]
    @scala.inline
    def withGateway(value: S): Self[M, B, S, SL, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGateway: Self[M, B, S, SL, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gateway")(js.undefined)
        ret
    }
    @scala.inline
    def withIPAddress(value: S): Self[M, B, S, SL, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPAddress: Self[M, B, S, SL, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withNameServers(value: SL): Self[M, B, S, SL, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameServers: Self[M, B, S, SL, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameServers")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutingPrefix(value: L): Self[M, B, S, SL, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoutingPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutingPrefix: Self[M, B, S, SL, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoutingPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: IPConfigurationType | ManagedType[IPConfigurationType]): Self[M, B, S, SL, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[M, B, S, SL, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withWebProxyAutoDiscoveryUrl(value: S): Self[M, B, S, SL, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebProxyAutoDiscoveryUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebProxyAutoDiscoveryUrl: Self[M, B, S, SL, L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebProxyAutoDiscoveryUrl")(js.undefined)
        ret
    }
  }
  
}

