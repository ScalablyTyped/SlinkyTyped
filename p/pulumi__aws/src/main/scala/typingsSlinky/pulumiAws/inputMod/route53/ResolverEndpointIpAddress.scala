package typingsSlinky.pulumiAws.inputMod.route53

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverEndpointIpAddress extends js.Object {
  /**
    * The IP address in the subnet that you want to use for DNS queries.
    */
  var ip: js.UndefOr[Input[String]] = js.native
  var ipId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the subnet that contains the IP address.
    */
  var subnetId: Input[String] = js.native
}

object ResolverEndpointIpAddress {
  @scala.inline
  def apply(subnetId: Input[String]): ResolverEndpointIpAddress = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverEndpointIpAddress]
  }
  @scala.inline
  implicit class ResolverEndpointIpAddressOps[Self <: ResolverEndpointIpAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubnetId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.undefined)
        ret
    }
    @scala.inline
    def withIpId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipId")(js.undefined)
        ret
    }
  }
  
}

