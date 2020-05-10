package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelExportTaskRequest extends js.Object {
  /**
    * The ID of the export task. This is the ID returned by CreateInstanceExportTask.
    */
  var ExportTaskId: ExportVmTaskId = js.native
}

object CancelExportTaskRequest {
  @scala.inline
  def apply(ExportTaskId: ExportVmTaskId): CancelExportTaskRequest = {
    val __obj = js.Dynamic.literal(ExportTaskId = ExportTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelExportTaskRequest]
  }
  @scala.inline
  implicit class CancelExportTaskRequestOps[Self <: CancelExportTaskRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportTaskId(value: ExportVmTaskId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportTaskId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

