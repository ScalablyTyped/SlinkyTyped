package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoteSummary extends js.Object {
  /**
    *  The unique identifier of the member that cast the vote. 
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.native
  /**
    *  The name of the member that cast the vote. 
    */
  var MemberName: js.UndefOr[NetworkMemberNameString] = js.native
  /**
    *  The vote value, either YES or NO. 
    */
  var Vote: js.UndefOr[VoteValue] = js.native
}

object VoteSummary {
  @scala.inline
  def apply(): VoteSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoteSummary]
  }
  @scala.inline
  implicit class VoteSummaryOps[Self <: VoteSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMemberId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberId")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberName(value: NetworkMemberNameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberName")(js.undefined)
        ret
    }
    @scala.inline
    def withVote(value: VoteValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vote")(js.undefined)
        ret
    }
  }
  
}

