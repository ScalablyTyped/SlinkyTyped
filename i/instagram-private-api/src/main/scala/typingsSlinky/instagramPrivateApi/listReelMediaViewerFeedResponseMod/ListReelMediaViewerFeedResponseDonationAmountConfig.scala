package typingsSlinky.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReelMediaViewerFeedResponseDonationAmountConfig extends js.Object {
  var default_selected_donation_value: Double = js.native
  var donation_amount_selector_values: js.Array[Double] = js.native
  var maximum_donation_amount: Double = js.native
  var minimum_donation_amount: Double = js.native
  var user_currency: String = js.native
}

object ListReelMediaViewerFeedResponseDonationAmountConfig {
  @scala.inline
  def apply(
    default_selected_donation_value: Double,
    donation_amount_selector_values: js.Array[Double],
    maximum_donation_amount: Double,
    minimum_donation_amount: Double,
    user_currency: String
  ): ListReelMediaViewerFeedResponseDonationAmountConfig = {
    val __obj = js.Dynamic.literal(default_selected_donation_value = default_selected_donation_value.asInstanceOf[js.Any], donation_amount_selector_values = donation_amount_selector_values.asInstanceOf[js.Any], maximum_donation_amount = maximum_donation_amount.asInstanceOf[js.Any], minimum_donation_amount = minimum_donation_amount.asInstanceOf[js.Any], user_currency = user_currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseDonationAmountConfig]
  }
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseDonationAmountConfigOps[Self <: ListReelMediaViewerFeedResponseDonationAmountConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault_selected_donation_value(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_selected_donation_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDonation_amount_selector_values(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("donation_amount_selector_values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximum_donation_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum_donation_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimum_donation_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum_donation_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_currency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_currency")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

