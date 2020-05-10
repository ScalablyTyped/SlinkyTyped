package typingsSlinky.node.osMod

import typingsSlinky.node.nodeStrings.IPv6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfaceInfoIPv6
  extends NetworkInterfaceBase
     with NetworkInterfaceInfo {
  var family: IPv6 = js.native
  var scopeid: Double = js.native
}

object NetworkInterfaceInfoIPv6 {
  @scala.inline
  def apply(address: String, family: IPv6, internal: Boolean, mac: String, netmask: String, scopeid: Double): NetworkInterfaceInfoIPv6 = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any], scopeid = scopeid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceInfoIPv6]
  }
  @scala.inline
  implicit class NetworkInterfaceInfoIPv6Ops[Self <: NetworkInterfaceInfoIPv6] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFamily(value: IPv6): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

