package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddAttachmentsToSetResponse extends js.Object {
  /**
    * The ID of the attachment set. If an attachmentSetId was not specified, a new attachment set is created, and the ID of the set is returned in the response. If an attachmentSetId was specified, the attachments are added to the specified set, if it exists.
    */
  var attachmentSetId: js.UndefOr[AttachmentSetId] = js.native
  /**
    * The time and date when the attachment set expires.
    */
  var expiryTime: js.UndefOr[ExpiryTime] = js.native
}

object AddAttachmentsToSetResponse {
  @scala.inline
  def apply(): AddAttachmentsToSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddAttachmentsToSetResponse]
  }
  @scala.inline
  implicit class AddAttachmentsToSetResponseOps[Self <: AddAttachmentsToSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withExpiryTime(value: ExpiryTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiryTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryTime")(js.undefined)
        ret
    }
  }
  
}

