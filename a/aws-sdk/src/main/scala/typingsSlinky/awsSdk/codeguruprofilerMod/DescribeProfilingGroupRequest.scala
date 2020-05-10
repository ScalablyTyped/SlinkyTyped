package typingsSlinky.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProfilingGroupRequest extends js.Object {
  /**
    * The profiling group name.
    */
  var profilingGroupName: ProfilingGroupName = js.native
}

object DescribeProfilingGroupRequest {
  @scala.inline
  def apply(profilingGroupName: ProfilingGroupName): DescribeProfilingGroupRequest = {
    val __obj = js.Dynamic.literal(profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProfilingGroupRequest]
  }
  @scala.inline
  implicit class DescribeProfilingGroupRequestOps[Self <: DescribeProfilingGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProfilingGroupName(value: ProfilingGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

