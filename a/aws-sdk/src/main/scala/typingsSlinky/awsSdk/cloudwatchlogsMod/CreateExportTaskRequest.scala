package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateExportTaskRequest extends js.Object {
  /**
    * The name of S3 bucket for the exported log data. The bucket must be in the same AWS region.
    */
  var destination: ExportDestinationBucket = js.native
  /**
    * The prefix used as the start of the key for every object exported. If you don't specify a value, the default is exportedlogs.
    */
  var destinationPrefix: js.UndefOr[ExportDestinationPrefix] = js.native
  /**
    * The start time of the range for the request, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp earlier than this time are not exported.
    */
  var from: Timestamp = js.native
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
  /**
    * Export only log streams that match the provided prefix. If you don't specify a value, no prefix filter is applied.
    */
  var logStreamNamePrefix: js.UndefOr[LogStreamName] = js.native
  /**
    * The name of the export task.
    */
  var taskName: js.UndefOr[ExportTaskName] = js.native
  /**
    * The end time of the range for the request, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp later than this time are not exported.
    */
  var to: Timestamp = js.native
}

object CreateExportTaskRequest {
  @scala.inline
  def apply(destination: ExportDestinationBucket, from: Timestamp, logGroupName: LogGroupName, to: Timestamp): CreateExportTaskRequest = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExportTaskRequest]
  }
  @scala.inline
  implicit class CreateExportTaskRequestOps[Self <: CreateExportTaskRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: ExportDestinationBucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogGroupName(value: LogGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationPrefix(value: ExportDestinationPrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withLogStreamNamePrefix(value: LogStreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamNamePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogStreamNamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamNamePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskName(value: ExportTaskName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskName")(js.undefined)
        ret
    }
  }
  
}

