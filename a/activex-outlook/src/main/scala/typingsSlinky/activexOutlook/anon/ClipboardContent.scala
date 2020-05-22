package typingsSlinky.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipboardContent extends js.Object {
  var Cancel: Boolean
  val ClipboardContent: js.Any
  val Target: typingsSlinky.activexOutlook.Outlook.Folder
}

object ClipboardContent {
  @scala.inline
  def apply(Cancel: Boolean, ClipboardContent: js.Any, Target: typingsSlinky.activexOutlook.Outlook.Folder): ClipboardContent = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ClipboardContent = ClipboardContent.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardContent]
  }
}

