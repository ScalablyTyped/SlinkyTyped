package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndPointStateOutput extends js.Object {
  /**
    * Information about the health of the instances.
    */
  var InstanceStates: js.UndefOr[typingsSlinky.awsSdk.elbMod.InstanceStates] = js.native
}

object DescribeEndPointStateOutput {
  @scala.inline
  def apply(): DescribeEndPointStateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndPointStateOutput]
  }
  @scala.inline
  implicit class DescribeEndPointStateOutputOps[Self <: DescribeEndPointStateOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceStates(value: InstanceStates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceStates")(js.undefined)
        ret
    }
  }
  
}

