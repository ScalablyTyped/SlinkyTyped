package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidWorkProfileCompliancePolicy extends DeviceCompliancePolicy {
  // Require that devices have enabled device threat protection.
  var deviceThreatProtectionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured,
    * low, medium, high, notSet.
    */
  var deviceThreatProtectionRequiredSecurityLevel: js.UndefOr[DeviceThreatProtectionLevel] = js.native
  // Minimum Android security patch level.
  var minAndroidSecurityPatchLevel: js.UndefOr[String] = js.native
  // Maximum Android version.
  var osMaximumVersion: js.UndefOr[String] = js.native
  // Minimum Android version.
  var osMinimumVersion: js.UndefOr[String] = js.native
  // Number of days before the password expires. Valid values 1 to 365
  var passwordExpirationDays: js.UndefOr[Double] = js.native
  // Minimum password length. Valid values 4 to 16
  var passwordMinimumLength: js.UndefOr[Double] = js.native
  // Minutes of inactivity before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[Double] = js.native
  // Number of previous passwords to block. Valid values 1 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.native
  // Require a password to unlock device.
  var passwordRequired: js.UndefOr[Boolean] = js.native
  /**
    * Type of characters in password. Possible values are: deviceDefault, alphabetic, alphanumeric, alphanumericWithSymbols,
    * lowSecurityBiometric, numeric, numericComplex, any.
    */
  var passwordRequiredType: js.UndefOr[AndroidRequiredPasswordType] = js.native
  // Devices must not be jailbroken or rooted.
  var securityBlockJailbrokenDevices: js.UndefOr[Boolean] = js.native
  // Disable USB debugging on Android devices.
  var securityDisableUsbDebugging: js.UndefOr[Boolean] = js.native
  // Require that devices disallow installation of apps from unknown sources.
  var securityPreventInstallAppsFromUnknownSources: js.UndefOr[Boolean] = js.native
  // Require the device to pass the Company Portal client app runtime integrity check.
  var securityRequireCompanyPortalAppIntegrity: js.UndefOr[Boolean] = js.native
  // Require Google Play Services to be installed and enabled on the device.
  var securityRequireGooglePlayServices: js.UndefOr[Boolean] = js.native
  // Require the device to pass the SafetyNet basic integrity check.
  var securityRequireSafetyNetAttestationBasicIntegrity: js.UndefOr[Boolean] = js.native
  // Require the device to pass the SafetyNet certified device check.
  var securityRequireSafetyNetAttestationCertifiedDevice: js.UndefOr[Boolean] = js.native
  /**
    * Require the device to have up to date security providers. The device will require Google Play Services to be enabled
    * and up to date.
    */
  var securityRequireUpToDateSecurityProviders: js.UndefOr[Boolean] = js.native
  // Require the Android Verify apps feature is turned on.
  var securityRequireVerifyApps: js.UndefOr[Boolean] = js.native
  // Require encryption on Android devices.
  var storageRequireEncryption: js.UndefOr[Boolean] = js.native
}

object AndroidWorkProfileCompliancePolicy {
  @scala.inline
  def apply(): AndroidWorkProfileCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidWorkProfileCompliancePolicy]
  }
  @scala.inline
  implicit class AndroidWorkProfileCompliancePolicyOps[Self <: AndroidWorkProfileCompliancePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceThreatProtectionEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceThreatProtectionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceThreatProtectionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceThreatProtectionEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceThreatProtectionRequiredSecurityLevel(value: DeviceThreatProtectionLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceThreatProtectionRequiredSecurityLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceThreatProtectionRequiredSecurityLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceThreatProtectionRequiredSecurityLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMinAndroidSecurityPatchLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAndroidSecurityPatchLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinAndroidSecurityPatchLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAndroidSecurityPatchLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withOsMaximumVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osMaximumVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOsMaximumVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osMaximumVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withOsMinimumVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osMinimumVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOsMinimumVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osMinimumVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordExpirationDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordExpirationDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordExpirationDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordExpirationDays")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordMinimumLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinimumLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordMinimumLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinimumLength")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordMinutesOfInactivityBeforeLock(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinutesOfInactivityBeforeLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordMinutesOfInactivityBeforeLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinutesOfInactivityBeforeLock")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordPreviousPasswordBlockCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordPreviousPasswordBlockCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordPreviousPasswordBlockCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordPreviousPasswordBlockCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordRequiredType(value: AndroidRequiredPasswordType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordRequiredType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordRequiredType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordRequiredType")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityBlockJailbrokenDevices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityBlockJailbrokenDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityBlockJailbrokenDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityBlockJailbrokenDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityDisableUsbDebugging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityDisableUsbDebugging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityDisableUsbDebugging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityDisableUsbDebugging")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityPreventInstallAppsFromUnknownSources(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityPreventInstallAppsFromUnknownSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityPreventInstallAppsFromUnknownSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityPreventInstallAppsFromUnknownSources")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityRequireCompanyPortalAppIntegrity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityRequireCompanyPortalAppIntegrity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityRequireCompanyPortalAppIntegrity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityRequireCompanyPortalAppIntegrity")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityRequireGooglePlayServices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityRequireGooglePlayServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityRequireGooglePlayServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityRequireGooglePlayServices")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityRequireSafetyNetAttestationBasicIntegrity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityRequireSafetyNetAttestationBasicIntegrity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityRequireSafetyNetAttestationBasicIntegrity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityRequireSafetyNetAttestationBasicIntegrity")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityRequireSafetyNetAttestationCertifiedDevice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityRequireSafetyNetAttestationCertifiedDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityRequireSafetyNetAttestationCertifiedDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityRequireSafetyNetAttestationCertifiedDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityRequireUpToDateSecurityProviders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityRequireUpToDateSecurityProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityRequireUpToDateSecurityProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityRequireUpToDateSecurityProviders")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityRequireVerifyApps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityRequireVerifyApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityRequireVerifyApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityRequireVerifyApps")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageRequireEncryption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageRequireEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageRequireEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageRequireEncryption")(js.undefined)
        ret
    }
  }
  
}

