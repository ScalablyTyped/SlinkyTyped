package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Windows10GeneralConfiguration extends DeviceConfiguration {
  /**
    * Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a
    * Microsoft account.
    */
  var accountsBlockAddingNonMicrosoftAccountEmail: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from selecting an AntiTheft mode preference (Windows 10 Mobile only).
  var antiTheftModeBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether apps from AppX packages signed with a trusted certificate can be side loaded. Possible values are:
    * notConfigured, blocked, allowed.
    */
  var appsAllowTrustedAppsSideloading: js.UndefOr[StateManagementSetting] = js.native
  /**
    * Indicates whether or not to disable the launch of all apps from Windows Store that came pre-installed or were
    * downloaded.
    */
  var appsBlockWindowsStoreOriginatedApps: js.UndefOr[Boolean] = js.native
  // Specify a list of allowed Bluetooth services and profiles in hex formatted strings.
  var bluetoothAllowedServices: js.UndefOr[js.Array[String]] = js.native
  // Whether or not to Block the user from using bluetooth advertising.
  var bluetoothBlockAdvertising: js.UndefOr[Boolean] = js.native
  // Whether or not to Block the user from using bluetooth discoverable mode.
  var bluetoothBlockDiscoverableMode: js.UndefOr[Boolean] = js.native
  // Whether or not to block specific bundled Bluetooth peripherals to automatically pair with the host device.
  var bluetoothBlockPrePairing: js.UndefOr[Boolean] = js.native
  // Whether or not to Block the user from using bluetooth.
  var bluetoothBlocked: js.UndefOr[Boolean] = js.native
  // Whether or not to Block the user from accessing the camera of the device.
  var cameraBlocked: js.UndefOr[Boolean] = js.native
  // Whether or not to Block the user from using data over cellular while roaming.
  var cellularBlockDataWhenRoaming: js.UndefOr[Boolean] = js.native
  // Whether or not to Block the user from using VPN over cellular.
  var cellularBlockVpn: js.UndefOr[Boolean] = js.native
  // Whether or not to Block the user from using VPN when roaming over cellular.
  var cellularBlockVpnWhenRoaming: js.UndefOr[Boolean] = js.native
  // Whether or not to Block the user from doing manual root certificate installation.
  var certificatesBlockManualRootCertificateInstallation: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not to block Connected Devices Service which enables discovery and connection to other devices, remote
    * messaging, remote app sessions and other cross-device experiences.
    */
  var connectedDevicesServiceBlocked: js.UndefOr[Boolean] = js.native
  // Whether or not to Block the user from using copy paste.
  var copyPasteBlocked: js.UndefOr[Boolean] = js.native
  // Whether or not to Block the user from using Cortana.
  var cortanaBlocked: js.UndefOr[Boolean] = js.native
  // Whether or not to block end user access to Defender.
  var defenderBlockEndUserAccess: js.UndefOr[Boolean] = js.native
  // Specifies the level of cloud-delivered protection. Possible values are: notConfigured, high, highPlus, zeroTolerance.
  var defenderCloudBlockLevel: js.UndefOr[DefenderCloudBlockLevelType] = js.native
  // Number of days before deleting quarantined malware. Valid values 0 to 90
  var defenderDaysBeforeDeletingQuarantinedMalware: js.UndefOr[Double] = js.native
  // Gets or sets Defender’s actions to take on detected Malware per threat level.
  var defenderDetectedMalwareActions: js.UndefOr[DefenderDetectedMalwareActions] = js.native
  // File extensions to exclude from scans and real time protection.
  var defenderFileExtensionsToExclude: js.UndefOr[js.Array[String]] = js.native
  // Files and folder to exclude from scans and real time protection.
  var defenderFilesAndFoldersToExclude: js.UndefOr[js.Array[String]] = js.native
  /**
    * Value for monitoring file activity. Possible values are: userDefined, disable, monitorAllFiles,
    * monitorIncomingFilesOnly, monitorOutgoingFilesOnly.
    */
  var defenderMonitorFileActivity: js.UndefOr[DefenderMonitorFileActivity] = js.native
  // Processes to exclude from scans and real time protection.
  var defenderProcessesToExclude: js.UndefOr[js.Array[String]] = js.native
  /**
    * The configuration for how to prompt user for sample submission. Possible values are: userDefined, alwaysPrompt,
    * promptBeforeSendingPersonalData, neverSendData, sendAllDataWithoutPrompting.
    */
  var defenderPromptForSampleSubmission: js.UndefOr[DefenderPromptForSampleSubmission] = js.native
  // Indicates whether or not to require behavior monitoring.
  var defenderRequireBehaviorMonitoring: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require cloud protection.
  var defenderRequireCloudProtection: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require network inspection system.
  var defenderRequireNetworkInspectionSystem: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require real time monitoring.
  var defenderRequireRealTimeMonitoring: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to scan archive files.
  var defenderScanArchiveFiles: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to scan downloads.
  var defenderScanDownloads: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to scan incoming mail messages.
  var defenderScanIncomingMail: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to scan mapped network drives during full scan.
  var defenderScanMappedNetworkDrivesDuringFullScan: js.UndefOr[Boolean] = js.native
  // Max CPU usage percentage during scan. Valid values 0 to 100
  var defenderScanMaxCpu: js.UndefOr[Double] = js.native
  // Indicates whether or not to scan files opened from a network folder.
  var defenderScanNetworkFiles: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to scan removable drives during full scan.
  var defenderScanRemovableDrivesDuringFullScan: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to scan scripts loaded in Internet Explorer browser.
  var defenderScanScriptsLoadedInInternetExplorer: js.UndefOr[Boolean] = js.native
  // The defender system scan type. Possible values are: userDefined, disabled, quick, full.
  var defenderScanType: js.UndefOr[DefenderScanType] = js.native
  // The time to perform a daily quick scan.
  var defenderScheduledQuickScanTime: js.UndefOr[String] = js.native
  // The defender time for the system scan.
  var defenderScheduledScanTime: js.UndefOr[String] = js.native
  // The signature update interval in hours. Specify 0 not to check. Valid values 0 to 24
  var defenderSignatureUpdateIntervalInHours: js.UndefOr[Double] = js.native
  /**
    * Defender day of the week for the system scan. Possible values are: userDefined, everyday, sunday, monday, tuesday,
    * wednesday, thursday, friday, saturday.
    */
  var defenderSystemScanSchedule: js.UndefOr[WeeklySchedule] = js.native
  // Indicates whether or not to allow developer unlock. Possible values are: notConfigured, blocked, allowed.
  var developerUnlockSetting: js.UndefOr[StateManagementSetting] = js.native
  // Indicates whether or not to Block the user from resetting their phone.
  var deviceManagementBlockFactoryResetOnMobile: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block the user from doing manual un-enrollment from device management.
  var deviceManagementBlockManualUnenroll: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets a value allowing the device to send diagnostic and usage telemetry data, such as Watson. Possible values
    * are: userDefined, none, basic, enhanced, full.
    */
  var diagnosticsDataSubmissionMode: js.UndefOr[DiagnosticDataSubmissionMode] = js.native
  /**
    * Allow users to change Start pages on Edge. Use the EdgeHomepageUrls to specify the Start pages that the user would see
    * by default when they open Edge.
    */
  var edgeAllowStartPagesModification: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to prevent access to about flags on Edge browser.
  var edgeBlockAccessToAboutFlags: js.UndefOr[Boolean] = js.native
  /**
    * Block the address bar dropdown functionality in Microsoft Edge. Disable this settings to minimize network connections
    * from Microsoft Edge to Microsoft services.
    */
  var edgeBlockAddressBarDropdown: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block auto fill.
  var edgeBlockAutofill: js.UndefOr[Boolean] = js.native
  /**
    * Block Microsoft compatibility list in Microsoft Edge. This list from Microsoft helps Edge properly display sites with
    * known compatibility issues.
    */
  var edgeBlockCompatibilityList: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block developer tools in the Edge browser.
  var edgeBlockDeveloperTools: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block extensions in the Edge browser.
  var edgeBlockExtensions: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block InPrivate browsing on corporate networks, in the Edge browser.
  var edgeBlockInPrivateBrowsing: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block the user from using JavaScript.
  var edgeBlockJavaScript: js.UndefOr[Boolean] = js.native
  /**
    * Block the collection of information by Microsoft for live tile creation when users pin a site to Start from Microsoft
    * Edge.
    */
  var edgeBlockLiveTileDataCollection: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block password manager.
  var edgeBlockPasswordManager: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block popups.
  var edgeBlockPopups: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using the search suggestions in the address bar.
  var edgeBlockSearchSuggestions: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block the user from sending the do not track header.
  var edgeBlockSendingDoNotTrackHeader: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. Note: the name of this property
    * is misleading; the property is obsolete, use EdgeSendIntranetTrafficToInternetExplorer instead.
    */
  var edgeBlockSendingIntranetTrafficToInternetExplorer: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block the user from using the Edge browser.
  var edgeBlocked: js.UndefOr[Boolean] = js.native
  // Clear browsing data on exiting Microsoft Edge.
  var edgeClearBrowsingDataOnExit: js.UndefOr[Boolean] = js.native
  /**
    * Indicates which cookies to block in the Edge browser. Possible values are: userDefined, allow, blockThirdParty,
    * blockAll.
    */
  var edgeCookiePolicy: js.UndefOr[EdgeCookiePolicy] = js.native
  /**
    * Block the Microsoft web page that opens on the first use of Microsoft Edge. This policy allows enterprises, like those
    * enrolled in zero emissions configurations, to block this page.
    */
  var edgeDisableFirstRunPage: js.UndefOr[Boolean] = js.native
  // Indicates the enterprise mode site list location. Could be a local file, local network or http location.
  var edgeEnterpriseModeSiteListLocation: js.UndefOr[String] = js.native
  // The first run URL for when Edge browser is opened for the first time.
  var edgeFirstRunUrl: js.UndefOr[String] = js.native
  // The list of URLs for homepages shodwn on MDM-enrolled devices on Edge browser.
  var edgeHomepageUrls: js.UndefOr[js.Array[String]] = js.native
  // Indicates whether or not to Require the user to use the smart screen filter.
  var edgeRequireSmartScreen: js.UndefOr[Boolean] = js.native
  /**
    * Allows IT admins to set a default search engine for MDM-Controlled devices. Users can override this and change their
    * default search engine provided the AllowSearchEngineCustomization policy is not set.
    */
  var edgeSearchEngine: js.UndefOr[EdgeSearchEngineBase] = js.native
  // Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer.
  var edgeSendIntranetTrafficToInternetExplorer: js.UndefOr[Boolean] = js.native
  /**
    * Enable favorites sync between Internet Explorer and Microsoft Edge. Additions, deletions, modifications and order
    * changes to favorites are shared between browsers.
    */
  var edgeSyncFavoritesWithInternetExplorer: js.UndefOr[Boolean] = js.native
  // Endpoint for discovering cloud printers.
  var enterpriseCloudPrintDiscoveryEndPoint: js.UndefOr[String] = js.native
  /**
    * Maximum number of printers that should be queried from a discovery endpoint. This is a mobile only setting. Valid
    * values 1 to 65535
    */
  var enterpriseCloudPrintDiscoveryMaxLimit: js.UndefOr[Double] = js.native
  // OAuth resource URI for printer discovery service as configured in Azure portal.
  var enterpriseCloudPrintMopriaDiscoveryResourceIdentifier: js.UndefOr[String] = js.native
  // Authentication endpoint for acquiring OAuth tokens.
  var enterpriseCloudPrintOAuthAuthority: js.UndefOr[String] = js.native
  // GUID of a client application authorized to retrieve OAuth tokens from the OAuth Authority.
  var enterpriseCloudPrintOAuthClientIdentifier: js.UndefOr[String] = js.native
  // OAuth resource URI for print service as configured in the Azure portal.
  var enterpriseCloudPrintResourceIdentifier: js.UndefOr[String] = js.native
  // Indicates whether or not to enable device discovery UX.
  var experienceBlockDeviceDiscovery: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow the error dialog from displaying if no SIM card is detected.
  var experienceBlockErrorDialogWhenNoSIM: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to enable task switching on the device.
  var experienceBlockTaskSwitcher: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block DVR and broadcasting.
  var gameDvrBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block the user from using internet sharing.
  var internetSharingBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block the user from location services.
  var locationServicesBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Specify whether to show a user-configurable setting to control the screen timeout while on the lock screen of Windows
    * 10 Mobile devices. If this policy is set to Allow, the value set by lockScreenTimeoutInSeconds is ignored.
    */
  var lockScreenAllowTimeoutConfiguration: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block action center notifications over lock screen.
  var lockScreenBlockActionCenterNotifications: js.UndefOr[Boolean] = js.native
  // Indicates whether or not the user can interact with Cortana using speech while the system is locked.
  var lockScreenBlockCortana: js.UndefOr[Boolean] = js.native
  // Indicates whether to allow toast notifications above the device lock screen.
  var lockScreenBlockToastNotifications: js.UndefOr[Boolean] = js.native
  /**
    * Set the duration (in seconds) from the screen locking to the screen turning off for Windows 10 Mobile devices.
    * Supported values are 11-1800. Valid values 11 to 1800
    */
  var lockScreenTimeoutInSeconds: js.UndefOr[Double] = js.native
  // Disables the ability to quickly switch between users that are logged on simultaneously without logging off.
  var logonBlockFastUserSwitching: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block Microsoft account settings sync.
  var microsoftAccountBlockSettingsSync: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block a Microsoft account.
  var microsoftAccountBlocked: js.UndefOr[Boolean] = js.native
  /**
    * If set, proxy settings will be applied to all processes and accounts in the device. Otherwise, it will be applied to
    * the user account that’s enrolled into MDM.
    */
  var networkProxyApplySettingsDeviceWide: js.UndefOr[Boolean] = js.native
  // Address to the proxy auto-config (PAC) script you want to use.
  var networkProxyAutomaticConfigurationUrl: js.UndefOr[String] = js.native
  /**
    * Disable automatic detection of settings. If enabled, the system will try to find the path to a proxy auto-config (PAC)
    * script.
    */
  var networkProxyDisableAutoDetect: js.UndefOr[Boolean] = js.native
  // Specifies manual proxy server settings.
  var networkProxyServer: js.UndefOr[Windows10NetworkProxyServer] = js.native
  // Indicates whether or not to Block the user from using near field communication.
  var nfcBlocked: js.UndefOr[Boolean] = js.native
  // Gets or sets a value allowing IT admins to prevent apps and features from working with files on OneDrive.
  var oneDriveDisableFileSync: js.UndefOr[Boolean] = js.native
  /**
    * Specify whether PINs or passwords such as '1111' or '1234' are allowed. For Windows 10 desktops, it also controls the
    * use of picture passwords.
    */
  var passwordBlockSimple: js.UndefOr[Boolean] = js.native
  // The password expiration in days. Valid values 0 to 730
  var passwordExpirationDays: js.UndefOr[Double] = js.native
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[Double] = js.native
  // The minimum password length. Valid values 4 to 16
  var passwordMinimumLength: js.UndefOr[Double] = js.native
  // The minutes of inactivity before the screen times out.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.native
  // The number of previous passwords to prevent reuse of. Valid values 0 to 50
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.native
  // Indicates whether or not to require a password upon resuming from an idle state.
  var passwordRequireWhenResumeFromIdleState: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require the user to have a password.
  var passwordRequired: js.UndefOr[Boolean] = js.native
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.native
  // The number of sign in failures before factory reset. Valid values 0 to 999
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.native
  /**
    * A http or https Url to a jpg, jpeg or png image that needs to be downloaded and used as the Desktop Image or a file Url
    * to a local image on the file system that needs to used as the Desktop Image.
    */
  var personalizationDesktopImageUrl: js.UndefOr[String] = js.native
  /**
    * A http or https Url to a jpg, jpeg or png image that neeeds to be downloaded and used as the Lock Screen Image or a
    * file Url to a local image on the file system that needs to be used as the Lock Screen Image.
    */
  var personalizationLockScreenImageUrl: js.UndefOr[String] = js.native
  /**
    * Enables or disables the use of advertising ID. Added in Windows 10, version 1607. Possible values are: notConfigured,
    * blocked, allowed.
    */
  var privacyAdvertisingId: js.UndefOr[StateManagementSetting] = js.native
  /**
    * Indicates whether or not to allow the automatic acceptance of the pairing and privacy user consent dialog when
    * launching apps.
    */
  var privacyAutoAcceptPairingAndConsentPrompts: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to block the usage of cloud based speech services for Cortana, Dictation, or Store
    * applications.
    */
  var privacyBlockInputPersonalization: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block the user from reset protection mode.
  var resetProtectionModeBlocked: js.UndefOr[Boolean] = js.native
  // Specifies what filter level of safe search is required. Possible values are: userDefined, strict, moderate.
  var safeSearchFilter: js.UndefOr[SafeSearchFilterType] = js.native
  // Indicates whether or not to Block the user from taking Screenshots.
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.native
  // Specifies if search can use diacritics.
  var searchBlockDiacritics: js.UndefOr[Boolean] = js.native
  // Specifies whether to use automatic language detection when indexing content and properties.
  var searchDisableAutoLanguageDetection: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to disable the search indexer backoff feature.
  var searchDisableIndexerBackoff: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to block indexing of WIP-protected items to prevent them from appearing in search results for
    * Cortana or Explorer.
    */
  var searchDisableIndexingEncryptedItems: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow users to add locations on removable drives to libraries and to be indexed.
  var searchDisableIndexingRemovableDrive: js.UndefOr[Boolean] = js.native
  // Specifies minimum amount of hard drive space on the same drive as the index location before indexing stops.
  var searchEnableAutomaticIndexSizeManangement: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block remote queries of this computer’s index.
  var searchEnableRemoteQueries: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block access to Accounts in Settings app.
  var settingsBlockAccountsPage: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from installing provisioning packages.
  var settingsBlockAddProvisioningPackage: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block access to Apps in Settings app.
  var settingsBlockAppsPage: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from changing the language settings.
  var settingsBlockChangeLanguage: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from changing power and sleep settings.
  var settingsBlockChangePowerSleep: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from changing the region settings.
  var settingsBlockChangeRegion: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from changing date and time settings.
  var settingsBlockChangeSystemTime: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block access to Devices in Settings app.
  var settingsBlockDevicesPage: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block access to Ease of Access in Settings app.
  var settingsBlockEaseOfAccessPage: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from editing the device name.
  var settingsBlockEditDeviceName: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block access to Gaming in Settings app.
  var settingsBlockGamingPage: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block access to Network &amp; Internet in Settings app.
  var settingsBlockNetworkInternetPage: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block access to Personalization in Settings app.
  var settingsBlockPersonalizationPage: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block access to Privacy in Settings app.
  var settingsBlockPrivacyPage: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the runtime configuration agent from removing provisioning packages.
  var settingsBlockRemoveProvisioningPackage: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block access to Settings app.
  var settingsBlockSettingsApp: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block access to System in Settings app.
  var settingsBlockSystemPage: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block access to Time &amp; Language in Settings app.
  var settingsBlockTimeLanguagePage: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block access to Update &amp; Security in Settings app.
  var settingsBlockUpdateSecurityPage: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block multiple users of the same app to share data.
  var sharedUserAppDataAllowed: js.UndefOr[Boolean] = js.native
  // Indicates whether or not users can override SmartScreen Filter warnings about potentially malicious websites.
  var smartScreenBlockPromptOverride: js.UndefOr[Boolean] = js.native
  // Indicates whether or not users can override the SmartScreen Filter warnings about downloading unverified files
  var smartScreenBlockPromptOverrideForFiles: js.UndefOr[Boolean] = js.native
  // Allows IT Admins to control whether users are allowed to install apps from places other than the Store.
  var smartScreenEnableAppInstallControl: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from unpinning apps from taskbar.
  var startBlockUnpinningAppsFromTaskbar: js.UndefOr[Boolean] = js.native
  /**
    * Setting the value of this collapses the app list, removes the app list entirely, or disables the corresponding toggle
    * in the Settings app. Possible values are: userDefined, collapse, remove, disableSettingsApp.
    */
  var startMenuAppListVisibility: js.UndefOr[WindowsStartMenuAppListVisibilityType] = js.native
  // Enabling this policy hides the change account setting from appearing in the user tile in the start menu.
  var startMenuHideChangeAccountSettings: js.UndefOr[Boolean] = js.native
  /**
    * Enabling this policy hides the most used apps from appearing on the start menu and disables the corresponding toggle in
    * the Settings app.
    */
  var startMenuHideFrequentlyUsedApps: js.UndefOr[Boolean] = js.native
  // Enabling this policy hides hibernate from appearing in the power button in the start menu.
  var startMenuHideHibernate: js.UndefOr[Boolean] = js.native
  // Enabling this policy hides lock from appearing in the user tile in the start menu.
  var startMenuHideLock: js.UndefOr[Boolean] = js.native
  // Enabling this policy hides the power button from appearing in the start menu.
  var startMenuHidePowerButton: js.UndefOr[Boolean] = js.native
  /**
    * Enabling this policy hides recent jump lists from appearing on the start menu/taskbar and disables the corresponding
    * toggle in the Settings app.
    */
  var startMenuHideRecentJumpLists: js.UndefOr[Boolean] = js.native
  /**
    * Enabling this policy hides recently added apps from appearing on the start menu and disables the corresponding toggle
    * in the Settings app.
    */
  var startMenuHideRecentlyAddedApps: js.UndefOr[Boolean] = js.native
  // Enabling this policy hides 'Restart/Update and Restart' from appearing in the power button in the start menu.
  var startMenuHideRestartOptions: js.UndefOr[Boolean] = js.native
  // Enabling this policy hides shut down/update and shut down from appearing in the power button in the start menu.
  var startMenuHideShutDown: js.UndefOr[Boolean] = js.native
  // Enabling this policy hides sign out from appearing in the user tile in the start menu.
  var startMenuHideSignOut: js.UndefOr[Boolean] = js.native
  // Enabling this policy hides sleep from appearing in the power button in the start menu.
  var startMenuHideSleep: js.UndefOr[Boolean] = js.native
  // Enabling this policy hides switch account from appearing in the user tile in the start menu.
  var startMenuHideSwitchAccount: js.UndefOr[Boolean] = js.native
  // Enabling this policy hides the user tile from appearing in the start menu.
  var startMenuHideUserTile: js.UndefOr[Boolean] = js.native
  /**
    * This policy setting allows you to import Edge assets to be used with startMenuLayoutXml policy. Start layout can
    * contain secondary tile from Edge app which looks for Edge local asset file. Edge local asset would not exist and cause
    * Edge secondary tile to appear empty in this case. This policy only gets applied when startMenuLayoutXml policy is
    * modified. The value should be a UTF-8 Base64 encoded byte array.
    */
  var startMenuLayoutEdgeAssetsXml: js.UndefOr[Double] = js.native
  /**
    * Allows admins to override the default Start menu layout and prevents the user from changing it. The layout is modified
    * by specifying an XML file based on a layout modification schema. XML needs to be in a UTF8 encoded byte array format.
    */
  var startMenuLayoutXml: js.UndefOr[Double] = js.native
  // Allows admins to decide how the Start menu is displayed. Possible values are: userDefined, fullScreen, nonFullScreen.
  var startMenuMode: js.UndefOr[WindowsStartMenuModeType] = js.native
  /**
    * Enforces the visibility (Show/Hide) of the Documents folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderDocuments: js.UndefOr[VisibilitySetting] = js.native
  /**
    * Enforces the visibility (Show/Hide) of the Downloads folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderDownloads: js.UndefOr[VisibilitySetting] = js.native
  /**
    * Enforces the visibility (Show/Hide) of the FileExplorer shortcut on the Start menu. Possible values are: notConfigured,
    * hide, show.
    */
  var startMenuPinnedFolderFileExplorer: js.UndefOr[VisibilitySetting] = js.native
  /**
    * Enforces the visibility (Show/Hide) of the HomeGroup folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderHomeGroup: js.UndefOr[VisibilitySetting] = js.native
  /**
    * Enforces the visibility (Show/Hide) of the Music folder shortcut on the Start menu. Possible values are: notConfigured,
    * hide, show.
    */
  var startMenuPinnedFolderMusic: js.UndefOr[VisibilitySetting] = js.native
  /**
    * Enforces the visibility (Show/Hide) of the Network folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderNetwork: js.UndefOr[VisibilitySetting] = js.native
  /**
    * Enforces the visibility (Show/Hide) of the PersonalFolder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderPersonalFolder: js.UndefOr[VisibilitySetting] = js.native
  /**
    * Enforces the visibility (Show/Hide) of the Pictures folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderPictures: js.UndefOr[VisibilitySetting] = js.native
  /**
    * Enforces the visibility (Show/Hide) of the Settings folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderSettings: js.UndefOr[VisibilitySetting] = js.native
  /**
    * Enforces the visibility (Show/Hide) of the Videos folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderVideos: js.UndefOr[VisibilitySetting] = js.native
  // Indicates whether or not to Block the user from using removable storage.
  var storageBlockRemovableStorage: js.UndefOr[Boolean] = js.native
  // Indicating whether or not to require encryption on a mobile device.
  var storageRequireMobileDeviceEncryption: js.UndefOr[Boolean] = js.native
  // Indicates whether application data is restricted to the system drive.
  var storageRestrictAppDataToSystemVolume: js.UndefOr[Boolean] = js.native
  // Indicates whether the installation of applications is restricted to the system drive.
  var storageRestrictAppInstallToSystemVolume: js.UndefOr[Boolean] = js.native
  // Whether the device is required to connect to the network.
  var tenantLockdownRequireNetworkDuringOutOfBoxExperience: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block the user from USB connection.
  var usbBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block the user from voice recording.
  var voiceRecordingBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not user's localhost IP address is displayed while making phone calls using the WebRTC
  var webRtcBlockLocalhostIpAddress: js.UndefOr[Boolean] = js.native
  // Indicating whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
  var wiFiBlockAutomaticConnectHotspots: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block the user from using Wi-Fi manual configuration.
  var wiFiBlockManualConfiguration: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block the user from using Wi-Fi.
  var wiFiBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Specify how often devices scan for Wi-Fi networks. Supported values are 1-500, where 100 = default, and 500 = low
    * frequency. Valid values 1 to 500
    */
  var wiFiScanInterval: js.UndefOr[Double] = js.native
  /**
    * Allows IT admins to block experiences that are typically for consumers only, such as Start suggestions, Membership
    * notifications, Post-OOBE app install and redirect tiles.
    */
  var windowsSpotlightBlockConsumerSpecificFeatures: js.UndefOr[Boolean] = js.native
  /**
    * Block suggestions from Microsoft that show after each OS clean install, upgrade or in an on-going basis to introduce
    * users to what is new or changed
    */
  var windowsSpotlightBlockOnActionCenter: js.UndefOr[Boolean] = js.native
  // Block personalized content in Windows spotlight based on user’s device usage.
  var windowsSpotlightBlockTailoredExperiences: js.UndefOr[Boolean] = js.native
  // Block third party content delivered via Windows Spotlight
  var windowsSpotlightBlockThirdPartyNotifications: js.UndefOr[Boolean] = js.native
  // Block Windows Spotlight Windows welcome experience
  var windowsSpotlightBlockWelcomeExperience: js.UndefOr[Boolean] = js.native
  // Allows IT admins to turn off the popup of Windows Tips.
  var windowsSpotlightBlockWindowsTips: js.UndefOr[Boolean] = js.native
  // Allows IT admins to turn off all Windows Spotlight features
  var windowsSpotlightBlocked: js.UndefOr[Boolean] = js.native
  // Specifies the type of Spotlight. Possible values are: notConfigured, disabled, enabled.
  var windowsSpotlightConfigureOnLockScreen: js.UndefOr[WindowsSpotlightEnablementSettings] = js.native
  // Indicates whether or not to block automatic update of apps from Windows Store.
  var windowsStoreBlockAutoUpdate: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block the user from using the Windows store.
  var windowsStoreBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to enable Private Store Only.
  var windowsStoreEnablePrivateStoreOnly: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow other devices from discovering this PC for projection.
  var wirelessDisplayBlockProjectionToThisDevice: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow user input from wireless display receiver.
  var wirelessDisplayBlockUserInputFromReceiver: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require a PIN for new devices to initiate pairing.
  var wirelessDisplayRequirePinForPairing: js.UndefOr[Boolean] = js.native
}

