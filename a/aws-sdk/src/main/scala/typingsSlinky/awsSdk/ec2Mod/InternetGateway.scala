package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternetGateway extends js.Object {
  /**
    * Any VPCs attached to the internet gateway.
    */
  var Attachments: js.UndefOr[InternetGatewayAttachmentList] = js.native
  /**
    * The ID of the internet gateway.
    */
  var InternetGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that owns the internet gateway.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the internet gateway.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object InternetGateway {
  @scala.inline
  def apply(): InternetGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternetGateway]
  }
  @scala.inline
  implicit class InternetGatewayOps[Self <: InternetGateway] (val x: Self) extends AnyVal {
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
    def withInternetGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InternetGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternetGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InternetGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
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

