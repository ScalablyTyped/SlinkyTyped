package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowRunStatistics extends js.Object {
  /**
    * Total number of Actions which have failed.
    */
  var FailedActions: js.UndefOr[IntegerValue] = js.native
  /**
    * Total number Actions in running state.
    */
  var RunningActions: js.UndefOr[IntegerValue] = js.native
  /**
    * Total number of Actions which have stopped.
    */
  var StoppedActions: js.UndefOr[IntegerValue] = js.native
  /**
    * Total number of Actions which have succeeded.
    */
  var SucceededActions: js.UndefOr[IntegerValue] = js.native
  /**
    * Total number of Actions which timed out.
    */
  var TimeoutActions: js.UndefOr[IntegerValue] = js.native
  /**
    * Total number of Actions in the workflow run.
    */
  var TotalActions: js.UndefOr[IntegerValue] = js.native
}

object WorkflowRunStatistics {
  @scala.inline
  def apply(): WorkflowRunStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowRunStatistics]
  }
  @scala.inline
  implicit class WorkflowRunStatisticsOps[Self <: WorkflowRunStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedActions(value: IntegerValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedActions")(js.undefined)
        ret
    }
    @scala.inline
    def withRunningActions(value: IntegerValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunningActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunningActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunningActions")(js.undefined)
        ret
    }
    @scala.inline
    def withStoppedActions(value: IntegerValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StoppedActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoppedActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StoppedActions")(js.undefined)
        ret
    }
    @scala.inline
    def withSucceededActions(value: IntegerValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SucceededActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSucceededActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SucceededActions")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutActions(value: IntegerValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeoutActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeoutActions")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalActions(value: IntegerValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalActions")(js.undefined)
        ret
    }
  }
  
}

