package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfaceAttachment extends js.Object {
  /**
    * The timestamp indicating when the attachment initiated.
    */
  var AttachTime: js.UndefOr[js.Date] = js.native
  /**
    * The ID of the network interface attachment.
    */
  var AttachmentId: js.UndefOr[String] = js.native
  /**
    * Indicates whether the network interface is deleted when the instance is terminated.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * The device index of the network interface attachment on the instance.
    */
  var DeviceIndex: js.UndefOr[Integer] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The AWS account ID of the owner of the instance.
    */
  var InstanceOwnerId: js.UndefOr[String] = js.native
  /**
    * The attachment state.
    */
  var Status: js.UndefOr[AttachmentStatus] = js.native
}

object NetworkInterfaceAttachment {
  @scala.inline
  def apply(): NetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfaceAttachment]
  }
  @scala.inline
  implicit class NetworkInterfaceAttachmentOps[Self <: NetworkInterfaceAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteOnTermination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteOnTermination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteOnTermination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteOnTermination")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceIndex(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceOwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: AttachmentStatus): Self = {
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

