package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeImportSnapshotTasksResult extends js.Object {
  /**
    * A list of zero or more import snapshot tasks that are currently active or were completed or canceled in the previous 7 days.
    */
  var ImportSnapshotTasks: js.UndefOr[ImportSnapshotTaskList] = js.native
  /**
    * The token to use to get the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeImportSnapshotTasksResult {
  @scala.inline
  def apply(): DescribeImportSnapshotTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImportSnapshotTasksResult]
  }
  @scala.inline
  implicit class DescribeImportSnapshotTasksResultOps[Self <: DescribeImportSnapshotTasksResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportSnapshotTasks(value: ImportSnapshotTaskList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportSnapshotTasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportSnapshotTasks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportSnapshotTasks")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
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

