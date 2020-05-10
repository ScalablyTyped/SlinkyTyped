package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.NavigationFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNavigationFolder extends js.Object {
  val NavigationFolder: typingsSlinky.activexOutlook.Outlook.NavigationFolder = js.native
}

object AnonNavigationFolder {
  @scala.inline
  def apply(NavigationFolder: NavigationFolder): AnonNavigationFolder = {
    val __obj = js.Dynamic.literal(NavigationFolder = NavigationFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNavigationFolder]
  }
  @scala.inline
  implicit class AnonNavigationFolderOps[Self <: AnonNavigationFolder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNavigationFolder(value: NavigationFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NavigationFolder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

