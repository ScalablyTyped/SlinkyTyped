package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Windows81GeneralConfiguration extends DeviceConfiguration {
  /**
    * Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a
    * Microsoft account.
    */
  var accountsBlockAddingNonMicrosoftAccountEmail: js.UndefOr[Boolean] = js.native
  // Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
  var applyOnlyToWindows81: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block auto fill.
  var browserBlockAutofill: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block automatic detection of Intranet sites.
  var browserBlockAutomaticDetectionOfIntranetSites: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block enterprise mode access.
  var browserBlockEnterpriseModeAccess: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block the user from using JavaScript.
  var browserBlockJavaScript: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block plug-ins.
  var browserBlockPlugins: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block popups.
  var browserBlockPopups: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block the user from sending the do not track header.
  var browserBlockSendingDoNotTrackHeader: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block a single word entry on Intranet sites.
  var browserBlockSingleWordEntryOnIntranetSites: js.UndefOr[Boolean] = js.native
  // The enterprise mode site list location. Could be a local file, local network or http location.
  var browserEnterpriseModeSiteListLocation: js.UndefOr[String] = js.native
  // The internet security level. Possible values are: userDefined, medium, mediumHigh, high.
  var browserInternetSecurityLevel: js.UndefOr[InternetSiteSecurityLevel] = js.native
  // The Intranet security level. Possible values are: userDefined, low, mediumLow, medium, mediumHigh, high.
  var browserIntranetSecurityLevel: js.UndefOr[SiteSecurityLevel] = js.native
  // The logging report location.
  var browserLoggingReportLocation: js.UndefOr[String] = js.native
  // Indicates whether or not to require a firewall.
  var browserRequireFirewall: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require fraud warning.
  var browserRequireFraudWarning: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require high security for restricted sites.
  var browserRequireHighSecurityForRestrictedSites: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require the user to use the smart screen filter.
  var browserRequireSmartScreen: js.UndefOr[Boolean] = js.native
  // The trusted sites security level. Possible values are: userDefined, low, mediumLow, medium, mediumHigh, high.
  var browserTrustedSitesSecurityLevel: js.UndefOr[SiteSecurityLevel] = js.native
  // Indicates whether or not to block data roaming.
  var cellularBlockDataRoaming: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block diagnostic data submission.
  var diagnosticsBlockDataSubmission: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block the user from using a pictures password and pin.
  var passwordBlockPicturePasswordAndPin: js.UndefOr[Boolean] = js.native
  // Password expiration in days.
  var passwordExpirationDays: js.UndefOr[Double] = js.native
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[Double] = js.native
  // The minimum password length.
  var passwordMinimumLength: js.UndefOr[Double] = js.native
  // The minutes of inactivity before the screen times out.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.native
  // The number of previous passwords to prevent re-use of. Valid values 0 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.native
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.native
  // The number of sign in failures before factory reset.
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.native
  // Indicates whether or not to require encryption on a mobile device.
  var storageRequireDeviceEncryption: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require automatic updates.
  var updatesRequireAutomaticUpdates: js.UndefOr[Boolean] = js.native
  /**
    * The user account control settings. Possible values are: userDefined, alwaysNotify, notifyOnAppChanges,
    * notifyOnAppChangesWithoutDimming, neverNotify.
    */
  var userAccountControlSettings: js.UndefOr[WindowsUserAccountControlSettings] = js.native
  // The work folders url.
  var workFoldersUrl: js.UndefOr[String] = js.native
}

object Windows81GeneralConfiguration {
  @scala.inline
  def apply(): Windows81GeneralConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows81GeneralConfiguration]
  }
  @scala.inline
  implicit class Windows81GeneralConfigurationOps[Self <: Windows81GeneralConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountsBlockAddingNonMicrosoftAccountEmail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountsBlockAddingNonMicrosoftAccountEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountsBlockAddingNonMicrosoftAccountEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountsBlockAddingNonMicrosoftAccountEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyOnlyToWindows81(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyOnlyToWindows81")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyOnlyToWindows81: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyOnlyToWindows81")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserBlockAutofill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserBlockAutofill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserBlockAutofill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserBlockAutofill")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserBlockAutomaticDetectionOfIntranetSites(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserBlockAutomaticDetectionOfIntranetSites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserBlockAutomaticDetectionOfIntranetSites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserBlockAutomaticDetectionOfIntranetSites")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserBlockEnterpriseModeAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserBlockEnterpriseModeAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserBlockEnterpriseModeAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserBlockEnterpriseModeAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserBlockJavaScript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserBlockJavaScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserBlockJavaScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserBlockJavaScript")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserBlockPlugins(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserBlockPlugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserBlockPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserBlockPlugins")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserBlockPopups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserBlockPopups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserBlockPopups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserBlockPopups")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserBlockSendingDoNotTrackHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserBlockSendingDoNotTrackHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserBlockSendingDoNotTrackHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserBlockSendingDoNotTrackHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserBlockSingleWordEntryOnIntranetSites(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserBlockSingleWordEntryOnIntranetSites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserBlockSingleWordEntryOnIntranetSites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserBlockSingleWordEntryOnIntranetSites")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserEnterpriseModeSiteListLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserEnterpriseModeSiteListLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserEnterpriseModeSiteListLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserEnterpriseModeSiteListLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserInternetSecurityLevel(value: InternetSiteSecurityLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserInternetSecurityLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserInternetSecurityLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserInternetSecurityLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserIntranetSecurityLevel(value: SiteSecurityLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserIntranetSecurityLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserIntranetSecurityLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserIntranetSecurityLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserLoggingReportLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserLoggingReportLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserLoggingReportLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserLoggingReportLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserRequireFirewall(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserRequireFirewall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserRequireFirewall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserRequireFirewall")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserRequireFraudWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserRequireFraudWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserRequireFraudWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserRequireFraudWarning")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserRequireHighSecurityForRestrictedSites(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserRequireHighSecurityForRestrictedSites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserRequireHighSecurityForRestrictedSites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserRequireHighSecurityForRestrictedSites")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserRequireSmartScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserRequireSmartScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserRequireSmartScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserRequireSmartScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserTrustedSitesSecurityLevel(value: SiteSecurityLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserTrustedSitesSecurityLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserTrustedSitesSecurityLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserTrustedSitesSecurityLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withCellularBlockDataRoaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockDataRoaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellularBlockDataRoaming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockDataRoaming")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagnosticsBlockDataSubmission(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosticsBlockDataSubmission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagnosticsBlockDataSubmission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosticsBlockDataSubmission")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordBlockPicturePasswordAndPin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordBlockPicturePasswordAndPin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordBlockPicturePasswordAndPin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordBlockPicturePasswordAndPin")(js.undefined)
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
    def withStorageRequireDeviceEncryption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageRequireDeviceEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageRequireDeviceEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageRequireDeviceEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatesRequireAutomaticUpdates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatesRequireAutomaticUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatesRequireAutomaticUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatesRequireAutomaticUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAccountControlSettings(value: WindowsUserAccountControlSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAccountControlSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAccountControlSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAccountControlSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkFoldersUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workFoldersUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkFoldersUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workFoldersUrl")(js.undefined)
        ret
    }
  }
  
}

