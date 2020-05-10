package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDataRepositoryTasksRequest extends js.Object {
  /**
    * (Optional) You can use filters to narrow the DescribeDataRepositoryTasks response to include just tasks for specific file systems, or tasks in a specific lifecycle state.
    */
  var Filters: js.UndefOr[DataRepositoryTaskFilters] = js.native
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.fsxMod.MaxResults] = js.native
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.fsxMod.NextToken] = js.native
  /**
    * (Optional) IDs of the tasks whose descriptions you want to retrieve (String).
    */
  var TaskIds: js.UndefOr[typingsSlinky.awsSdk.fsxMod.TaskIds] = js.native
}

object DescribeDataRepositoryTasksRequest {
  @scala.inline
  def apply(): DescribeDataRepositoryTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataRepositoryTasksRequest]
  }
  @scala.inline
  implicit class DescribeDataRepositoryTasksRequestOps[Self <: DescribeDataRepositoryTasksRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: DataRepositoryTaskFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskIds(value: TaskIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TaskIds")(js.undefined)
        ret
    }
  }
  
}

