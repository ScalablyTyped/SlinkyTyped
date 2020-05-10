package typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTeachersResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.native
  var teachers: js.UndefOr[js.Array[Teacher]] = js.native
}

object ListTeachersResponse {
  @scala.inline
  def apply(): ListTeachersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTeachersResponse]
  }
  @scala.inline
  implicit class ListTeachersResponseOps[Self <: ListTeachersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withTeachers(value: js.Array[Teacher]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teachers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeachers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teachers")(js.undefined)
        ret
    }
  }
  
}

