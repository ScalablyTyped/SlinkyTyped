package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.Attachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttachment extends js.Object {
  val Attachment: typingsSlinky.activexOutlook.Outlook.Attachment = js.native
}

object AnonAttachment {
  @scala.inline
  def apply(Attachment: Attachment): AnonAttachment = {
    val __obj = js.Dynamic.literal(Attachment = Attachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttachment]
  }
  @scala.inline
  implicit class AnonAttachmentOps[Self <: AnonAttachment] (val x: Self) extends AnyVal {
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
  }
  
}

