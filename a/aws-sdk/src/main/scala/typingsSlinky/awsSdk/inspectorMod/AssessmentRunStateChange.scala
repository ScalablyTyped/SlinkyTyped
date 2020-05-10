package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentRunStateChange extends js.Object {
  /**
    * The assessment run state.
    */
  var state: AssessmentRunState = js.native
  /**
    * The last time the assessment run state changed.
    */
  var stateChangedAt: js.Date = js.native
}

object AssessmentRunStateChange {
  @scala.inline
  def apply(state: AssessmentRunState, stateChangedAt: js.Date): AssessmentRunStateChange = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], stateChangedAt = stateChangedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentRunStateChange]
  }
  @scala.inline
  implicit class AssessmentRunStateChangeOps[Self <: AssessmentRunStateChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: AssessmentRunState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateChangedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChangedAt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

