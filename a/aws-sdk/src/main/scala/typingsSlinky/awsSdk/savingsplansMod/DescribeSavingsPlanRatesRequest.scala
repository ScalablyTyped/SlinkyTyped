package typingsSlinky.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSavingsPlanRatesRequest extends js.Object {
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
  implicit class DescribeSavingsPlanRatesRequestOps[Self <: DescribeSavingsPlanRatesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSavingsPlanId(value: SavingsPlanId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingsPlanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: SavingsPlanRateFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
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
  }
  
}

