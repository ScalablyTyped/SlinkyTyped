package typingsSlinky.pulumiKubernetes.inputMod.batch.v1beta1

import typingsSlinky.pulumiKubernetes.inputMod.core.v1.ObjectReference
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CronJobStatus represents the current state of a cron job.
  */
@js.native
trait CronJobStatus extends js.Object {
  /**
    * A list of pointers to currently running jobs.
    */
  var active: js.UndefOr[Input[js.Array[Input[ObjectReference]]]] = js.native
  /**
    * Information when was the last time the job was successfully scheduled.
    */
  var lastScheduleTime: js.UndefOr[Input[String]] = js.native
}

object CronJobStatus {
  @scala.inline
  def apply(): CronJobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CronJobStatus]
  }
  @scala.inline
  implicit class CronJobStatusOps[Self <: CronJobStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Input[js.Array[Input[ObjectReference]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withLastScheduleTime(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastScheduleTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastScheduleTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastScheduleTime")(js.undefined)
        ret
    }
  }
  
}

