package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFaqsResponse extends js.Object {
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
  implicit class ListFaqsResponseOps[Self <: ListFaqsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFaqSummaryItems(value: FaqSummaryItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaqSummaryItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaqSummaryItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaqSummaryItems")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

