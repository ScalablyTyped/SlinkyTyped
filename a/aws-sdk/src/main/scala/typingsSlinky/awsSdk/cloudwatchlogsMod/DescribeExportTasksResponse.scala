package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExportTasksResponse extends js.Object {
  /**
    * The export tasks.
    */
  var exportTasks: js.UndefOr[ExportTasks] = js.native
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeExportTasksResponse {
  @scala.inline
  def apply(): DescribeExportTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportTasksResponse]
  }
  @scala.inline
  implicit class DescribeExportTasksResponseOps[Self <: DescribeExportTasksResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportTasks(value: ExportTasks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportTasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportTasks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportTasks")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

