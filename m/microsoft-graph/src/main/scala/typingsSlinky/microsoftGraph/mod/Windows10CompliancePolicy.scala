package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Windows10CompliancePolicy extends DeviceCompliancePolicy {
  // Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled
  var bitLockerEnabled: js.UndefOr[Boolean] = js.native
  // Require devices to be reported as healthy by Windows Device Health Attestation.
  var codeIntegrityEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is
    * enabled.
    */
  var earlyLaunchAntiMalwareDriverEnabled: js.UndefOr[Boolean] = js.native
  // Maximum Windows Phone version.
  var mobileOsMaximumVersion: js.UndefOr[String] = js.native
  // Minimum Windows Phone version.
  var mobileOsMinimumVersion: js.UndefOr[String] = js.native
  // Maximum Windows 10 version.
  var osMaximumVersion: js.UndefOr[String] = js.native
  // Minimum Windows 10 version.
  var osMinimumVersion: js.UndefOr[String] = js.native
  // Indicates whether or not to block simple password.
  var passwordBlockSimple: js.UndefOr[Boolean] = js.native
  // The password expiration in days.
  var passwordExpirationDays: js.UndefOr[Double] = js.native
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[Double] = js.native
  // The minimum password length.
  var passwordMinimumLength: js.UndefOr[Double] = js.native
  // Minutes of inactivity before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[Double] = js.native
  // The number of previous passwords to prevent re-use of.
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.native
  // Require a password to unlock Windows device.
  var passwordRequired: js.UndefOr[Boolean] = js.native
  // Require a password to unlock an idle device.
  var passwordRequiredToUnlockFromIdle: js.UndefOr[Boolean] = js.native
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.native
  // Require devices to be reported as healthy by Windows Device Health Attestation.
  var requireHealthyDeviceReport: js.UndefOr[Boolean] = js.native
  // Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.
  var secureBootEnabled: js.UndefOr[Boolean] = js.native
  // Require encryption on windows devices.
  var storageRequireEncryption: js.UndefOr[Boolean] = js.native
}

object Windows10CompliancePolicy {
  @scala.inline
  def apply(): Windows10CompliancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10CompliancePolicy]
  }
  @scala.inline
  implicit class Windows10CompliancePolicyOps[Self <: Windows10CompliancePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitLockerEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitLockerEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitLockerEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitLockerEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeIntegrityEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeIntegrityEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeIntegrityEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeIntegrityEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEarlyLaunchAntiMalwareDriverEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earlyLaunchAntiMalwareDriverEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEarlyLaunchAntiMalwareDriverEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earlyLaunchAntiMalwareDriverEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileOsMaximumVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileOsMaximumVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileOsMaximumVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileOsMaximumVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileOsMinimumVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileOsMinimumVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileOsMinimumVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileOsMinimumVersion")(js.undefined)
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
    def withPasswordBlockSimple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordBlockSimple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordBlockSimple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordBlockSimple")(js.undefined)
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
    def withPasswordMinimumCharacterSetCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinimumCharacterSetCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordMinimumCharacterSetCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinimumCharacterSetCount")(js.undefined)
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
    def withPasswordRequiredToUnlockFromIdle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordRequiredToUnlockFromIdle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordRequiredToUnlockFromIdle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordRequiredToUnlockFromIdle")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordRequiredType(value: RequiredPasswordType): Self = {
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
    def withRequireHealthyDeviceReport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireHealthyDeviceReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireHealthyDeviceReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireHealthyDeviceReport")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureBootEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureBootEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureBootEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureBootEnabled")(js.undefined)
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

