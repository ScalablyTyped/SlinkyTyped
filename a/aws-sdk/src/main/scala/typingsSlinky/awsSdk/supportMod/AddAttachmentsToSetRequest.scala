package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddAttachmentsToSetRequest extends js.Object {
  /**
    * The ID of the attachment set. If an attachmentSetId is not specified, a new attachment set is created, and the ID of the set is returned in the response. If an attachmentSetId is specified, the attachments are added to the specified set, if it exists.
    */
  var attachmentSetId: js.UndefOr[AttachmentSetId] = js.native
  /**
    * One or more attachments to add to the set. The limit is 3 attachments per set, and the size limit is 5 MB per attachment.
    */
  var attachments: Attachments = js.native
}

object AddAttachmentsToSetRequest {
  @scala.inline
  def apply(attachments: Attachments): AddAttachmentsToSetRequest = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAttachmentsToSetRequest]
  }
  @scala.inline
  implicit class AddAttachmentsToSetRequestOps[Self <: AddAttachmentsToSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachments(value: Attachments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachmentSetId(value: AttachmentSetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentSetId")(js.undefined)
        ret
    }
  }
  
}

