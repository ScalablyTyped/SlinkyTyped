package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecutionSummaryForJob extends js.Object {
  /**
    * Contains a subset of information about a job execution.
    */
  var jobExecutionSummary: js.UndefOr[JobExecutionSummary] = js.native
  /**
    * The ARN of the thing on which the job execution is running.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
}

object JobExecutionSummaryForJob {
  @scala.inline
  def apply(): JobExecutionSummaryForJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionSummaryForJob]
  }
  @scala.inline
  implicit class JobExecutionSummaryForJobOps[Self <: JobExecutionSummaryForJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobExecutionSummary(value: JobExecutionSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobExecutionSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobExecutionSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobExecutionSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withThingArn(value: ThingArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingArn")(js.undefined)
        ret
    }
  }
  
}

