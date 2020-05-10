package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The history of the submission. This currently includes state and grade
  * histories.
  */
@js.native
trait SchemaSubmissionHistory extends js.Object {
  /**
    * The grade history information of the submission, if present.
    */
  var gradeHistory: js.UndefOr[SchemaGradeHistory] = js.native
  /**
    * The state history information of the submission, if present.
    */
  var stateHistory: js.UndefOr[SchemaStateHistory] = js.native
}

object SchemaSubmissionHistory {
  @scala.inline
  def apply(): SchemaSubmissionHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubmissionHistory]
  }
  @scala.inline
  implicit class SchemaSubmissionHistoryOps[Self <: SchemaSubmissionHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGradeHistory(value: SchemaGradeHistory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradeHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradeHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradeHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withStateHistory(value: SchemaStateHistory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateHistory")(js.undefined)
        ret
    }
  }
  
}

