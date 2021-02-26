package typingsSlinky.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResolverEndpointIpAddressesResponse extends StObject {
  
  /**
    * Information about the IP addresses in your VPC that DNS queries originate from (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints).
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
  implicit class ListResolverEndpointIpAddressesResponseMutableBuilder[Self <: ListResolverEndpointIpAddressesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpAddresses(value: IpAddressesResponse): Self = StObject.set(x, "IpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressesUndefined: Self = StObject.set(x, "IpAddresses", js.undefined)
    
    @scala.inline
    def setIpAddressesVarargs(value: IpAddressResponse*): Self = StObject.set(x, "IpAddresses", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
