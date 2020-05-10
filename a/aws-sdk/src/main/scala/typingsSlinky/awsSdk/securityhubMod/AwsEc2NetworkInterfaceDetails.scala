package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2NetworkInterfaceDetails extends js.Object {
  /**
    * The network interface attachment.
    */
  var Attachment: js.UndefOr[AwsEc2NetworkInterfaceAttachment] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[NonEmptyString] = js.native
  /**
    * Security groups for the network interface.
    */
  var SecurityGroups: js.UndefOr[AwsEc2NetworkInterfaceSecurityGroupList] = js.native
  /**
    * Indicates whether traffic to or from the instance is validated.
    */
  var SourceDestCheck: js.UndefOr[Boolean] = js.native
}

object AwsEc2NetworkInterfaceDetails {
  @scala.inline
  def apply(): AwsEc2NetworkInterfaceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2NetworkInterfaceDetails]
  }
  @scala.inline
  implicit class AwsEc2NetworkInterfaceDetailsOps[Self <: AwsEc2NetworkInterfaceDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachment(value: AwsEc2NetworkInterfaceAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attachment")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaceId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroups(value: AwsEc2NetworkInterfaceSecurityGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceDestCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceDestCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceDestCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceDestCheck")(js.undefined)
        ret
    }
  }
  
}

