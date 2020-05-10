package typingsSlinky.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSavingsPlanRatesResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The ID of the Savings Plan.
    */
  var savingsPlanId: js.UndefOr[SavingsPlanId] = js.native
  /**
    * Information about the Savings Plans rates.
    */
  var searchResults: js.UndefOr[SavingsPlanRateList] = js.native
}

object DescribeSavingsPlanRatesResponse {
  @scala.inline
  def apply(): DescribeSavingsPlanRatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSavingsPlanRatesResponse]
  }
  @scala.inline
  implicit class DescribeSavingsPlanRatesResponseOps[Self <: DescribeSavingsPlanRatesResponse] (val x: Self) extends AnyVal {
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
    def withSavingsPlanId(value: SavingsPlanId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingsPlanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingsPlanId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingsPlanId")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchResults(value: SavingsPlanRateList): Self = {
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

