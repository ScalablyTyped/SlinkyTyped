package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansAmortizedCommitment extends js.Object {
  /**
    * The amortized amount of your Savings Plans commitment that was purchased with either a Partial or a NoUpfront.
    */
  var AmortizedRecurringCommitment: js.UndefOr[GenericString] = js.native
  /**
    * The amortized amount of your Savings Plans commitment that was purchased with an Upfront or PartialUpfront Savings Plans.
    */
  var AmortizedUpfrontCommitment: js.UndefOr[GenericString] = js.native
  /**
    * The total amortized amount of your Savings Plans commitment, regardless of your Savings Plans purchase method. 
    */
  var TotalAmortizedCommitment: js.UndefOr[GenericString] = js.native
}

object SavingsPlansAmortizedCommitment {
  @scala.inline
  def apply(): SavingsPlansAmortizedCommitment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansAmortizedCommitment]
  }
  @scala.inline
  implicit class SavingsPlansAmortizedCommitmentOps[Self <: SavingsPlansAmortizedCommitment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmortizedRecurringCommitment(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmortizedRecurringCommitment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmortizedRecurringCommitment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmortizedRecurringCommitment")(js.undefined)
        ret
    }
    @scala.inline
    def withAmortizedUpfrontCommitment(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmortizedUpfrontCommitment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmortizedUpfrontCommitment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmortizedUpfrontCommitment")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalAmortizedCommitment(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalAmortizedCommitment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalAmortizedCommitment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalAmortizedCommitment")(js.undefined)
        ret
    }
  }
  
}

