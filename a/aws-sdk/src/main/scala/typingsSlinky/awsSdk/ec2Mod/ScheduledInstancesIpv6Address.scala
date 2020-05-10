package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstancesIpv6Address extends js.Object {
  /**
    * The IPv6 address.
    */
  var Ipv6Address: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.Ipv6Address] = js.native
}

object ScheduledInstancesIpv6Address {
  @scala.inline
  def apply(): ScheduledInstancesIpv6Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstancesIpv6Address]
  }
  @scala.inline
  implicit class ScheduledInstancesIpv6AddressOps[Self <: ScheduledInstancesIpv6Address] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpv6Address(value: Ipv6Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6Address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6Address")(js.undefined)
        ret
    }
  }
  
}

