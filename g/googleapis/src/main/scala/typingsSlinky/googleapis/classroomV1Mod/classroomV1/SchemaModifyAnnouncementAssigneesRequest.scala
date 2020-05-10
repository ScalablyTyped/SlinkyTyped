package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to modify assignee mode and options of an announcement.
  */
@js.native
trait SchemaModifyAnnouncementAssigneesRequest extends js.Object {
  /**
    * Mode of the announcement describing whether it will be accessible by all
    * students or specified individual students.
    */
  var assigneeMode: js.UndefOr[String] = js.native
  /**
    * Set which students can view or cannot view the announcement. Must be
    * specified only when `assigneeMode` is `INDIVIDUAL_STUDENTS`.
    */
  var modifyIndividualStudentsOptions: js.UndefOr[SchemaModifyIndividualStudentsOptions] = js.native
}

object SchemaModifyAnnouncementAssigneesRequest {
  @scala.inline
  def apply(): SchemaModifyAnnouncementAssigneesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyAnnouncementAssigneesRequest]
  }
  @scala.inline
  implicit class SchemaModifyAnnouncementAssigneesRequestOps[Self <: SchemaModifyAnnouncementAssigneesRequest] (val x: Self) extends AnyVal {
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
    def withModifyIndividualStudentsOptions(value: SchemaModifyIndividualStudentsOptions): Self = {
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

