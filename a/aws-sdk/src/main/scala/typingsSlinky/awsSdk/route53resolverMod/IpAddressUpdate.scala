package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpAddressUpdate extends js.Object {
  /**
    * The new IP address.
    */
  var Ip: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.Ip] = js.native
  /**
    *  Only when removing an IP address from a resolver endpoint: The ID of the IP address that you want to remove. To get this ID, use GetResolverEndpoint.
    */
  var IpId: js.UndefOr[ResourceId] = js.native
  /**
    * The ID of the subnet that includes the IP address that you want to update. To get this ID, use GetResolverEndpoint.
    */
  var SubnetId: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.SubnetId] = js.native
}

object IpAddressUpdate {
  @scala.inline
  def apply(): IpAddressUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpAddressUpdate]
  }
  @scala.inline
  implicit class IpAddressUpdateOps[Self <: IpAddressUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIp(value: Ip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ip")(js.undefined)
        ret
    }
    @scala.inline
    def withIpId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpId")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: SubnetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(js.undefined)
        ret
    }
  }
  
}

