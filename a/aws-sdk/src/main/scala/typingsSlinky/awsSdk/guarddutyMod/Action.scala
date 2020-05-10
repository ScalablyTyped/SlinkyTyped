package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  /**
    * GuardDuty Finding activity type.
    */
  var ActionType: js.UndefOr[String] = js.native
  /**
    * Information about the AWS_API_CALL action described in this finding.
    */
  var AwsApiCallAction: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.AwsApiCallAction] = js.native
  /**
    * Information about the DNS_REQUEST action described in this finding.
    */
  var DnsRequestAction: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.DnsRequestAction] = js.native
  /**
    * Information about the NETWORK_CONNECTION action described in this finding.
    */
  var NetworkConnectionAction: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.NetworkConnectionAction] = js.native
  /**
    * Information about the PORT_PROBE action described in this finding.
    */
  var PortProbeAction: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.PortProbeAction] = js.native
}

object Action {
  @scala.inline
  def apply(): Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionType")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsApiCallAction(value: AwsApiCallAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsApiCallAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsApiCallAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsApiCallAction")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsRequestAction(value: DnsRequestAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsRequestAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsRequestAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsRequestAction")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkConnectionAction(value: NetworkConnectionAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkConnectionAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkConnectionAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkConnectionAction")(js.undefined)
        ret
    }
    @scala.inline
    def withPortProbeAction(value: PortProbeAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortProbeAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortProbeAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortProbeAction")(js.undefined)
        ret
    }
  }
  
}

