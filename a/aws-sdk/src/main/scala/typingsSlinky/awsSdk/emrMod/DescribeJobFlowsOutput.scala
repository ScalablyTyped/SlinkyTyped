package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobFlowsOutput extends js.Object {
  /**
    * A list of job flows matching the parameters supplied.
    */
  var JobFlows: js.UndefOr[JobFlowDetailList] = js.native
}

object DescribeJobFlowsOutput {
  @scala.inline
  def apply(): DescribeJobFlowsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobFlowsOutput]
  }
  @scala.inline
  implicit class DescribeJobFlowsOutputOps[Self <: DescribeJobFlowsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobFlows(value: JobFlowDetailList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobFlows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobFlows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobFlows")(js.undefined)
        ret
    }
  }
  
}

