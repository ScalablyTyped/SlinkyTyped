package typingsSlinky.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem extends js.Object {
  var amount_raised: String = js.native
  var charity: ListReelMediaViewerFeedResponseCharity = js.native
  var donations: ListReelMediaViewerFeedResponseDonations = js.native
  var fundraiser_id: String = js.native
}

object ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem {
  @scala.inline
  def apply(
    amount_raised: String,
    charity: ListReelMediaViewerFeedResponseCharity,
    donations: ListReelMediaViewerFeedResponseDonations,
    fundraiser_id: String
  ): ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem = {
    val __obj = js.Dynamic.literal(amount_raised = amount_raised.asInstanceOf[js.Any], charity = charity.asInstanceOf[js.Any], donations = donations.asInstanceOf[js.Any], fundraiser_id = fundraiser_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem]
  }
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItemOps[Self <: ListReelMediaViewerFeedResponseStoryFundraiserDonationInfosItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount_raised(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_raised")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharity(value: ListReelMediaViewerFeedResponseCharity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDonations(value: ListReelMediaViewerFeedResponseDonations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFundraiser_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fundraiser_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

