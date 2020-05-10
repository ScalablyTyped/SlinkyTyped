package typingsSlinky.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentConfiguration extends js.Object {
  /**
    * Indicates the phone number that should be dialed to connect the agent to their inbound or outbound calls when softphone is not enabled.
    */
  var extension: String = js.native
  /**
    * The agent's user friendly display name.
    */
  var name: String = js.native
  /**
    * Describes the agent's current routing profile and list of queues therein. See agent.getRoutingProfile() for more info.
    */
  var routingProfile: AgentRoutingProfile = js.native
  /**
    * Indicates whether the agent's phone calls should route to the agent's browser-based softphone or the telephone number configured as the agent's extension.
    */
  var softphoneEnabled: Boolean = js.native
  /**
    * The username for the agent as entered in their Amazon Connect user account.
    */
  var username: String = js.native
}

object AgentConfiguration {
  @scala.inline
  def apply(
    extension: String,
    name: String,
    routingProfile: AgentRoutingProfile,
    softphoneEnabled: Boolean,
    username: String
  ): AgentConfiguration = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], routingProfile = routingProfile.asInstanceOf[js.Any], softphoneEnabled = softphoneEnabled.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentConfiguration]
  }
  @scala.inline
  implicit class AgentConfigurationOps[Self <: AgentConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutingProfile(value: AgentRoutingProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoftphoneEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softphoneEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

