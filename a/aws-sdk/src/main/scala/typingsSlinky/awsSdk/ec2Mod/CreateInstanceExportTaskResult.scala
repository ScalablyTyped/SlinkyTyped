package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstanceExportTaskResult extends js.Object {
  /**
    * Information about the instance export task.
    */
  var ExportTask: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ExportTask] = js.native
}

object CreateInstanceExportTaskResult {
  @scala.inline
  def apply(): CreateInstanceExportTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceExportTaskResult]
  }
  @scala.inline
  implicit class CreateInstanceExportTaskResultOps[Self <: CreateInstanceExportTaskResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportTask(value: ExportTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportTask")(js.undefined)
        ret
    }
  }
  
}

