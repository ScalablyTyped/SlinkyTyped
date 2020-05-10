package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing student submissions.
  */
@js.native
trait SchemaListStudentSubmissionsResponse extends js.Object {
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Student work that matches the request.
    */
  var studentSubmissions: js.UndefOr[js.Array[SchemaStudentSubmission]] = js.native
}

object SchemaListStudentSubmissionsResponse {
  @scala.inline
  def apply(): SchemaListStudentSubmissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListStudentSubmissionsResponse]
  }
  @scala.inline
  implicit class SchemaListStudentSubmissionsResponseOps[Self <: SchemaListStudentSubmissionsResponse] (val x: Self) extends AnyVal {
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
    def withStudentSubmissions(value: js.Array[SchemaStudentSubmission]): Self = {
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

