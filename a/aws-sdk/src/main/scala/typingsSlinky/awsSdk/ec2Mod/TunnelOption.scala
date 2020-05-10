package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TunnelOption extends js.Object {
  /**
    * The number of seconds after which a DPD timeout occurs.
    */
  var DpdTimeoutSeconds: js.UndefOr[Integer] = js.native
  /**
    * The IKE versions that are permitted for the VPN tunnel.
    */
  var IkeVersions: js.UndefOr[IKEVersionsList] = js.native
  /**
    * The external IP address of the VPN tunnel.
    */
  var OutsideIpAddress: js.UndefOr[String] = js.native
  /**
    * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1 IKE negotiations.
    */
  var Phase1DHGroupNumbers: js.UndefOr[Phase1DHGroupNumbersList] = js.native
  /**
    * The permitted encryption algorithms for the VPN tunnel for phase 1 IKE negotiations.
    */
  var Phase1EncryptionAlgorithms: js.UndefOr[Phase1EncryptionAlgorithmsList] = js.native
  /**
    * The permitted integrity algorithms for the VPN tunnel for phase 1 IKE negotiations.
    */
  var Phase1IntegrityAlgorithms: js.UndefOr[Phase1IntegrityAlgorithmsList] = js.native
  /**
    * The lifetime for phase 1 of the IKE negotiation, in seconds.
    */
  var Phase1LifetimeSeconds: js.UndefOr[Integer] = js.native
  /**
    * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2 IKE negotiations.
    */
  var Phase2DHGroupNumbers: js.UndefOr[Phase2DHGroupNumbersList] = js.native
  /**
    * The permitted encryption algorithms for the VPN tunnel for phase 2 IKE negotiations.
    */
  var Phase2EncryptionAlgorithms: js.UndefOr[Phase2EncryptionAlgorithmsList] = js.native
  /**
    * The permitted integrity algorithms for the VPN tunnel for phase 2 IKE negotiations.
    */
  var Phase2IntegrityAlgorithms: js.UndefOr[Phase2IntegrityAlgorithmsList] = js.native
  /**
    * The lifetime for phase 2 of the IKE negotiation, in seconds.
    */
  var Phase2LifetimeSeconds: js.UndefOr[Integer] = js.native
  /**
    * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the customer gateway.
    */
  var PreSharedKey: js.UndefOr[String] = js.native
  /**
    * The percentage of the rekey window determined by RekeyMarginTimeSeconds during which the rekey time is randomly selected.
    */
  var RekeyFuzzPercentage: js.UndefOr[Integer] = js.native
  /**
    * The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN connection performs an IKE rekey.
    */
  var RekeyMarginTimeSeconds: js.UndefOr[Integer] = js.native
  /**
    * The number of packets in an IKE replay window.
    */
  var ReplayWindowSize: js.UndefOr[Integer] = js.native
  /**
    * The range of inside IP addresses for the tunnel.
    */
  var TunnelInsideCidr: js.UndefOr[String] = js.native
}

object TunnelOption {
  @scala.inline
  def apply(): TunnelOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TunnelOption]
  }
  @scala.inline
  implicit class TunnelOptionOps[Self <: TunnelOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDpdTimeoutSeconds(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DpdTimeoutSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDpdTimeoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DpdTimeoutSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withIkeVersions(value: IKEVersionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IkeVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIkeVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IkeVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withOutsideIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutsideIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutsideIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutsideIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withPhase1DHGroupNumbers(value: Phase1DHGroupNumbersList): Self = {
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
    def withPhase1EncryptionAlgorithms(value: Phase1EncryptionAlgorithmsList): Self = {
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
    def withPhase1IntegrityAlgorithms(value: Phase1IntegrityAlgorithmsList): Self = {
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
    def withPhase2DHGroupNumbers(value: Phase2DHGroupNumbersList): Self = {
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
    def withPhase2EncryptionAlgorithms(value: Phase2EncryptionAlgorithmsList): Self = {
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
    def withPhase2IntegrityAlgorithms(value: Phase2IntegrityAlgorithmsList): Self = {
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

