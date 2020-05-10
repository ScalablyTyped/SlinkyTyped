package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.Attachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttachmentCancel extends js.Object {
  val Attachment: typingsSlinky.activexOutlook.Outlook.Attachment = js.native
  var Cancel: Boolean = js.native
}

object AnonAttachmentCancel {
  @scala.inline
  def apply(Attachment: Attachment, Cancel: Boolean): AnonAttachmentCancel = {
    val __obj = js.Dynamic.literal(Attachment = Attachment.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttachmentCancel]
  }
  @scala.inline
  implicit class AnonAttachmentCancelOps[Self <: AnonAttachmentCancel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachment(value: Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

