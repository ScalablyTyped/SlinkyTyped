package typingsSlinky.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchSystemInstancesRequest extends StObject {
  
  /**
    * Optional filter to apply to the search. Valid filters are SYSTEM_TEMPLATE_ID, STATUS, and GREENGRASS_GROUP_NAME. Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function as AND criteria.
    */
  var filters: js.UndefOr[SystemInstanceFilters] = js.native
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The string that specifies the next page of results. Use this when you're paginating results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object SearchSystemInstancesRequest {
  
  @scala.inline
  def apply(): SearchSystemInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSystemInstancesRequest]
  }
  
  @scala.inline
  implicit class SearchSystemInstancesRequestMutableBuilder[Self <: SearchSystemInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: SystemInstanceFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: SystemInstanceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
