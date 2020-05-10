package typingsSlinky.pulumiKubernetes.outputMod.batch.v2alpha1

import typingsSlinky.pulumiKubernetes.outputMod.core.v1.ObjectReference
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
  val active: js.Array[ObjectReference] = js.native
  /**
    * Information when was the last time the job was successfully scheduled.
    */
  val lastScheduleTime: String = js.native
}

object CronJobStatus {
  @scala.inline
  def apply(active: js.Array[ObjectReference], lastScheduleTime: String): CronJobStatus = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], lastScheduleTime = lastScheduleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CronJobStatus]
  }
  @scala.inline
  implicit class CronJobStatusOps[Self <: CronJobStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: js.Array[ObjectReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastScheduleTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastScheduleTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

