package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidGeneralDeviceConfiguration extends DeviceConfiguration {
  // Indicates whether or not to block clipboard sharing to copy and paste between applications.
  var appsBlockClipboardSharing: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block copy and paste within applications.
  var appsBlockCopyPaste: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the YouTube app.
  var appsBlockYouTube: js.UndefOr[Boolean] = js.native
  // List of apps to be hidden on the KNOX device. This collection can contain a maximum of 500 elements.
  var appsHideList: js.UndefOr[js.Array[AppListItem]] = js.native
  // List of apps which can be installed on the KNOX device. This collection can contain a maximum of 500 elements.
  var appsInstallAllowList: js.UndefOr[js.Array[AppListItem]] = js.native
  /**
    * List of apps which are blocked from being launched on the KNOX device. This collection can contain a maximum of 500
    * elements.
    */
  var appsLaunchBlockList: js.UndefOr[js.Array[AppListItem]] = js.native
  // Indicates whether or not to block Bluetooth.
  var bluetoothBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the use of the camera.
  var cameraBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block data roaming.
  var cellularBlockDataRoaming: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block SMS/MMS messaging.
  var cellularBlockMessaging: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block voice roaming.
  var cellularBlockVoiceRoaming: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block syncing Wi-Fi tethering.
  var cellularBlockWiFiTethering: js.UndefOr[Boolean] = js.native
  // Type of list that is in the CompliantAppsList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
  var compliantAppListType: js.UndefOr[AppListType] = js.native
  /**
    * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection
    * can contain a maximum of 10000 elements.
    */
  var compliantAppsList: js.UndefOr[js.Array[AppListItem]] = js.native
  // Indicates whether or not to allow device sharing mode.
  var deviceSharingAllowed: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block diagnostic data submission.
  var diagnosticDataBlockSubmission: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block user performing a factory reset.
  var factoryResetBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Google account auto sync.
  var googleAccountBlockAutoSync: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the Google Play store.
  var googlePlayStoreBlocked: js.UndefOr[Boolean] = js.native
  /**
    * A list of apps that will be allowed to run when the device is in Kiosk Mode. This collection can contain a maximum of
    * 500 elements.
    */
  var kioskModeApps: js.UndefOr[js.Array[AppListItem]] = js.native
  // Indicates whether or not to block the screen sleep button while in Kiosk Mode.
  var kioskModeBlockSleepButton: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the volume buttons while in Kiosk Mode.
  var kioskModeBlockVolumeButtons: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block location services.
  var locationServicesBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Near-Field Communication.
  var nfcBlocked: js.UndefOr[Boolean] = js.native
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
  // Indicates whether or not to require a password.
  var passwordRequired: js.UndefOr[Boolean] = js.native
  /**
    * Type of password that is required. Possible values are: deviceDefault, alphabetic, alphanumeric,
    * alphanumericWithSymbols, lowSecurityBiometric, numeric, numericComplex, any.
    */
  var passwordRequiredType: js.UndefOr[AndroidRequiredPasswordType] = js.native
  // Number of sign in failures allowed before factory reset. Valid values 1 to 16
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.native
  // Indicates whether or not to block powering off the device.
  var powerOffBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block screenshots.
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.native
  // Require the Android Verify apps feature is turned on.
  var securityRequireVerifyApps: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Google Backup.
  var storageBlockGoogleBackup: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block removable storage usage.
  var storageBlockRemovableStorage: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require device encryption.
  var storageRequireDeviceEncryption: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require removable storage encryption.
  var storageRequireRemovableStorageEncryption: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the use of the Voice Assistant.
  var voiceAssistantBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block voice dialing.
  var voiceDialingBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the web browser's auto fill feature.
  var webBrowserBlockAutofill: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block JavaScript within the web browser.
  var webBrowserBlockJavaScript: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block popups within the web browser.
  var webBrowserBlockPopups: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the web browser.
  var webBrowserBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Cookie settings within the web browser. Possible values are: browserDefault, blockAlways, allowCurrentWebSite,
    * allowFromWebsitesVisited, allowAlways.
    */
  var webBrowserCookieSettings: js.UndefOr[WebBrowserCookieSettings] = js.native
  // Indicates whether or not to block syncing Wi-Fi.
  var wiFiBlocked: js.UndefOr[Boolean] = js.native
}

