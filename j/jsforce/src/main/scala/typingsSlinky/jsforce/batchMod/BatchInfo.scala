package typingsSlinky.jsforce.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchInfo extends js.Object {
  var id: String = js.native
  var jobId: String = js.native
  var numberRecordsFailed: String = js.native
  var numberRecordsProcessed: String = js.native
  var state: String = js.native
  var stateMessage: String = js.native
  var totalProcessingTime: String = js.native
}

object BatchInfo {
  @scala.inline
  def apply(
    id: String,
    jobId: String,
    numberRecordsFailed: String,
    numberRecordsProcessed: String,
    state: String,
    stateMessage: String,
    totalProcessingTime: String
  ): BatchInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], numberRecordsFailed = numberRecordsFailed.asInstanceOf[js.Any], numberRecordsProcessed = numberRecordsProcessed.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateMessage = stateMessage.asInstanceOf[js.Any], totalProcessingTime = totalProcessingTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchInfo]
  }
  @scala.inline
  implicit class BatchInfoOps[Self <: BatchInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberRecordsFailed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberRecordsFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberRecordsProcessed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberRecordsProcessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalProcessingTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalProcessingTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

