package typingsSlinky.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignmentSubmission extends js.Object {
  /**
    * Attachments added by the student.
    * Drive files that correspond to materials with a share mode of
    * STUDENT_COPY may not exist yet if the student has not accessed the
    * assignment in Classroom.
    *
    * Some attachment metadata is only populated if the requesting user has
    * permission to access it. Identifier and alternate_link fields are always
    * available, but others (for example, title) may not be.
    */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.native
}

object AssignmentSubmission {
  @scala.inline
  def apply(): AssignmentSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignmentSubmission]
  }
  @scala.inline
  implicit class AssignmentSubmissionOps[Self <: AssignmentSubmission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachments(value: js.Array[Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
  }
  
}

