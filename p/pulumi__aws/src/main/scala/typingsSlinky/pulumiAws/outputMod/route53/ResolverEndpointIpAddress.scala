package typingsSlinky.pulumiAws.outputMod.route53

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverEndpointIpAddress extends js.Object {
  /**
    * The IP address in the subnet that you want to use for DNS queries.
    */
  var ip: String = js.native
  var ipId: String = js.native
  /**
    * The ID of the subnet that contains the IP address.
    */
  var subnetId: String = js.native
}

object ResolverEndpointIpAddress {
  @scala.inline
  def apply(ip: String, ipId: String, subnetId: String): ResolverEndpointIpAddress = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], ipId = ipId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverEndpointIpAddress]
  }
  @scala.inline
  implicit class ResolverEndpointIpAddressOps[Self <: ResolverEndpointIpAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

