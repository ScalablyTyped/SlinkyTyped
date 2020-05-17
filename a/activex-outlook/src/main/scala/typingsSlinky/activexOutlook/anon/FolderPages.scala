package typingsSlinky.activexOutlook.anon

import typingsSlinky.activexOutlook.Outlook.PropertyPages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FolderPages extends js.Object {
  val Folder: typingsSlinky.activexOutlook.Outlook.Folder = js.native
  val Pages: PropertyPages = js.native
}

object FolderPages {
  @scala.inline
  def apply(Folder: typingsSlinky.activexOutlook.Outlook.Folder, Pages: PropertyPages): FolderPages = {
    val __obj = js.Dynamic.literal(Folder = Folder.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderPages]
  }
  @scala.inline
  implicit class FolderPagesOps[Self <: FolderPages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFolder(value: typingsSlinky.activexOutlook.Outlook.Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPages(value: PropertyPages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

