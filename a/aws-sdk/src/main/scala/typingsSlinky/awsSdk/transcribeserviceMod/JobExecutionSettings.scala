package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecutionSettings extends js.Object {
  /**
    * Indicates whether a job should be queued by Amazon Transcribe when the concurrent execution limit is exceeded. When the AllowDeferredExecution field is true, jobs are queued and will be executed when the number of executing jobs falls below the concurrent execution limit. If the field is false, Amazon Transcribe returns a LimitExceededException exception. If you specify the AllowDeferredExecution field, you must specify the DataAccessRoleArn field.
    */
  var AllowDeferredExecution: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of a role that has access to the S3 bucket that contains the input files. Amazon Transcribe will assume this role to read queued media files. If you have specified an output S3 bucket for the transcription results, this role should have access to the output bucket as well. If you specify the AllowDeferredExecution field, you must specify the DataAccessRoleArn field.
    */
  var DataAccessRoleArn: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.DataAccessRoleArn] = js.native
}

object JobExecutionSettings {
  @scala.inline
  def apply(): JobExecutionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionSettings]
  }
  @scala.inline
  implicit class JobExecutionSettingsOps[Self <: JobExecutionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDeferredExecution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowDeferredExecution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDeferredExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowDeferredExecution")(js.undefined)
        ret
    }
    @scala.inline
    def withDataAccessRoleArn(value: DataAccessRoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataAccessRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataAccessRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataAccessRoleArn")(js.undefined)
        ret
    }
  }
  
}

