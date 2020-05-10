package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invitation extends js.Object {
  /**
    * The date and time that the invitation was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * The date and time that the invitation expires. This is the CreationDate plus the ProposalDurationInHours that is specified in the ProposalThresholdPolicy. After this date and time, the invitee can no longer create a member and join the network using this InvitationId.
    */
  var ExpirationDate: js.UndefOr[js.Date] = js.native
  /**
    * The unique identifier for the invitation.
    */
  var InvitationId: js.UndefOr[ResourceIdString] = js.native
  var NetworkSummary: js.UndefOr[typingsSlinky.awsSdk.managedblockchainMod.NetworkSummary] = js.native
  /**
    * The status of the invitation:    PENDING - The invitee has not created a member to join the network, and the invitation has not yet expired.    ACCEPTING - The invitee has begun creating a member, and creation has not yet completed.    ACCEPTED - The invitee created a member and joined the network using the InvitationID.    REJECTED - The invitee rejected the invitation.    EXPIRED - The invitee neither created a member nor rejected the invitation before the ExpirationDate.  
    */
  var Status: js.UndefOr[InvitationStatus] = js.native
}

object Invitation {
  @scala.inline
  def apply(): Invitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invitation]
  }
  @scala.inline
  implicit class InvitationOps[Self <: Invitation] (val x: Self) extends AnyVal {
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
    def withInvitationId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvitationId")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkSummary(value: NetworkSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: InvitationStatus): Self = {
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

