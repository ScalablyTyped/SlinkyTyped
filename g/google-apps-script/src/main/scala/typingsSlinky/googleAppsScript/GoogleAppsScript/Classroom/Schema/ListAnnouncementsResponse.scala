package typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAnnouncementsResponse extends js.Object {
  var announcements: js.UndefOr[js.Array[Announcement]] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListAnnouncementsResponse {
  @scala.inline
  def apply(): ListAnnouncementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAnnouncementsResponse]
  }
  @scala.inline
  implicit class ListAnnouncementsResponseOps[Self <: ListAnnouncementsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnouncements(value: js.Array[Announcement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announcements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnouncements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announcements")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

