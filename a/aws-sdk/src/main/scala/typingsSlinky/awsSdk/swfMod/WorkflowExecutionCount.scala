package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionCount extends js.Object {
  /**
    * The number of workflow executions.
    */
  var count: Count = js.native
  /**
    * If set to true, indicates that the actual count was more than the maximum supported by this API and the count returned is the truncated value.
    */
  var truncated: js.UndefOr[Truncated] = js.native
}

object WorkflowExecutionCount {
  @scala.inline
  def apply(count: Count): WorkflowExecutionCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionCount]
  }
  @scala.inline
  implicit class WorkflowExecutionCountOps[Self <: WorkflowExecutionCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTruncated(value: Truncated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncated")(js.undefined)
        ret
    }
  }
  
}

