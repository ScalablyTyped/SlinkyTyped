package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApprovalThresholdPolicy extends js.Object {
  /**
    * The duration from the time that a proposal is created until it expires. If members cast neither the required number of YES votes to approve the proposal nor the number of NO votes required to reject it before the duration expires, the proposal is EXPIRED and ProposalActions are not carried out.
    */
  var ProposalDurationInHours: js.UndefOr[ProposalDurationInt] = js.native
  /**
    * Determines whether the vote percentage must be greater than the ThresholdPercentage or must be greater than or equal to the ThreholdPercentage to be approved.
    */
  var ThresholdComparator: js.UndefOr[typingsSlinky.awsSdk.managedblockchainMod.ThresholdComparator] = js.native
  /**
    * The percentage of votes among all members that must be YES for a proposal to be approved. For example, a ThresholdPercentage value of 50 indicates 50%. The ThresholdComparator determines the precise comparison. If a ThresholdPercentage value of 50 is specified on a network with 10 members, along with a ThresholdComparator value of GREATER_THAN, this indicates that 6 YES votes are required for the proposal to be approved.
    */
  var ThresholdPercentage: js.UndefOr[ThresholdPercentageInt] = js.native
}

object ApprovalThresholdPolicy {
  @scala.inline
  def apply(): ApprovalThresholdPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalThresholdPolicy]
  }
  @scala.inline
  implicit class ApprovalThresholdPolicyOps[Self <: ApprovalThresholdPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProposalDurationInHours(value: ProposalDurationInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProposalDurationInHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposalDurationInHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProposalDurationInHours")(js.undefined)
        ret
    }
    @scala.inline
    def withThresholdComparator(value: ThresholdComparator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThresholdComparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThresholdComparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThresholdComparator")(js.undefined)
        ret
    }
    @scala.inline
    def withThresholdPercentage(value: ThresholdPercentageInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThresholdPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThresholdPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThresholdPercentage")(js.undefined)
        ret
    }
  }
  
}

