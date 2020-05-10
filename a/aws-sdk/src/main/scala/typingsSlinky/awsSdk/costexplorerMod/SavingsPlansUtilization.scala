package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansUtilization extends js.Object {
  /**
    * The total amount of Savings Plans commitment that's been purchased in an account (or set of accounts).
    */
  var TotalCommitment: js.UndefOr[GenericString] = js.native
  /**
    * The amount of your Savings Plans commitment that was not consumed from Savings Plans eligible usage in a specific period.
    */
  var UnusedCommitment: js.UndefOr[GenericString] = js.native
  /**
    * The amount of your Savings Plans commitment that was consumed from Savings Plans eligible usage in a specific period.
    */
  var UsedCommitment: js.UndefOr[GenericString] = js.native
  /**
    * The amount of UsedCommitment divided by the TotalCommitment for your Savings Plans.
    */
  var UtilizationPercentage: js.UndefOr[GenericString] = js.native
}

object SavingsPlansUtilization {
  @scala.inline
  def apply(): SavingsPlansUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansUtilization]
  }
  @scala.inline
  implicit class SavingsPlansUtilizationOps[Self <: SavingsPlansUtilization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTotalCommitment(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCommitment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalCommitment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCommitment")(js.undefined)
        ret
    }
    @scala.inline
    def withUnusedCommitment(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnusedCommitment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnusedCommitment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnusedCommitment")(js.undefined)
        ret
    }
    @scala.inline
    def withUsedCommitment(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsedCommitment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsedCommitment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsedCommitment")(js.undefined)
        ret
    }
    @scala.inline
    def withUtilizationPercentage(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UtilizationPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtilizationPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UtilizationPercentage")(js.undefined)
        ret
    }
  }
  
}

