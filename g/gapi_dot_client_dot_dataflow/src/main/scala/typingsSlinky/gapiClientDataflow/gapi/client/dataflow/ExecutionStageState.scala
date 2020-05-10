package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionStageState extends js.Object {
  /** The time at which the stage transitioned to this state. */
  var currentStateTime: js.UndefOr[String] = js.native
  /** The name of the execution stage. */
  var executionStageName: js.UndefOr[String] = js.native
  /** Executions stage states allow the same set of values as JobState. */
  var executionStageState: js.UndefOr[String] = js.native
}

object ExecutionStageState {
  @scala.inline
  def apply(): ExecutionStageState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionStageState]
  }
  @scala.inline
  implicit class ExecutionStageStateOps[Self <: ExecutionStageState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentStateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentStateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentStateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentStateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionStageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionStageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionStageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionStageName")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionStageState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionStageState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionStageState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionStageState")(js.undefined)
        ret
    }
  }
  
}

