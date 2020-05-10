package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a `Feed` with a `feed_type` of `COURSE_WORK_CHANGES`.
  */
@js.native
trait SchemaCourseWorkChangesInfo extends js.Object {
  /**
    * The `course_id` of the course to subscribe to work changes for.
    */
  var courseId: js.UndefOr[String] = js.native
}

object SchemaCourseWorkChangesInfo {
  @scala.inline
  def apply(): SchemaCourseWorkChangesInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCourseWorkChangesInfo]
  }
  @scala.inline
  implicit class SchemaCourseWorkChangesInfoOps[Self <: SchemaCourseWorkChangesInfo] (val x: Self) extends AnyVal {
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

