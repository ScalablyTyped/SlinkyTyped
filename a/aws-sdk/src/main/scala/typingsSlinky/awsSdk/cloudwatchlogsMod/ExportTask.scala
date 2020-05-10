package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportTask extends js.Object {
  /**
    * The name of Amazon S3 bucket to which the log data was exported.
    */
  var destination: js.UndefOr[ExportDestinationBucket] = js.native
  /**
    * The prefix that was used as the start of Amazon S3 key for every object exported.
    */
  var destinationPrefix: js.UndefOr[ExportDestinationPrefix] = js.native
  /**
    * Execution info about the export task.
    */
  var executionInfo: js.UndefOr[ExportTaskExecutionInfo] = js.native
  /**
    * The start time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp before this time are not exported.
    */
  var from: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the log group from which logs data was exported.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.native
  /**
    * The status of the export task.
    */
  var status: js.UndefOr[ExportTaskStatus] = js.native
  /**
    * The ID of the export task.
    */
  var taskId: js.UndefOr[ExportTaskId] = js.native
  /**
    * The name of the export task.
    */
  var taskName: js.UndefOr[ExportTaskName] = js.native
  /**
    * The end time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a timestamp later than this time are not exported.
    */
  var to: js.UndefOr[Timestamp] = js.native
}

object ExportTask {
  @scala.inline
  def apply(): ExportTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTask]
  }
  @scala.inline
  implicit class ExportTaskOps[Self <: ExportTask] (val x: Self) extends AnyVal {
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
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
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
    def withExecutionInfo(value: ExportTaskExecutionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withLogGroupName(value: LogGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ExportTaskStatus): Self = {
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
    def withTaskId(value: ExportTaskId): Self = {
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
    @scala.inline
    def withTo(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

