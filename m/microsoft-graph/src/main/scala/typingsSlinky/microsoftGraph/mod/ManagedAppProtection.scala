package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedAppProtection extends ManagedAppPolicy {
  // Data storage locations where a user may store managed data.
  var allowedDataStorageLocations: js.UndefOr[js.Array[ManagedAppDataStorageLocation]] = js.native
  // Sources from which data is allowed to be transferred. Possible values are: allApps, managedApps, none.
  var allowedInboundDataTransferSources: js.UndefOr[ManagedAppDataTransferLevel] = js.native
  /**
    * The level to which the clipboard may be shared between apps on the managed device. Possible values are: allApps,
    * managedAppsWithPasteIn, managedApps, blocked.
    */
  var allowedOutboundClipboardSharingLevel: js.UndefOr[ManagedAppClipboardSharingLevel] = js.native
  // Destinations to which data is allowed to be transferred. Possible values are: allApps, managedApps, none.
  var allowedOutboundDataTransferDestinations: js.UndefOr[ManagedAppDataTransferLevel] = js.native
  // Indicates whether contacts can be synced to the user's device.
  var contactSyncBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether the backup of a managed app's data is blocked.
  var dataBackupBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether device compliance is required.
  var deviceComplianceRequired: js.UndefOr[Boolean] = js.native
  // Indicates whether use of the app pin is required if the device pin is set.
  var disableAppPinIfDevicePinIsSet: js.UndefOr[Boolean] = js.native
  // Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True.
  var fingerprintBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether internet links should be opened in the managed browser app.
  var managedBrowserToOpenLinksRequired: js.UndefOr[Boolean] = js.native
  // Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped.
  var maximumPinRetries: js.UndefOr[Double] = js.native
  // Minimum pin length required for an app-level pin if PinRequired is set to True
  var minimumPinLength: js.UndefOr[Double] = js.native
  // Versions less than the specified version will block the managed app from accessing company data.
  var minimumRequiredAppVersion: js.UndefOr[String] = js.native
  // Versions less than the specified version will block the managed app from accessing company data.
  var minimumRequiredOsVersion: js.UndefOr[String] = js.native
  // Versions less than the specified version will result in warning message on the managed app.
  var minimumWarningAppVersion: js.UndefOr[String] = js.native
  // Versions less than the specified version will result in warning message on the managed app from accessing company data.
  var minimumWarningOsVersion: js.UndefOr[String] = js.native
  // Indicates whether organizational credentials are required for app use.
  var organizationalCredentialsRequired: js.UndefOr[Boolean] = js.native
  // TimePeriod before the all-level pin must be reset if PinRequired is set to True.
  var periodBeforePinReset: js.UndefOr[String] = js.native
  // The period after which access is checked when the device is not connected to the internet.
  var periodOfflineBeforeAccessCheck: js.UndefOr[String] = js.native
  // The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped.
  var periodOfflineBeforeWipeIsEnforced: js.UndefOr[String] = js.native
  // The period after which access is checked when the device is connected to the internet.
  var periodOnlineBeforeAccessCheck: js.UndefOr[String] = js.native
  /**
    * Character set which may be used for an app-level pin if PinRequired is set to True. Possible values are: numeric,
    * alphanumericAndSymbol.
    */
  var pinCharacterSet: js.UndefOr[ManagedAppPinCharacterSet] = js.native
  // Indicates whether an app-level pin is required.
  var pinRequired: js.UndefOr[Boolean] = js.native
  // Indicates whether printing is allowed from managed apps.
  var printBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether users may use the 'Save As' menu item to save a copy of protected files.
  var saveAsBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether simplePin is blocked.
  var simplePinBlocked: js.UndefOr[Boolean] = js.native
}

object ManagedAppProtection {
  @scala.inline
  def apply(): ManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppProtection]
  }
  @scala.inline
  implicit class ManagedAppProtectionOps[Self <: ManagedAppProtection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedDataStorageLocations(value: js.Array[ManagedAppDataStorageLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedDataStorageLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedDataStorageLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedDataStorageLocations")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedInboundDataTransferSources(value: ManagedAppDataTransferLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedInboundDataTransferSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedInboundDataTransferSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedInboundDataTransferSources")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedOutboundClipboardSharingLevel(value: ManagedAppClipboardSharingLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedOutboundClipboardSharingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedOutboundClipboardSharingLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedOutboundClipboardSharingLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedOutboundDataTransferDestinations(value: ManagedAppDataTransferLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedOutboundDataTransferDestinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedOutboundDataTransferDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedOutboundDataTransferDestinations")(js.undefined)
        ret
    }
    @scala.inline
    def withContactSyncBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactSyncBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactSyncBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactSyncBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBackupBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBackupBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataBackupBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBackupBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceComplianceRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceComplianceRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceComplianceRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceComplianceRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAppPinIfDevicePinIsSet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAppPinIfDevicePinIsSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAppPinIfDevicePinIsSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAppPinIfDevicePinIsSet")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerprintBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprintBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprintBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprintBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedBrowserToOpenLinksRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedBrowserToOpenLinksRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedBrowserToOpenLinksRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedBrowserToOpenLinksRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumPinRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumPinRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumPinRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumPinRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumPinLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumPinLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumPinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumPinLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumRequiredAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumRequiredAppVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumRequiredAppVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumRequiredAppVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumRequiredOsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumRequiredOsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumRequiredOsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumRequiredOsVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumWarningAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumWarningAppVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumWarningAppVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumWarningAppVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumWarningOsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumWarningOsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumWarningOsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumWarningOsVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationalCredentialsRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizationalCredentialsRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationalCredentialsRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizationalCredentialsRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriodBeforePinReset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodBeforePinReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriodBeforePinReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodBeforePinReset")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriodOfflineBeforeAccessCheck(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodOfflineBeforeAccessCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriodOfflineBeforeAccessCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodOfflineBeforeAccessCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriodOfflineBeforeWipeIsEnforced(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodOfflineBeforeWipeIsEnforced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriodOfflineBeforeWipeIsEnforced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodOfflineBeforeWipeIsEnforced")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriodOnlineBeforeAccessCheck(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodOnlineBeforeAccessCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriodOnlineBeforeAccessCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodOnlineBeforeAccessCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withPinCharacterSet(value: ManagedAppPinCharacterSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinCharacterSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinCharacterSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinCharacterSet")(js.undefined)
        ret
    }
    @scala.inline
    def withPinRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveAsBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveAsBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveAsBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveAsBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withSimplePinBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplePinBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimplePinBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplePinBlocked")(js.undefined)
        ret
    }
  }
  
}

