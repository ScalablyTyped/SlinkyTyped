package typingsSlinky.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationFolder extends js.Object {
  val NavigationFolder: typingsSlinky.activexOutlook.Outlook.NavigationFolder = js.native
}

object NavigationFolder {
  @scala.inline
  def apply(NavigationFolder: typingsSlinky.activexOutlook.Outlook.NavigationFolder): NavigationFolder = {
    val __obj = js.Dynamic.literal(NavigationFolder = NavigationFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationFolder]
  }
  @scala.inline
  implicit class NavigationFolderOps[Self <: NavigationFolder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNavigationFolder(value: typingsSlinky.activexOutlook.Outlook.NavigationFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NavigationFolder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

