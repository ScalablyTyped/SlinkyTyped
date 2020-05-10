package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing teachers.
  */
@js.native
trait SchemaListTeachersResponse extends js.Object {
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Teachers who match the list request.
    */
  var teachers: js.UndefOr[js.Array[SchemaTeacher]] = js.native
}

object SchemaListTeachersResponse {
  @scala.inline
  def apply(): SchemaListTeachersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTeachersResponse]
  }
  @scala.inline
  implicit class SchemaListTeachersResponseOps[Self <: SchemaListTeachersResponse] (val x: Self) extends AnyVal {
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
    def withTeachers(value: js.Array[SchemaTeacher]): Self = {
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

