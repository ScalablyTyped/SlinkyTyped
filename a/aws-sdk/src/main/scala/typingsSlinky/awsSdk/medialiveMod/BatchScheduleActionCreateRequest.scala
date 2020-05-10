package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchScheduleActionCreateRequest extends js.Object {
  /**
    * A list of schedule actions to create.
    */
  var ScheduleActions: listOfScheduleAction = js.native
}

object BatchScheduleActionCreateRequest {
  @scala.inline
  def apply(ScheduleActions: listOfScheduleAction): BatchScheduleActionCreateRequest = {
    val __obj = js.Dynamic.literal(ScheduleActions = ScheduleActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchScheduleActionCreateRequest]
  }
  @scala.inline
  implicit class BatchScheduleActionCreateRequestOps[Self <: BatchScheduleActionCreateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScheduleActions(value: listOfScheduleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleActions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

