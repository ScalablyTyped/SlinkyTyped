package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatRenderAttachmentsOptions extends js.Object {
  var attachmentLayout: js.UndefOr[String] = js.native
  var attachments: js.UndefOr[ChatRenderAttachmentsOptionsAttachments] = js.native
}

object ChatRenderAttachmentsOptions {
  @scala.inline
  def apply(): ChatRenderAttachmentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatRenderAttachmentsOptions]
  }
  @scala.inline
  implicit class ChatRenderAttachmentsOptionsOps[Self <: ChatRenderAttachmentsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachments(value: ChatRenderAttachmentsOptionsAttachments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
  }
  
}

