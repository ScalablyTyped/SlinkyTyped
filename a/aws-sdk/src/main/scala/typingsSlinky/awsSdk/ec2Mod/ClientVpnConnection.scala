package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientVpnConnection extends js.Object {
  /**
    * The IP address of the client.
    */
  var ClientIp: js.UndefOr[String] = js.native
  /**
    * The ID of the Client VPN endpoint to which the client is connected.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  /**
    * The common name associated with the client. This is either the name of the client certificate, or the Active Directory user name.
    */
  var CommonName: js.UndefOr[String] = js.native
  /**
    * The date and time the client connection was terminated.
    */
  var ConnectionEndTime: js.UndefOr[String] = js.native
  /**
    * The date and time the client connection was established.
    */
  var ConnectionEstablishedTime: js.UndefOr[String] = js.native
  /**
    * The ID of the client connection.
    */
  var ConnectionId: js.UndefOr[String] = js.native
  /**
    * The number of bytes received by the client.
    */
  var EgressBytes: js.UndefOr[String] = js.native
  /**
    * The number of packets received by the client.
    */
  var EgressPackets: js.UndefOr[String] = js.native
  /**
    * The number of bytes sent by the client.
    */
  var IngressBytes: js.UndefOr[String] = js.native
  /**
    * The number of packets sent by the client.
    */
  var IngressPackets: js.UndefOr[String] = js.native
  /**
    * The current state of the client connection.
    */
  var Status: js.UndefOr[ClientVpnConnectionStatus] = js.native
  /**
    * The current date and time.
    */
  var Timestamp: js.UndefOr[String] = js.native
  /**
    * The username of the client who established the client connection. This information is only provided if Active Directory client authentication is used.
    */
  var Username: js.UndefOr[String] = js.native
}

object ClientVpnConnection {
  @scala.inline
  def apply(): ClientVpnConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnConnection]
  }
  @scala.inline
  implicit class ClientVpnConnectionOps[Self <: ClientVpnConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientIp")(js.undefined)
        ret
    }
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
    def withCommonName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonName")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionEstablishedTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionEstablishedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionEstablishedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionEstablishedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionId")(js.undefined)
        ret
    }
    @scala.inline
    def withEgressBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EgressBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEgressBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EgressBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withEgressPackets(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EgressPackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEgressPackets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EgressPackets")(js.undefined)
        ret
    }
    @scala.inline
    def withIngressBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngressBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIngressBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngressBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withIngressPackets(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngressPackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIngressPackets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngressPackets")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ClientVpnConnectionStatus): Self = {
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
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(js.undefined)
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

