package typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Feed extends js.Object {
  var courseRosterChangesInfo: js.UndefOr[CourseRosterChangesInfo] = js.native
  var courseWorkChangesInfo: js.UndefOr[CourseWorkChangesInfo] = js.native
  var feedType: js.UndefOr[String] = js.native
}

object Feed {
  @scala.inline
  def apply(): Feed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Feed]
  }
  @scala.inline
  implicit class FeedOps[Self <: Feed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCourseRosterChangesInfo(value: CourseRosterChangesInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseRosterChangesInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCourseRosterChangesInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseRosterChangesInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withCourseWorkChangesInfo(value: CourseWorkChangesInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseWorkChangesInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCourseWorkChangesInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseWorkChangesInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withFeedType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedType")(js.undefined)
        ret
    }
  }
  
}

