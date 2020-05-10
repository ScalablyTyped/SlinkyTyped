package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsInformationProtectionPolicy extends WindowsInformationProtection {
  // Offline interval before app data is wiped (days)
  var daysWithoutContactBeforeUnenroll: js.UndefOr[Double] = js.native
  // Enrollment url for the MDM
  var mdmEnrollmentUrl: js.UndefOr[String] = js.native
  /**
    * Specifies the maximum amount of time (in minutes) allowed after the device is idle that will cause the device to become
    * PIN or password locked. Range is an integer X where 0 &amp;lt;= X &amp;lt;= 999.
    */
  var minutesOfInactivityBeforeDeviceLock: js.UndefOr[Double] = js.native
  /**
    * Integer value that specifies the number of past PINs that can be associated to a user account that can't be reused. The
    * largest number you can configure for this policy setting is 50. The lowest number you can configure for this policy
    * setting is 0. If this policy is set to 0, then storage of previous PINs is not required. This node was added in Windows
    * 10, version 1511. Default is 0.
    */
  var numberOfPastPinsRemembered: js.UndefOr[Double] = js.native
  /**
    * The number of authentication failures allowed before the device will be wiped. A value of 0 disables device wipe
    * functionality. Range is an integer X where 4 &amp;lt;= X &amp;lt;= 16 for desktop and 0 &amp;lt;= X &amp;lt;= 999 for
    * mobile devices.
    */
  var passwordMaximumAttemptCount: js.UndefOr[Double] = js.native
  /**
    * Integer value specifies the period of time (in days) that a PIN can be used before the system requires the user to
    * change it. The largest number you can configure for this policy setting is 730. The lowest number you can configure for
    * this policy setting is 0. If this policy is set to 0, then the user's PIN will never expire. This node was added in
    * Windows 10, version 1511. Default is 0.
    */
  var pinExpirationDays: js.UndefOr[Double] = js.native
  /**
    * Integer value that configures the use of lowercase letters in the Windows Hello for Business PIN. Default is NotAllow.
    * Possible values are: notAllow, requireAtLeastOne, allow.
    */
  var pinLowercaseLetters: js.UndefOr[WindowsInformationProtectionPinCharacterRequirements] = js.native
  /**
    * Integer value that sets the minimum number of characters required for the PIN. Default value is 4. The lowest number
    * you can configure for this policy setting is 4. The largest number you can configure must be less than the number
    * configured in the Maximum PIN length policy setting or the number 127, whichever is the lowest.
    */
  var pinMinimumLength: js.UndefOr[Double] = js.native
  /**
    * Integer value that configures the use of special characters in the Windows Hello for Business PIN. Valid special
    * characters for Windows Hello for Business PIN gestures include: ! ' # $ % &amp; ' ( ) + , - . / : ; &amp;lt; = &amp;gt;
    * ? @ [ / ] ^ ` {
    */
  var pinSpecialCharacters: js.UndefOr[WindowsInformationProtectionPinCharacterRequirements] = js.native
  /**
    * Integer value that configures the use of uppercase letters in the Windows Hello for Business PIN. Default is NotAllow.
    * Possible values are: notAllow, requireAtLeastOne, allow.
    */
  var pinUppercaseLetters: js.UndefOr[WindowsInformationProtectionPinCharacterRequirements] = js.native
  // New property in RS2, pending documentation
  var revokeOnMdmHandoffDisabled: js.UndefOr[Boolean] = js.native
  // Boolean value that sets Windows Hello for Business as a method for signing into Windows.
  var windowsHelloForBusinessBlocked: js.UndefOr[Boolean] = js.native
}

object WindowsInformationProtectionPolicy {
  @scala.inline
  def apply(): WindowsInformationProtectionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionPolicy]
  }
  @scala.inline
  implicit class WindowsInformationProtectionPolicyOps[Self <: WindowsInformationProtectionPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaysWithoutContactBeforeUnenroll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysWithoutContactBeforeUnenroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysWithoutContactBeforeUnenroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysWithoutContactBeforeUnenroll")(js.undefined)
        ret
    }
    @scala.inline
    def withMdmEnrollmentUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdmEnrollmentUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdmEnrollmentUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdmEnrollmentUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withMinutesOfInactivityBeforeDeviceLock(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutesOfInactivityBeforeDeviceLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinutesOfInactivityBeforeDeviceLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutesOfInactivityBeforeDeviceLock")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfPastPinsRemembered(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfPastPinsRemembered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfPastPinsRemembered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfPastPinsRemembered")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordMaximumAttemptCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMaximumAttemptCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordMaximumAttemptCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMaximumAttemptCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPinExpirationDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinExpirationDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinExpirationDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinExpirationDays")(js.undefined)
        ret
    }
    @scala.inline
    def withPinLowercaseLetters(value: WindowsInformationProtectionPinCharacterRequirements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinLowercaseLetters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinLowercaseLetters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinLowercaseLetters")(js.undefined)
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
    def withPinSpecialCharacters(value: WindowsInformationProtectionPinCharacterRequirements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinSpecialCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinSpecialCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinSpecialCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withPinUppercaseLetters(value: WindowsInformationProtectionPinCharacterRequirements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinUppercaseLetters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinUppercaseLetters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinUppercaseLetters")(js.undefined)
        ret
    }
    @scala.inline
    def withRevokeOnMdmHandoffDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokeOnMdmHandoffDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevokeOnMdmHandoffDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokeOnMdmHandoffDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsHelloForBusinessBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsHelloForBusinessBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsHelloForBusinessBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsHelloForBusinessBlocked")(js.undefined)
        ret
    }
  }
  
}

