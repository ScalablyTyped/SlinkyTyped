package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTaskRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that is used to monitor and log events in the task.  For more information on these groups, see Working with Log Groups and Log Streams in the Amazon CloudWatch User Guide.  For more information about how to use CloudWatch Logs with DataSync, see Monitoring Your Task in the AWS DataSync User Guide. 
    */
  var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.native
  /**
    * The Amazon Resource Name (ARN) of an AWS storage resource's location. 
    */
  var DestinationLocationArn: LocationArn = js.native
  /**
    * A list of filter rules that determines which files to exclude from a task. The list should contain a single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for example, "/folder1|/folder2"   
    */
  var Excludes: js.UndefOr[FilterList] = js.native
  /**
    * The name of a task. This value is a text reference that is used to identify the task in the console. 
    */
  var Name: js.UndefOr[TagValue] = js.native
  /**
    * The set of configuration options that control the behavior of a single execution of the task that occurs when you call StartTaskExecution. You can configure these options to preserve metadata such as user ID (UID) and group ID (GID), file permissions, data integrity verification, and so on. For each individual task execution, you can override these options by specifying the OverrideOptions before starting a the task execution. For more information, see the operation. 
    */
  var Options: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.Options] = js.native
  /**
    * Specifies a schedule used to periodically transfer files from a source to a destination location. The schedule should be specified in UTC time. For more information, see task-scheduling.
    */
  var Schedule: js.UndefOr[TaskSchedule] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source location for the task.
    */
  var SourceLocationArn: LocationArn = js.native
  /**
    * The key-value pair that represents the tag that you want to add to the resource. The value can be an empty string. 
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateTaskRequest {
  @scala.inline
  def apply(DestinationLocationArn: LocationArn, SourceLocationArn: LocationArn): CreateTaskRequest = {
    val __obj = js.Dynamic.literal(DestinationLocationArn = DestinationLocationArn.asInstanceOf[js.Any], SourceLocationArn = SourceLocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaskRequest]
  }
  @scala.inline
  implicit class CreateTaskRequestOps[Self <: CreateTaskRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationLocationArn(value: LocationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationLocationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceLocationArn(value: LocationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceLocationArn")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

