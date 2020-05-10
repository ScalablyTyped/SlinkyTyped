package typingsSlinky.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureAgentRequest extends js.Object {
  /**
    * 
    */
  var fleetInstanceId: js.UndefOr[FleetInstanceId] = js.native
  /**
    * 
    */
  var profilingGroupName: ProfilingGroupName = js.native
}

object ConfigureAgentRequest {
  @scala.inline
  def apply(profilingGroupName: ProfilingGroupName): ConfigureAgentRequest = {
    val __obj = js.Dynamic.literal(profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureAgentRequest]
  }
  @scala.inline
  implicit class ConfigureAgentRequestOps[Self <: ConfigureAgentRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withFleetInstanceId(value: FleetInstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fleetInstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fleetInstanceId")(js.undefined)
        ret
    }
  }
  
}

