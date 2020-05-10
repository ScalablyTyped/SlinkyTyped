package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProposalActions extends js.Object {
  /**
    *  The actions to perform for an APPROVED proposal to invite an AWS account to create a member and join the network. 
    */
  var Invitations: js.UndefOr[InviteActionList] = js.native
  /**
    *  The actions to perform for an APPROVED proposal to remove a member from the network, which deletes the member and all associated member resources from the network. 
    */
  var Removals: js.UndefOr[RemoveActionList] = js.native
}

object ProposalActions {
  @scala.inline
  def apply(): ProposalActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProposalActions]
  }
  @scala.inline
  implicit class ProposalActionsOps[Self <: ProposalActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvitations(value: InviteActionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Invitations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Invitations")(js.undefined)
        ret
    }
    @scala.inline
    def withRemovals(value: RemoveActionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Removals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemovals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Removals")(js.undefined)
        ret
    }
  }
  
}

