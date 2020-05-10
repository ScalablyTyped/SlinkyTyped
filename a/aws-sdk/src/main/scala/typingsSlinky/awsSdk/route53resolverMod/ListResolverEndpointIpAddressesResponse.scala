package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResolverEndpointIpAddressesResponse extends js.Object {
  /**
    * The IP addresses that DNS queries pass through on their way to your network (outbound endpoint) or on the way to Resolver (inbound endpoint).
    */
  var IpAddresses: js.UndefOr[IpAddressesResponse] = js.native
  /**
    * The value that you specified for MaxResults in the request.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.MaxResults] = js.native
  /**
    * If the specified endpoint has more than MaxResults IP addresses, you can submit another ListResolverEndpointIpAddresses request to get the next group of IP addresses. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.NextToken] = js.native
}

object ListResolverEndpointIpAddressesResponse {
  @scala.inline
  def apply(): ListResolverEndpointIpAddressesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverEndpointIpAddressesResponse]
  }
  @scala.inline
  implicit class ListResolverEndpointIpAddressesResponseOps[Self <: ListResolverEndpointIpAddressesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpAddresses(value: IpAddressesResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

