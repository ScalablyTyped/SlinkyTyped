package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentInfo extends js.Object {
  /**
    * The agent or connector ID.
    */
  var agentId: js.UndefOr[AgentId] = js.native
  /**
    * Network details about the host where the agent or connector resides.
    */
  var agentNetworkInfoList: js.UndefOr[AgentNetworkInfoList] = js.native
  /**
    * Type of agent.
    */
  var agentType: js.UndefOr[String] = js.native
  /**
    * Status of the collection process for an agent or connector.
    */
  var collectionStatus: js.UndefOr[String] = js.native
  /**
    * The ID of the connector.
    */
  var connectorId: js.UndefOr[String] = js.native
  /**
    * The health of the agent or connector.
    */
  var health: js.UndefOr[AgentStatus] = js.native
  /**
    * The name of the host where the agent or connector resides. The host can be a server or virtual machine.
    */
  var hostName: js.UndefOr[String] = js.native
  /**
    * Time since agent or connector health was reported.
    */
  var lastHealthPingTime: js.UndefOr[String] = js.native
  /**
    * Agent's first registration timestamp in UTC.
    */
  var registeredTime: js.UndefOr[String] = js.native
  /**
    * The agent or connector version.
    */
  var version: js.UndefOr[String] = js.native
}

object AgentInfo {
  @scala.inline
  def apply(): AgentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentInfo]
  }
  @scala.inline
  implicit class AgentInfoOps[Self <: AgentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentId(value: AgentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentId")(js.undefined)
        ret
    }
    @scala.inline
    def withAgentNetworkInfoList(value: AgentNetworkInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentNetworkInfoList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentNetworkInfoList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentNetworkInfoList")(js.undefined)
        ret
    }
    @scala.inline
    def withAgentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentType")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectionStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorId")(js.undefined)
        ret
    }
    @scala.inline
    def withHealth(value: AgentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("health")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("health")(js.undefined)
        ret
    }
    @scala.inline
    def withHostName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostName")(js.undefined)
        ret
    }
    @scala.inline
    def withLastHealthPingTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastHealthPingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastHealthPingTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastHealthPingTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisteredTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisteredTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredTime")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

