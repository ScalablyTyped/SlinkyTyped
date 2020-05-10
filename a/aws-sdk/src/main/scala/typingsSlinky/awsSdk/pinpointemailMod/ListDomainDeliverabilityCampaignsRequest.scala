package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainDeliverabilityCampaignsRequest extends js.Object {
  /**
    * The last day, in Unix time format, that you want to obtain deliverability data for. This value has to be less than or equal to 30 days after the value of the StartDate parameter.
    */
  var EndDate: js.Date = js.native
  /**
    * A token that’s returned from a previous call to the ListDomainDeliverabilityCampaigns operation. This token indicates the position of a campaign in the list of campaigns.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.NextToken] = js.native
  /**
    * The maximum number of results to include in response to a single call to the ListDomainDeliverabilityCampaigns operation. If the number of results is larger than the number that you specify in this parameter, the response includes a NextToken element, which you can use to obtain additional results.
    */
  var PageSize: js.UndefOr[MaxItems] = js.native
  /**
    * The first day, in Unix time format, that you want to obtain deliverability data for.
    */
  var StartDate: js.Date = js.native
  /**
    * The domain to obtain deliverability data for.
    */
  var SubscribedDomain: Domain = js.native
}

object ListDomainDeliverabilityCampaignsRequest {
  @scala.inline
  def apply(EndDate: js.Date, StartDate: js.Date, SubscribedDomain: Domain): ListDomainDeliverabilityCampaignsRequest = {
    val __obj = js.Dynamic.literal(EndDate = EndDate.asInstanceOf[js.Any], StartDate = StartDate.asInstanceOf[js.Any], SubscribedDomain = SubscribedDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainDeliverabilityCampaignsRequest]
  }
  @scala.inline
  implicit class ListDomainDeliverabilityCampaignsRequestOps[Self <: ListDomainDeliverabilityCampaignsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscribedDomain(value: Domain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscribedDomain")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withPageSize(value: MaxItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSize")(js.undefined)
        ret
    }
  }
  
}

