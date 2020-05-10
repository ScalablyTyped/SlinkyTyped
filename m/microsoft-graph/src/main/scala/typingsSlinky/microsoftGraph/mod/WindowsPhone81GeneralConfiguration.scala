package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsPhone81GeneralConfiguration extends DeviceConfiguration {
  // Value indicating whether this policy only applies to Windows Phone 8.1. This property is read-only.
  var applyOnlyToWindowsPhone81: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block copy paste.
  var appsBlockCopyPaste: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block bluetooth.
  var bluetoothBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block camera.
  var cameraBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Wi-Fi tethering. Has no impact if Wi-Fi is blocked.
  var cellularBlockWifiTethering: js.UndefOr[Boolean] = js.native
  // List that is in the AppComplianceList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
  var compliantAppListType: js.UndefOr[AppListType] = js.native
  /**
    * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection
    * can contain a maximum of 10000 elements.
    */
  var compliantAppsList: js.UndefOr[js.Array[AppListItem]] = js.native
  // Indicates whether or not to block diagnostic data submission.
  var diagnosticDataBlockSubmission: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block custom email accounts.
  var emailBlockAddingAccounts: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block location services.
  var locationServicesBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block using a Microsoft Account.
  var microsoftAccountBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Near-Field Communication.
  var nfcBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block syncing the calendar.
  var passwordBlockSimple: js.UndefOr[Boolean] = js.native
  // Number of days before the password expires.
  var passwordExpirationDays: js.UndefOr[Double] = js.native
  // Number of character sets a password must contain.
  var passwordMinimumCharacterSetCount: js.UndefOr[Double] = js.native
  // Minimum length of passwords.
  var passwordMinimumLength: js.UndefOr[Double] = js.native
  // Minutes of inactivity before screen timeout.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.native
  // Number of previous passwords to block. Valid values 0 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.native
  // Indicates whether or not to require a password.
  var passwordRequired: js.UndefOr[Boolean] = js.native
  // Password type that is required. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.native
  // Number of sign in failures allowed before factory reset.
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.native
  // Indicates whether or not to block screenshots.
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block removable storage.
  var storageBlockRemovableStorage: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require encryption.
  var storageRequireEncryption: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the web browser.
  var webBrowserBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
  var wifiBlockAutomaticConnectHotspots: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Wi-Fi hotspot reporting. Has no impact if Wi-Fi is blocked.
  var wifiBlockHotspotReporting: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Wi-Fi.
  var wifiBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the Windows Store.
  var windowsStoreBlocked: js.UndefOr[Boolean] = js.native
}

object WindowsPhone81GeneralConfiguration {
  @scala.inline
  def apply(): WindowsPhone81GeneralConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsPhone81GeneralConfiguration]
  }
  @scala.inline
  implicit class WindowsPhone81GeneralConfigurationOps[Self <: WindowsPhone81GeneralConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyOnlyToWindowsPhone81(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyOnlyToWindowsPhone81")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyOnlyToWindowsPhone81: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyOnlyToWindowsPhone81")(js.undefined)
        ret
    }
    @scala.inline
    def withAppsBlockCopyPaste(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsBlockCopyPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppsBlockCopyPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsBlockCopyPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withBluetoothBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBluetoothBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withCameraBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCameraBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withCellularBlockWifiTethering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockWifiTethering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellularBlockWifiTethering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockWifiTethering")(js.undefined)
        ret
    }
    @scala.inline
    def withCompliantAppListType(value: AppListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compliantAppListType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompliantAppListType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compliantAppListType")(js.undefined)
        ret
    }
    @scala.inline
    def withCompliantAppsList(value: js.Array[AppListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compliantAppsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompliantAppsList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compliantAppsList")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagnosticDataBlockSubmission(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosticDataBlockSubmission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagnosticDataBlockSubmission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosticDataBlockSubmission")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailBlockAddingAccounts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailBlockAddingAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailBlockAddingAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailBlockAddingAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationServicesBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationServicesBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationServicesBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationServicesBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withMicrosoftAccountBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsoftAccountBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicrosoftAccountBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsoftAccountBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withNfcBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nfcBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNfcBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nfcBlocked")(js.undefined)
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
    def withScreenCaptureBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenCaptureBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenCaptureBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenCaptureBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageBlockRemovableStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageBlockRemovableStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageBlockRemovableStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageBlockRemovableStorage")(js.undefined)
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
    def withWebBrowserBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webBrowserBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebBrowserBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webBrowserBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withWifiBlockAutomaticConnectHotspots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiBlockAutomaticConnectHotspots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWifiBlockAutomaticConnectHotspots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiBlockAutomaticConnectHotspots")(js.undefined)
        ret
    }
    @scala.inline
    def withWifiBlockHotspotReporting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiBlockHotspotReporting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWifiBlockHotspotReporting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiBlockHotspotReporting")(js.undefined)
        ret
    }
    @scala.inline
    def withWifiBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWifiBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsStoreBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsStoreBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsStoreBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsStoreBlocked")(js.undefined)
        ret
    }
  }
  
}

