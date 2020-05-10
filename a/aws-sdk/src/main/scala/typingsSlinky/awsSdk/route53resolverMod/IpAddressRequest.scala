package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpAddressRequest extends js.Object {
  /**
    * The IP address that you want to use for DNS queries.
    */
  var Ip: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.Ip] = js.native
  /**
    * The subnet that contains the IP address.
    */
  var SubnetId: typingsSlinky.awsSdk.route53resolverMod.SubnetId = js.native
}

object IpAddressRequest {
  @scala.inline
  def apply(SubnetId: SubnetId): IpAddressRequest = {
    val __obj = js.Dynamic.literal(SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpAddressRequest]
  }
  @scala.inline
  implicit class IpAddressRequestOps[Self <: IpAddressRequest] (val x: Self) extends AnyVal {
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
  }
  
}

