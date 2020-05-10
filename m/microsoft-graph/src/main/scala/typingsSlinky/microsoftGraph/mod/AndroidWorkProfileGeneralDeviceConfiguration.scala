package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidWorkProfileGeneralDeviceConfiguration extends DeviceConfiguration {
  // Indicates whether or not to block fingerprint unlock.
  var passwordBlockFingerprintUnlock: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Smart Lock and other trust agents.
  var passwordBlockTrustAgents: js.UndefOr[Boolean] = js.native
  // Number of days before the password expires. Valid values 1 to 365
  var passwordExpirationDays: js.UndefOr[Double] = js.native
  // Minimum length of passwords. Valid values 4 to 16
  var passwordMinimumLength: js.UndefOr[Double] = js.native
  // Minutes of inactivity before the screen times out.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.native
  // Number of previous passwords to block. Valid values 0 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.native
  /**
    * Type of password that is required. Possible values are: deviceDefault, lowSecurityBiometric, required, atLeastNumeric,
    * numericComplex, atLeastAlphabetic, atLeastAlphanumeric, alphanumericWithSymbols.
    */
  var passwordRequiredType: js.UndefOr[AndroidWorkProfileRequiredPasswordType] = js.native
  // Number of sign in failures allowed before factory reset. Valid values 1 to 16
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.native
  // Require the Android Verify apps feature is turned on.
  var securityRequireVerifyApps: js.UndefOr[Boolean] = js.native
  // Block users from adding/removing accounts in work profile.
  var workProfileBlockAddingAccounts: js.UndefOr[Boolean] = js.native
  // Block work profile camera.
  var workProfileBlockCamera: js.UndefOr[Boolean] = js.native
  // Block display work profile caller ID in personal profile.
  var workProfileBlockCrossProfileCallerId: js.UndefOr[Boolean] = js.native
  // Block work profile contacts availability in personal profile.
  var workProfileBlockCrossProfileContactsSearch: js.UndefOr[Boolean] = js.native
  // Boolean that indicates if the setting disallow cross profile copy/paste is enabled.
  var workProfileBlockCrossProfileCopyPaste: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block notifications while device locked.
  var workProfileBlockNotificationsWhileDeviceLocked: js.UndefOr[Boolean] = js.native
  // Block screen capture in work profile.
  var workProfileBlockScreenCapture: js.UndefOr[Boolean] = js.native
  // Allow bluetooth devices to access enterprise contacts.
  var workProfileBluetoothEnableContactSharing: js.UndefOr[Boolean] = js.native
  /**
    * Type of data sharing that is allowed. Possible values are: deviceDefault, preventAny, allowPersonalToWork,
    * noRestrictions.
    */
  var workProfileDataSharingType: js.UndefOr[AndroidWorkProfileCrossProfileDataSharingType] = js.native
  // Type of password that is required. Possible values are: deviceDefault, prompt, autoGrant, autoDeny.
  var workProfileDefaultAppPermissionPolicy: js.UndefOr[AndroidWorkProfileDefaultAppPermissionPolicyType] = js.native
  // Indicates whether or not to block fingerprint unlock for work profile.
  var workProfilePasswordBlockFingerprintUnlock: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Smart Lock and other trust agents for work profile.
  var workProfilePasswordBlockTrustAgents: js.UndefOr[Boolean] = js.native
  // Number of days before the work profile password expires. Valid values 1 to 365
  var workProfilePasswordExpirationDays: js.UndefOr[Double] = js.native
  // Minimum # of letter characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinLetterCharacters: js.UndefOr[Double] = js.native
  // Minimum # of lower-case characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinLowerCaseCharacters: js.UndefOr[Double] = js.native
  // Minimum # of non-letter characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinNonLetterCharacters: js.UndefOr[Double] = js.native
  // Minimum # of numeric characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinNumericCharacters: js.UndefOr[Double] = js.native
  // Minimum # of symbols required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinSymbolCharacters: js.UndefOr[Double] = js.native
  // Minimum # of upper-case characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinUpperCaseCharacters: js.UndefOr[Double] = js.native
  // Minimum length of work profile password. Valid values 4 to 16
  var workProfilePasswordMinimumLength: js.UndefOr[Double] = js.native
  // Minutes of inactivity before the screen times out.
  var workProfilePasswordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.native
  // Number of previous work profile passwords to block. Valid values 0 to 24
  var workProfilePasswordPreviousPasswordBlockCount: js.UndefOr[Double] = js.native
  /**
    * Type of work profile password that is required. Possible values are: deviceDefault, lowSecurityBiometric, required,
    * atLeastNumeric, numericComplex, atLeastAlphabetic, atLeastAlphanumeric, alphanumericWithSymbols.
    */
  var workProfilePasswordRequiredType: js.UndefOr[AndroidWorkProfileRequiredPasswordType] = js.native
  // Number of sign in failures allowed before work profile is removed and all corporate data deleted. Valid values 1 to 16
  var workProfilePasswordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.native
  // Password is required or not for work profile
  var workProfileRequirePassword: js.UndefOr[Boolean] = js.native
}

