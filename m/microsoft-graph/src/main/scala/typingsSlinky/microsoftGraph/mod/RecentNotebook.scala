package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecentNotebook extends js.Object {
  // The name of the notebook.
  var displayName: js.UndefOr[String] = js.native
  /**
    * The date and time when the notebook was last modified. The timestamp represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Read-only.
    */
  var lastAccessedTime: js.UndefOr[String] = js.native
  /**
    * Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote client, if it's installed.
    * The oneNoteWebURL link opens the notebook in OneNote on the web.
    */
  var links: js.UndefOr[RecentNotebookLinks] = js.native
  // The backend store where the Notebook resides, either OneDriveForBusiness or OneDrive.
  var sourceService: js.UndefOr[OnenoteSourceService] = js.native
}

object RecentNotebook {
  @scala.inline
  def apply(): RecentNotebook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecentNotebook]
  }
  @scala.inline
  implicit class RecentNotebookOps[Self <: RecentNotebook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withLastAccessedTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAccessedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAccessedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAccessedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: RecentNotebookLinks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceService(value: OnenoteSourceService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceService")(js.undefined)
        ret
    }
  }
  
}

