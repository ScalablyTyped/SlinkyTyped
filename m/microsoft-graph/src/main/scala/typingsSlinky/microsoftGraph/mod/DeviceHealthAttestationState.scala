package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceHealthAttestationState extends js.Object {
  /**
    * TWhen an Attestation Identity Key (AIK) is present on a device, it indicates that the device has an endorsement key
    * (EK) certificate.
    */
  var attestationIdentityKey: js.UndefOr[String] = js.native
  // On or Off of BitLocker Drive Encryption
  var bitLockerStatus: js.UndefOr[String] = js.native
  // The security version number of the Boot Application
  var bootAppSecurityVersion: js.UndefOr[String] = js.native
  // When bootDebugging is enabled, the device is used in development and testing
  var bootDebugging: js.UndefOr[String] = js.native
  // The security version number of the Boot Application
  var bootManagerSecurityVersion: js.UndefOr[String] = js.native
  // The version of the Boot Manager
  var bootManagerVersion: js.UndefOr[String] = js.native
  // The Boot Revision List that was loaded during initial boot on the attested device
  var bootRevisionListInfo: js.UndefOr[String] = js.native
  // When code integrity is enabled, code execution is restricted to integrity verified code
  var codeIntegrity: js.UndefOr[String] = js.native
  // The version of the Boot Manager
  var codeIntegrityCheckVersion: js.UndefOr[String] = js.native
  // The Code Integrity policy that is controlling the security of the boot environment
  var codeIntegrityPolicy: js.UndefOr[String] = js.native
  // The DHA report version. (Namespace version)
  var contentNamespaceUrl: js.UndefOr[String] = js.native
  // The HealthAttestation state schema version
  var contentVersion: js.UndefOr[String] = js.native
  // DEP Policy defines a set of hardware and software technologies that perform additional checks on memory
  var dataExcutionPolicy: js.UndefOr[String] = js.native
  // The DHA report version. (Namespace version)
  var deviceHealthAttestationStatus: js.UndefOr[String] = js.native
  // ELAM provides protection for the computers in your network when they start up
  var earlyLaunchAntiMalwareDriverProtection: js.UndefOr[String] = js.native
  // This attribute indicates if DHA is supported for the device
  var healthAttestationSupportedStatus: js.UndefOr[String] = js.native
  // This attribute appears if DHA-Service detects an integrity issue
  var healthStatusMismatchInfo: js.UndefOr[String] = js.native
  // The DateTime when device was evaluated or issued to MDM
  var issuedDateTime: js.UndefOr[String] = js.native
  // The Timestamp of the last update.
  var lastUpdateDateTime: js.UndefOr[String] = js.native
  // When operatingSystemKernelDebugging is enabled, the device is used in development and testing
  var operatingSystemKernelDebugging: js.UndefOr[String] = js.native
  // The Operating System Revision List that was loaded during initial boot on the attested device
  var operatingSystemRevListInfo: js.UndefOr[String] = js.native
  // The measurement that is captured in PCR[0]
  var pcr0: js.UndefOr[String] = js.native
  // Informational attribute that identifies the HASH algorithm that was used by TPM
  var pcrHashAlgorithm: js.UndefOr[String] = js.native
  // The number of times a PC device has hibernated or resumed
  var resetCount: js.UndefOr[Double] = js.native
  // The number of times a PC device has rebooted
  var restartCount: js.UndefOr[Double] = js.native
  // Safe mode is a troubleshooting option for Windows that starts your computer in a limited state
  var safeMode: js.UndefOr[String] = js.native
  // When Secure Boot is enabled, the core components must have the correct cryptographic signatures
  var secureBoot: js.UndefOr[String] = js.native
  // Fingerprint of the Custom Secure Boot Configuration Policy
  var secureBootConfigurationPolicyFingerPrint: js.UndefOr[String] = js.native
  // When test signing is allowed, the device does not enforce signature validation during boot
  var testSigning: js.UndefOr[String] = js.native
  // The security version number of the Boot Application
  var tpmVersion: js.UndefOr[String] = js.native
  // VSM is a container that protects high value assets from a compromised kernel
  var virtualSecureMode: js.UndefOr[String] = js.native
  // Operating system running with limited services that is used to prepare a computer for Windows
  var windowsPE: js.UndefOr[String] = js.native
}

object DeviceHealthAttestationState {
  @scala.inline
  def apply(): DeviceHealthAttestationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceHealthAttestationState]
  }
  @scala.inline
  implicit class DeviceHealthAttestationStateOps[Self <: DeviceHealthAttestationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttestationIdentityKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attestationIdentityKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttestationIdentityKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attestationIdentityKey")(js.undefined)
        ret
    }
    @scala.inline
    def withBitLockerStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitLockerStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitLockerStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitLockerStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withBootAppSecurityVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootAppSecurityVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootAppSecurityVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootAppSecurityVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withBootDebugging(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootDebugging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootDebugging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootDebugging")(js.undefined)
        ret
    }
    @scala.inline
    def withBootManagerSecurityVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootManagerSecurityVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootManagerSecurityVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootManagerSecurityVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withBootManagerVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootManagerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootManagerVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootManagerVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withBootRevisionListInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootRevisionListInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootRevisionListInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootRevisionListInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeIntegrity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeIntegrity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeIntegrity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeIntegrity")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeIntegrityCheckVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeIntegrityCheckVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeIntegrityCheckVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeIntegrityCheckVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeIntegrityPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeIntegrityPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeIntegrityPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeIntegrityPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withContentNamespaceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentNamespaceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentNamespaceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentNamespaceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withContentVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDataExcutionPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataExcutionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataExcutionPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataExcutionPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceHealthAttestationStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceHealthAttestationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceHealthAttestationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceHealthAttestationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withEarlyLaunchAntiMalwareDriverProtection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earlyLaunchAntiMalwareDriverProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEarlyLaunchAntiMalwareDriverProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earlyLaunchAntiMalwareDriverProtection")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthAttestationSupportedStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthAttestationSupportedStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthAttestationSupportedStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthAttestationSupportedStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthStatusMismatchInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthStatusMismatchInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthStatusMismatchInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthStatusMismatchInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystemKernelDebugging(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystemKernelDebugging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystemKernelDebugging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystemKernelDebugging")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystemRevListInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystemRevListInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystemRevListInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystemRevListInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPcr0(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pcr0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPcr0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pcr0")(js.undefined)
        ret
    }
    @scala.inline
    def withPcrHashAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pcrHashAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPcrHashAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pcrHashAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withResetCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRestartCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestartCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureBoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureBoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureBoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureBoot")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureBootConfigurationPolicyFingerPrint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureBootConfigurationPolicyFingerPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureBootConfigurationPolicyFingerPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureBootConfigurationPolicyFingerPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withTestSigning(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSigning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestSigning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSigning")(js.undefined)
        ret
    }
    @scala.inline
    def withTpmVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpmVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTpmVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpmVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualSecureMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualSecureMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualSecureMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualSecureMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsPE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsPE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsPE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsPE")(js.undefined)
        ret
    }
  }
  
}

