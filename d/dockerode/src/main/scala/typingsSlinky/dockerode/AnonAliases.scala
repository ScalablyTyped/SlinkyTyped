package typingsSlinky.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAliases extends js.Object {
  var Aliases: js.UndefOr[js.Any] = js.native
  var EndpointID: String = js.native
  var Gateway: String = js.native
  var GlobalIPv6Address: String = js.native
  var GlobalIPv6PrefixLen: Double = js.native
  var IPAMConfig: js.UndefOr[js.Any] = js.native
  var IPAddress: String = js.native
  var IPPrefixLen: Double = js.native
  var IPv6Gateway: String = js.native
  var Links: js.UndefOr[js.Any] = js.native
  var MacAddress: String = js.native
  var NetworkID: String = js.native
}

object AnonAliases {
  @scala.inline
  def apply(
    EndpointID: String,
    Gateway: String,
    GlobalIPv6Address: String,
    GlobalIPv6PrefixLen: Double,
    IPAddress: String,
    IPPrefixLen: Double,
    IPv6Gateway: String,
    MacAddress: String,
    NetworkID: String
  ): AnonAliases = {
    val __obj = js.Dynamic.literal(EndpointID = EndpointID.asInstanceOf[js.Any], Gateway = Gateway.asInstanceOf[js.Any], GlobalIPv6Address = GlobalIPv6Address.asInstanceOf[js.Any], GlobalIPv6PrefixLen = GlobalIPv6PrefixLen.asInstanceOf[js.Any], IPAddress = IPAddress.asInstanceOf[js.Any], IPPrefixLen = IPPrefixLen.asInstanceOf[js.Any], IPv6Gateway = IPv6Gateway.asInstanceOf[js.Any], MacAddress = MacAddress.asInstanceOf[js.Any], NetworkID = NetworkID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAliases]
  }
  @scala.inline
  implicit class AnonAliasesOps[Self <: AnonAliases] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGateway(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalIPv6Address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalIPv6Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalIPv6PrefixLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalIPv6PrefixLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPPrefixLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPPrefixLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPv6Gateway(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPv6Gateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMacAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MacAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAliases(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aliases")(js.undefined)
        ret
    }
    @scala.inline
    def withIPAMConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAMConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPAMConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAMConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Links")(js.undefined)
        ret
    }
  }
  
}

