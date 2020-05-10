package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStacksResult extends js.Object {
  /**
    * An array of Stack objects that describe the stacks.
    */
  var Stacks: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.Stacks] = js.native
}

object DescribeStacksResult {
  @scala.inline
  def apply(): DescribeStacksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStacksResult]
  }
  @scala.inline
  implicit class DescribeStacksResultOps[Self <: DescribeStacksResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStacks(value: Stacks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stacks")(js.undefined)
        ret
    }
  }
  
}

