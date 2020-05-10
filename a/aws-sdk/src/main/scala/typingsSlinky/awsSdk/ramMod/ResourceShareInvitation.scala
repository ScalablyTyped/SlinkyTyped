package typingsSlinky.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceShareInvitation extends js.Object {
  /**
    * The date and time when the invitation was sent.
    */
  var invitationTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The ID of the AWS account that received the invitation.
    */
  var receiverAccountId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.native
  /**
    * To view the resources associated with a pending resource share invitation, use  ListPendingInvitationResources.
    */
  var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the invitation.
    */
  var resourceShareInvitationArn: js.UndefOr[String] = js.native
  /**
    * The name of the resource share.
    */
  var resourceShareName: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that sent the invitation.
    */
  var senderAccountId: js.UndefOr[String] = js.native
  /**
    * The status of the invitation.
    */
  var status: js.UndefOr[ResourceShareInvitationStatus] = js.native
}

object ResourceShareInvitation {
  @scala.inline
  def apply(): ResourceShareInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceShareInvitation]
  }
  @scala.inline
  implicit class ResourceShareInvitationOps[Self <: ResourceShareInvitation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvitationTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withReceiverAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiverAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceiverAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiverAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceShareArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceShareArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareArn")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceShareAssociations(value: ResourceShareAssociationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareAssociations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceShareAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareAssociations")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceShareInvitationArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareInvitationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceShareInvitationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareInvitationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceShareName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceShareName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareName")(js.undefined)
        ret
    }
    @scala.inline
    def withSenderAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSenderAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ResourceShareInvitationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

