package typingsSlinky.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetTaskStatusInput extends js.Object {
  /**
    * If an error occurred during the task, this value specifies the error code. This value is set on the physical attempt object. It is used to display error information to the user. It should not start with string "Service_" which is reserved by the system.
    */
  var errorId: js.UndefOr[String] = js.native
  /**
    * If an error occurred during the task, this value specifies a text description of the error. This value is set on the physical attempt object. It is used to display error information to the user. The web service does not parse this value.
    */
  var errorMessage: js.UndefOr[typingsSlinky.awsSdk.datapipelineMod.errorMessage] = js.native
  /**
    * If an error occurred during the task, this value specifies the stack trace associated with the error. This value is set on the physical attempt object. It is used to display error information to the user. The web service does not parse this value.
    */
  var errorStackTrace: js.UndefOr[String] = js.native
  /**
    * The ID of the task assigned to the task runner. This value is provided in the response for PollForTask.
    */
  var taskId: typingsSlinky.awsSdk.datapipelineMod.taskId = js.native
  /**
    * If FINISHED, the task successfully completed. If FAILED, the task ended unsuccessfully. Preconditions use false.
    */
  var taskStatus: TaskStatus = js.native
}

object SetTaskStatusInput {
  @scala.inline
  def apply(taskId: taskId, taskStatus: TaskStatus): SetTaskStatusInput = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any], taskStatus = taskStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTaskStatusInput]
  }
  @scala.inline
  implicit class SetTaskStatusInputOps[Self <: SetTaskStatusInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTaskId(value: taskId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskStatus(value: TaskStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorId")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: errorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorStackTrace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStackTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorStackTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStackTrace")(js.undefined)
        ret
    }
  }
  
}

