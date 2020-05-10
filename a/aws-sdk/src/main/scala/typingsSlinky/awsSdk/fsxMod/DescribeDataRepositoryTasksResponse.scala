package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDataRepositoryTasksResponse extends js.Object {
  /**
    * The collection of data repository task descriptions returned.
    */
  var DataRepositoryTasks: js.UndefOr[typingsSlinky.awsSdk.fsxMod.DataRepositoryTasks] = js.native
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.fsxMod.NextToken] = js.native
}

object DescribeDataRepositoryTasksResponse {
  @scala.inline
  def apply(): DescribeDataRepositoryTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataRepositoryTasksResponse]
  }
  @scala.inline
  implicit class DescribeDataRepositoryTasksResponseOps[Self <: DescribeDataRepositoryTasksResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataRepositoryTasks(value: DataRepositoryTasks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataRepositoryTasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataRepositoryTasks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataRepositoryTasks")(js.undefined)
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
  }
  
}

