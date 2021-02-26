package typingsSlinky.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDatasetImportJobsRequest extends StObject {
  
  /**
    * An array of filters. For each filter, you provide a condition and a match statement. The condition is either IS or IS_NOT, which specifies whether to include or exclude the datasets that match the statement from the list, respectively. The match statement consists of a key and a value.  Filter properties     Condition - The condition to apply. Valid values are IS and IS_NOT. To include the datasets that match the statement, specify IS. To exclude matching datasets, specify IS_NOT.    Key - The name of the parameter to filter on. Valid values are DatasetArn and Status.    Value - The value to match.   For example, to list all dataset import jobs whose status is ACTIVE, you specify the following filter:  "Filters": [ { "Condition": "IS", "Key": "Status", "Value": "ACTIVE" } ] 
    */
  var Filters: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Filters] = js.native
  
  /**
    * The number of items to return in the response.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.MaxResults] = js.native
  
  /**
    * If the result of the previous request was truncated, the response includes a NextToken. To retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.NextToken] = js.native
}
object ListDatasetImportJobsRequest {
  
  @scala.inline
  def apply(): ListDatasetImportJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetImportJobsRequest]
  }
  
  @scala.inline
  implicit class ListDatasetImportJobsRequestMutableBuilder[Self <: ListDatasetImportJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
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
