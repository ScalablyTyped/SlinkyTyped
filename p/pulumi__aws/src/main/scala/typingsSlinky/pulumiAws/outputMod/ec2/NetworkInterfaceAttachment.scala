package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfaceAttachment extends js.Object {
  var attachmentId: String = js.native
  var deviceIndex: Double = js.native
  var instance: String = js.native
}

object NetworkInterfaceAttachment {
  @scala.inline
  def apply(attachmentId: String, deviceIndex: Double, instance: String): NetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal(attachmentId = attachmentId.asInstanceOf[js.Any], deviceIndex = deviceIndex.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceAttachment]
  }
  @scala.inline
  implicit class NetworkInterfaceAttachmentOps[Self <: NetworkInterfaceAttachment] (val x: Self) extends AnyVal {
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
    def withInstance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

