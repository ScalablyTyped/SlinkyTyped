package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClientVpnRoutesRequest extends StObject {
  
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: typingsSlinky.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters. Filter names and values are case-sensitive.    destination-cidr - The CIDR of the route destination.    origin - How the route was associated with the Client VPN endpoint (associate | add-route).    target-subnet - The ID of the subnet through which traffic is routed.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeClientVpnRoutesMaxResults] = js.native
  
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.NextToken] = js.native
}
object DescribeClientVpnRoutesRequest {
  
  @scala.inline
  def apply(ClientVpnEndpointId: ClientVpnEndpointId): DescribeClientVpnRoutesRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClientVpnRoutesRequest]
  }
  
  @scala.inline
  implicit class DescribeClientVpnRoutesRequestMutableBuilder[Self <: DescribeClientVpnRoutesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientVpnEndpointId(value: ClientVpnEndpointId): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: DescribeClientVpnRoutesMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
