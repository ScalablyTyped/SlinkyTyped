package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStacksRequest extends js.Object {
  /**
    * An array of stack IDs that specify the stacks to be described. If you omit this parameter, DescribeStacks returns a description of every stack.
    */
  var StackIds: js.UndefOr[Strings] = js.native
}

object DescribeStacksRequest {
  @scala.inline
  def apply(): DescribeStacksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStacksRequest]
  }
  @scala.inline
  implicit class DescribeStacksRequestOps[Self <: DescribeStacksRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackIds(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackIds")(js.undefined)
        ret
    }
  }
  
}

