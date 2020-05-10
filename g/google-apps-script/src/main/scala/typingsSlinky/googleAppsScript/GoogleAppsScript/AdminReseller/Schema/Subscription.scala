package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription extends js.Object {
  var billingMethod: js.UndefOr[String] = js.native
  var creationTime: js.UndefOr[String] = js.native
  var customerDomain: js.UndefOr[String] = js.native
  var customerId: js.UndefOr[String] = js.native
  var dealCode: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var plan: js.UndefOr[SubscriptionPlan] = js.native
  var purchaseOrderId: js.UndefOr[String] = js.native
  var renewalSettings: js.UndefOr[RenewalSettings] = js.native
  var resourceUiUrl: js.UndefOr[String] = js.native
  var seats: js.UndefOr[Seats] = js.native
  var skuId: js.UndefOr[String] = js.native
  var skuName: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var subscriptionId: js.UndefOr[String] = js.native
  var suspensionReasons: js.UndefOr[js.Array[String]] = js.native
  var transferInfo: js.UndefOr[SubscriptionTransferInfo] = js.native
  var trialSettings: js.UndefOr[SubscriptionTrialSettings] = js.native
}

object Subscription {
  @scala.inline
  def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(js.undefined)
        ret
    }
    @scala.inline
    def withDealCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDealCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealCode")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPlan(value: SubscriptionPlan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(js.undefined)
        ret
    }
    @scala.inline
    def withPurchaseOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseOrderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchaseOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchaseOrderId")(js.undefined)
        ret
    }
    @scala.inline
    def withRenewalSettings(value: RenewalSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renewalSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenewalSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renewalSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceUiUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUiUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceUiUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUiUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSeats(value: Seats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seats")(js.undefined)
        ret
    }
    @scala.inline
    def withSkuId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkuId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuId")(js.undefined)
        ret
    }
    @scala.inline
    def withSkuName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkuName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionId")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspensionReasons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionReasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspensionReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionReasons")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferInfo(value: SubscriptionTransferInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withTrialSettings(value: SubscriptionTrialSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialSettings")(js.undefined)
        ret
    }
  }
  
}

