package typingsSlinky.node.osMod

import typingsSlinky.node.nodeStrings.IPv6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceInfoIPv6
  extends NetworkInterfaceBase
     with NetworkInterfaceInfo {
  var family: IPv6
  var scopeid: Double
}

object NetworkInterfaceInfoIPv6 {
  @scala.inline
  def apply(
    address: java.lang.String,
    family: IPv6,
    internal: Boolean,
    mac: java.lang.String,
    netmask: java.lang.String,
    scopeid: Double,
    cidr: java.lang.String = null
  ): NetworkInterfaceInfoIPv6 = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any], scopeid = scopeid.asInstanceOf[js.Any])
    if (cidr != null) __obj.updateDynamic("cidr")(cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceInfoIPv6]
  }
}

