package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteScheduledActionAnswer extends js.Object {
  /**
    * The names of the scheduled actions that could not be deleted, including an error message.
    */
  var FailedScheduledActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests] = js.native
}

object BatchDeleteScheduledActionAnswer {
  @scala.inline
  def apply(): BatchDeleteScheduledActionAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteScheduledActionAnswer]
  }
  @scala.inline
  implicit class BatchDeleteScheduledActionAnswerOps[Self <: BatchDeleteScheduledActionAnswer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedScheduledActions(value: FailedScheduledUpdateGroupActionRequests): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedScheduledActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedScheduledActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedScheduledActions")(js.undefined)
        ret
    }
  }
  
}

