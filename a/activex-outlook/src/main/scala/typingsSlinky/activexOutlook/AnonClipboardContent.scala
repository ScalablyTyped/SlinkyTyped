package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.Folder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClipboardContent extends js.Object {
  var Cancel: Boolean = js.native
  val ClipboardContent: js.Any = js.native
  val Target: Folder = js.native
}

object AnonClipboardContent {
  @scala.inline
  def apply(Cancel: Boolean, ClipboardContent: js.Any, Target: Folder): AnonClipboardContent = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ClipboardContent = ClipboardContent.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClipboardContent]
  }
  @scala.inline
  implicit class AnonClipboardContentOps[Self <: AnonClipboardContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClipboardContent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClipboardContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

