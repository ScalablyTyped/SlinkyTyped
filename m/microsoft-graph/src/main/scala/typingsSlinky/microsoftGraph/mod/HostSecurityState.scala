package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostSecurityState extends js.Object {
  // Host FQDN (Fully Qualified Domain Name) (for example, machine.company.com).
  var fqdn: js.UndefOr[String] = js.native
  var isAzureAdJoined: js.UndefOr[Boolean] = js.native
  var isAzureAdRegistered: js.UndefOr[Boolean] = js.native
  // True if the host is domain joined to an on-premises Active Directory domain.
  var isHybridAzureDomainJoined: js.UndefOr[Boolean] = js.native
  // The local host name, without the DNS domain name.
  var netBiosName: js.UndefOr[String] = js.native
  // Host Operating System. (For example, Windows10, MacOS, RHEL, etc.).
  var os: js.UndefOr[String] = js.native
  // Private (not routable) IPv4 or IPv6 address (see RFC 1918) at the time of the alert.
  var privateIpAddress: js.UndefOr[String] = js.native
  // Publicly routable IPv4 or IPv6 address (see RFC 1918) at time of the alert.
  var publicIpAddress: js.UndefOr[String] = js.native
  // Provider-generated/calculated risk score of the host. Recommended value range of 0-1, which equates to a percentage.
  var riskScore: js.UndefOr[String] = js.native
}

object HostSecurityState {
  @scala.inline
  def apply(): HostSecurityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostSecurityState]
  }
  @scala.inline
  implicit class HostSecurityStateOps[Self <: HostSecurityState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFqdn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fqdn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFqdn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fqdn")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAzureAdJoined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAzureAdJoined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAzureAdJoined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAzureAdJoined")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAzureAdRegistered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAzureAdRegistered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAzureAdRegistered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAzureAdRegistered")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHybridAzureDomainJoined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHybridAzureDomainJoined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHybridAzureDomainJoined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHybridAzureDomainJoined")(js.undefined)
        ret
    }
    @scala.inline
    def withNetBiosName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netBiosName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetBiosName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netBiosName")(js.undefined)
        ret
    }
    @scala.inline
    def withOs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withRiskScore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiskScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskScore")(js.undefined)
        ret
    }
  }
  
}

