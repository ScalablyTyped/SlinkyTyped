package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EgressOnlyInternetGateway extends js.Object {
  /**
    * Information about the attachment of the egress-only internet gateway.
    */
  var Attachments: js.UndefOr[InternetGatewayAttachmentList] = js.native
  /**
    * The ID of the egress-only internet gateway.
    */
  var EgressOnlyInternetGatewayId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.EgressOnlyInternetGatewayId] = js.native
  /**
    * The tags assigned to the egress-only internet gateway.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object EgressOnlyInternetGateway {
  @scala.inline
  def apply(): EgressOnlyInternetGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EgressOnlyInternetGateway]
  }
  @scala.inline
  implicit class EgressOnlyInternetGatewayOps[Self <: EgressOnlyInternetGateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachments(value: InternetGatewayAttachmentList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withEgressOnlyInternetGatewayId(value: EgressOnlyInternetGatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EgressOnlyInternetGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEgressOnlyInternetGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EgressOnlyInternetGatewayId")(js.undefined)
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
  }
  
}

