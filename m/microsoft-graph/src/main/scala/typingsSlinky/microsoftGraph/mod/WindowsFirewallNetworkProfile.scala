package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsFirewallNetworkProfile extends js.Object {
  /**
    * Configures the firewall to merge authorized application rules from group policy with those from local store instead of
    * ignoring the local store rules. When AuthorizedApplicationRulesFromGroupPolicyNotMerged and
    * AuthorizedApplicationRulesFromGroupPolicyMerged are both true, AuthorizedApplicationRulesFromGroupPolicyMerged takes
    * priority.
    */
  var authorizedApplicationRulesFromGroupPolicyMerged: js.UndefOr[Boolean] = js.native
  /**
    * Configures the firewall to merge connection security rules from group policy with those from local store instead of
    * ignoring the local store rules. When ConnectionSecurityRulesFromGroupPolicyNotMerged and
    * ConnectionSecurityRulesFromGroupPolicyMerged are both true, ConnectionSecurityRulesFromGroupPolicyMerged takes
    * priority.
    */
  var connectionSecurityRulesFromGroupPolicyMerged: js.UndefOr[Boolean] = js.native
  /**
    * Configures the host device to allow or block the firewall and advanced security enforcement for the network profile.
    * Possible values are: notConfigured, blocked, allowed.
    */
  var firewallEnabled: js.UndefOr[StateManagementSetting] = js.native
  /**
    * Configures the firewall to merge global port rules from group policy with those from local store instead of ignoring
    * the local store rules. When GlobalPortRulesFromGroupPolicyNotMerged and GlobalPortRulesFromGroupPolicyMerged are both
    * true, GlobalPortRulesFromGroupPolicyMerged takes priority.
    */
  var globalPortRulesFromGroupPolicyMerged: js.UndefOr[Boolean] = js.native
  /**
    * Configures the firewall to block all incoming connections by default. When InboundConnectionsRequired and
    * InboundConnectionsBlocked are both true, InboundConnectionsBlocked takes priority.
    */
  var inboundConnectionsBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Prevents the firewall from displaying notifications when an application is blocked from listening on a port. When
    * InboundNotificationsRequired and InboundNotificationsBlocked are both true, InboundNotificationsBlocked takes priority.
    */
  var inboundNotificationsBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Configures the firewall to block all incoming traffic regardless of other policy settings. When IncomingTrafficRequired
    * and IncomingTrafficBlocked are both true, IncomingTrafficBlocked takes priority.
    */
  var incomingTrafficBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Configures the firewall to block all outgoing connections by default. When OutboundConnectionsRequired and
    * OutboundConnectionsBlocked are both true, OutboundConnectionsBlocked takes priority. This setting will get applied to
    * Windows releases version 1809 and above.
    */
  var outboundConnectionsBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Configures the firewall to merge Firewall Rule policies from group policy with those from local store instead of
    * ignoring the local store rules. When PolicyRulesFromGroupPolicyNotMerged and PolicyRulesFromGroupPolicyMerged are both
    * true, PolicyRulesFromGroupPolicyMerged takes priority.
    */
  var policyRulesFromGroupPolicyMerged: js.UndefOr[Boolean] = js.native
  /**
    * Configures the firewall to allow the host computer to respond to unsolicited network traffic of that traffic is secured
    * by IPSec even when stealthModeBlocked is set to true. When SecuredPacketExemptionBlocked and
    * SecuredPacketExemptionAllowed are both true, SecuredPacketExemptionAllowed takes priority.
    */
  var securedPacketExemptionAllowed: js.UndefOr[Boolean] = js.native
  /**
    * Prevent the server from operating in stealth mode. When StealthModeRequired and StealthModeBlocked are both true,
    * StealthModeBlocked takes priority.
    */
  var stealthModeBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Configures the firewall to block unicast responses to multicast broadcast traffic. When
    * UnicastResponsesToMulticastBroadcastsRequired and UnicastResponsesToMulticastBroadcastsBlocked are both true,
    * UnicastResponsesToMulticastBroadcastsBlocked takes priority.
    */
  var unicastResponsesToMulticastBroadcastsBlocked: js.UndefOr[Boolean] = js.native
}

object WindowsFirewallNetworkProfile {
  @scala.inline
  def apply(): WindowsFirewallNetworkProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsFirewallNetworkProfile]
  }
  @scala.inline
  implicit class WindowsFirewallNetworkProfileOps[Self <: WindowsFirewallNetworkProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizedApplicationRulesFromGroupPolicyMerged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizedApplicationRulesFromGroupPolicyMerged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizedApplicationRulesFromGroupPolicyMerged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizedApplicationRulesFromGroupPolicyMerged")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionSecurityRulesFromGroupPolicyMerged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionSecurityRulesFromGroupPolicyMerged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionSecurityRulesFromGroupPolicyMerged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionSecurityRulesFromGroupPolicyMerged")(js.undefined)
        ret
    }
    @scala.inline
    def withFirewallEnabled(value: StateManagementSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirewallEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalPortRulesFromGroupPolicyMerged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalPortRulesFromGroupPolicyMerged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalPortRulesFromGroupPolicyMerged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalPortRulesFromGroupPolicyMerged")(js.undefined)
        ret
    }
    @scala.inline
    def withInboundConnectionsBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inboundConnectionsBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInboundConnectionsBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inboundConnectionsBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withInboundNotificationsBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inboundNotificationsBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInboundNotificationsBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inboundNotificationsBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withIncomingTrafficBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomingTrafficBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncomingTrafficBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomingTrafficBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withOutboundConnectionsBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outboundConnectionsBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutboundConnectionsBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outboundConnectionsBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyRulesFromGroupPolicyMerged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyRulesFromGroupPolicyMerged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyRulesFromGroupPolicyMerged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyRulesFromGroupPolicyMerged")(js.undefined)
        ret
    }
    @scala.inline
    def withSecuredPacketExemptionAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securedPacketExemptionAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecuredPacketExemptionAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securedPacketExemptionAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withStealthModeBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stealthModeBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStealthModeBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stealthModeBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withUnicastResponsesToMulticastBroadcastsBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicastResponsesToMulticastBroadcastsBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnicastResponsesToMulticastBroadcastsBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicastResponsesToMulticastBroadcastsBlocked")(js.undefined)
        ret
    }
  }
  
}

