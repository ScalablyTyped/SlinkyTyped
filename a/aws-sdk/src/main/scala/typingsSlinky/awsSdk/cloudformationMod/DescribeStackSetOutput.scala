package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackSetOutput extends js.Object {
  /**
    * The specified stack set.
    */
  var StackSet: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackSet] = js.native
}

object DescribeStackSetOutput {
  @scala.inline
  def apply(): DescribeStackSetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackSetOutput]
  }
  @scala.inline
  implicit class DescribeStackSetOutputOps[Self <: DescribeStackSetOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackSet(value: StackSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSet")(js.undefined)
        ret
    }
  }
  
}

