package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyTransitGatewayVpcAttachmentRequest extends js.Object {
  /**
    * The IDs of one or more subnets to add. You can specify at most one subnet per Availability Zone.
    */
  var AddSubnetIds: js.UndefOr[TransitGatewaySubnetIdList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The new VPC attachment options.  You cannot modify the IPv6 options. 
    */
  var Options: js.UndefOr[ModifyTransitGatewayVpcAttachmentRequestOptions] = js.native
  /**
    * The IDs of one or more subnets to remove.
    */
  var RemoveSubnetIds: js.UndefOr[TransitGatewaySubnetIdList] = js.native
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: typingsSlinky.awsSdk.ec2Mod.TransitGatewayAttachmentId = js.native
}

object ModifyTransitGatewayVpcAttachmentRequest {
  @scala.inline
  def apply(TransitGatewayAttachmentId: TransitGatewayAttachmentId): ModifyTransitGatewayVpcAttachmentRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayAttachmentId = TransitGatewayAttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTransitGatewayVpcAttachmentRequest]
  }
  @scala.inline
  implicit class ModifyTransitGatewayVpcAttachmentRequestOps[Self <: ModifyTransitGatewayVpcAttachmentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayAttachmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddSubnetIds(value: TransitGatewaySubnetIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddSubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddSubnetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: ModifyTransitGatewayVpcAttachmentRequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveSubnetIds(value: TransitGatewaySubnetIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveSubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveSubnetIds")(js.undefined)
        ret
    }
  }
  
}

