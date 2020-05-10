package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.Folder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFolder extends js.Object {
  val Folder: typingsSlinky.activexOutlook.Outlook.Folder = js.native
}

object AnonFolder {
  @scala.inline
  def apply(Folder: Folder): AnonFolder = {
    val __obj = js.Dynamic.literal(Folder = Folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFolder]
  }
  @scala.inline
  implicit class AnonFolderOps[Self <: AnonFolder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFolder(value: Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Folder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

