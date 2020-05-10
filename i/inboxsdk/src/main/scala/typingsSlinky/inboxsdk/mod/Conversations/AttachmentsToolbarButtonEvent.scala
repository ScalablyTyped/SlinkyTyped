package typingsSlinky.inboxsdk.mod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentsToolbarButtonEvent extends js.Object {
  var attachmentCardViews: js.Array[AttachmentCardView] = js.native
}

object AttachmentsToolbarButtonEvent {
  @scala.inline
  def apply(attachmentCardViews: js.Array[AttachmentCardView]): AttachmentsToolbarButtonEvent = {
    val __obj = js.Dynamic.literal(attachmentCardViews = attachmentCardViews.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentsToolbarButtonEvent]
  }
  @scala.inline
  implicit class AttachmentsToolbarButtonEventOps[Self <: AttachmentsToolbarButtonEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentCardViews(value: js.Array[AttachmentCardView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentCardViews")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

