package typingsSlinky.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CourseRosterChangesInfo extends js.Object {
  /** The `course_id` of the course to subscribe to roster changes for. */
  var courseId: js.UndefOr[String] = js.native
}

object CourseRosterChangesInfo {
  @scala.inline
  def apply(): CourseRosterChangesInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CourseRosterChangesInfo]
  }
  @scala.inline
  implicit class CourseRosterChangesInfoOps[Self <: CourseRosterChangesInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

