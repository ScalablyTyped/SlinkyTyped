package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskExecutionResultDetail extends js.Object {
  /**
    * Errors that AWS DataSync encountered during execution of the task. You can use this error code to help troubleshoot issues.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  /**
    * Detailed description of an error that was encountered during the task execution. You can use this information to help troubleshoot issues. 
    */
  var ErrorDetail: js.UndefOr[String] = js.native
  /**
    * The total time in milliseconds that AWS DataSync spent in the PREPARING phase. 
    */
  var PrepareDuration: js.UndefOr[Duration] = js.native
  /**
    * The status of the PREPARING phase.
    */
  var PrepareStatus: js.UndefOr[PhaseStatus] = js.native
  /**
    * The total time in milliseconds that AWS DataSync took to transfer the file from the source to the destination location.
    */
  var TotalDuration: js.UndefOr[Duration] = js.native
  /**
    * The total time in milliseconds that AWS DataSync spent in the TRANSFERRING phase.
    */
  var TransferDuration: js.UndefOr[Duration] = js.native
  /**
    * The status of the TRANSFERRING Phase.
    */
  var TransferStatus: js.UndefOr[PhaseStatus] = js.native
  /**
    * The total time in milliseconds that AWS DataSync spent in the VERIFYING phase.
    */
  var VerifyDuration: js.UndefOr[Duration] = js.native
  /**
    * The status of the VERIFYING Phase.
    */
  var VerifyStatus: js.UndefOr[PhaseStatus] = js.native
}

object TaskExecutionResultDetail {
  @scala.inline
  def apply(): TaskExecutionResultDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskExecutionResultDetail]
  }
  @scala.inline
  implicit class TaskExecutionResultDetailOps[Self <: TaskExecutionResultDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepareDuration(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrepareDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepareDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrepareDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepareStatus(value: PhaseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrepareStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepareStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrepareStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalDuration(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferDuration(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransferDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransferDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferStatus(value: PhaseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransferStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransferStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifyDuration(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerifyDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifyDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerifyDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifyStatus(value: PhaseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerifyStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifyStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerifyStatus")(js.undefined)
        ret
    }
  }
  
}

