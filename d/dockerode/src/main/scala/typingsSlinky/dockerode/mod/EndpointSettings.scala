package typingsSlinky.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:enable:interface-name */
@js.native
trait EndpointSettings extends js.Object {
  var Aliases: js.UndefOr[js.Array[String]] = js.native
  var DriverOpts: js.UndefOr[StringDictionary[String]] = js.native
  var EndpointID: js.UndefOr[String] = js.native
  var Gateway: js.UndefOr[String] = js.native
  var GlobalIPV6PrefixLen: js.UndefOr[Double] = js.native
  var GlobalIPv6Address: js.UndefOr[String] = js.native
  var IPAMConfig: js.UndefOr[typingsSlinky.dockerode.mod.IPAMConfig] = js.native
  var IPAddress: js.UndefOr[String] = js.native
  var IPPrefixLen: js.UndefOr[Double] = js.native
  var IPv6Gateway: js.UndefOr[String] = js.native
  var Links: js.UndefOr[js.Array[String]] = js.native
  var MacAddress: js.UndefOr[String] = js.native
  var NetworkID: js.UndefOr[String] = js.native
}

object EndpointSettings {
  @scala.inline
  def apply(): EndpointSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointSettings]
  }
  @scala.inline
  implicit class EndpointSettingsOps[Self <: EndpointSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliases(value: js.Array[String]): Self = {
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
    def withDriverOpts(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriverOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriverOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriverOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointID")(js.undefined)
        ret
    }
    @scala.inline
    def withGateway(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gateway")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalIPV6PrefixLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalIPV6PrefixLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalIPV6PrefixLen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalIPV6PrefixLen")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalIPv6Address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalIPv6Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalIPv6Address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalIPv6Address")(js.undefined)
        ret
    }
    @scala.inline
    def withIPAMConfig(value: IPAMConfig): Self = {
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
    def withIPAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withIPPrefixLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPPrefixLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPPrefixLen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPPrefixLen")(js.undefined)
        ret
    }
    @scala.inline
    def withIPv6Gateway(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPv6Gateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPv6Gateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPv6Gateway")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: js.Array[String]): Self = {
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
    @scala.inline
    def withMacAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MacAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MacAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkID")(js.undefined)
        ret
    }
  }
  
}

