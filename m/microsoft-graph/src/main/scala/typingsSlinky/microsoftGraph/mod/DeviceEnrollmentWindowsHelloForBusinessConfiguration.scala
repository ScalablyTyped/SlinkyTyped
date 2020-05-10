package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceEnrollmentWindowsHelloForBusinessConfiguration extends DeviceEnrollmentConfiguration {
  // Not yet documented. Possible values are: notConfigured, enabled, disabled.
  var enhancedBiometricsState: js.UndefOr[Enablement] = js.native
  // Not yet documented
  var pinExpirationInDays: js.UndefOr[Double] = js.native
  // Not yet documented. Possible values are: allowed, required, disallowed.
  var pinLowercaseCharactersUsage: js.UndefOr[WindowsHelloForBusinessPinUsage] = js.native
  // Not yet documented
  var pinMaximumLength: js.UndefOr[Double] = js.native
  // Not yet documented
  var pinMinimumLength: js.UndefOr[Double] = js.native
  // Not yet documented
  var pinPreviousBlockCount: js.UndefOr[Double] = js.native
  // Not yet documented. Possible values are: allowed, required, disallowed.
  var pinSpecialCharactersUsage: js.UndefOr[WindowsHelloForBusinessPinUsage] = js.native
  // Not yet documented. Possible values are: allowed, required, disallowed.
  var pinUppercaseCharactersUsage: js.UndefOr[WindowsHelloForBusinessPinUsage] = js.native
  // Not yet documented
  var remotePassportEnabled: js.UndefOr[Boolean] = js.native
  // Not yet documented
  var securityDeviceRequired: js.UndefOr[Boolean] = js.native
  // Not yet documented. Possible values are: notConfigured, enabled, disabled.
  var state: js.UndefOr[Enablement] = js.native
  // Not yet documented
  var unlockWithBiometricsEnabled: js.UndefOr[Boolean] = js.native
}

object DeviceEnrollmentWindowsHelloForBusinessConfiguration {
  @scala.inline
  def apply(): DeviceEnrollmentWindowsHelloForBusinessConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEnrollmentWindowsHelloForBusinessConfiguration]
  }
  @scala.inline
  implicit class DeviceEnrollmentWindowsHelloForBusinessConfigurationOps[Self <: DeviceEnrollmentWindowsHelloForBusinessConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnhancedBiometricsState(value: Enablement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhancedBiometricsState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnhancedBiometricsState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhancedBiometricsState")(js.undefined)
        ret
    }
    @scala.inline
    def withPinExpirationInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinExpirationInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinExpirationInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinExpirationInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withPinLowercaseCharactersUsage(value: WindowsHelloForBusinessPinUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinLowercaseCharactersUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinLowercaseCharactersUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinLowercaseCharactersUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withPinMaximumLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinMaximumLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinMaximumLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinMaximumLength")(js.undefined)
        ret
    }
    @scala.inline
    def withPinMinimumLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinMinimumLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinMinimumLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinMinimumLength")(js.undefined)
        ret
    }
    @scala.inline
    def withPinPreviousBlockCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinPreviousBlockCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinPreviousBlockCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinPreviousBlockCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPinSpecialCharactersUsage(value: WindowsHelloForBusinessPinUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinSpecialCharactersUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinSpecialCharactersUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinSpecialCharactersUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withPinUppercaseCharactersUsage(value: WindowsHelloForBusinessPinUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinUppercaseCharactersUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinUppercaseCharactersUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinUppercaseCharactersUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withRemotePassportEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remotePassportEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemotePassportEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remotePassportEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityDeviceRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityDeviceRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityDeviceRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityDeviceRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: Enablement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlockWithBiometricsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockWithBiometricsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnlockWithBiometricsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockWithBiometricsEnabled")(js.undefined)
        ret
    }
  }
  
}

