package typingsSlinky.nodeHueApi.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodeHueApi.AnonCheckforupdate
import typingsSlinky.nodeHueApi.AnonCommunication
import typingsSlinky.nodeHueApi.AnonCreatedate
import typingsSlinky.nodeHueApi.AnonErrorcode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBridgeConfig extends js.Object {
  var UTC: js.Date
  var apiversion: String
  var backup: AnonErrorcode
  var bridgeid: String
  var dhcp: Boolean
  var factorynew: Boolean
  var gateway: String
  var ipaddress: String
  var linkbutton: Boolean
  var localtime: js.Date
  var mac: String
  var modelid: String
  var name: String
  var netmask: String
  var portalconnection: String
  var portalservices: Boolean
  var portalstate: AnonCommunication
  var proxyaddress: String
  var proxyport: Double
  var replacesbridgeid: js.UndefOr[String] = js.undefined
  var swupdate: AnonCheckforupdate
  var swversion: String
  var timezone: String
  var whitelist: StringDictionary[AnonCreatedate]
  var zigbeechannel: Double
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
    zigbeechannel: Double,
    replacesbridgeid: String = null
  ): IBridgeConfig = {
    val __obj = js.Dynamic.literal(UTC = UTC.asInstanceOf[js.Any], apiversion = apiversion.asInstanceOf[js.Any], backup = backup.asInstanceOf[js.Any], bridgeid = bridgeid.asInstanceOf[js.Any], dhcp = dhcp.asInstanceOf[js.Any], factorynew = factorynew.asInstanceOf[js.Any], gateway = gateway.asInstanceOf[js.Any], ipaddress = ipaddress.asInstanceOf[js.Any], linkbutton = linkbutton.asInstanceOf[js.Any], localtime = localtime.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], modelid = modelid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any], portalconnection = portalconnection.asInstanceOf[js.Any], portalservices = portalservices.asInstanceOf[js.Any], portalstate = portalstate.asInstanceOf[js.Any], proxyaddress = proxyaddress.asInstanceOf[js.Any], proxyport = proxyport.asInstanceOf[js.Any], swupdate = swupdate.asInstanceOf[js.Any], swversion = swversion.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], whitelist = whitelist.asInstanceOf[js.Any], zigbeechannel = zigbeechannel.asInstanceOf[js.Any])
    if (replacesbridgeid != null) __obj.updateDynamic("replacesbridgeid")(replacesbridgeid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBridgeConfig]
  }
}

