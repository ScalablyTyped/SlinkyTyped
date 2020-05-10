package typingsSlinky.evernote

import typingsSlinky.evernote.mod.Types.BusinessUserRole
import typingsSlinky.evernote.mod.Types.PremiumOrderStatus
import typingsSlinky.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAvailablePoints extends js.Object {
  var availablePoints: js.UndefOr[Double] = js.native
  var businessId: js.UndefOr[Double] = js.native
  var businessName: js.UndefOr[String] = js.native
  var businessRole: js.UndefOr[BusinessUserRole] = js.native
  var currency: js.UndefOr[String] = js.native
  var lastFailedCharge: js.UndefOr[Timestamp] = js.native
  var lastFailedChargeReason: js.UndefOr[String] = js.native
  var lastRequestedCharge: js.UndefOr[Timestamp] = js.native
  var lastSuccessfulCharge: js.UndefOr[Timestamp] = js.native
  var nextChargeDate: js.UndefOr[Timestamp] = js.native
  var nextPaymentDue: js.UndefOr[Timestamp] = js.native
  var premiumCommerceService: js.UndefOr[String] = js.native
  var premiumLockUntil: js.UndefOr[Timestamp] = js.native
  var premiumOrderNumber: js.UndefOr[String] = js.native
  var premiumServiceSKU: js.UndefOr[String] = js.native
  var premiumServiceStart: js.UndefOr[Timestamp] = js.native
  var premiumServiceStatus: js.UndefOr[PremiumOrderStatus] = js.native
  var premiumSubscriptionNumber: js.UndefOr[String] = js.native
  var unitDiscount: js.UndefOr[Double] = js.native
  var unitPrice: js.UndefOr[Double] = js.native
  var updated: js.UndefOr[Timestamp] = js.native
  var uploadLimitEnd: js.UndefOr[Timestamp] = js.native
  var uploadLimitNextMonth: js.UndefOr[Double] = js.native
}

object AnonAvailablePoints {
  @scala.inline
  def apply(): AnonAvailablePoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAvailablePoints]
  }
  @scala.inline
  implicit class AnonAvailablePointsOps[Self <: AnonAvailablePoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailablePoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availablePoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailablePoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availablePoints")(js.undefined)
        ret
    }
    @scala.inline
    def withBusinessId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessId")(js.undefined)
        ret
    }
    @scala.inline
    def withBusinessName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessName")(js.undefined)
        ret
    }
    @scala.inline
    def withBusinessRole(value: BusinessUserRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessRole")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withLastFailedCharge(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastFailedCharge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastFailedCharge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastFailedCharge")(js.undefined)
        ret
    }
    @scala.inline
    def withLastFailedChargeReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastFailedChargeReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastFailedChargeReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastFailedChargeReason")(js.undefined)
        ret
    }
    @scala.inline
    def withLastRequestedCharge(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRequestedCharge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastRequestedCharge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRequestedCharge")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSuccessfulCharge(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSuccessfulCharge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSuccessfulCharge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSuccessfulCharge")(js.undefined)
        ret
    }
    @scala.inline
    def withNextChargeDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextChargeDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextChargeDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextChargeDate")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPaymentDue(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPaymentDue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPaymentDue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPaymentDue")(js.undefined)
        ret
    }
    @scala.inline
    def withPremiumCommerceService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumCommerceService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremiumCommerceService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumCommerceService")(js.undefined)
        ret
    }
    @scala.inline
    def withPremiumLockUntil(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumLockUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremiumLockUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumLockUntil")(js.undefined)
        ret
    }
    @scala.inline
    def withPremiumOrderNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumOrderNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremiumOrderNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumOrderNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPremiumServiceSKU(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumServiceSKU")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremiumServiceSKU: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumServiceSKU")(js.undefined)
        ret
    }
    @scala.inline
    def withPremiumServiceStart(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumServiceStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremiumServiceStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumServiceStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPremiumServiceStatus(value: PremiumOrderStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumServiceStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremiumServiceStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumServiceStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withPremiumSubscriptionNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumSubscriptionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremiumSubscriptionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiumSubscriptionNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitDiscount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitDiscount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitDiscount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitDiscount")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitPrice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadLimitEnd(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadLimitEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadLimitEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadLimitEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadLimitNextMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadLimitNextMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadLimitNextMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadLimitNextMonth")(js.undefined)
        ret
    }
  }
  
}

