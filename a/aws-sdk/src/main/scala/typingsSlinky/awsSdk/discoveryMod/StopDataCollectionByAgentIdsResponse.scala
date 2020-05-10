package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDataCollectionByAgentIdsResponse extends js.Object {
  /**
    * Information about the agents or connector that were instructed to stop collecting data. Information includes the agent/connector ID, a description of the operation performed, and whether the agent/connector configuration was updated.
    */
  var agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList] = js.native
}

object StopDataCollectionByAgentIdsResponse {
  @scala.inline
  def apply(): StopDataCollectionByAgentIdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopDataCollectionByAgentIdsResponse]
  }
  @scala.inline
  implicit class StopDataCollectionByAgentIdsResponseOps[Self <: StopDataCollectionByAgentIdsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentsConfigurationStatus(value: AgentConfigurationStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentsConfigurationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentsConfigurationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentsConfigurationStatus")(js.undefined)
        ret
    }
  }
  
}

