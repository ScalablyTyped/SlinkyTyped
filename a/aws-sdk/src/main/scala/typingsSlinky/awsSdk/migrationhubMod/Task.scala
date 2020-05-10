package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  /**
    * Indication of the percentage completion of the task.
    */
  var ProgressPercent: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.ProgressPercent] = js.native
  /**
    * Status of the task - Not Started, In-Progress, Complete.
    */
  var Status: typingsSlinky.awsSdk.migrationhubMod.Status = js.native
  /**
    * Details of task status as notified by a migration tool. A tool might use this field to provide clarifying information about the status that is unique to that tool or that explains an error state.
    */
  var StatusDetail: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.StatusDetail] = js.native
}

object Task {
  @scala.inline
  def apply(Status: Status): Task = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  @scala.inline
  implicit class TaskOps[Self <: Task] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgressPercent(value: ProgressPercent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusDetail(value: StatusDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusDetail")(js.undefined)
        ret
    }
  }
  
}

