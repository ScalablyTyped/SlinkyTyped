package typingsSlinky.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSavingsPlanRatesRequest extends StObject {
  
  /**
    * The filters.
    */
  var filters: js.UndefOr[SavingsPlanRateFilterList] = js.native
  
  /**
    * The maximum number of results to return with a single call. To retrieve additional results, make another call with the returned token value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The ID of the Savings Plan.
    */
  var savingsPlanId: SavingsPlanId = js.native
}
object DescribeSavingsPlanRatesRequest {
  
  @scala.inline
  def apply(savingsPlanId: SavingsPlanId): DescribeSavingsPlanRatesRequest = {
    val __obj = js.Dynamic.literal(savingsPlanId = savingsPlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSavingsPlanRatesRequest]
  }
  
  @scala.inline
  implicit class DescribeSavingsPlanRatesRequestMutableBuilder[Self <: DescribeSavingsPlanRatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: SavingsPlanRateFilterList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: SavingsPlanRateFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSavingsPlanId(value: SavingsPlanId): Self = StObject.set(x, "savingsPlanId", value.asInstanceOf[js.Any])
  }
}
