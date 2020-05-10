package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing course work.
  */
@js.native
trait SchemaListAnnouncementsResponse extends js.Object {
  /**
    * Announcement items that match the request.
    */
  var announcements: js.UndefOr[js.Array[SchemaAnnouncement]] = js.native
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAnnouncementsResponse {
  @scala.inline
  def apply(): SchemaListAnnouncementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAnnouncementsResponse]
  }
  @scala.inline
  implicit class SchemaListAnnouncementsResponseOps[Self <: SchemaListAnnouncementsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnouncements(value: js.Array[SchemaAnnouncement]): Self = {
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

