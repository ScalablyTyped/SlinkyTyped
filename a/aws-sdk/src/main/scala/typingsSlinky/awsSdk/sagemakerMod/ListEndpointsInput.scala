package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEndpointsInput extends StObject {
  
  /**
    * A filter that returns only endpoints with a creation time greater than or equal to the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.native
  
  /**
    * A filter that returns only endpoints that were created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.native
  
  /**
    *  A filter that returns only endpoints that were modified after the specified timestamp. 
    */
  var LastModifiedTimeAfter: js.UndefOr[js.Date] = js.native
  
  /**
    *  A filter that returns only endpoints that were modified before the specified timestamp. 
    */
  var LastModifiedTimeBefore: js.UndefOr[js.Date] = js.native
  
  /**
    * The maximum number of endpoints to return in the response.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxResults] = js.native
  
  /**
    * A string in endpoint names. This filter returns only endpoints whose name contains the specified string.
    */
  var NameContains: js.UndefOr[EndpointNameContains] = js.native
  
  /**
    * If the result of a ListEndpoints request was truncated, the response includes a NextToken. To retrieve the next set of endpoints, use the token in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * Sorts the list of results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[EndpointSortKey] = js.native
  
  /**
    * The sort order for results. The default is Descending.
    */
  var SortOrder: js.UndefOr[OrderKey] = js.native
  
  /**
    *  A filter that returns only endpoints with the specified status.
    */
  var StatusEquals: js.UndefOr[EndpointStatus] = js.native
}
object ListEndpointsInput {
  
  @scala.inline
  def apply(): ListEndpointsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEndpointsInput]
  }
  
  @scala.inline
  implicit class ListEndpointsInputMutableBuilder[Self <: ListEndpointsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    @scala.inline
    def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    @scala.inline
    def setLastModifiedTimeAfter(value: js.Date): Self = StObject.set(x, "LastModifiedTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeAfterUndefined: Self = StObject.set(x, "LastModifiedTimeAfter", js.undefined)
    
    @scala.inline
    def setLastModifiedTimeBefore(value: js.Date): Self = StObject.set(x, "LastModifiedTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeBeforeUndefined: Self = StObject.set(x, "LastModifiedTimeBefore", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNameContains(value: EndpointNameContains): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSortBy(value: EndpointSortKey): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: OrderKey): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    @scala.inline
    def setStatusEquals(value: EndpointStatus): Self = StObject.set(x, "StatusEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusEqualsUndefined: Self = StObject.set(x, "StatusEquals", js.undefined)
  }
}
