package typingsSlinky.activexOutlook.anon

import typingsSlinky.activexOutlook.Outlook.AttachmentSelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attachments extends js.Object {
  val Attachments: AttachmentSelection = js.native
  val CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any = js.native
}

object Attachments {
  @scala.inline
  def apply(
    Attachments: AttachmentSelection,
    CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
  ): Attachments = {
    val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], CommandBar = CommandBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachments]
  }
  @scala.inline
  implicit class AttachmentsOps[Self <: Attachments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachments(value: AttachmentSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommandBar(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommandBar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

