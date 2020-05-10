package typingsSlinky.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHumanLoopRequest extends js.Object {
  /**
    * The unique name of the human loop.
    */
  var HumanLoopName: typingsSlinky.awsSdk.augmentedairuntimeMod.HumanLoopName = js.native
}

object DescribeHumanLoopRequest {
  @scala.inline
  def apply(HumanLoopName: HumanLoopName): DescribeHumanLoopRequest = {
    val __obj = js.Dynamic.literal(HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHumanLoopRequest]
  }
  @scala.inline
  implicit class DescribeHumanLoopRequestOps[Self <: DescribeHumanLoopRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHumanLoopName(value: HumanLoopName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

