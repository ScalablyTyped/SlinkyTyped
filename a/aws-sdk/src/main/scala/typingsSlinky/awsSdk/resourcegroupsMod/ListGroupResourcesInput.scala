package typingsSlinky.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGroupResourcesInput extends StObject {
  
  /**
    * Filters, formatted as ResourceFilter objects, that you want to apply to a ListGroupResources operation. Filters the results to include only those of the specified resource types.    resource-type - Filter resources by their type. Specify up to five resource types in the format AWS::ServiceCode::ResourceType. For example, AWS::EC2::Instance, or AWS::S3::Bucket.    When you specify a resource-type filter for ListGroupResources, AWS Resource Groups validates your filter resource types against the types that are defined in the query associated with the group. For example, if a group contains only S3 buckets because its query specifies only that resource type, but your resource-type filter includes EC2 instances, AWS Resource Groups does not filter for EC2 instances. In this case, a ListGroupResources request returns a BadRequestException error with a message similar to the following:  The resource types specified as filters in the request are not valid.  The error includes a list of resource types that failed the validation because they are not part of the query associated with the group. This validation doesn't occur when the group query specifies AWS::AllSupported, because a group based on such a query can contain any of the allowed resource types for the query type (tag-based or AWS CloudFormation stack-based queries).
    */
  var Filters: js.UndefOr[ResourceFilterList] = js.native
  
  /**
    * The name or the ARN of the resource group
    */
  var Group: js.UndefOr[GroupString] = js.native
  
  /**
    * Don't use this parameter. Use Group instead.
    */
  var GroupName: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.GroupName] = js.native
  
  /**
    * The total number of results that you want included on each page of the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that the service might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.MaxResults] = js.native
  
  /**
    * The parameter for receiving additional results if you receive a NextToken response in a previous request. A NextToken response indicates that more output is available. Set this parameter to the value provided by a previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.NextToken] = js.native
}
object ListGroupResourcesInput {
  
  @scala.inline
  def apply(): ListGroupResourcesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupResourcesInput]
  }
  
  @scala.inline
  implicit class ListGroupResourcesInputMutableBuilder[Self <: ListGroupResourcesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: ResourceFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: ResourceFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setGroup(value: GroupString): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
    
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
