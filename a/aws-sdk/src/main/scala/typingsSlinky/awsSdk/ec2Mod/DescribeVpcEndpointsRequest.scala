package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcEndpointsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters.    service-name - The name of the service.    vpc-id - The ID of the VPC in which the endpoint resides.    vpc-endpoint-id - The ID of the endpoint.    vpc-endpoint-state - The state of the endpoint (pendingAcceptance | pending | available | deleting | deleted | rejected | failed).    vpc-endpoint-type - The type of VPC endpoint (Interface | Gateway | GatewayLoadBalancer).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of items to return for this request. The request returns a token that you can specify in a subsequent call to get the next set of results. Constraint: If the value is greater than 1,000, we return only 1,000 items.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a prior call.)
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * One or more endpoint IDs.
    */
  var VpcEndpointIds: js.UndefOr[VpcEndpointIdList] = js.native
}
object DescribeVpcEndpointsRequest {
  
  @scala.inline
  def apply(): DescribeVpcEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcEndpointsRequest]
  }
  
  @scala.inline
  implicit class DescribeVpcEndpointsRequestMutableBuilder[Self <: DescribeVpcEndpointsRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVpcEndpointIds(value: VpcEndpointIdList): Self = StObject.set(x, "VpcEndpointIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointIdsUndefined: Self = StObject.set(x, "VpcEndpointIds", js.undefined)
    
    @scala.inline
    def setVpcEndpointIdsVarargs(value: VpcEndpointId*): Self = StObject.set(x, "VpcEndpointIds", js.Array(value :_*))
  }
}
