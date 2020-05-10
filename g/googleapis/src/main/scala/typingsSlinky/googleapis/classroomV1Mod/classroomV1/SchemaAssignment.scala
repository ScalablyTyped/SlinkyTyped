package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional details for assignments.
  */
@js.native
trait SchemaAssignment extends js.Object {
  /**
    * Drive folder where attachments from student submissions are placed. This
    * is only populated for course teachers and administrators.
    */
  var studentWorkFolder: js.UndefOr[SchemaDriveFolder] = js.native
}

object SchemaAssignment {
  @scala.inline
  def apply(): SchemaAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssignment]
  }
  @scala.inline
  implicit class SchemaAssignmentOps[Self <: SchemaAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStudentWorkFolder(value: SchemaDriveFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studentWorkFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStudentWorkFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studentWorkFolder")(js.undefined)
        ret
    }
  }
  
}

