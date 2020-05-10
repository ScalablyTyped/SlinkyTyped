package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeThingRegistrationTaskResponse extends js.Object {
  /**
    * The task creation date.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * The number of things that failed to be provisioned.
    */
  var failureCount: js.UndefOr[Count] = js.native
  /**
    * The S3 bucket that contains the input file.
    */
  var inputFileBucket: js.UndefOr[RegistryS3BucketName] = js.native
  /**
    * The input file key.
    */
  var inputFileKey: js.UndefOr[RegistryS3KeyName] = js.native
  /**
    * The date when the task was last modified.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The message.
    */
  var message: js.UndefOr[ErrorMessage] = js.native
  /**
    * The progress of the bulk provisioning task expressed as a percentage.
    */
  var percentageProgress: js.UndefOr[Percentage] = js.native
  /**
    * The role ARN that grants access to the input file bucket.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
  /**
    * The status of the bulk thing provisioning task.
    */
  var status: js.UndefOr[Status] = js.native
  /**
    * The number of things successfully provisioned.
    */
  var successCount: js.UndefOr[Count] = js.native
  /**
    * The task ID.
    */
  var taskId: js.UndefOr[TaskId] = js.native
  /**
    * The task's template.
    */
  var templateBody: js.UndefOr[TemplateBody] = js.native
}

object DescribeThingRegistrationTaskResponse {
  @scala.inline
  def apply(): DescribeThingRegistrationTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeThingRegistrationTaskResponse]
  }
  @scala.inline
  implicit class DescribeThingRegistrationTaskResponseOps[Self <: DescribeThingRegistrationTaskResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureCount(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFileBucket(value: RegistryS3BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFileBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFileBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFileBucket")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFileKey(value: RegistryS3KeyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFileKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFileKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFileKey")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: ErrorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentageProgress(value: Percentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentageProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentageProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentageProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessCount(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskId(value: TaskId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskId")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateBody(value: TemplateBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateBody")(js.undefined)
        ret
    }
  }
  
}

