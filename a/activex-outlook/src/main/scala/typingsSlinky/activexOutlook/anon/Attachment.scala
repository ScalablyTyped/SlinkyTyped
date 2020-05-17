package typingsSlinky.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attachment extends js.Object {
  val Attachment: typingsSlinky.activexOutlook.Outlook.Attachment = js.native
}

object Attachment {
  @scala.inline
  def apply(Attachment: typingsSlinky.activexOutlook.Outlook.Attachment): Attachment = {
    val __obj = js.Dynamic.literal(Attachment = Attachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  @scala.inline
  implicit class AttachmentOps[Self <: Attachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachment(value: typingsSlinky.activexOutlook.Outlook.Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attachment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

