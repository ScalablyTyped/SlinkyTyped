package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTaskSetsResponse extends js.Object {
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.native
  /**
    * The list of task sets described.
    */
  var taskSets: js.UndefOr[TaskSets] = js.native
}

object DescribeTaskSetsResponse {
  @scala.inline
  def apply(): DescribeTaskSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTaskSetsResponse]
  }
  @scala.inline
  implicit class DescribeTaskSetsResponseOps[Self <: DescribeTaskSetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailures(value: Failures): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskSets(value: TaskSets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSets")(js.undefined)
        ret
    }
  }
  
}

