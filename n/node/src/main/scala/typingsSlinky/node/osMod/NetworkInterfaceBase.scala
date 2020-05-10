package typingsSlinky.node.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfaceBase extends js.Object {
  var address: String = js.native
  var cidr: String | Null = js.native
  var internal: Boolean = js.native
  var mac: String = js.native
  var netmask: String = js.native
}

object NetworkInterfaceBase {
  @scala.inline
  def apply(address: String, internal: Boolean, mac: String, netmask: String): NetworkInterfaceBase = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceBase]
  }
  @scala.inline
  implicit class NetworkInterfaceBaseOps[Self <: NetworkInterfaceBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMac(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetmask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netmask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCidr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCidrNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidr")(null)
        ret
    }
  }
  
}

