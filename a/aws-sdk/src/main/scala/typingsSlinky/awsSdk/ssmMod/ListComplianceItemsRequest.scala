package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListComplianceItemsRequest extends StObject {
  
  /**
    * One or more compliance filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[ComplianceStringFilterList] = js.native
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxResults] = js.native
  
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * The ID for the resources from which to get compliance information. Currently, you can only specify one resource ID.
    */
  var ResourceIds: js.UndefOr[ComplianceResourceIdList] = js.native
  
  /**
    * The type of resource from which to get compliance information. Currently, the only supported resource type is ManagedInstance.
    */
  var ResourceTypes: js.UndefOr[ComplianceResourceTypeList] = js.native
}
object ListComplianceItemsRequest {
  
  @scala.inline
  def apply(): ListComplianceItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComplianceItemsRequest]
  }
  
  @scala.inline
  implicit class ListComplianceItemsRequestMutableBuilder[Self <: ListComplianceItemsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: ComplianceStringFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: ComplianceStringFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceIds(value: ComplianceResourceIdList): Self = StObject.set(x, "ResourceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdsUndefined: Self = StObject.set(x, "ResourceIds", js.undefined)
    
    @scala.inline
    def setResourceIdsVarargs(value: ComplianceResourceId*): Self = StObject.set(x, "ResourceIds", js.Array(value :_*))
    
    @scala.inline
    def setResourceTypes(value: ComplianceResourceTypeList): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    @scala.inline
    def setResourceTypesVarargs(value: ComplianceResourceType*): Self = StObject.set(x, "ResourceTypes", js.Array(value :_*))
  }
}
