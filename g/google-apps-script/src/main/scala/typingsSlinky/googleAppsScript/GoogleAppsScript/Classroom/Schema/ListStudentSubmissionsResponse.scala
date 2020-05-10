package typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStudentSubmissionsResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.native
  var studentSubmissions: js.UndefOr[js.Array[StudentSubmission]] = js.native
}

object ListStudentSubmissionsResponse {
  @scala.inline
  def apply(): ListStudentSubmissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStudentSubmissionsResponse]
  }
  @scala.inline
  implicit class ListStudentSubmissionsResponseOps[Self <: ListStudentSubmissionsResponse] (val x: Self) extends AnyVal {
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
    def withStudentSubmissions(value: js.Array[StudentSubmission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studentSubmissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStudentSubmissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studentSubmissions")(js.undefined)
        ret
    }
  }
  
}

