package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosCompliancePolicy extends DeviceCompliancePolicy {
  // Require that devices have enabled device threat protection .
  var deviceThreatProtectionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured,
    * low, medium, high, notSet.
    */
  var deviceThreatProtectionRequiredSecurityLevel: js.UndefOr[DeviceThreatProtectionLevel] = js.native
  // Indicates whether or not to require a managed email profile.
  var managedEmailProfileRequired: js.UndefOr[Boolean] = js.native
  // Maximum IOS version.
  var osMaximumVersion: js.UndefOr[String] = js.native
  // Minimum IOS version.
  var osMinimumVersion: js.UndefOr[String] = js.native
  // Indicates whether or not to block simple passcodes.
  var passcodeBlockSimple: js.UndefOr[Boolean] = js.native
  // Number of days before the passcode expires. Valid values 1 to 65535
  var passcodeExpirationDays: js.UndefOr[Double] = js.native
  // The number of character sets required in the password.
  var passcodeMinimumCharacterSetCount: js.UndefOr[Double] = js.native
  // Minimum length of passcode. Valid values 4 to 14
  var passcodeMinimumLength: js.UndefOr[Double] = js.native
  // Minutes of inactivity before a passcode is required.
  var passcodeMinutesOfInactivityBeforeLock: js.UndefOr[Double] = js.native
  // Number of previous passcodes to block. Valid values 1 to 24
  var passcodePreviousPasscodeBlockCount: js.UndefOr[Double] = js.native
  // Indicates whether or not to require a passcode.
  var passcodeRequired: js.UndefOr[Boolean] = js.native
  // The required passcode type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passcodeRequiredType: js.UndefOr[RequiredPasswordType] = js.native
  // Devices must not be jailbroken or rooted.
  var securityBlockJailbrokenDevices: js.UndefOr[Boolean] = js.native
}

object IosCompliancePolicy {
  @scala.inline
  def apply(): IosCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosCompliancePolicy]
  }
  @scala.inline
  implicit class IosCompliancePolicyOps[Self <: IosCompliancePolicy] (val x: Self) extends AnyVal {
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
    def withManagedEmailProfileRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedEmailProfileRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedEmailProfileRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedEmailProfileRequired")(js.undefined)
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
    def withPasscodeBlockSimple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeBlockSimple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasscodeBlockSimple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeBlockSimple")(js.undefined)
        ret
    }
    @scala.inline
    def withPasscodeExpirationDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeExpirationDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasscodeExpirationDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeExpirationDays")(js.undefined)
        ret
    }
    @scala.inline
    def withPasscodeMinimumCharacterSetCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeMinimumCharacterSetCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasscodeMinimumCharacterSetCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeMinimumCharacterSetCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPasscodeMinimumLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeMinimumLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasscodeMinimumLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeMinimumLength")(js.undefined)
        ret
    }
    @scala.inline
    def withPasscodeMinutesOfInactivityBeforeLock(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeMinutesOfInactivityBeforeLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasscodeMinutesOfInactivityBeforeLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeMinutesOfInactivityBeforeLock")(js.undefined)
        ret
    }
    @scala.inline
    def withPasscodePreviousPasscodeBlockCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodePreviousPasscodeBlockCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasscodePreviousPasscodeBlockCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodePreviousPasscodeBlockCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPasscodeRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasscodeRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withPasscodeRequiredType(value: RequiredPasswordType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeRequiredType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasscodeRequiredType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeRequiredType")(js.undefined)
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
  }
  
}

