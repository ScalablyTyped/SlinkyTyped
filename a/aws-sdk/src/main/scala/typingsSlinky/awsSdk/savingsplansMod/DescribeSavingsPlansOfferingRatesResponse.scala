package typingsSlinky.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSavingsPlansOfferingRatesResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Information about the Savings Plans offering rates.
    */
  var searchResults: js.UndefOr[SavingsPlanOfferingRatesList] = js.native
}

object DescribeSavingsPlansOfferingRatesResponse {
  @scala.inline
  def apply(): DescribeSavingsPlansOfferingRatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSavingsPlansOfferingRatesResponse]
  }
  @scala.inline
  implicit class DescribeSavingsPlansOfferingRatesResponseOps[Self <: DescribeSavingsPlansOfferingRatesResponse] (val x: Self) extends AnyVal {
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
    def withSearchResults(value: SavingsPlanOfferingRatesList): Self = {
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

