package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackResourceOutput extends js.Object {
  /**
    * A StackResourceDetail structure containing the description of the specified resource in the specified stack.
    */
  var StackResourceDetail: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackResourceDetail] = js.native
}

object DescribeStackResourceOutput {
  @scala.inline
  def apply(): DescribeStackResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackResourceOutput]
  }
  @scala.inline
  implicit class DescribeStackResourceOutputOps[Self <: DescribeStackResourceOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackResourceDetail(value: StackResourceDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackResourceDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackResourceDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackResourceDetail")(js.undefined)
        ret
    }
  }
  
}

