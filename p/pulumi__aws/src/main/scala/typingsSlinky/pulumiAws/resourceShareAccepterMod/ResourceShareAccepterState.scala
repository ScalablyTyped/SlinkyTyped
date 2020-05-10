package typingsSlinky.pulumiAws.resourceShareAccepterMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceShareAccepterState extends js.Object {
  /**
    * The ARN of the resource share invitation.
    */
  val invitationArn: js.UndefOr[Input[String]] = js.native
  /**
    * The account ID of the receiver account which accepts the invitation.
    */
  val receiverAccountId: js.UndefOr[Input[String]] = js.native
  /**
    * A list of the resource ARNs shared via the resource share.
    */
  val resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The account ID of the sender account which submits the invitation.
    */
  val senderAccountId: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the resource share.
    */
  val shareArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the resource share as displayed in the console.
    */
  val shareId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the resource share.
    */
  val shareName: js.UndefOr[Input[String]] = js.native
  /**
    * The status of the resource share (ACTIVE, PENDING, FAILED, DELETING, DELETED).
    */
  val status: js.UndefOr[Input[String]] = js.native
}

object ResourceShareAccepterState {
  @scala.inline
  def apply(): ResourceShareAccepterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceShareAccepterState]
  }
  @scala.inline
  implicit class ResourceShareAccepterStateOps[Self <: ResourceShareAccepterState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvitationArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withReceiverAccountId(value: Input[String]): Self = {
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
    def withResources(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withSenderAccountId(value: Input[String]): Self = {
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
    def withShareArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareArn")(js.undefined)
        ret
    }
    @scala.inline
    def withShareId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareId")(js.undefined)
        ret
    }
    @scala.inline
    def withShareName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Input[String]): Self = {
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

