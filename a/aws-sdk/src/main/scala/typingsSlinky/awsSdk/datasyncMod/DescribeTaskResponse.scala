package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTaskResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that was used to monitor and log events in the task. For more information on these groups, see Working with Log Groups and Log Streams in the Amazon CloudWatch User Guide.
    */
  var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.native
  /**
    * The time that the task was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task execution that is syncing files.
    */
  var CurrentTaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS storage resource's location.
    */
  var DestinationLocationArn: js.UndefOr[LocationArn] = js.native
  /**
    * The Amazon Resource Name (ARN) of the destination ENIs (Elastic Network Interface) that was created for your subnet.
    */
  var DestinationNetworkInterfaceArns: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.DestinationNetworkInterfaceArns] = js.native
  /**
    * Errors that AWS DataSync encountered during execution of the task. You can use this error code to help troubleshoot issues.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  /**
    * Detailed description of an error that was encountered during the task execution. You can use this information to help troubleshoot issues. 
    */
  var ErrorDetail: js.UndefOr[String] = js.native
  /**
    * A list of filter rules that determines which files to exclude from a task. The list should contain a single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for example: "/folder1|/folder2"   
    */
  var Excludes: js.UndefOr[FilterList] = js.native
  /**
    * The name of the task that was described.
    */
  var Name: js.UndefOr[TagValue] = js.native
  /**
    * The set of configuration options that control the behavior of a single execution of the task that occurs when you call StartTaskExecution. You can configure these options to preserve metadata such as user ID (UID) and group (GID), file permissions, data integrity verification, and so on. For each individual task execution, you can override these options by specifying the overriding OverrideOptions value to operation. 
    */
  var Options: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.Options] = js.native
  /**
    * The schedule used to periodically transfer files from a source to a destination location.
    */
  var Schedule: js.UndefOr[TaskSchedule] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source file system's location.
    */
  var SourceLocationArn: js.UndefOr[LocationArn] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source ENIs (Elastic Network Interface) that was created for your subnet.
    */
  var SourceNetworkInterfaceArns: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.SourceNetworkInterfaceArns] = js.native
  /**
    * The status of the task that was described. For detailed information about task execution statuses, see Understanding Task Statuses in the AWS DataSync User Guide. 
    */
  var Status: js.UndefOr[TaskStatus] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task that was described.
    */
  var TaskArn: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.TaskArn] = js.native
}

object DescribeTaskResponse {
  @scala.inline
  def apply(): DescribeTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTaskResponse]
  }
  @scala.inline
  implicit class DescribeTaskResponseOps[Self <: DescribeTaskResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudWatchLogGroupArn(value: LogGroupArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLogGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentTaskExecutionArn(value: TaskExecutionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentTaskExecutionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentTaskExecutionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentTaskExecutionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationLocationArn(value: LocationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationLocationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationLocationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationLocationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationNetworkInterfaceArns(value: DestinationNetworkInterfaceArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationNetworkInterfaceArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationNetworkInterfaceArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationNetworkInterfaceArns")(js.undefined)
        ret
    }
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
    def withName(value: TagValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
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
    def withSchedule(value: TaskSchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceLocationArn(value: LocationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceLocationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceLocationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceLocationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceNetworkInterfaceArns(value: SourceNetworkInterfaceArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceNetworkInterfaceArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceNetworkInterfaceArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceNetworkInterfaceArns")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: TaskStatus): Self = {
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
    def withTaskArn(value: TaskArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskArn")(js.undefined)
        ret
    }
  }
  
}

