package typingsSlinky.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSavingsPlansOfferingsResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * Information about the Savings Plans offerings.
    */
  var searchResults: js.UndefOr[SavingsPlanOfferingsList] = js.native
}
object DescribeSavingsPlansOfferingsResponse {
  
  @scala.inline
  def apply(): DescribeSavingsPlansOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSavingsPlansOfferingsResponse]
  }
  
  @scala.inline
  implicit class DescribeSavingsPlansOfferingsResponseMutableBuilder[Self <: DescribeSavingsPlansOfferingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSearchResults(value: SavingsPlanOfferingsList): Self = StObject.set(x, "searchResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchResultsUndefined: Self = StObject.set(x, "searchResults", js.undefined)
    
    @scala.inline
    def setSearchResultsVarargs(value: SavingsPlanOffering*): Self = StObject.set(x, "searchResults", js.Array(value :_*))
  }
}
