package typingsSlinky.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Course extends js.Object {
  /**
    * Absolute link to this course in the Classroom web UI.
    *
    * Read-only.
    */
  var alternateLink: js.UndefOr[String] = js.native
  /**
    * The Calendar ID for a calendar that all course members can see, to which
    * Classroom adds events for course work and announcements in the course.
    *
    * Read-only.
    */
  var calendarId: js.UndefOr[String] = js.native
  /**
    * The email address of a Google group containing all members of the course.
    * This group does not accept email and can only be used for permissions.
    *
    * Read-only.
    */
  var courseGroupEmail: js.UndefOr[String] = js.native
  /**
    * Sets of materials that appear on the "about" page of this course.
    *
    * Read-only.
    */
  var courseMaterialSets: js.UndefOr[js.Array[CourseMaterialSet]] = js.native
  /**
    * State of the course.
    * If unspecified, the default state is `PROVISIONED`.
    */
  var courseState: js.UndefOr[String] = js.native
  /**
    * Creation time of the course.
    * Specifying this field in a course update mask results in an error.
    *
    * Read-only.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * Optional description.
    * For example, "We'll be learning about the structure of living
    * creatures from a combination of textbooks, guest lectures, and lab work.
    * Expect to be excited!"
    * If set, this field must be a valid UTF-8 string and no longer than 30,000
    * characters.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional heading for the description.
    * For example, "Welcome to 10th Grade Biology."
    * If set, this field must be a valid UTF-8 string and no longer than 3600
    * characters.
    */
  var descriptionHeading: js.UndefOr[String] = js.native
  /**
    * Enrollment code to use when joining this course.
    * Specifying this field in a course update mask results in an error.
    *
    * Read-only.
    */
  var enrollmentCode: js.UndefOr[String] = js.native
  /**
    * Whether or not guardian notifications are enabled for this course.
    *
    * Read-only.
    */
  var guardiansEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Identifier for this course assigned by Classroom.
    *
    * When
    * creating a course,
    * you may optionally set this identifier to an
    * alias string in the
    * request to create a corresponding alias. The `id` is still assigned by
    * Classroom and cannot be updated after the course is created.
    *
    * Specifying this field in a course update mask results in an error.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of the course.
    * For example, "10th Grade Biology".
    * The name is required. It must be between 1 and 750 characters and a valid
    * UTF-8 string.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The identifier of the owner of a course.
    *
    * When specified as a parameter of a
    * create course request, this
    * field is required.
    * The identifier can be one of the following:
    *
    * &#42; the numeric identifier for the user
    * &#42; the email address of the user
    * &#42; the string literal `"me"`, indicating the requesting user
    *
    * This must be set in a create request. Admins can also specify this field
    * in a patch course request to
    * transfer ownership. In other contexts, it is read-only.
    */
  var ownerId: js.UndefOr[String] = js.native
  /**
    * Optional room location.
    * For example, "301".
    * If set, this field must be a valid UTF-8 string and no longer than 650
    * characters.
    */
  var room: js.UndefOr[String] = js.native
  /**
    * Section of the course.
    * For example, "Period 2".
    * If set, this field must be a valid UTF-8 string and no longer than 2800
    * characters.
    */
  var section: js.UndefOr[String] = js.native
  /**
    * Information about a Drive Folder that is shared with all teachers of the
    * course.
    *
    * This field will only be set for teachers of the course and domain
    * administrators.
    *
    * Read-only.
    */
  var teacherFolder: js.UndefOr[DriveFolder] = js.native
  /**
    * The email address of a Google group containing all teachers of the course.
    * This group does not accept email and can only be used for permissions.
    *
    * Read-only.
    */
  var teacherGroupEmail: js.UndefOr[String] = js.native
  /**
    * Time of the most recent update to this course.
    * Specifying this field in a course update mask results in an error.
    *
    * Read-only.
    */
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

