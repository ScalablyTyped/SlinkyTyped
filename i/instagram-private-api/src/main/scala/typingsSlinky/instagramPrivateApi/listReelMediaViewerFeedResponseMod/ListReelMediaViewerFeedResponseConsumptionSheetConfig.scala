package typingsSlinky.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReelMediaViewerFeedResponseConsumptionSheetConfig extends js.Object {
  var can_viewer_donate: Boolean = js.native
  var currency: String = js.native
  var donation_amount_config: ListReelMediaViewerFeedResponseDonationAmountConfig = js.native
  var donation_disabled_message: Null = js.native
  var donation_url: String = js.native
  var has_viewer_donated: Boolean = js.native
  var privacy_disclaimer: String = js.native
  var you_donated_message: Null = js.native
}

object ListReelMediaViewerFeedResponseConsumptionSheetConfig {
  @scala.inline
  def apply(
    can_viewer_donate: Boolean,
    currency: String,
    donation_amount_config: ListReelMediaViewerFeedResponseDonationAmountConfig,
    donation_disabled_message: Null,
    donation_url: String,
    has_viewer_donated: Boolean,
    privacy_disclaimer: String,
    you_donated_message: Null
  ): ListReelMediaViewerFeedResponseConsumptionSheetConfig = {
    val __obj = js.Dynamic.literal(can_viewer_donate = can_viewer_donate.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], donation_amount_config = donation_amount_config.asInstanceOf[js.Any], donation_disabled_message = donation_disabled_message.asInstanceOf[js.Any], donation_url = donation_url.asInstanceOf[js.Any], has_viewer_donated = has_viewer_donated.asInstanceOf[js.Any], privacy_disclaimer = privacy_disclaimer.asInstanceOf[js.Any], you_donated_message = you_donated_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseConsumptionSheetConfig]
  }
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseConsumptionSheetConfigOps[Self <: ListReelMediaViewerFeedResponseConsumptionSheetConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCan_viewer_donate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_viewer_donate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDonation_amount_config(value: ListReelMediaViewerFeedResponseDonationAmountConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donation_amount_config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDonation_disabled_message(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donation_disabled_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDonation_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donation_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_viewer_donated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_viewer_donated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivacy_disclaimer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacy_disclaimer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYou_donated_message(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("you_donated_message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

