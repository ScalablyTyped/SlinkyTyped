package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateResolverEndpointIpAddressResponse extends js.Object {
  /**
    * The response to an AssociateResolverEndpointIpAddress request.
    */
  var ResolverEndpoint: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.ResolverEndpoint] = js.native
}

object AssociateResolverEndpointIpAddressResponse {
  @scala.inline
  def apply(): AssociateResolverEndpointIpAddressResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateResolverEndpointIpAddressResponse]
  }
  @scala.inline
  implicit class AssociateResolverEndpointIpAddressResponseOps[Self <: AssociateResolverEndpointIpAddressResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolverEndpoint(value: ResolverEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolverEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolverEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolverEndpoint")(js.undefined)
        ret
    }
  }
  
}

