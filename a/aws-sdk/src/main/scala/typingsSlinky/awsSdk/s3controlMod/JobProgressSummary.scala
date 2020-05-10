package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobProgressSummary extends js.Object {
  /**
    * 
    */
  var NumberOfTasksFailed: js.UndefOr[JobNumberOfTasksFailed] = js.native
  /**
    * 
    */
  var NumberOfTasksSucceeded: js.UndefOr[JobNumberOfTasksSucceeded] = js.native
  /**
    * 
    */
  var TotalNumberOfTasks: js.UndefOr[JobTotalNumberOfTasks] = js.native
}

object JobProgressSummary {
  @scala.inline
  def apply(): JobProgressSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobProgressSummary]
  }
  @scala.inline
  implicit class JobProgressSummaryOps[Self <: JobProgressSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumberOfTasksFailed(value: JobNumberOfTasksFailed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfTasksFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfTasksFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfTasksFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfTasksSucceeded(value: JobNumberOfTasksSucceeded): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfTasksSucceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfTasksSucceeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfTasksSucceeded")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalNumberOfTasks(value: JobTotalNumberOfTasks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalNumberOfTasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalNumberOfTasks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalNumberOfTasks")(js.undefined)
        ret
    }
  }
  
}

