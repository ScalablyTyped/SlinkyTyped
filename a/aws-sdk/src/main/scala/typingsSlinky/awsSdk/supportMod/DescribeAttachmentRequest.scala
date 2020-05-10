package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAttachmentRequest extends js.Object {
  /**
    * The ID of the attachment to return. Attachment IDs are returned by the DescribeCommunications operation.
    */
  var attachmentId: AttachmentId = js.native
}

object DescribeAttachmentRequest {
  @scala.inline
  def apply(attachmentId: AttachmentId): DescribeAttachmentRequest = {
    val __obj = js.Dynamic.literal(attachmentId = attachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAttachmentRequest]
  }
  @scala.inline
  implicit class DescribeAttachmentRequestOps[Self <: DescribeAttachmentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentId(value: AttachmentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

