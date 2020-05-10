package typingsSlinky.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlan extends js.Object {
  /**
    * The hourly commitment, in USD.
    */
  var commitment: js.UndefOr[Amount] = js.native
  /**
    * The currency.
    */
  var currency: js.UndefOr[CurrencyCode] = js.native
  /**
    * The description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The EC2 instance family.
    */
  var ec2InstanceFamily: js.UndefOr[EC2InstanceFamily] = js.native
  /**
    * The end time.
    */
  var end: js.UndefOr[String] = js.native
  /**
    * The ID of the offering.
    */
  var offeringId: js.UndefOr[SavingsPlanOfferingId] = js.native
  /**
    * The payment option.
    */
  var paymentOption: js.UndefOr[SavingsPlanPaymentOption] = js.native
  /**
    * The product types.
    */
  var productTypes: js.UndefOr[SavingsPlanProductTypeList] = js.native
  /**
    * The recurring payment amount.
    */
  var recurringPaymentAmount: js.UndefOr[Amount] = js.native
  /**
    * The AWS Region.
    */
  var region: js.UndefOr[Region] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Savings Plan.
    */
  var savingsPlanArn: js.UndefOr[SavingsPlanArn] = js.native
  /**
    * The ID of the Savings Plan.
    */
  var savingsPlanId: js.UndefOr[SavingsPlanId] = js.native
  /**
    * The plan type.
    */
  var savingsPlanType: js.UndefOr[SavingsPlanType] = js.native
  /**
    * The start time.
    */
  var start: js.UndefOr[String] = js.native
  /**
    * The state.
    */
  var state: js.UndefOr[SavingsPlanState] = js.native
  /**
    * One or more tags.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The duration of the term, in seconds.
    */
  var termDurationInSeconds: js.UndefOr[TermDurationInSeconds] = js.native
  /**
    * The up-front payment amount.
    */
  var upfrontPaymentAmount: js.UndefOr[Amount] = js.native
}

object SavingsPlan {
  @scala.inline
  def apply(): SavingsPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlan]
  }
  @scala.inline
  implicit class SavingsPlanOps[Self <: SavingsPlan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitment(value: Amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitment")(js.undefined)
        ret
    }
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEc2InstanceFamily(value: EC2InstanceFamily): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2InstanceFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2InstanceFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2InstanceFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferingId(value: SavingsPlanOfferingId): Self = {
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
    def withProductTypes(value: SavingsPlanProductTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurringPaymentAmount(value: Amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurringPaymentAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurringPaymentAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurringPaymentAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withSavingsPlanArn(value: SavingsPlanArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingsPlanArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingsPlanArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingsPlanArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSavingsPlanId(value: SavingsPlanId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingsPlanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingsPlanId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingsPlanId")(js.undefined)
        ret
    }
    @scala.inline
    def withSavingsPlanType(value: SavingsPlanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingsPlanType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingsPlanType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savingsPlanType")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: SavingsPlanState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTermDurationInSeconds(value: TermDurationInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termDurationInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTermDurationInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termDurationInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withUpfrontPaymentAmount(value: Amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upfrontPaymentAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpfrontPaymentAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upfrontPaymentAmount")(js.undefined)
        ret
    }
  }
  
}

