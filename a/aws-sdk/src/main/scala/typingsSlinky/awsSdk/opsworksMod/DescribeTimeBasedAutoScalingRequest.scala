package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTimeBasedAutoScalingRequest extends js.Object {
  /**
    * An array of instance IDs.
    */
  var InstanceIds: Strings = js.native
}

object DescribeTimeBasedAutoScalingRequest {
  @scala.inline
  def apply(InstanceIds: Strings): DescribeTimeBasedAutoScalingRequest = {
    val __obj = js.Dynamic.literal(InstanceIds = InstanceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTimeBasedAutoScalingRequest]
  }
  @scala.inline
  implicit class DescribeTimeBasedAutoScalingRequestOps[Self <: DescribeTimeBasedAutoScalingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceIds(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

