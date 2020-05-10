package typingsSlinky.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProfilingGroupResponse extends js.Object {
  /**
    * Information about the new profiling group
    */
  var profilingGroup: ProfilingGroupDescription = js.native
}

object CreateProfilingGroupResponse {
  @scala.inline
  def apply(profilingGroup: ProfilingGroupDescription): CreateProfilingGroupResponse = {
    val __obj = js.Dynamic.literal(profilingGroup = profilingGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfilingGroupResponse]
  }
  @scala.inline
  implicit class CreateProfilingGroupResponseOps[Self <: CreateProfilingGroupResponse] (val x: Self) extends AnyVal {
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

