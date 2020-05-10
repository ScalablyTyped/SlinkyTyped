package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateScheduleResponse extends js.Object {
  /**
    * Schedule actions created in the schedule.
    */
  var Creates: js.UndefOr[BatchScheduleActionCreateResult] = js.native
  /**
    * Schedule actions deleted from the schedule.
    */
  var Deletes: js.UndefOr[BatchScheduleActionDeleteResult] = js.native
}

object BatchUpdateScheduleResponse {
  @scala.inline
  def apply(): BatchUpdateScheduleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateScheduleResponse]
  }
  @scala.inline
  implicit class BatchUpdateScheduleResponseOps[Self <: BatchUpdateScheduleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreates(value: BatchScheduleActionCreateResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creates")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletes(value: BatchScheduleActionDeleteResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deletes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deletes")(js.undefined)
        ret
    }
  }
  
}

