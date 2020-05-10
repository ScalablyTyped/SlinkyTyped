package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExportTasksResult extends js.Object {
  /**
    * Information about the export tasks.
    */
  var ExportTasks: js.UndefOr[ExportTaskList] = js.native
}

object DescribeExportTasksResult {
  @scala.inline
  def apply(): DescribeExportTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportTasksResult]
  }
  @scala.inline
  implicit class DescribeExportTasksResultOps[Self <: DescribeExportTasksResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportTasks(value: ExportTaskList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportTasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportTasks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportTasks")(js.undefined)
        ret
    }
  }
  
}

