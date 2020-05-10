package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayPeeringAttachment extends js.Object {
  /**
    * Information about the accepter transit gateway.
    */
  var AccepterTgwInfo: js.UndefOr[PeeringTgwInfo] = js.native
  /**
    * The time the transit gateway peering attachment was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * Information about the requester transit gateway.
    */
  var RequesterTgwInfo: js.UndefOr[PeeringTgwInfo] = js.native
  /**
    * The state of the transit gateway peering attachment.
    */
  var State: js.UndefOr[TransitGatewayAttachmentState] = js.native
  /**
    * The status of the transit gateway peering attachment.
    */
  var Status: js.UndefOr[PeeringAttachmentStatus] = js.native
  /**
    * The tags for the transit gateway peering attachment.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the transit gateway peering attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[String] = js.native
}

object TransitGatewayPeeringAttachment {
  @scala.inline
  def apply(): TransitGatewayPeeringAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayPeeringAttachment]
  }
  @scala.inline
  implicit class TransitGatewayPeeringAttachmentOps[Self <: TransitGatewayPeeringAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccepterTgwInfo(value: PeeringTgwInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccepterTgwInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccepterTgwInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccepterTgwInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRequesterTgwInfo(value: PeeringTgwInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterTgwInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterTgwInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterTgwInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: TransitGatewayAttachmentState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: PeeringAttachmentStatus): Self = {
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
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitGatewayAttachmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayAttachmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayAttachmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayAttachmentId")(js.undefined)
        ret
    }
  }
  
}

