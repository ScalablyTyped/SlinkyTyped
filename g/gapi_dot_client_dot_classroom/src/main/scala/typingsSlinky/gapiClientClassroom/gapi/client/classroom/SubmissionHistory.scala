package typingsSlinky.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmissionHistory extends js.Object {
  /** The grade history information of the submission, if present. */
  var gradeHistory: js.UndefOr[GradeHistory] = js.native
  /** The state history information of the submission, if present. */
  var stateHistory: js.UndefOr[StateHistory] = js.native
}

object SubmissionHistory {
  @scala.inline
  def apply(): SubmissionHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmissionHistory]
  }
  @scala.inline
  implicit class SubmissionHistoryOps[Self <: SubmissionHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGradeHistory(value: GradeHistory): Self = {
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
    def withStateHistory(value: StateHistory): Self = {
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

