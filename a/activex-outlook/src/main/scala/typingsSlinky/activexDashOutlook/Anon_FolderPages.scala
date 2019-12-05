package typingsSlinky.activexDashOutlook

import typingsSlinky.activexDashOutlook.Outlook.Folder
import typingsSlinky.activexDashOutlook.Outlook.PropertyPages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FolderPages extends js.Object {
  val Folder: typingsSlinky.activexDashOutlook.Outlook.Folder
  val Pages: PropertyPages
}

object Anon_FolderPages {
  @scala.inline
  def apply(Folder: Folder, Pages: PropertyPages): Anon_FolderPages = {
    val __obj = js.Dynamic.literal(Folder = Folder.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FolderPages]
  }
}

