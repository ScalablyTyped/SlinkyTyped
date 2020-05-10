package typingsSlinky.googleapis.v2beta2Mod.cloudtasksV2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Status of the task.
  */
@js.native
trait SchemaTaskStatus extends js.Object {
  /**
    * Output only. The number of attempts dispatched.  This count includes
    * attempts which have been dispatched but haven&#39;t received a response.
    */
  var attemptDispatchCount: js.UndefOr[Double] = js.native
  /**
    * Output only. The number of attempts which have received a response.  This
    * field is not calculated for pull tasks.
    */
  var attemptResponseCount: js.UndefOr[Double] = js.native
  /**
    * Output only. The status of the task&#39;s first attempt.  Only
    * dispatch_time will be set. The other AttemptStatus information is not
    * retained by Cloud Tasks.  This field is not calculated for pull tasks.
    */
  var firstAttemptStatus: js.UndefOr[SchemaAttemptStatus] = js.native
  /**
    * Output only. The status of the task&#39;s last attempt.  This field is
    * not calculated for pull tasks.
    */
  var lastAttemptStatus: js.UndefOr[SchemaAttemptStatus] = js.native
}

object SchemaTaskStatus {
  @scala.inline
  def apply(): SchemaTaskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTaskStatus]
  }
  @scala.inline
  implicit class SchemaTaskStatusOps[Self <: SchemaTaskStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttemptDispatchCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptDispatchCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttemptDispatchCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptDispatchCount")(js.undefined)
        ret
    }
    @scala.inline
    def withAttemptResponseCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptResponseCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttemptResponseCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptResponseCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstAttemptStatus(value: SchemaAttemptStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstAttemptStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstAttemptStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstAttemptStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAttemptStatus(value: SchemaAttemptStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAttemptStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAttemptStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAttemptStatus")(js.undefined)
        ret
    }
  }
  
}

