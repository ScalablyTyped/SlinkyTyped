package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifySubnetAttributeRequest extends js.Object {
  /**
    * Specify true to indicate that network interfaces created in the specified subnet should be assigned an IPv6 address. This includes a network interface that's created when launching an instance into the subnet (the instance therefore receives an IPv6 address).  If you enable the IPv6 addressing feature for your subnet, your network interface or instance only receives an IPv6 address if it's created using version 2016-11-15 or later of the Amazon EC2 API.
    */
  var AssignIpv6AddressOnCreation: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * Specify true to indicate that ENIs attached to instances created in the specified subnet should be assigned a public IPv4 address.
    */
  var MapPublicIpOnLaunch: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * The ID of the subnet.
    */
  var SubnetId: typingsSlinky.awsSdk.ec2Mod.SubnetId = js.native
}

object ModifySubnetAttributeRequest {
  @scala.inline
  def apply(SubnetId: SubnetId): ModifySubnetAttributeRequest = {
    val __obj = js.Dynamic.literal(SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySubnetAttributeRequest]
  }
  @scala.inline
  implicit class ModifySubnetAttributeRequestOps[Self <: ModifySubnetAttributeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubnetId(value: SubnetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignIpv6AddressOnCreation(value: AttributeBooleanValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignIpv6AddressOnCreation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignIpv6AddressOnCreation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignIpv6AddressOnCreation")(js.undefined)
        ret
    }
    @scala.inline
    def withMapPublicIpOnLaunch(value: AttributeBooleanValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MapPublicIpOnLaunch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapPublicIpOnLaunch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MapPublicIpOnLaunch")(js.undefined)
        ret
    }
  }
  
}

