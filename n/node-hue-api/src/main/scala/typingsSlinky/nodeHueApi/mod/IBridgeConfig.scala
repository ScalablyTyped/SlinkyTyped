package typingsSlinky.nodeHueApi.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodeHueApi.AnonCheckforupdate
import typingsSlinky.nodeHueApi.AnonCommunication
import typingsSlinky.nodeHueApi.AnonCreatedate
import typingsSlinky.nodeHueApi.AnonErrorcode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBridgeConfig extends js.Object {
  var UTC: js.Date = js.native
  var apiversion: String = js.native
  var backup: AnonErrorcode = js.native
  var bridgeid: String = js.native
  var dhcp: Boolean = js.native
  var factorynew: Boolean = js.native
  var gateway: String = js.native
  var ipaddress: String = js.native
  var linkbutton: Boolean = js.native
  var localtime: js.Date = js.native
  var mac: String = js.native
  var modelid: String = js.native
  var name: String = js.native
  var netmask: String = js.native
  var portalconnection: String = js.native
  var portalservices: Boolean = js.native
  var portalstate: AnonCommunication = js.native
  var proxyaddress: String = js.native
  var proxyport: Double = js.native
  var replacesbridgeid: js.UndefOr[String] = js.native
  var swupdate: AnonCheckforupdate = js.native
  var swversion: String = js.native
  var timezone: String = js.native
  var whitelist: StringDictionary[AnonCreatedate] = js.native
  var zigbeechannel: Double = js.native
}

object IBridgeConfig {
  @scala.inline
  def apply(
    UTC: js.Date,
    apiversion: String,
    backup: AnonErrorcode,
    bridgeid: String,
    dhcp: Boolean,
    factorynew: Boolean,
    gateway: String,
    ipaddress: String,
    linkbutton: Boolean,
    localtime: js.Date,
    mac: String,
    modelid: String,
    name: String,
    netmask: String,
    portalconnection: String,
    portalservices: Boolean,
    portalstate: AnonCommunication,
    proxyaddress: String,
    proxyport: Double,
    swupdate: AnonCheckforupdate,
    swversion: String,
    timezone: String,
    whitelist: StringDictionary[AnonCreatedate],
    zigbeechannel: Double
  ): IBridgeConfig = {
    val __obj = js.Dynamic.literal(UTC = UTC.asInstanceOf[js.Any], apiversion = apiversion.asInstanceOf[js.Any], backup = backup.asInstanceOf[js.Any], bridgeid = bridgeid.asInstanceOf[js.Any], dhcp = dhcp.asInstanceOf[js.Any], factorynew = factorynew.asInstanceOf[js.Any], gateway = gateway.asInstanceOf[js.Any], ipaddress = ipaddress.asInstanceOf[js.Any], linkbutton = linkbutton.asInstanceOf[js.Any], localtime = localtime.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], modelid = modelid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any], portalconnection = portalconnection.asInstanceOf[js.Any], portalservices = portalservices.asInstanceOf[js.Any], portalstate = portalstate.asInstanceOf[js.Any], proxyaddress = proxyaddress.asInstanceOf[js.Any], proxyport = proxyport.asInstanceOf[js.Any], swupdate = swupdate.asInstanceOf[js.Any], swversion = swversion.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], whitelist = whitelist.asInstanceOf[js.Any], zigbeechannel = zigbeechannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBridgeConfig]
  }
  @scala.inline
  implicit class IBridgeConfigOps[Self <: IBridgeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUTC(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UTC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiversion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiversion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackup(value: AnonErrorcode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBridgeid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridgeid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDhcp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dhcp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFactorynew(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factorynew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGateway(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpaddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipaddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkbutton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkbutton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocaltime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMac(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetmask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netmask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortalconnection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalconnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortalservices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalservices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortalstate(value: AnonCommunication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalstate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxyaddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyaddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxyport(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwupdate(value: AnonCheckforupdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swupdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwversion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swversion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhitelist(value: StringDictionary[AnonCreatedate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZigbeechannel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zigbeechannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplacesbridgeid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacesbridgeid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacesbridgeid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacesbridgeid")(js.undefined)
        ret
    }
  }
  
}

