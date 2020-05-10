package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosHomeScreenFolderPage extends js.Object {
  // A list of apps to appear on a page within a folder. This collection can contain a maximum of 500 elements.
  var apps: js.UndefOr[js.Array[IosHomeScreenApp]] = js.native
  // Name of the folder page
  var displayName: js.UndefOr[String] = js.native
}

object IosHomeScreenFolderPage {
  @scala.inline
  def apply(): IosHomeScreenFolderPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosHomeScreenFolderPage]
  }
  @scala.inline
  implicit class IosHomeScreenFolderPageOps[Self <: IosHomeScreenFolderPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApps(value: js.Array[IosHomeScreenApp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apps")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
  }
  
}

