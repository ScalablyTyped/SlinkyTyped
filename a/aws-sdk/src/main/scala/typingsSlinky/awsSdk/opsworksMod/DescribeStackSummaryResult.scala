package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackSummaryResult extends js.Object {
  /**
    * A StackSummary object that contains the results.
    */
  var StackSummary: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.StackSummary] = js.native
}

object DescribeStackSummaryResult {
  @scala.inline
  def apply(): DescribeStackSummaryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackSummaryResult]
  }
  @scala.inline
  implicit class DescribeStackSummaryResultOps[Self <: DescribeStackSummaryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackSummary(value: StackSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSummary")(js.undefined)
        ret
    }
  }
  
}

