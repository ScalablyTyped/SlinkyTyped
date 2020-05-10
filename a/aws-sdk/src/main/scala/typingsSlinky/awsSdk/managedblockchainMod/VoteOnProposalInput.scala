package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoteOnProposalInput extends js.Object {
  /**
    *  The unique identifier of the network. 
    */
  var NetworkId: ResourceIdString = js.native
  /**
    *  The unique identifier of the proposal. 
    */
  var ProposalId: ResourceIdString = js.native
  /**
    *  The value of the vote. 
    */
  var Vote: VoteValue = js.native
  /**
    * The unique identifier of the member casting the vote. 
    */
  var VoterMemberId: ResourceIdString = js.native
}

object VoteOnProposalInput {
  @scala.inline
  def apply(
    NetworkId: ResourceIdString,
    ProposalId: ResourceIdString,
    Vote: VoteValue,
    VoterMemberId: ResourceIdString
  ): VoteOnProposalInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any], ProposalId = ProposalId.asInstanceOf[js.Any], Vote = Vote.asInstanceOf[js.Any], VoterMemberId = VoterMemberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoteOnProposalInput]
  }
  @scala.inline
  implicit class VoteOnProposalInputOps[Self <: VoteOnProposalInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProposalId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProposalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVote(value: VoteValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoterMemberId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoterMemberId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

