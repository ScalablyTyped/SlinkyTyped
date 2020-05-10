package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkInterfaceAttachment extends js.Object {
  var attachmentId: String = js.native
  var deviceIndex: Double = js.native
  var instanceId: String = js.native
  var instanceOwnerId: String = js.native
}

object GetNetworkInterfaceAttachment {
  @scala.inline
  def apply(attachmentId: String, deviceIndex: Double, instanceId: String, instanceOwnerId: String): GetNetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal(attachmentId = attachmentId.asInstanceOf[js.Any], deviceIndex = deviceIndex.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], instanceOwnerId = instanceOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkInterfaceAttachment]
  }
  @scala.inline
  implicit class GetNetworkInterfaceAttachmentOps[Self <: GetNetworkInterfaceAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

