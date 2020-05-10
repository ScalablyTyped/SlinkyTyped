package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTaskExecutionResponse extends js.Object {
  /**
    * The physical number of bytes transferred over the network.
    */
  var BytesTransferred: js.UndefOr[long] = js.native
  /**
    * The number of logical bytes written to the destination AWS storage resource.
    */
  var BytesWritten: js.UndefOr[long] = js.native
  /**
    * The estimated physical number of bytes that is to be transferred over the network.
    */
  var EstimatedBytesToTransfer: js.UndefOr[long] = js.native
  /**
    * The expected number of files that is to be transferred over the network. This value is calculated during the PREPARING phase, before the TRANSFERRING phase. This value is the expected number of files to be transferred. It's calculated based on comparing the content of the source and destination locations and finding the delta that needs to be transferred. 
    */
  var EstimatedFilesToTransfer: js.UndefOr[long] = js.native
  /**
    * A list of filter rules that determines which files to exclude from a task. The list should contain a single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for example: "/folder1|/folder2"   
    */
  var Excludes: js.UndefOr[FilterList] = js.native
  /**
    * The actual number of files that was transferred over the network. This value is calculated and updated on an ongoing basis during the TRANSFERRING phase. It's updated periodically when each file is read from the source and sent over the network.  If failures occur during a transfer, this value can be less than EstimatedFilesToTransfer. This value can also be greater than EstimatedFilesTransferred in some cases. This element is implementation-specific for some location types, so don't use it as an indicator for a correct file number or to monitor your task execution.
    */
  var FilesTransferred: js.UndefOr[long] = js.native
  /**
    * A list of filter rules that determines which files to include when running a task. The list should contain a single filter string that consists of the patterns to include. The patterns are delimited by "|" (that is, a pipe), for example: "/folder1|/folder2"   
    */
  var Includes: js.UndefOr[FilterList] = js.native
  var Options: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.Options] = js.native
  /**
    * The result of the task execution.
    */
  var Result: js.UndefOr[TaskExecutionResultDetail] = js.native
  /**
    * The time that the task execution was started.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * The status of the task execution.  For detailed information about task execution statuses, see Understanding Task Statuses in the AWS DataSync User Guide. 
    */
  var Status: js.UndefOr[TaskExecutionStatus] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task execution that was described. TaskExecutionArn is hierarchical and includes TaskArn for the task that was executed.  For example, a TaskExecution value with the ARN arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b executed the task with the ARN arn:aws:datasync:us-east-1:111222333444:task/task-0208075f79cedf4a2. 
    */
  var TaskExecutionArn: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.TaskExecutionArn] = js.native
}

object DescribeTaskExecutionResponse {
  @scala.inline
  def apply(): DescribeTaskExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTaskExecutionResponse]
  }
  @scala.inline
  implicit class DescribeTaskExecutionResponseOps[Self <: DescribeTaskExecutionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesTransferred(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesTransferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesTransferred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesTransferred")(js.undefined)
        ret
    }
    @scala.inline
    def withBytesWritten(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesWritten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesWritten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesWritten")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedBytesToTransfer(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedBytesToTransfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedBytesToTransfer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedBytesToTransfer")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedFilesToTransfer(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedFilesToTransfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedFilesToTransfer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedFilesToTransfer")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludes(value: FilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excludes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excludes")(js.undefined)
        ret
    }
    @scala.inline
    def withFilesTransferred(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilesTransferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilesTransferred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilesTransferred")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludes(value: FilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Includes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Includes")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: TaskExecutionResultDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Result")(js.undefined)
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
    def withStatus(value: TaskExecutionStatus): Self = {
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
    @scala.inline
    def withTaskExecutionArn(value: TaskExecutionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskExecutionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskExecutionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskExecutionArn")(js.undefined)
        ret
    }
  }
  
}

