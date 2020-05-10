package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSyncJob extends js.Object {
  /**
    * If the reason that the synchronization failed is due to an error with the underlying data source, this field contains a code that identifies the error.
    */
  var DataSourceErrorCode: js.UndefOr[String] = js.native
  /**
    * The UNIX datetime that the synchronization job was completed.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * If the Status field is set to FAILED, the ErrorCode field contains a the reason that the synchronization failed.
    */
  var ErrorCode: js.UndefOr[typingsSlinky.awsSdk.kendraMod.ErrorCode] = js.native
  /**
    * If the Status field is set to ERROR, the ErrorMessage field contains a description of the error that caused the synchronization to fail.
    */
  var ErrorMessage: js.UndefOr[typingsSlinky.awsSdk.kendraMod.ErrorMessage] = js.native
  /**
    * A unique identifier for the synchronization job.
    */
  var ExecutionId: js.UndefOr[String] = js.native
  /**
    * The UNIX datetime that the synchronization job was started.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * The execution status of the synchronization job. When the Status field is set to SUCCEEDED, the synchronization job is done. If the status code is set to FAILED, the ErrorCode and ErrorMessage fields give you the reason for the failure.
    */
  var Status: js.UndefOr[DataSourceSyncJobStatus] = js.native
}

object DataSourceSyncJob {
  @scala.inline
  def apply(): DataSourceSyncJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSyncJob]
  }
  @scala.inline
  implicit class DataSourceSyncJobOps[Self <: DataSourceSyncJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSourceErrorCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCode(value: ErrorCode): Self = {
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
    def withErrorMessage(value: ErrorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionId")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: DataSourceSyncJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

