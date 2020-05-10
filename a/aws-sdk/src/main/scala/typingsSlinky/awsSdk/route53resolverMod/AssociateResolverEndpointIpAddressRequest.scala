package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateResolverEndpointIpAddressRequest extends js.Object {
  /**
    * Either the IPv4 address that you want to add to a resolver endpoint or a subnet ID. If you specify a subnet ID, Resolver chooses an IP address for you from the available IPs in the specified subnet.
    */
  var IpAddress: IpAddressUpdate = js.native
  /**
    * The ID of the resolver endpoint that you want to associate IP addresses with.
    */
  var ResolverEndpointId: ResourceId = js.native
}

object AssociateResolverEndpointIpAddressRequest {
  @scala.inline
  def apply(IpAddress: IpAddressUpdate, ResolverEndpointId: ResourceId): AssociateResolverEndpointIpAddressRequest = {
    val __obj = js.Dynamic.literal(IpAddress = IpAddress.asInstanceOf[js.Any], ResolverEndpointId = ResolverEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResolverEndpointIpAddressRequest]
  }
  @scala.inline
  implicit class AssociateResolverEndpointIpAddressRequestOps[Self <: AssociateResolverEndpointIpAddressRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpAddress(value: IpAddressUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolverEndpointId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolverEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

