package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.ec2Mod.Boolean
import typingsSlinky.awsSdk.ec2Mod.DescribeNatGatewaysMaxResults
import typingsSlinky.awsSdk.ec2Mod.Filter
import typingsSlinky.awsSdk.ec2Mod.FilterList
import typingsSlinky.awsSdk.ec2Mod.NatGatewayId
import typingsSlinky.awsSdk.ec2Mod.NatGatewayIdStringList
import typingsSlinky.awsSdk.ec2Mod.String
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeNatGatewaysRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeNatGatewaysReques extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters.    nat-gateway-id - The ID of the NAT gateway.    state - The state of the NAT gateway (pending | failed | available | deleting | deleted).    subnet-id - The ID of the subnet in which the NAT gateway resides.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    vpc-id - The ID of the VPC in which the NAT gateway resides.  
    */
  var Filter: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeNatGatewaysMaxResults] = js.native
  
  /**
    * One or more NAT gateway IDs.
    */
  var NatGatewayIds: js.UndefOr[NatGatewayIdStringList] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeNatGatewaysReques {
  
  @scala.inline
  def apply(): DescribeNatGatewaysReques = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNatGatewaysReques]
  }
  
  @scala.inline
  implicit class DescribeNatGatewaysRequesMutableBuilder[Self <: DescribeNatGatewaysReques] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFilter(value: FilterList): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: Filter*): Self = StObject.set(x, "Filter", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: DescribeNatGatewaysMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNatGatewayIds(value: NatGatewayIdStringList): Self = StObject.set(x, "NatGatewayIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatGatewayIdsUndefined: Self = StObject.set(x, "NatGatewayIds", js.undefined)
    
    @scala.inline
    def setNatGatewayIdsVarargs(value: NatGatewayId*): Self = StObject.set(x, "NatGatewayIds", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
