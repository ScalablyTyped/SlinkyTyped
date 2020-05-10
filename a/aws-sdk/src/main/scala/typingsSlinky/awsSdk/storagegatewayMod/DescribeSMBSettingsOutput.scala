package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSMBSettingsOutput extends js.Object {
  /**
    * Indicates the status of a gateway that is a member of the Active Directory domain.   ACCESS_DENIED: Indicates that the JoinDomain operation failed due to an authentication error.   DETACHED: Indicates that gateway is not joined to a domain.   JOINED: Indicates that the gateway has successfully joined a domain.   JOINING: Indicates that a JoinDomain operation is in progress.   NETWORK_ERROR: Indicates that JoinDomain operation failed due to a network or connectivity error.   TIMEOUT: Indicates that the JoinDomain operation failed because the operation didn't complete within the allotted time.   UNKNOWN_ERROR: Indicates that the JoinDomain operation failed due to another type of error.  
    */
  var ActiveDirectoryStatus: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.ActiveDirectoryStatus] = js.native
  /**
    * The name of the domain that the gateway is joined to.
    */
  var DomainName: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.DomainName] = js.native
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * This value is true if a password for the guest user “smbguest” is set, and otherwise false.
    */
  var SMBGuestPasswordSet: js.UndefOr[Boolean] = js.native
  /**
    * The type of security strategy that was specified for file gateway. ClientSpecified: if you use this option, requests are established based on what is negotiated by the client. This option is recommended when you want to maximize compatibility across different clients in your environment.  MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients that have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server 2008 or newer.  MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that have encryption enabled. This option is highly recommended for environments that handle sensitive data. This option works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer. 
    */
  var SMBSecurityStrategy: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.SMBSecurityStrategy] = js.native
}

object DescribeSMBSettingsOutput {
  @scala.inline
  def apply(): DescribeSMBSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSMBSettingsOutput]
  }
  @scala.inline
  implicit class DescribeSMBSettingsOutputOps[Self <: DescribeSMBSettingsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveDirectoryStatus(value: ActiveDirectoryStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveDirectoryStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveDirectoryStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveDirectoryStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayARN(value: GatewayARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(js.undefined)
        ret
    }
    @scala.inline
    def withSMBGuestPasswordSet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMBGuestPasswordSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSMBGuestPasswordSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMBGuestPasswordSet")(js.undefined)
        ret
    }
    @scala.inline
    def withSMBSecurityStrategy(value: SMBSecurityStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMBSecurityStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSMBSecurityStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMBSecurityStrategy")(js.undefined)
        ret
    }
  }
  
}