object Windows10GeneralConfiguration {
  @scala.inline
  def apply(): Windows10GeneralConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10GeneralConfiguration]
  }
  @scala.inline
  implicit class Windows10GeneralConfigurationOps[Self <: Windows10GeneralConfiguration] (val x: Self) extends AnyVal {
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
    def withAntiTheftModeBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antiTheftModeBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAntiTheftModeBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antiTheftModeBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withAppsAllowTrustedAppsSideloading(value: StateManagementSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsAllowTrustedAppsSideloading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppsAllowTrustedAppsSideloading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsAllowTrustedAppsSideloading")(js.undefined)
        ret
    }
    @scala.inline
    def withAppsBlockWindowsStoreOriginatedApps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsBlockWindowsStoreOriginatedApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppsBlockWindowsStoreOriginatedApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsBlockWindowsStoreOriginatedApps")(js.undefined)
        ret
    }
    @scala.inline
    def withBluetoothAllowedServices(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothAllowedServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBluetoothAllowedServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothAllowedServices")(js.undefined)
        ret
    }
    @scala.inline
    def withBluetoothBlockAdvertising(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothBlockAdvertising")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBluetoothBlockAdvertising: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothBlockAdvertising")(js.undefined)
        ret
    }
    @scala.inline
    def withBluetoothBlockDiscoverableMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothBlockDiscoverableMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBluetoothBlockDiscoverableMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothBlockDiscoverableMode")(js.undefined)
        ret
    }
    @scala.inline
    def withBluetoothBlockPrePairing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothBlockPrePairing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBluetoothBlockPrePairing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothBlockPrePairing")(js.undefined)
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
    def withCellularBlockDataWhenRoaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockDataWhenRoaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellularBlockDataWhenRoaming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockDataWhenRoaming")(js.undefined)
        ret
    }
    @scala.inline
    def withCellularBlockVpn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockVpn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellularBlockVpn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockVpn")(js.undefined)
        ret
    }
    @scala.inline
    def withCellularBlockVpnWhenRoaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockVpnWhenRoaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellularBlockVpnWhenRoaming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockVpnWhenRoaming")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificatesBlockManualRootCertificateInstallation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatesBlockManualRootCertificateInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificatesBlockManualRootCertificateInstallation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatesBlockManualRootCertificateInstallation")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectedDevicesServiceBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectedDevicesServiceBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectedDevicesServiceBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectedDevicesServiceBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyPasteBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyPasteBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyPasteBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyPasteBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withCortanaBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cortanaBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCortanaBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cortanaBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderBlockEndUserAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderBlockEndUserAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderBlockEndUserAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderBlockEndUserAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderCloudBlockLevel(value: DefenderCloudBlockLevelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderCloudBlockLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderCloudBlockLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderCloudBlockLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderDaysBeforeDeletingQuarantinedMalware(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderDaysBeforeDeletingQuarantinedMalware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderDaysBeforeDeletingQuarantinedMalware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderDaysBeforeDeletingQuarantinedMalware")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderDetectedMalwareActions(value: DefenderDetectedMalwareActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderDetectedMalwareActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderDetectedMalwareActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderDetectedMalwareActions")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderFileExtensionsToExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderFileExtensionsToExclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderFileExtensionsToExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderFileExtensionsToExclude")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderFilesAndFoldersToExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderFilesAndFoldersToExclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderFilesAndFoldersToExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderFilesAndFoldersToExclude")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderMonitorFileActivity(value: DefenderMonitorFileActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderMonitorFileActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderMonitorFileActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderMonitorFileActivity")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderProcessesToExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderProcessesToExclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderProcessesToExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderProcessesToExclude")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderPromptForSampleSubmission(value: DefenderPromptForSampleSubmission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderPromptForSampleSubmission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderPromptForSampleSubmission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderPromptForSampleSubmission")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderRequireBehaviorMonitoring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderRequireBehaviorMonitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderRequireBehaviorMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderRequireBehaviorMonitoring")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderRequireCloudProtection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderRequireCloudProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderRequireCloudProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderRequireCloudProtection")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderRequireNetworkInspectionSystem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderRequireNetworkInspectionSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderRequireNetworkInspectionSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderRequireNetworkInspectionSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderRequireRealTimeMonitoring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderRequireRealTimeMonitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderRequireRealTimeMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderRequireRealTimeMonitoring")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderScanArchiveFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScanArchiveFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderScanArchiveFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScanArchiveFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderScanDownloads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScanDownloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderScanDownloads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScanDownloads")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderScanIncomingMail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScanIncomingMail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderScanIncomingMail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScanIncomingMail")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderScanMappedNetworkDrivesDuringFullScan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScanMappedNetworkDrivesDuringFullScan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderScanMappedNetworkDrivesDuringFullScan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScanMappedNetworkDrivesDuringFullScan")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderScanMaxCpu(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScanMaxCpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderScanMaxCpu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScanMaxCpu")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderScanNetworkFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScanNetworkFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderScanNetworkFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScanNetworkFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderScanRemovableDrivesDuringFullScan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScanRemovableDrivesDuringFullScan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderScanRemovableDrivesDuringFullScan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScanRemovableDrivesDuringFullScan")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderScanScriptsLoadedInInternetExplorer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScanScriptsLoadedInInternetExplorer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderScanScriptsLoadedInInternetExplorer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScanScriptsLoadedInInternetExplorer")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderScanType(value: DefenderScanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScanType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderScanType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScanType")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderScheduledQuickScanTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScheduledQuickScanTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderScheduledQuickScanTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScheduledQuickScanTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderScheduledScanTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScheduledScanTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderScheduledScanTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderScheduledScanTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderSignatureUpdateIntervalInHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderSignatureUpdateIntervalInHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderSignatureUpdateIntervalInHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderSignatureUpdateIntervalInHours")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderSystemScanSchedule(value: WeeklySchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderSystemScanSchedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderSystemScanSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderSystemScanSchedule")(js.undefined)
        ret
    }
    @scala.inline
    def withDeveloperUnlockSetting(value: StateManagementSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerUnlockSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperUnlockSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerUnlockSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceManagementBlockFactoryResetOnMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceManagementBlockFactoryResetOnMobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceManagementBlockFactoryResetOnMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceManagementBlockFactoryResetOnMobile")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceManagementBlockManualUnenroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceManagementBlockManualUnenroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceManagementBlockManualUnenroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceManagementBlockManualUnenroll")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagnosticsDataSubmissionMode(value: DiagnosticDataSubmissionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosticsDataSubmissionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagnosticsDataSubmissionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosticsDataSubmissionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeAllowStartPagesModification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeAllowStartPagesModification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeAllowStartPagesModification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeAllowStartPagesModification")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeBlockAccessToAboutFlags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockAccessToAboutFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeBlockAccessToAboutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockAccessToAboutFlags")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeBlockAddressBarDropdown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockAddressBarDropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeBlockAddressBarDropdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockAddressBarDropdown")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeBlockAutofill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockAutofill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeBlockAutofill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockAutofill")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeBlockCompatibilityList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockCompatibilityList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeBlockCompatibilityList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockCompatibilityList")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeBlockDeveloperTools(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockDeveloperTools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeBlockDeveloperTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockDeveloperTools")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeBlockExtensions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeBlockExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeBlockInPrivateBrowsing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockInPrivateBrowsing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeBlockInPrivateBrowsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockInPrivateBrowsing")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeBlockJavaScript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockJavaScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeBlockJavaScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockJavaScript")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeBlockLiveTileDataCollection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockLiveTileDataCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeBlockLiveTileDataCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockLiveTileDataCollection")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeBlockPasswordManager(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockPasswordManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeBlockPasswordManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockPasswordManager")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeBlockPopups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockPopups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeBlockPopups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockPopups")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeBlockSearchSuggestions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockSearchSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeBlockSearchSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockSearchSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeBlockSendingDoNotTrackHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockSendingDoNotTrackHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeBlockSendingDoNotTrackHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockSendingDoNotTrackHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeBlockSendingIntranetTrafficToInternetExplorer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockSendingIntranetTrafficToInternetExplorer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeBlockSendingIntranetTrafficToInternetExplorer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlockSendingIntranetTrafficToInternetExplorer")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeClearBrowsingDataOnExit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeClearBrowsingDataOnExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeClearBrowsingDataOnExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeClearBrowsingDataOnExit")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeCookiePolicy(value: EdgeCookiePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeCookiePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeCookiePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeCookiePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeDisableFirstRunPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeDisableFirstRunPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeDisableFirstRunPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeDisableFirstRunPage")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeEnterpriseModeSiteListLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeEnterpriseModeSiteListLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeEnterpriseModeSiteListLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeEnterpriseModeSiteListLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeFirstRunUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeFirstRunUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeFirstRunUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeFirstRunUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeHomepageUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeHomepageUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeHomepageUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeHomepageUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeRequireSmartScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeRequireSmartScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeRequireSmartScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeRequireSmartScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeSearchEngine(value: EdgeSearchEngineBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeSearchEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeSearchEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeSearchEngine")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeSendIntranetTrafficToInternetExplorer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeSendIntranetTrafficToInternetExplorer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeSendIntranetTrafficToInternetExplorer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeSendIntranetTrafficToInternetExplorer")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeSyncFavoritesWithInternetExplorer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeSyncFavoritesWithInternetExplorer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeSyncFavoritesWithInternetExplorer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeSyncFavoritesWithInternetExplorer")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterpriseCloudPrintDiscoveryEndPoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseCloudPrintDiscoveryEndPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterpriseCloudPrintDiscoveryEndPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseCloudPrintDiscoveryEndPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterpriseCloudPrintDiscoveryMaxLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseCloudPrintDiscoveryMaxLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterpriseCloudPrintDiscoveryMaxLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseCloudPrintDiscoveryMaxLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseCloudPrintMopriaDiscoveryResourceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseCloudPrintMopriaDiscoveryResourceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterpriseCloudPrintOAuthAuthority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseCloudPrintOAuthAuthority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterpriseCloudPrintOAuthAuthority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseCloudPrintOAuthAuthority")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterpriseCloudPrintOAuthClientIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseCloudPrintOAuthClientIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterpriseCloudPrintOAuthClientIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseCloudPrintOAuthClientIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterpriseCloudPrintResourceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseCloudPrintResourceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterpriseCloudPrintResourceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseCloudPrintResourceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withExperienceBlockDeviceDiscovery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experienceBlockDeviceDiscovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperienceBlockDeviceDiscovery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experienceBlockDeviceDiscovery")(js.undefined)
        ret
    }
    @scala.inline
    def withExperienceBlockErrorDialogWhenNoSIM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experienceBlockErrorDialogWhenNoSIM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperienceBlockErrorDialogWhenNoSIM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experienceBlockErrorDialogWhenNoSIM")(js.undefined)
        ret
    }
    @scala.inline
    def withExperienceBlockTaskSwitcher(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experienceBlockTaskSwitcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperienceBlockTaskSwitcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experienceBlockTaskSwitcher")(js.undefined)
        ret
    }
    @scala.inline
    def withGameDvrBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameDvrBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameDvrBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameDvrBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withInternetSharingBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internetSharingBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternetSharingBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internetSharingBlocked")(js.undefined)
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
    def withLockScreenAllowTimeoutConfiguration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenAllowTimeoutConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockScreenAllowTimeoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenAllowTimeoutConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withLockScreenBlockActionCenterNotifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenBlockActionCenterNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockScreenBlockActionCenterNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenBlockActionCenterNotifications")(js.undefined)
        ret
    }
    @scala.inline
    def withLockScreenBlockCortana(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenBlockCortana")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockScreenBlockCortana: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenBlockCortana")(js.undefined)
        ret
    }
    @scala.inline
    def withLockScreenBlockToastNotifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenBlockToastNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockScreenBlockToastNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenBlockToastNotifications")(js.undefined)
        ret
    }
    @scala.inline
    def withLockScreenTimeoutInSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenTimeoutInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockScreenTimeoutInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenTimeoutInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withLogonBlockFastUserSwitching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logonBlockFastUserSwitching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogonBlockFastUserSwitching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logonBlockFastUserSwitching")(js.undefined)
        ret
    }
    @scala.inline
    def withMicrosoftAccountBlockSettingsSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsoftAccountBlockSettingsSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicrosoftAccountBlockSettingsSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsoftAccountBlockSettingsSync")(js.undefined)
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
    def withNetworkProxyApplySettingsDeviceWide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkProxyApplySettingsDeviceWide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkProxyApplySettingsDeviceWide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkProxyApplySettingsDeviceWide")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkProxyAutomaticConfigurationUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkProxyAutomaticConfigurationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkProxyAutomaticConfigurationUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkProxyAutomaticConfigurationUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkProxyDisableAutoDetect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkProxyDisableAutoDetect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkProxyDisableAutoDetect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkProxyDisableAutoDetect")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkProxyServer(value: Windows10NetworkProxyServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkProxyServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkProxyServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkProxyServer")(js.undefined)
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
    def withOneDriveDisableFileSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneDriveDisableFileSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneDriveDisableFileSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneDriveDisableFileSync")(js.undefined)
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
    def withPasswordRequireWhenResumeFromIdleState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordRequireWhenResumeFromIdleState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordRequireWhenResumeFromIdleState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordRequireWhenResumeFromIdleState")(js.undefined)
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
    def withPersonalizationDesktopImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalizationDesktopImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonalizationDesktopImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalizationDesktopImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonalizationLockScreenImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalizationLockScreenImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonalizationLockScreenImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalizationLockScreenImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivacyAdvertisingId(value: StateManagementSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyAdvertisingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacyAdvertisingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyAdvertisingId")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivacyAutoAcceptPairingAndConsentPrompts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyAutoAcceptPairingAndConsentPrompts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacyAutoAcceptPairingAndConsentPrompts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyAutoAcceptPairingAndConsentPrompts")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivacyBlockInputPersonalization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyBlockInputPersonalization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacyBlockInputPersonalization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyBlockInputPersonalization")(js.undefined)
        ret
    }
    @scala.inline
    def withResetProtectionModeBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetProtectionModeBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetProtectionModeBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetProtectionModeBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeSearchFilter(value: SafeSearchFilterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeSearchFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeSearchFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeSearchFilter")(js.undefined)
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
    def withSearchBlockDiacritics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBlockDiacritics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchBlockDiacritics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBlockDiacritics")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchDisableAutoLanguageDetection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDisableAutoLanguageDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchDisableAutoLanguageDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDisableAutoLanguageDetection")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchDisableIndexerBackoff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDisableIndexerBackoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchDisableIndexerBackoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDisableIndexerBackoff")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchDisableIndexingEncryptedItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDisableIndexingEncryptedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchDisableIndexingEncryptedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDisableIndexingEncryptedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchDisableIndexingRemovableDrive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDisableIndexingRemovableDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchDisableIndexingRemovableDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDisableIndexingRemovableDrive")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchEnableAutomaticIndexSizeManangement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchEnableAutomaticIndexSizeManangement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchEnableAutomaticIndexSizeManangement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchEnableAutomaticIndexSizeManangement")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchEnableRemoteQueries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchEnableRemoteQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchEnableRemoteQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchEnableRemoteQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockAccountsPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockAccountsPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockAccountsPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockAccountsPage")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockAddProvisioningPackage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockAddProvisioningPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockAddProvisioningPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockAddProvisioningPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockAppsPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockAppsPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockAppsPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockAppsPage")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockChangeLanguage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockChangeLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockChangeLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockChangeLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockChangePowerSleep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockChangePowerSleep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockChangePowerSleep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockChangePowerSleep")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockChangeRegion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockChangeRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockChangeRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockChangeRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockChangeSystemTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockChangeSystemTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockChangeSystemTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockChangeSystemTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockDevicesPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockDevicesPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockDevicesPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockDevicesPage")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockEaseOfAccessPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockEaseOfAccessPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockEaseOfAccessPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockEaseOfAccessPage")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockEditDeviceName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockEditDeviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockEditDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockEditDeviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockGamingPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockGamingPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockGamingPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockGamingPage")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockNetworkInternetPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockNetworkInternetPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockNetworkInternetPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockNetworkInternetPage")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockPersonalizationPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockPersonalizationPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockPersonalizationPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockPersonalizationPage")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockPrivacyPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockPrivacyPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockPrivacyPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockPrivacyPage")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockRemoveProvisioningPackage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockRemoveProvisioningPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockRemoveProvisioningPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockRemoveProvisioningPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockSettingsApp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockSettingsApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockSettingsApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockSettingsApp")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockSystemPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockSystemPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockSystemPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockSystemPage")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockTimeLanguagePage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockTimeLanguagePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockTimeLanguagePage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockTimeLanguagePage")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsBlockUpdateSecurityPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockUpdateSecurityPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsBlockUpdateSecurityPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsBlockUpdateSecurityPage")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedUserAppDataAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedUserAppDataAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedUserAppDataAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedUserAppDataAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withSmartScreenBlockPromptOverride(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartScreenBlockPromptOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartScreenBlockPromptOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartScreenBlockPromptOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withSmartScreenBlockPromptOverrideForFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartScreenBlockPromptOverrideForFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartScreenBlockPromptOverrideForFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartScreenBlockPromptOverrideForFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withSmartScreenEnableAppInstallControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartScreenEnableAppInstallControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartScreenEnableAppInstallControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartScreenEnableAppInstallControl")(js.undefined)
        ret
    }
    @scala.inline
    def withStartBlockUnpinningAppsFromTaskbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startBlockUnpinningAppsFromTaskbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartBlockUnpinningAppsFromTaskbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startBlockUnpinningAppsFromTaskbar")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuAppListVisibility(value: WindowsStartMenuAppListVisibilityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuAppListVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuAppListVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuAppListVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuHideChangeAccountSettings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideChangeAccountSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuHideChangeAccountSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideChangeAccountSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuHideFrequentlyUsedApps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideFrequentlyUsedApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuHideFrequentlyUsedApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideFrequentlyUsedApps")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuHideHibernate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideHibernate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuHideHibernate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideHibernate")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuHideLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuHideLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideLock")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuHidePowerButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHidePowerButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuHidePowerButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHidePowerButton")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuHideRecentJumpLists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideRecentJumpLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuHideRecentJumpLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideRecentJumpLists")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuHideRecentlyAddedApps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideRecentlyAddedApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuHideRecentlyAddedApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideRecentlyAddedApps")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuHideRestartOptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideRestartOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuHideRestartOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideRestartOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuHideShutDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideShutDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuHideShutDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideShutDown")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuHideSignOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideSignOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuHideSignOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideSignOut")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuHideSleep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideSleep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuHideSleep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideSleep")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuHideSwitchAccount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideSwitchAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuHideSwitchAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideSwitchAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuHideUserTile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideUserTile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuHideUserTile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuHideUserTile")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuLayoutEdgeAssetsXml(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuLayoutEdgeAssetsXml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuLayoutEdgeAssetsXml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuLayoutEdgeAssetsXml")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuLayoutXml(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuLayoutXml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuLayoutXml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuLayoutXml")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuMode(value: WindowsStartMenuModeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuMode")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuPinnedFolderDocuments(value: VisibilitySetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderDocuments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuPinnedFolderDocuments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderDocuments")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuPinnedFolderDownloads(value: VisibilitySetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderDownloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuPinnedFolderDownloads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderDownloads")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuPinnedFolderFileExplorer(value: VisibilitySetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderFileExplorer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuPinnedFolderFileExplorer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderFileExplorer")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuPinnedFolderHomeGroup(value: VisibilitySetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderHomeGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuPinnedFolderHomeGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderHomeGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuPinnedFolderMusic(value: VisibilitySetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderMusic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuPinnedFolderMusic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderMusic")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuPinnedFolderNetwork(value: VisibilitySetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuPinnedFolderNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderNetwork")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuPinnedFolderPersonalFolder(value: VisibilitySetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderPersonalFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuPinnedFolderPersonalFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderPersonalFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuPinnedFolderPictures(value: VisibilitySetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderPictures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuPinnedFolderPictures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderPictures")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuPinnedFolderSettings(value: VisibilitySetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuPinnedFolderSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenuPinnedFolderVideos(value: VisibilitySetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderVideos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenuPinnedFolderVideos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenuPinnedFolderVideos")(js.undefined)
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
    def withStorageRequireMobileDeviceEncryption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageRequireMobileDeviceEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageRequireMobileDeviceEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageRequireMobileDeviceEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageRestrictAppDataToSystemVolume(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageRestrictAppDataToSystemVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageRestrictAppDataToSystemVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageRestrictAppDataToSystemVolume")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageRestrictAppInstallToSystemVolume(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageRestrictAppInstallToSystemVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageRestrictAppInstallToSystemVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageRestrictAppInstallToSystemVolume")(js.undefined)
        ret
    }
    @scala.inline
    def withTenantLockdownRequireNetworkDuringOutOfBoxExperience(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantLockdownRequireNetworkDuringOutOfBoxExperience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenantLockdownRequireNetworkDuringOutOfBoxExperience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantLockdownRequireNetworkDuringOutOfBoxExperience")(js.undefined)
        ret
    }
    @scala.inline
    def withUsbBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usbBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsbBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usbBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceRecordingBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceRecordingBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceRecordingBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceRecordingBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withWebRtcBlockLocalhostIpAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webRtcBlockLocalhostIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebRtcBlockLocalhostIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webRtcBlockLocalhostIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withWiFiBlockAutomaticConnectHotspots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wiFiBlockAutomaticConnectHotspots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWiFiBlockAutomaticConnectHotspots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wiFiBlockAutomaticConnectHotspots")(js.undefined)
        ret
    }
    @scala.inline
    def withWiFiBlockManualConfiguration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wiFiBlockManualConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWiFiBlockManualConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wiFiBlockManualConfiguration")(js.undefined)
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
    @scala.inline
    def withWiFiScanInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wiFiScanInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWiFiScanInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wiFiScanInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsSpotlightBlockConsumerSpecificFeatures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsSpotlightBlockConsumerSpecificFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsSpotlightBlockConsumerSpecificFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsSpotlightBlockConsumerSpecificFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsSpotlightBlockOnActionCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsSpotlightBlockOnActionCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsSpotlightBlockOnActionCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsSpotlightBlockOnActionCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsSpotlightBlockTailoredExperiences(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsSpotlightBlockTailoredExperiences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsSpotlightBlockTailoredExperiences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsSpotlightBlockTailoredExperiences")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsSpotlightBlockThirdPartyNotifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsSpotlightBlockThirdPartyNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsSpotlightBlockThirdPartyNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsSpotlightBlockThirdPartyNotifications")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsSpotlightBlockWelcomeExperience(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsSpotlightBlockWelcomeExperience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsSpotlightBlockWelcomeExperience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsSpotlightBlockWelcomeExperience")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsSpotlightBlockWindowsTips(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsSpotlightBlockWindowsTips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsSpotlightBlockWindowsTips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsSpotlightBlockWindowsTips")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsSpotlightBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsSpotlightBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsSpotlightBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsSpotlightBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsSpotlightConfigureOnLockScreen(value: WindowsSpotlightEnablementSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsSpotlightConfigureOnLockScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsSpotlightConfigureOnLockScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsSpotlightConfigureOnLockScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsStoreBlockAutoUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsStoreBlockAutoUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsStoreBlockAutoUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsStoreBlockAutoUpdate")(js.undefined)
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
    @scala.inline
    def withWindowsStoreEnablePrivateStoreOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsStoreEnablePrivateStoreOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsStoreEnablePrivateStoreOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsStoreEnablePrivateStoreOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withWirelessDisplayBlockProjectionToThisDevice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wirelessDisplayBlockProjectionToThisDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWirelessDisplayBlockProjectionToThisDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wirelessDisplayBlockProjectionToThisDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withWirelessDisplayBlockUserInputFromReceiver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wirelessDisplayBlockUserInputFromReceiver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWirelessDisplayBlockUserInputFromReceiver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wirelessDisplayBlockUserInputFromReceiver")(js.undefined)
        ret
    }
    @scala.inline
    def withWirelessDisplayRequirePinForPairing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wirelessDisplayRequirePinForPairing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWirelessDisplayRequirePinForPairing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wirelessDisplayRequirePinForPairing")(js.undefined)
        ret
    }
  }
  
}

