package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains fields to add or remove students from a course work or
  * announcement where the `assigneeMode` is set to `INDIVIDUAL_STUDENTS`.
  */
@js.native
trait SchemaModifyIndividualStudentsOptions extends js.Object {
  /**
    * Ids of students to be added as having access to this
    * coursework/announcement.
    */
  var addStudentIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Ids of students to be removed from having access to this
    * coursework/announcement.
    */
  var removeStudentIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaModifyIndividualStudentsOptions {
  @scala.inline
  def apply(): SchemaModifyIndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyIndividualStudentsOptions]
  }
  @scala.inline
  implicit class SchemaModifyIndividualStudentsOptionsOps[Self <: SchemaModifyIndividualStudentsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddStudentIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addStudentIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddStudentIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addStudentIds")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveStudentIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeStudentIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveStudentIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeStudentIds")(js.undefined)
        ret
    }
  }
  
}

