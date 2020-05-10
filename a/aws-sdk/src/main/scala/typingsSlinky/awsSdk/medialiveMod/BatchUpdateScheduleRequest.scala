package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateScheduleRequest extends js.Object {
  /**
    * Id of the channel whose schedule is being updated.
    */
  var ChannelId: string = js.native
  /**
    * Schedule actions to create in the schedule.
    */
  var Creates: js.UndefOr[BatchScheduleActionCreateRequest] = js.native
  /**
    * Schedule actions to delete from the schedule.
    */
  var Deletes: js.UndefOr[BatchScheduleActionDeleteRequest] = js.native
}

object BatchUpdateScheduleRequest {
  @scala.inline
  def apply(ChannelId: string): BatchUpdateScheduleRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateScheduleRequest]
  }
  @scala.inline
  implicit class BatchUpdateScheduleRequestOps[Self <: BatchUpdateScheduleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreates(value: BatchScheduleActionCreateRequest): Self = {
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
    def withDeletes(value: BatchScheduleActionDeleteRequest): Self = {
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

