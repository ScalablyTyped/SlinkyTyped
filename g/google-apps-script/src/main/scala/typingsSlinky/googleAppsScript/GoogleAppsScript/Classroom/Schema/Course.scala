package typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Course extends js.Object {
  var alternateLink: js.UndefOr[String] = js.native
  var calendarId: js.UndefOr[String] = js.native
  var courseGroupEmail: js.UndefOr[String] = js.native
  var courseMaterialSets: js.UndefOr[js.Array[CourseMaterialSet]] = js.native
  var courseState: js.UndefOr[String] = js.native
  var creationTime: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var descriptionHeading: js.UndefOr[String] = js.native
  var enrollmentCode: js.UndefOr[String] = js.native
  var guardiansEnabled: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var ownerId: js.UndefOr[String] = js.native
  var room: js.UndefOr[String] = js.native
  var section: js.UndefOr[String] = js.native
  var teacherFolder: js.UndefOr[DriveFolder] = js.native
  var teacherGroupEmail: js.UndefOr[String] = js.native
  var updateTime: js.UndefOr[String] = js.native
}

object Course {
  @scala.inline
  def apply(): Course = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Course]
  }
  @scala.inline
  implicit class CourseOps[Self <: Course] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternateLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateLink")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendarId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarId")(js.undefined)
        ret
    }
    @scala.inline
    def withCourseGroupEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseGroupEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCourseGroupEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseGroupEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withCourseMaterialSets(value: js.Array[CourseMaterialSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseMaterialSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCourseMaterialSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseMaterialSets")(js.undefined)
        ret
    }
    @scala.inline
    def withCourseState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCourseState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseState")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionHeading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptionHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionHeading")(js.undefined)
        ret
    }
    @scala.inline
    def withEnrollmentCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollmentCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnrollmentCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollmentCode")(js.undefined)
        ret
    }
    @scala.inline
    def withGuardiansEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardiansEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuardiansEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardiansEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(js.undefined)
        ret
    }
    @scala.inline
    def withRoom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("room")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("room")(js.undefined)
        ret
    }
    @scala.inline
    def withSection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(js.undefined)
        ret
    }
    @scala.inline
    def withTeacherFolder(value: DriveFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teacherFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeacherFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teacherFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withTeacherGroupEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teacherGroupEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeacherGroupEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teacherGroupEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

