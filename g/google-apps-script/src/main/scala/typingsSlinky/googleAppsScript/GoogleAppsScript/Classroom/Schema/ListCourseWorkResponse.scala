package typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCourseWorkResponse extends js.Object {
  var courseWork: js.UndefOr[js.Array[CourseWork]] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListCourseWorkResponse {
  @scala.inline
  def apply(): ListCourseWorkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCourseWorkResponse]
  }
  @scala.inline
  implicit class ListCourseWorkResponseOps[Self <: ListCourseWorkResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCourseWork(value: js.Array[CourseWork]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseWork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCourseWork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseWork")(js.undefined)
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

