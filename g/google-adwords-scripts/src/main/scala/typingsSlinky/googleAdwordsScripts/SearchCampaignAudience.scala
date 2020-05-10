package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchCampaignAudience extends SearchCampaignExcludedAudience {
  def bidding(): SearchAudienceBidding = js.native
  def isEnabled(): Boolean = js.native
  def isPaused(): Boolean = js.native
}

object SearchCampaignAudience {
  @scala.inline
  def apply(
    bidding: () => SearchAudienceBidding,
    getAudienceId: () => Double,
    getCampaign: () => Campaign,
    getId: () => Double,
    getName: () => String,
    isEnabled: () => Boolean,
    isPaused: () => Boolean,
    remove: () => Unit
  ): SearchCampaignAudience = {
    val __obj = js.Dynamic.literal(bidding = js.Any.fromFunction0(bidding), getAudienceId = js.Any.fromFunction0(getAudienceId), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), isEnabled = js.Any.fromFunction0(isEnabled), isPaused = js.Any.fromFunction0(isPaused), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[SearchCampaignAudience]
  }
  @scala.inline
  implicit class SearchCampaignAudienceOps[Self <: SearchCampaignAudience] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBidding(value: () => SearchAudienceBidding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidding")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPaused(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaused")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

