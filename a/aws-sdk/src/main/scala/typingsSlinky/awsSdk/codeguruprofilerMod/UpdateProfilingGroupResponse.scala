package typingsSlinky.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProfilingGroupResponse extends js.Object {
  /**
    * Updated information about the profiling group.
    */
  var profilingGroup: ProfilingGroupDescription = js.native
}

object UpdateProfilingGroupResponse {
  @scala.inline
  def apply(profilingGroup: ProfilingGroupDescription): UpdateProfilingGroupResponse = {
    val __obj = js.Dynamic.literal(profilingGroup = profilingGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProfilingGroupResponse]
  }
  @scala.inline
  implicit class UpdateProfilingGroupResponseOps[Self <: UpdateProfilingGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProfilingGroup(value: ProfilingGroupDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilingGroup")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

