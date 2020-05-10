package typingsSlinky.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Announcement extends js.Object {
  /**
    * Absolute link to this announcement in the Classroom web UI.
    * This is only populated if `state` is `PUBLISHED`.
    *
    * Read-only.
    */
  var alternateLink: js.UndefOr[String] = js.native
  /**
    * Assignee mode of the announcement.
    * If unspecified, the default value is `ALL_STUDENTS`.
    */
  var assigneeMode: js.UndefOr[String] = js.native
  /**
    * Identifier of the course.
    *
    * Read-only.
    */
  var courseId: js.UndefOr[String] = js.native
  /**
    * Timestamp when this announcement was created.
    *
    * Read-only.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * Identifier for the user that created the announcement.
    *
    * Read-only.
    */
  var creatorUserId: js.UndefOr[String] = js.native
  /**
    * Classroom-assigned identifier of this announcement, unique per course.
    *
    * Read-only.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifiers of students with access to the announcement.
    * This field is set only if `assigneeMode` is `INDIVIDUAL_STUDENTS`.
    * If the `assigneeMode` is `INDIVIDUAL_STUDENTS`, then only students
    * specified in this field can see the announcement.
    */
  var individualStudentsOptions: js.UndefOr[IndividualStudentsOptions] = js.native
  /**
    * Additional materials.
    *
    * Announcements must have no more than 20 material items.
    */
  var materials: js.UndefOr[js.Array[Material]] = js.native
  /** Optional timestamp when this announcement is scheduled to be published. */
  var scheduledTime: js.UndefOr[String] = js.native
  /**
    * Status of this announcement.
    * If unspecified, the default state is `DRAFT`.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Description of this announcement.
    * The text must be a valid UTF-8 string containing no more
    * than 30,000 characters.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Timestamp of the most recent change to this announcement.
    *
    * Read-only.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object Announcement {
  @scala.inline
  def apply(): Announcement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Announcement]
  }
  @scala.inline
  implicit class AnnouncementOps[Self <: Announcement] (val x: Self) extends AnyVal {
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
    def withCourseId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCourseId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseId")(js.undefined)
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
    def withCreatorUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatorUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatorUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatorUserId")(js.undefined)
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
    def withIndividualStudentsOptions(value: IndividualStudentsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individualStudentsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndividualStudentsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individualStudentsOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMaterials(value: js.Array[Material]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaterials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materials")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledTime")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
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

