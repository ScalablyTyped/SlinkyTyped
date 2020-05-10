package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvoiceSummary extends js.Object {
  var additionalChargeSummaries: js.UndefOr[js.Array[InvoiceSummaryAdditionalChargeSummary]] = js.native
  var customerBalance: js.UndefOr[Amount] = js.native
  var googleBalance: js.UndefOr[Amount] = js.native
  var merchantBalance: js.UndefOr[Amount] = js.native
  var productTotal: js.UndefOr[Amount] = js.native
  var promotionSummaries: js.UndefOr[js.Array[Promotion]] = js.native
}

object InvoiceSummary {
  @scala.inline
  def apply(): InvoiceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvoiceSummary]
  }
  @scala.inline
  implicit class InvoiceSummaryOps[Self <: InvoiceSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalChargeSummaries(value: js.Array[InvoiceSummaryAdditionalChargeSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalChargeSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalChargeSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalChargeSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerBalance(value: Amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerBalance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerBalance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerBalance")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleBalance(value: Amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleBalance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleBalance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleBalance")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchantBalance(value: Amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantBalance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantBalance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantBalance")(js.undefined)
        ret
    }
    @scala.inline
    def withProductTotal(value: Amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withPromotionSummaries(value: js.Array[Promotion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotionSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotionSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotionSummaries")(js.undefined)
        ret
    }
  }
  
}

