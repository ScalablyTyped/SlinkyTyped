package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportTask extends js.Object {
  /**
    * A description of the resource being exported.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the export task.
    */
  var ExportTaskId: js.UndefOr[String] = js.native
  /**
    * Information about the export task.
    */
  var ExportToS3Task: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ExportToS3Task] = js.native
  /**
    * Information about the instance to export.
    */
  var InstanceExportDetails: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceExportDetails] = js.native
  /**
    * The state of the export task.
    */
  var State: js.UndefOr[ExportTaskState] = js.native
  /**
    * The status message related to the export task.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * The tags for the export task.
    */
  var Tags: js.UndefOr[TagList] = js.native
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withExportTaskId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportTaskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportTaskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportTaskId")(js.undefined)
        ret
    }
    @scala.inline
    def withExportToS3Task(value: ExportToS3Task): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportToS3Task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportToS3Task: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportToS3Task")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceExportDetails(value: InstanceExportDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceExportDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceExportDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceExportDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ExportTaskState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
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

