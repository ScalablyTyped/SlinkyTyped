package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateClientVpnConnectionsResult extends js.Object {
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  /**
    * The current state of the client connections.
    */
  var ConnectionStatuses: js.UndefOr[TerminateConnectionStatusSet] = js.native
  /**
    * The user who established the terminated client connections.
    */
  var Username: js.UndefOr[String] = js.native
}

object TerminateClientVpnConnectionsResult {
  @scala.inline
  def apply(): TerminateClientVpnConnectionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateClientVpnConnectionsResult]
  }
  @scala.inline
  implicit class TerminateClientVpnConnectionsResultOps[Self <: TerminateClientVpnConnectionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientVpnEndpointId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientVpnEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientVpnEndpointId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientVpnEndpointId")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionStatuses(value: TerminateConnectionStatusSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(js.undefined)
        ret
    }
  }
  
}