object AndroidWorkProfileGeneralDeviceConfiguration {
  @scala.inline
  def apply(): AndroidWorkProfileGeneralDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidWorkProfileGeneralDeviceConfiguration]
  }
  @scala.inline
  implicit class AndroidWorkProfileGeneralDeviceConfigurationOps[Self <: AndroidWorkProfileGeneralDeviceConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPasswordBlockFingerprintUnlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordBlockFingerprintUnlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordBlockFingerprintUnlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordBlockFingerprintUnlock")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordBlockTrustAgents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordBlockTrustAgents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordBlockTrustAgents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordBlockTrustAgents")(js.undefined)
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
    def withPasswordMinutesOfInactivityBeforeScreenTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinutesOfInactivityBeforeScreenTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordMinutesOfInactivityBeforeScreenTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinutesOfInactivityBeforeScreenTimeout")(js.undefined)
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
    def withPasswordRequiredType(value: AndroidWorkProfileRequiredPasswordType): Self = {
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
    def withPasswordSignInFailureCountBeforeFactoryReset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordSignInFailureCountBeforeFactoryReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordSignInFailureCountBeforeFactoryReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordSignInFailureCountBeforeFactoryReset")(js.undefined)
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
    def withWorkProfileBlockAddingAccounts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileBlockAddingAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfileBlockAddingAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileBlockAddingAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfileBlockCamera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileBlockCamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfileBlockCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileBlockCamera")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfileBlockCrossProfileCallerId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileBlockCrossProfileCallerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfileBlockCrossProfileCallerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileBlockCrossProfileCallerId")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfileBlockCrossProfileContactsSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileBlockCrossProfileContactsSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfileBlockCrossProfileContactsSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileBlockCrossProfileContactsSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfileBlockCrossProfileCopyPaste(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileBlockCrossProfileCopyPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfileBlockCrossProfileCopyPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileBlockCrossProfileCopyPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfileBlockNotificationsWhileDeviceLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileBlockNotificationsWhileDeviceLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfileBlockNotificationsWhileDeviceLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileBlockNotificationsWhileDeviceLocked")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfileBlockScreenCapture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileBlockScreenCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfileBlockScreenCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileBlockScreenCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfileBluetoothEnableContactSharing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileBluetoothEnableContactSharing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfileBluetoothEnableContactSharing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileBluetoothEnableContactSharing")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfileDataSharingType(value: AndroidWorkProfileCrossProfileDataSharingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileDataSharingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfileDataSharingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileDataSharingType")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfileDefaultAppPermissionPolicy(value: AndroidWorkProfileDefaultAppPermissionPolicyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileDefaultAppPermissionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfileDefaultAppPermissionPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileDefaultAppPermissionPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfilePasswordBlockFingerprintUnlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordBlockFingerprintUnlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfilePasswordBlockFingerprintUnlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordBlockFingerprintUnlock")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfilePasswordBlockTrustAgents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordBlockTrustAgents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfilePasswordBlockTrustAgents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordBlockTrustAgents")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfilePasswordExpirationDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordExpirationDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfilePasswordExpirationDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordExpirationDays")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfilePasswordMinLetterCharacters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordMinLetterCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfilePasswordMinLetterCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordMinLetterCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfilePasswordMinLowerCaseCharacters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordMinLowerCaseCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfilePasswordMinLowerCaseCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordMinLowerCaseCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfilePasswordMinNonLetterCharacters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordMinNonLetterCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfilePasswordMinNonLetterCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordMinNonLetterCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfilePasswordMinNumericCharacters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordMinNumericCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfilePasswordMinNumericCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordMinNumericCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfilePasswordMinSymbolCharacters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordMinSymbolCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfilePasswordMinSymbolCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordMinSymbolCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfilePasswordMinUpperCaseCharacters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordMinUpperCaseCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfilePasswordMinUpperCaseCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordMinUpperCaseCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfilePasswordMinimumLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordMinimumLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfilePasswordMinimumLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordMinimumLength")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordMinutesOfInactivityBeforeScreenTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordMinutesOfInactivityBeforeScreenTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfilePasswordPreviousPasswordBlockCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordPreviousPasswordBlockCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfilePasswordPreviousPasswordBlockCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordPreviousPasswordBlockCount")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfilePasswordRequiredType(value: AndroidWorkProfileRequiredPasswordType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordRequiredType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfilePasswordRequiredType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordRequiredType")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfilePasswordSignInFailureCountBeforeFactoryReset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordSignInFailureCountBeforeFactoryReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfilePasswordSignInFailureCountBeforeFactoryReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfilePasswordSignInFailureCountBeforeFactoryReset")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkProfileRequirePassword(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileRequirePassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkProfileRequirePassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workProfileRequirePassword")(js.undefined)
        ret
    }
  }
  
}

