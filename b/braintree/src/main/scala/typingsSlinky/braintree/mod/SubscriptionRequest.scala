package typingsSlinky.braintree.mod

import typingsSlinky.braintree.AnonAdd
import typingsSlinky.braintree.AnonDoNotInheritAddOnsOrDiscounts
import typingsSlinky.braintree.AnonRemove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionRequest extends js.Object {
  var addOns: js.UndefOr[AnonAdd] = js.native
  var billingDayOfMonth: js.UndefOr[Double] = js.native
  var descriptor: js.UndefOr[Descriptor] = js.native
  var discounts: js.UndefOr[AnonRemove] = js.native
  var firstBillingDate: js.UndefOr[js.Date] = js.native
  var id: js.UndefOr[String] = js.native
  var merchantAccountId: js.UndefOr[String] = js.native
  var neverExpires: js.UndefOr[Boolean] = js.native
  var numberOfBillingCycles: js.UndefOr[Double] = js.native
  var options: js.UndefOr[AnonDoNotInheritAddOnsOrDiscounts] = js.native
  var paymentMethodNonce: js.UndefOr[String] = js.native
  var paymentMethodToken: String = js.native
  var planId: String = js.native
  var price: js.UndefOr[String] = js.native
  var trialDuration: js.UndefOr[Double] = js.native
  var trialDurationUnit: js.UndefOr[String] = js.native
  var trialPeriod: js.UndefOr[Boolean] = js.native
}

object SubscriptionRequest {
  @scala.inline
  def apply(paymentMethodToken: String, planId: String): SubscriptionRequest = {
    val __obj = js.Dynamic.literal(paymentMethodToken = paymentMethodToken.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionRequest]
  }
  @scala.inline
  implicit class SubscriptionRequestOps[Self <: SubscriptionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaymentMethodToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOns(value: AnonAdd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddOns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOns")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingDayOfMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingDayOfMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingDayOfMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingDayOfMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptor(value: Descriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptor")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscounts(value: AnonRemove): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discounts")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstBillingDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstBillingDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstBillingDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstBillingDate")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchantAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withNeverExpires(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neverExpires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeverExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neverExpires")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfBillingCycles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfBillingCycles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfBillingCycles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfBillingCycles")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: AnonDoNotInheritAddOnsOrDiscounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentMethodNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodNonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentMethodNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodNonce")(js.undefined)
        ret
    }
    @scala.inline
    def withPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(js.undefined)
        ret
    }
    @scala.inline
    def withTrialDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTrialDurationUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialDurationUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialDurationUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialDurationUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withTrialPeriod(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialPeriod")(js.undefined)
        ret
    }
  }
  
}

