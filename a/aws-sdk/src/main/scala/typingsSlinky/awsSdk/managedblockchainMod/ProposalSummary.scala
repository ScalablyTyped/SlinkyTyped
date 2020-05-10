package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProposalSummary extends js.Object {
  /**
    *  The date and time that the proposal was created. 
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    *  The description of the proposal. 
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    *  The date and time that the proposal expires. This is the CreationDate plus the ProposalDurationInHours that is specified in the ProposalThresholdPolicy. After this date and time, if members have not cast enough votes to determine the outcome according to the voting policy, the proposal is EXPIRED and Actions are not carried out. 
    */
  var ExpirationDate: js.UndefOr[js.Date] = js.native
  /**
    *  The unique identifier of the proposal. 
    */
  var ProposalId: js.UndefOr[ResourceIdString] = js.native
  /**
    *  The unique identifier of the member that created the proposal. 
    */
  var ProposedByMemberId: js.UndefOr[ResourceIdString] = js.native
  /**
    *  The name of the member that created the proposal. 
    */
  var ProposedByMemberName: js.UndefOr[NetworkMemberNameString] = js.native
  /**
    * The status of the proposal. Values are as follows:    IN_PROGRESS - The proposal is active and open for member voting.    APPROVED - The proposal was approved with sufficient YES votes among members according to the VotingPolicy specified for the Network. The specified proposal actions are carried out.    REJECTED - The proposal was rejected with insufficient YES votes among members according to the VotingPolicy specified for the Network. The specified ProposalActions are not carried out.    EXPIRED - Members did not cast the number of votes required to determine the proposal outcome before the proposal expired. The specified ProposalActions are not carried out.    ACTION_FAILED - One or more of the specified ProposalActions in a proposal that was approved could not be completed because of an error.  
    */
  var Status: js.UndefOr[ProposalStatus] = js.native
}

object ProposalSummary {
  @scala.inline
  def apply(): ProposalSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProposalSummary]
  }
  @scala.inline
  implicit class ProposalSummaryOps[Self <: ProposalSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: DescriptionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withProposalId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProposalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProposalId")(js.undefined)
        ret
    }
    @scala.inline
    def withProposedByMemberId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProposedByMemberId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposedByMemberId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProposedByMemberId")(js.undefined)
        ret
    }
    @scala.inline
    def withProposedByMemberName(value: NetworkMemberNameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProposedByMemberName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposedByMemberName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProposedByMemberName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ProposalStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

