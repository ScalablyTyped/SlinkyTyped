package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpnTunnelOptionsSpecification extends js.Object {
  /**
    * The number of seconds after which a DPD timeout occurs. Constraints: A value between 0 and 30. Default: 30 
    */
  var DPDTimeoutSeconds: js.UndefOr[Integer] = js.native
  /**
    * The IKE versions that are permitted for the VPN tunnel. Valid values: ikev1 | ikev2 
    */
  var IKEVersions: js.UndefOr[IKEVersionsRequestList] = js.native
  /**
    * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 1 IKE negotiations. Valid values: 2 | 14 | 15 | 16 | 17 | 18 | 22 | 23 | 24 
    */
  var Phase1DHGroupNumbers: js.UndefOr[Phase1DHGroupNumbersRequestList] = js.native
  /**
    * One or more encryption algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations. Valid values: AES128 | AES256 
    */
  var Phase1EncryptionAlgorithms: js.UndefOr[Phase1EncryptionAlgorithmsRequestList] = js.native
  /**
    * One or more integrity algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations. Valid values: SHA1 | SHA2-256 
    */
  var Phase1IntegrityAlgorithms: js.UndefOr[Phase1IntegrityAlgorithmsRequestList] = js.native
  /**
    * The lifetime for phase 1 of the IKE negotiation, in seconds. Constraints: A value between 900 and 28,800. Default: 28800 
    */
  var Phase1LifetimeSeconds: js.UndefOr[Integer] = js.native
  /**
    * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 2 IKE negotiations. Valid values: 2 | 5 | 14 | 15 | 16 | 17 | 18 | 22 | 23 | 24 
    */
  var Phase2DHGroupNumbers: js.UndefOr[Phase2DHGroupNumbersRequestList] = js.native
  /**
    * One or more encryption algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations. Valid values: AES128 | AES256 
    */
  var Phase2EncryptionAlgorithms: js.UndefOr[Phase2EncryptionAlgorithmsRequestList] = js.native
  /**
    * One or more integrity algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations. Valid values: SHA1 | SHA2-256 
    */
  var Phase2IntegrityAlgorithms: js.UndefOr[Phase2IntegrityAlgorithmsRequestList] = js.native
  /**
    * The lifetime for phase 2 of the IKE negotiation, in seconds. Constraints: A value between 900 and 3,600. The value must be less than the value for Phase1LifetimeSeconds. Default: 3600 
    */
  var Phase2LifetimeSeconds: js.UndefOr[Integer] = js.native
  /**
    * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the customer gateway. Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores (_). Must be between 8 and 64 characters in length and cannot start with zero (0).
    */
  var PreSharedKey: js.UndefOr[String] = js.native
  /**
    * The percentage of the rekey window (determined by RekeyMarginTimeSeconds) during which the rekey time is randomly selected. Constraints: A value between 0 and 100. Default: 100 
    */
  var RekeyFuzzPercentage: js.UndefOr[Integer] = js.native
  /**
    * The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN connection performs an IKE rekey. The exact time of the rekey is randomly selected based on the value for RekeyFuzzPercentage. Constraints: A value between 60 and half of Phase2LifetimeSeconds. Default: 540 
    */
  var RekeyMarginTimeSeconds: js.UndefOr[Integer] = js.native
  /**
    * The number of packets in an IKE replay window. Constraints: A value between 64 and 2048. Default: 1024 
    */
  var ReplayWindowSize: js.UndefOr[Integer] = js.native
  /**
    * The range of inside IP addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN connections that use the same virtual private gateway.  Constraints: A size /30 CIDR block from the 169.254.0.0/16 range. The following CIDR blocks are reserved and cannot be used:    169.254.0.0/30     169.254.1.0/30     169.254.2.0/30     169.254.3.0/30     169.254.4.0/30     169.254.5.0/30     169.254.169.252/30   
    */
  var TunnelInsideCidr: js.UndefOr[String] = js.native
}

object ModifyVpnTunnelOptionsSpecification {
  @scala.inline
  def apply(): ModifyVpnTunnelOptionsSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpnTunnelOptionsSpecification]
  }
  @scala.inline
  implicit class ModifyVpnTunnelOptionsSpecificationOps[Self <: ModifyVpnTunnelOptionsSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDPDTimeoutSeconds(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DPDTimeoutSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDPDTimeoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DPDTimeoutSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withIKEVersions(value: IKEVersionsRequestList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IKEVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIKEVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IKEVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withPhase1DHGroupNumbers(value: Phase1DHGroupNumbersRequestList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phase1DHGroupNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhase1DHGroupNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phase1DHGroupNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withPhase1EncryptionAlgorithms(value: Phase1EncryptionAlgorithmsRequestList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phase1EncryptionAlgorithms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhase1EncryptionAlgorithms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phase1EncryptionAlgorithms")(js.undefined)
        ret
    }
    @scala.inline
    def withPhase1IntegrityAlgorithms(value: Phase1IntegrityAlgorithmsRequestList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phase1IntegrityAlgorithms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhase1IntegrityAlgorithms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phase1IntegrityAlgorithms")(js.undefined)
        ret
    }
    @scala.inline
    def withPhase1LifetimeSeconds(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phase1LifetimeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhase1LifetimeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phase1LifetimeSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withPhase2DHGroupNumbers(value: Phase2DHGroupNumbersRequestList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phase2DHGroupNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhase2DHGroupNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phase2DHGroupNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withPhase2EncryptionAlgorithms(value: Phase2EncryptionAlgorithmsRequestList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phase2EncryptionAlgorithms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhase2EncryptionAlgorithms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phase2EncryptionAlgorithms")(js.undefined)
        ret
    }
    @scala.inline
    def withPhase2IntegrityAlgorithms(value: Phase2IntegrityAlgorithmsRequestList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phase2IntegrityAlgorithms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhase2IntegrityAlgorithms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phase2IntegrityAlgorithms")(js.undefined)
        ret
    }
    @scala.inline
    def withPhase2LifetimeSeconds(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phase2LifetimeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhase2LifetimeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phase2LifetimeSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withPreSharedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreSharedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreSharedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreSharedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRekeyFuzzPercentage(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RekeyFuzzPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRekeyFuzzPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RekeyFuzzPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withRekeyMarginTimeSeconds(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RekeyMarginTimeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRekeyMarginTimeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RekeyMarginTimeSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withReplayWindowSize(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplayWindowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplayWindowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplayWindowSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnelInsideCidr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TunnelInsideCidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnelInsideCidr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TunnelInsideCidr")(js.undefined)
        ret
    }
  }
  
}

