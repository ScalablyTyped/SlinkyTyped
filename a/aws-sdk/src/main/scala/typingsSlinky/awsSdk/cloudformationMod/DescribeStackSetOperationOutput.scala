package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackSetOperationOutput extends js.Object {
  /**
    * The specified stack set operation.
    */
  var StackSetOperation: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackSetOperation] = js.native
}

object DescribeStackSetOperationOutput {
  @scala.inline
  def apply(): DescribeStackSetOperationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackSetOperationOutput]
  }
  @scala.inline
  implicit class DescribeStackSetOperationOutputOps[Self <: DescribeStackSetOperationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackSetOperation(value: StackSetOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSetOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetOperation")(js.undefined)
        ret
    }
  }
  
}

