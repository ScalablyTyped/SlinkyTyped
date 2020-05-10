package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MacOSCompliancePolicy extends DeviceCompliancePolicy {
  // Require that devices have enabled device threat protection.
  var deviceThreatProtectionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured,
    * low, medium, high, notSet.
    */
  var deviceThreatProtectionRequiredSecurityLevel: js.UndefOr[DeviceThreatProtectionLevel] = js.native
  // Corresponds to the 'Block all incoming connections' option.
  var firewallBlockAllIncoming: js.UndefOr[Boolean] = js.native
  // Corresponds to 'Enable stealth mode.'
  var firewallEnableStealthMode: js.UndefOr[Boolean] = js.native
  // Whether the firewall should be enabled or not.
  var firewallEnabled: js.UndefOr[Boolean] = js.native
  // Maximum MacOS version.
  var osMaximumVersion: js.UndefOr[String] = js.native
  // Minimum MacOS version.
  var osMinimumVersion: js.UndefOr[String] = js.native
  // Indicates whether or not to block simple passwords.
  var passwordBlockSimple: js.UndefOr[Boolean] = js.native
  // Number of days before the password expires. Valid values 1 to 65535
  var passwordExpirationDays: js.UndefOr[Double] = js.native
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[Double] = js.native
  // Minimum length of password. Valid values 4 to 14
  var passwordMinimumLength: js.UndefOr[Double] = js.native
  // Minutes of inactivity before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[Double] = js.native
  // Number of previous passwords to block. Valid values 1 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.native
  // Whether or not to require a password.
  var passwordRequired: js.UndefOr[Boolean] = js.native
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.native
  // Require encryption on Mac OS devices.
  var storageRequireEncryption: js.UndefOr[Boolean] = js.native
  // Require that devices have enabled system integrity protection.
  var systemIntegrityProtectionEnabled: js.UndefOr[Boolean] = js.native
}

object MacOSCompliancePolicy {
  @scala.inline
  def apply(): MacOSCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacOSCompliancePolicy]
  }
  @scala.inline
  implicit class MacOSCompliancePolicyOps[Self <: MacOSCompliancePolicy] (val x: Self) extends AnyVal {
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
    def withFirewallBlockAllIncoming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallBlockAllIncoming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirewallBlockAllIncoming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallBlockAllIncoming")(js.undefined)
        ret
    }
    @scala.inline
    def withFirewallEnableStealthMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallEnableStealthMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirewallEnableStealthMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallEnableStealthMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFirewallEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirewallEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallEnabled")(js.undefined)
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
    @scala.inline
    def withSystemIntegrityProtectionEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemIntegrityProtectionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemIntegrityProtectionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemIntegrityProtectionEnabled")(js.undefined)
        ret
    }
  }
  
}

