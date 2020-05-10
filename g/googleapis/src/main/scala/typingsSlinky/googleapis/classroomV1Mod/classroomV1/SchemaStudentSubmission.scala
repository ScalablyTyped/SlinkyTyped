package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Student submission for course work.  StudentSubmission items are generated
  * when a CourseWork item is created.  StudentSubmissions that have never been
  * accessed (i.e. with `state` = NEW) may not have a creation time or update
  * time.
  */
@js.native
trait SchemaStudentSubmission extends js.Object {
  /**
    * Absolute link to the submission in the Classroom web UI.  Read-only.
    */
  var alternateLink: js.UndefOr[String] = js.native
  /**
    * Optional grade. If unset, no grade was set. This value must be
    * non-negative. Decimal (i.e. non-integer) values are allowed, but will be
    * rounded to two decimal places.  This may be modified only by course
    * teachers.
    */
  var assignedGrade: js.UndefOr[Double] = js.native
  /**
    * Submission content when course_work_type is ASSIGNMENT.  Students can
    * modify this content using google.classroom.Work.ModifyAttachments.
    */
  var assignmentSubmission: js.UndefOr[SchemaAssignmentSubmission] = js.native
  /**
    * Whether this student submission is associated with the Developer Console
    * project making the request.  See google.classroom.Work.CreateCourseWork
    * for more details.  Read-only.
    */
  var associatedWithDeveloper: js.UndefOr[Boolean] = js.native
  /**
    * Identifier of the course.  Read-only.
    */
  var courseId: js.UndefOr[String] = js.native
  /**
    * Identifier for the course work this corresponds to.  Read-only.
    */
  var courseWorkId: js.UndefOr[String] = js.native
  /**
    * Type of course work this submission is for.  Read-only.
    */
  var courseWorkType: js.UndefOr[String] = js.native
  /**
    * Creation time of this submission. This may be unset if the student has
    * not accessed this item.  Read-only.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * Optional pending grade. If unset, no grade was set. This value must be
    * non-negative. Decimal (i.e. non-integer) values are allowed, but will be
    * rounded to two decimal places.  This is only visible to and modifiable by
    * course teachers.
    */
  var draftGrade: js.UndefOr[Double] = js.native
  /**
    * Classroom-assigned Identifier for the student submission. This is unique
    * among submissions for the relevant course work.  Read-only.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether this submission is late.  Read-only.
    */
  var late: js.UndefOr[Boolean] = js.native
  /**
    * Submission content when course_work_type is MULTIPLE_CHOICE_QUESTION.
    */
  var multipleChoiceSubmission: js.UndefOr[SchemaMultipleChoiceSubmission] = js.native
  /**
    * Submission content when course_work_type is SHORT_ANSWER_QUESTION.
    */
  var shortAnswerSubmission: js.UndefOr[SchemaShortAnswerSubmission] = js.native
  /**
    * State of this submission.  Read-only.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The history of the submission (includes state and grade histories).
    * Read-only.
    */
  var submissionHistory: js.UndefOr[js.Array[SchemaSubmissionHistory]] = js.native
  /**
    * Last update time of this submission. This may be unset if the student has
    * not accessed this item.  Read-only.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Identifier for the student that owns this submission.  Read-only.
    */
  var userId: js.UndefOr[String] = js.native
}

object SchemaStudentSubmission {
  @scala.inline
  def apply(): SchemaStudentSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStudentSubmission]
  }
  @scala.inline
  implicit class SchemaStudentSubmissionOps[Self <: SchemaStudentSubmission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternateLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateLink")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignedGrade(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedGrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignedGrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedGrade")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignmentSubmission(value: SchemaAssignmentSubmission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignmentSubmission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignmentSubmission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignmentSubmission")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociatedWithDeveloper(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedWithDeveloper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedWithDeveloper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedWithDeveloper")(js.undefined)
        ret
    }
    @scala.inline
    def withCourseId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCourseId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseId")(js.undefined)
        ret
    }
    @scala.inline
    def withCourseWorkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseWorkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCourseWorkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseWorkId")(js.undefined)
        ret
    }
    @scala.inline
    def withCourseWorkType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseWorkType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCourseWorkType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseWorkType")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDraftGrade(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draftGrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraftGrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draftGrade")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("late")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("late")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleChoiceSubmission(value: SchemaMultipleChoiceSubmission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleChoiceSubmission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleChoiceSubmission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleChoiceSubmission")(js.undefined)
        ret
    }
    @scala.inline
    def withShortAnswerSubmission(value: SchemaShortAnswerSubmission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortAnswerSubmission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortAnswerSubmission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortAnswerSubmission")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmissionHistory(value: js.Array[SchemaSubmissionHistory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submissionHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmissionHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submissionHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