object AndroidGeneralDeviceConfiguration {
  @scala.inline
  def apply(): AndroidGeneralDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidGeneralDeviceConfiguration]
  }
  @scala.inline
  implicit class AndroidGeneralDeviceConfigurationOps[Self <: AndroidGeneralDeviceConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppsBlockClipboardSharing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsBlockClipboardSharing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppsBlockClipboardSharing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsBlockClipboardSharing")(js.undefined)
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
    def withAppsBlockYouTube(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsBlockYouTube")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppsBlockYouTube: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsBlockYouTube")(js.undefined)
        ret
    }
    @scala.inline
    def withAppsHideList(value: js.Array[AppListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsHideList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppsHideList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsHideList")(js.undefined)
        ret
    }
    @scala.inline
    def withAppsInstallAllowList(value: js.Array[AppListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsInstallAllowList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppsInstallAllowList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsInstallAllowList")(js.undefined)
        ret
    }
    @scala.inline
    def withAppsLaunchBlockList(value: js.Array[AppListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsLaunchBlockList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppsLaunchBlockList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsLaunchBlockList")(js.undefined)
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
    def withCellularBlockMessaging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockMessaging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellularBlockMessaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockMessaging")(js.undefined)
        ret
    }
    @scala.inline
    def withCellularBlockVoiceRoaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockVoiceRoaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellularBlockVoiceRoaming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockVoiceRoaming")(js.undefined)
        ret
    }
    @scala.inline
    def withCellularBlockWiFiTethering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockWiFiTethering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellularBlockWiFiTethering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockWiFiTethering")(js.undefined)
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
    def withDeviceSharingAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceSharingAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceSharingAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceSharingAllowed")(js.undefined)
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
    def withFactoryResetBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factoryResetBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactoryResetBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factoryResetBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleAccountBlockAutoSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleAccountBlockAutoSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleAccountBlockAutoSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleAccountBlockAutoSync")(js.undefined)
        ret
    }
    @scala.inline
    def withGooglePlayStoreBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePlayStoreBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGooglePlayStoreBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePlayStoreBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeApps(value: js.Array[AppListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeApps")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeBlockSleepButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeBlockSleepButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeBlockSleepButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeBlockSleepButton")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeBlockVolumeButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeBlockVolumeButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeBlockVolumeButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeBlockVolumeButtons")(js.undefined)
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
    def withPowerOffBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerOffBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPowerOffBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerOffBlocked")(js.undefined)
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
    def withStorageBlockGoogleBackup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageBlockGoogleBackup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageBlockGoogleBackup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageBlockGoogleBackup")(js.undefined)
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
    def withStorageRequireRemovableStorageEncryption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageRequireRemovableStorageEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageRequireRemovableStorageEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageRequireRemovableStorageEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceAssistantBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceAssistantBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceAssistantBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceAssistantBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceDialingBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceDialingBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceDialingBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceDialingBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withWebBrowserBlockAutofill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webBrowserBlockAutofill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebBrowserBlockAutofill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webBrowserBlockAutofill")(js.undefined)
        ret
    }
    @scala.inline
    def withWebBrowserBlockJavaScript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webBrowserBlockJavaScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebBrowserBlockJavaScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webBrowserBlockJavaScript")(js.undefined)
        ret
    }
    @scala.inline
    def withWebBrowserBlockPopups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webBrowserBlockPopups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebBrowserBlockPopups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webBrowserBlockPopups")(js.undefined)
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
    def withWebBrowserCookieSettings(value: WebBrowserCookieSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webBrowserCookieSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebBrowserCookieSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webBrowserCookieSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withWiFiBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wiFiBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWiFiBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wiFiBlocked")(js.undefined)
        ret
    }
  }
  
}

