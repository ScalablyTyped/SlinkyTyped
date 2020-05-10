package typingsSlinky.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStudentsResponse extends js.Object {
  /**
    * Token identifying the next page of results to return. If empty, no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Students who match the list request. */
  var students: js.UndefOr[js.Array[Student]] = js.native
}

object ListStudentsResponse {
  @scala.inline
  def apply(): ListStudentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStudentsResponse]
  }
  @scala.inline
  implicit class ListStudentsResponseOps[Self <: ListStudentsResponse] (val x: Self) extends AnyVal {
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
    def withStudents(value: js.Array[Student]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("students")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStudents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("students")(js.undefined)
        ret
    }
  }
  
}

