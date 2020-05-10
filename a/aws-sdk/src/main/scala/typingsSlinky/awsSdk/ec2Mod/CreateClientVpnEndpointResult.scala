package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClientVpnEndpointResult extends js.Object {
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  /**
    * The DNS name to be used by clients when establishing their VPN session.
    */
  var DnsName: js.UndefOr[String] = js.native
  /**
    * The current state of the Client VPN endpoint.
    */
  var Status: js.UndefOr[ClientVpnEndpointStatus] = js.native
}

object CreateClientVpnEndpointResult {
  @scala.inline
  def apply(): CreateClientVpnEndpointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClientVpnEndpointResult]
  }
  @scala.inline
  implicit class CreateClientVpnEndpointResultOps[Self <: CreateClientVpnEndpointResult] (val x: Self) extends AnyVal {
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
    def withDnsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ClientVpnEndpointStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

