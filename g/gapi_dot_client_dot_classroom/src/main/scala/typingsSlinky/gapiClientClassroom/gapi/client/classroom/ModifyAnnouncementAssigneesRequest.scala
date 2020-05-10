package typingsSlinky.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyAnnouncementAssigneesRequest extends js.Object {
  /**
    * Mode of the announcement describing whether it is accessible by all
    * students or specified individual students.
    */
  var assigneeMode: js.UndefOr[String] = js.native
  /**
    * Set which students can view or cannot view the announcement.
    * Must be specified only when `assigneeMode` is `INDIVIDUAL_STUDENTS`.
    */
  var modifyIndividualStudentsOptions: js.UndefOr[ModifyIndividualStudentsOptions] = js.native
}

object ModifyAnnouncementAssigneesRequest {
  @scala.inline
  def apply(): ModifyAnnouncementAssigneesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyAnnouncementAssigneesRequest]
  }
  @scala.inline
  implicit class ModifyAnnouncementAssigneesRequestOps[Self <: ModifyAnnouncementAssigneesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssigneeMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigneeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssigneeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assigneeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyIndividualStudentsOptions(value: ModifyIndividualStudentsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyIndividualStudentsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifyIndividualStudentsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyIndividualStudentsOptions")(js.undefined)
        ret
    }
  }
  
}

