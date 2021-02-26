package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.ec2Mod.Boolean
import typingsSlinky.awsSdk.ec2Mod.DescribeSubnetsMaxResults
import typingsSlinky.awsSdk.ec2Mod.Filter
import typingsSlinky.awsSdk.ec2Mod.FilterList
import typingsSlinky.awsSdk.ec2Mod.String
import typingsSlinky.awsSdk.ec2Mod.SubnetId
import typingsSlinky.awsSdk.ec2Mod.SubnetIdStringList
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeSubnetsRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeSubnetsRequestwai extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters.    availability-zone - The Availability Zone for the subnet. You can also use availabilityZone as the filter name.    availability-zone-id - The ID of the Availability Zone for the subnet. You can also use availabilityZoneId as the filter name.    available-ip-address-count - The number of IPv4 addresses in the subnet that are available.    cidr-block - The IPv4 CIDR block of the subnet. The CIDR block you specify must exactly match the subnet's CIDR block for information to be returned for the subnet. You can also use cidr or cidrBlock as the filter names.    default-for-az - Indicates whether this is the default subnet for the Availability Zone. You can also use defaultForAz as the filter name.    ipv6-cidr-block-association.ipv6-cidr-block - An IPv6 CIDR block associated with the subnet.    ipv6-cidr-block-association.association-id - An association ID for an IPv6 CIDR block associated with the subnet.    ipv6-cidr-block-association.state - The state of an IPv6 CIDR block associated with the subnet.    owner-id - The ID of the AWS account that owns the subnet.    state - The state of the subnet (pending | available).    subnet-arn - The Amazon Resource Name (ARN) of the subnet.    subnet-id - The ID of the subnet.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    vpc-id - The ID of the VPC for the subnet.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeSubnetsMaxResults] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * One or more subnet IDs. Default: Describes all your subnets.
    */
  var SubnetIds: js.UndefOr[SubnetIdStringList] = js.native
}
object DescribeSubnetsRequestwai {
  
  @scala.inline
  def apply(): DescribeSubnetsRequestwai = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSubnetsRequestwai]
  }
  
  @scala.inline
  implicit class DescribeSubnetsRequestwaiMutableBuilder[Self <: DescribeSubnetsRequestwai] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
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
    def setMaxResults(value: DescribeSubnetsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSubnetIds(value: SubnetIdStringList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
  }
}
