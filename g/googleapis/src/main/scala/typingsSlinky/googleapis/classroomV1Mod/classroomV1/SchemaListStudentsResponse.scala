package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response when listing students.
  */
@js.native
trait SchemaListStudentsResponse extends js.Object {
  
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Students who match the list request.
    */
  var students: js.UndefOr[js.Array[SchemaStudent]] = js.native
}
object SchemaListStudentsResponse {
  
  @scala.inline
  def apply(): SchemaListStudentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListStudentsResponse]
  }
  
  @scala.inline
  implicit class SchemaListStudentsResponseOps[Self <: SchemaListStudentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setStudentsVarargs(value: SchemaStudent*): Self = this.set("students", js.Array(value :_*))
    
    @scala.inline
    def setStudents(value: js.Array[SchemaStudent]): Self = this.set("students", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStudents: Self = this.set("students", js.undefined)
  }
}
