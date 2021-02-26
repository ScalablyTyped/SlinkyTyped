package typingsSlinky.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFaqsResponse extends StObject {
  
  /**
    * information about the FAQs associated with the specified index.
    */
  var FaqSummaryItems: js.UndefOr[typingsSlinky.awsSdk.kendraMod.FaqSummaryItems] = js.native
  
  /**
    * The ListFaqs operation returns a page of FAQs at a time. The maximum size of the page is set by the MaxResults parameter. If there are more jobs in the list than the page size, Amazon Kendra returns the NextPage token. Include the token in the next request to the ListFaqs operation to return the next page of FAQs.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.kendraMod.NextToken] = js.native
}
object ListFaqsResponse {
  
  @scala.inline
  def apply(): ListFaqsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFaqsResponse]
  }
  
  @scala.inline
  implicit class ListFaqsResponseMutableBuilder[Self <: ListFaqsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFaqSummaryItems(value: FaqSummaryItems): Self = StObject.set(x, "FaqSummaryItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaqSummaryItemsUndefined: Self = StObject.set(x, "FaqSummaryItems", js.undefined)
    
    @scala.inline
    def setFaqSummaryItemsVarargs(value: FaqSummary*): Self = StObject.set(x, "FaqSummaryItems", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
