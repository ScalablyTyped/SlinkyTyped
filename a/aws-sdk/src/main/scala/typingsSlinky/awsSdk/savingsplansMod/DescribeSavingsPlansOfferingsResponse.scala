package typingsSlinky.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSavingsPlansOfferingsResponse extends js.Object {
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
  implicit class DescribeSavingsPlansOfferingsResponseOps[Self <: DescribeSavingsPlansOfferingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchResults(value: SavingsPlanOfferingsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchResults")(js.undefined)
        ret
    }
  }
  
}

