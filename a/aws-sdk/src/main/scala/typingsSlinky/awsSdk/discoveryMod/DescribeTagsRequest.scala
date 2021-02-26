package typingsSlinky.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTagsRequest extends StObject {
  
  /**
    * You can filter the list using a key-value format. You can separate these items by using logical operators. Allowed filters include tagKey, tagValue, and configurationId. 
    */
  var filters: js.UndefOr[TagFilters] = js.native
  
  /**
    * The total number of items to return in a single page of output. The maximum value is 100.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  
  /**
    * A token to start the list. Use this token to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeTagsRequest {
  
  @scala.inline
  def apply(): DescribeTagsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTagsRequest]
  }
  
  @scala.inline
  implicit class DescribeTagsRequestMutableBuilder[Self <: DescribeTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: TagFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: TagFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
