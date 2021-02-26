package typingsSlinky.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSecretsRequest extends StObject {
  
  /**
    * Lists the secret request filters.
    */
  var Filters: js.UndefOr[FiltersListType] = js.native
  
  /**
    * (Optional) Limits the number of results you want to include in the response. If you don't include this parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (isn't null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Secrets Manager might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var MaxResults: js.UndefOr[MaxResultsType] = js.native
  
  /**
    * (Optional) Use this parameter in a request if you receive a NextToken response in a previous request indicating there's more output available. In a subsequent call, set it to the value of the previous call NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[NextTokenType] = js.native
  
  /**
    * Lists secrets in the requested order. 
    */
  var SortOrder: js.UndefOr[SortOrderType] = js.native
}
object ListSecretsRequest {
  
  @scala.inline
  def apply(): ListSecretsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecretsRequest]
  }
  
  @scala.inline
  implicit class ListSecretsRequestMutableBuilder[Self <: ListSecretsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: FiltersListType): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResultsType): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextTokenType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrderType): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
