package typingsSlinky.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentSavingsPlanOffering extends js.Object {
  /**
    * The currency.
    */
  var currency: js.UndefOr[CurrencyCode] = js.native
  /**
    * The duration, in seconds.
    */
  var durationSeconds: js.UndefOr[SavingsPlansDuration] = js.native
  /**
    * The ID of the offering.
    */
  var offeringId: js.UndefOr[UUID] = js.native
  /**
    * The payment option.
    */
  var paymentOption: js.UndefOr[SavingsPlanPaymentOption] = js.native
  /**
    * The description.
    */
  var planDescription: js.UndefOr[SavingsPlanDescription] = js.native
  /**
    * The plan type.
    */
  var planType: js.UndefOr[SavingsPlanType] = js.native
}

object ParentSavingsPlanOffering {
  @scala.inline
  def apply(): ParentSavingsPlanOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentSavingsPlanOffering]
  }
  @scala.inline
  implicit class ParentSavingsPlanOfferingOps[Self <: ParentSavingsPlanOffering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: CurrencyCode): Self = {
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
    def withDurationSeconds(value: SavingsPlansDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferingId(value: UUID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringId")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentOption(value: SavingsPlanPaymentOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentOption")(js.undefined)
        ret
    }
    @scala.inline
    def withPlanDescription(value: SavingsPlanDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlanDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withPlanType(value: SavingsPlanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlanType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planType")(js.undefined)
        ret
    }
  }
  
}

