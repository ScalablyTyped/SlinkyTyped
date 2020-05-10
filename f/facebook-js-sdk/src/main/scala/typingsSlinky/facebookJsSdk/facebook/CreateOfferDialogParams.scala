package typingsSlinky.facebookJsSdk.facebook

import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.APP_INSTALLS
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.CONVERSIONS
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.LINK_CLICKS
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.OFFER_CLAIMS
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.PRODUCT_CATALOG_SALES
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.STORE_VISITS
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.create_offer
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOfferDialogParams extends DialogParams {
  var account_id: String = js.native
  @JSName("display")
  var display_CreateOfferDialogParams: popup = js.native
  var method: create_offer = js.native
  var objective: APP_INSTALLS | CONVERSIONS | LINK_CLICKS | OFFER_CLAIMS | PRODUCT_CATALOG_SALES | STORE_VISITS = js.native
  var page_id: String = js.native
}

object CreateOfferDialogParams {
  @scala.inline
  def apply(
    account_id: String,
    display: popup,
    method: create_offer,
    objective: APP_INSTALLS | CONVERSIONS | LINK_CLICKS | OFFER_CLAIMS | PRODUCT_CATALOG_SALES | STORE_VISITS,
    page_id: String
  ): CreateOfferDialogParams = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], objective = objective.asInstanceOf[js.Any], page_id = page_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOfferDialogParams]
  }
  @scala.inline
  implicit class CreateOfferDialogParamsOps[Self <: CreateOfferDialogParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay(value: popup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: create_offer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjective(
      value: APP_INSTALLS | CONVERSIONS | LINK_CLICKS | OFFER_CLAIMS | PRODUCT_CATALOG_SALES | STORE_VISITS
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

