package typingsSlinky.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyAttachmentsRequest extends js.Object {
  /**
    * Attachments to add.
    * A student submission may not have more than 20 attachments.
    *
    * Form attachments are not supported.
    */
  var addAttachments: js.UndefOr[js.Array[Attachment]] = js.native
}

object ModifyAttachmentsRequest {
  @scala.inline
  def apply(): ModifyAttachmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyAttachmentsRequest]
  }
  @scala.inline
  implicit class ModifyAttachmentsRequestOps[Self <: ModifyAttachmentsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAttachments(value: js.Array[Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAttachments")(js.undefined)
        ret
    }
  }
  
}

