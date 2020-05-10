package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosGeneralDeviceConfiguration extends DeviceConfiguration {
  // Indicates whether or not to allow account modification when the device is in supervised mode.
  var accountBlockModification: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow activation lock when the device is in the supervised mode.
  var activationLockAllowWhenSupervised: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow AirDrop when the device is in supervised mode.
  var airDropBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to cause AirDrop to be considered an unmanaged drop target (iOS 9.0 and later).
  var airDropForceUnmanagedDropTarget: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to enforce all devices receiving AirPlay requests from this device to use a pairing password.
  var airPlayForcePairingPasswordForOutgoingRequests: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to block the automatic downloading of apps purchased on other devices when the device is in
    * supervised mode (iOS 9.0 and later).
    */
  var appStoreBlockAutomaticDownloads: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from making in app purchases.
  var appStoreBlockInAppPurchases: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to block the App Store app, not restricting installation through Host apps. Applies to
    * supervised mode only (iOS 9.0 and later).
    */
  var appStoreBlockUIAppInstallation: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using the App Store.
  var appStoreBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require a password when using the app store.
  var appStoreRequirePassword: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using News when the device is in supervised mode (iOS 9.0 and later).
  var appleNewsBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow Apple Watch pairing when the device is in supervised mode (iOS 9.0 and later).
  var appleWatchBlockPairing: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to force a paired Apple Watch to use Wrist Detection (iOS 8.2 and later).
  var appleWatchForceWristDetection: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets the list of iOS apps allowed to autonomously enter Single App Mode. Supervised only. iOS 7.0 and later.
    * This collection can contain a maximum of 500 elements.
    */
  var appsSingleAppModeList: js.UndefOr[js.Array[AppListItem]] = js.native
  /**
    * List of apps in the visibility list (either visible/launchable apps list or hidden/unlaunchable apps list, controlled
    * by AppsVisibilityListType) (iOS 9.3 and later). This collection can contain a maximum of 10000 elements.
    */
  var appsVisibilityList: js.UndefOr[js.Array[AppListItem]] = js.native
  // Type of list that is in the AppsVisibilityList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
  var appsVisibilityListType: js.UndefOr[AppListType] = js.native
  /**
    * Indicates whether or not to allow modification of Bluetooth settings when the device is in supervised mode (iOS 10.0
    * and later).
    */
  var bluetoothBlockModification: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from accessing the camera of the device.
  var cameraBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block data roaming.
  var cellularBlockDataRoaming: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block global background fetch while roaming.
  var cellularBlockGlobalBackgroundFetchWhileRoaming: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow changes to cellular app data usage settings when the device is in supervised mode.
  var cellularBlockPerAppDataModification: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Personal Hotspot.
  var cellularBlockPersonalHotspot: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block voice roaming.
  var cellularBlockVoiceRoaming: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block untrusted TLS certificates.
  var certificatesBlockUntrustedTlsCertificates: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to allow remote screen observation by Classroom app when the device is in supervised mode (iOS
    * 9.3 and later).
    */
  var classroomAppBlockRemoteScreenObservation: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to
    * view a student's screen without prompting when the device is in supervised mode.
    */
  var classroomAppForceUnpromptedScreenObservation: js.UndefOr[Boolean] = js.native
  // List that is in the AppComplianceList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
  var compliantAppListType: js.UndefOr[AppListType] = js.native
  /**
    * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection
    * can contain a maximum of 10000 elements.
    */
  var compliantAppsList: js.UndefOr[js.Array[AppListItem]] = js.native
  /**
    * Indicates whether or not to block the user from installing configuration profiles and certificates interactively when
    * the device is in supervised mode.
    */
  var configurationProfileBlockChanges: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block definition lookup when the device is in supervised mode (iOS 8.1.3 and later ).
  var definitionLookupBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to allow the user to enables restrictions in the device settings when the device is in
    * supervised mode.
    */
  var deviceBlockEnableRestrictions: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to allow the use of the 'Erase all content and settings' option on the device when the device
    * is in supervised mode.
    */
  var deviceBlockEraseContentAndSettings: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow device name modification when the device is in supervised mode (iOS 9.0 and later).
  var deviceBlockNameModification: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block diagnostic data submission.
  var diagnosticDataBlockSubmission: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to allow diagnostics submission settings modification when the device is in supervised mode
    * (iOS 9.3.2 and later).
    */
  var diagnosticDataBlockSubmissionModification: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from viewing managed documents in unmanaged apps.
  var documentsBlockManagedDocumentsInUnmanagedApps: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from viewing unmanaged documents in managed apps.
  var documentsBlockUnmanagedDocumentsInManagedApps: js.UndefOr[Boolean] = js.native
  // An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
  var emailInDomainSuffixes: js.UndefOr[js.Array[String]] = js.native
  // Indicates whether or not to block the user from trusting an enterprise app.
  var enterpriseAppBlockTrust: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from modifying the enterprise app trust settings.
  var enterpriseAppBlockTrustModification: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using FaceTime.
  var faceTimeBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Find My Friends when the device is in supervised mode.
  var findMyFriendsBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using Game Center when the device is in supervised mode.
  var gameCenterBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from having friends in Game Center.
  var gamingBlockGameCenterFriends: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using multiplayer gaming.
  var gamingBlockMultiplayer: js.UndefOr[Boolean] = js.native
  /**
    * indicates whether or not to allow host pairing to control the devices an iOS device can pair with when the iOS device
    * is in supervised mode.
    */
  var hostPairingBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from downloading media from the iBookstore that has been tagged as erotica.
  var iBooksStoreBlockErotica: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using the iBooks Store when the device is in supervised mode.
  var iBooksStoreBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to block the user from continuing work they started on iOS device to another iOS or macOS
    * device.
    */
  var iCloudBlockActivityContinuation: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block iCloud backup.
  var iCloudBlockBackup: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block iCloud document sync.
  var iCloudBlockDocumentSync: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Managed Apps Cloud Sync.
  var iCloudBlockManagedAppsSync: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block iCloud Photo Library.
  var iCloudBlockPhotoLibrary: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block iCloud Photo Stream Sync.
  var iCloudBlockPhotoStreamSync: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Shared Photo Stream.
  var iCloudBlockSharedPhotoStream: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require backups to iCloud be encrypted.
  var iCloudRequireEncryptedBackup: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from accessing explicit content in iTunes and the App Store.
  var iTunesBlockExplicitContent: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to block Music service and revert Music app to classic mode when the device is in supervised
    * mode (iOS 9.3 and later and macOS 10.12 and later).
    */
  var iTunesBlockMusicService: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to block the user from using iTunes Radio when the device is in supervised mode (iOS 9.3 and
    * later).
    */
  var iTunesBlockRadio: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block keyboard auto-correction when the device is in supervised mode (iOS 8.1.3 and later).
  var keyboardBlockAutoCorrect: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using dictation input when the device is in supervised mode.
  var keyboardBlockDictation: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block predictive keyboards when device is in supervised mode (iOS 8.1.3 and later).
  var keyboardBlockPredictive: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block keyboard shortcuts when the device is in supervised mode (iOS 9.0 and later).
  var keyboardBlockShortcuts: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block keyboard spell-checking when the device is in supervised mode (iOS 8.1.3 and later).
  var keyboardBlockSpellCheck: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow assistive speak while in kiosk mode.
  var kioskModeAllowAssistiveSpeak: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow access to the Assistive Touch Settings while in kiosk mode.
  var kioskModeAllowAssistiveTouchSettings: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow device auto lock while in kiosk mode.
  var kioskModeAllowAutoLock: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow access to the Color Inversion Settings while in kiosk mode.
  var kioskModeAllowColorInversionSettings: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow use of the ringer switch while in kiosk mode.
  var kioskModeAllowRingerSwitch: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow screen rotation while in kiosk mode.
  var kioskModeAllowScreenRotation: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow use of the sleep button while in kiosk mode.
  var kioskModeAllowSleepButton: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow use of the touchscreen while in kiosk mode.
  var kioskModeAllowTouchscreen: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow access to the voice over settings while in kiosk mode.
  var kioskModeAllowVoiceOverSettings: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow use of the volume buttons while in kiosk mode.
  var kioskModeAllowVolumeButtons: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow access to the zoom settings while in kiosk mode.
  var kioskModeAllowZoomSettings: js.UndefOr[Boolean] = js.native
  // URL in the app store to the app to use for kiosk mode. Use if KioskModeManagedAppId is not known.
  var kioskModeAppStoreUrl: js.UndefOr[String] = js.native
  // ID for built-in apps to use for kiosk mode. Used when KioskModeManagedAppId and KioskModeAppStoreUrl are not set.
  var kioskModeBuiltInAppId: js.UndefOr[String] = js.native
  /**
    * Managed app id of the app to use for kiosk mode. If KioskModeManagedAppId is specified then KioskModeAppStoreUrl will
    * be ignored.
    */
  var kioskModeManagedAppId: js.UndefOr[String] = js.native
  // Indicates whether or not to require assistive touch while in kiosk mode.
  var kioskModeRequireAssistiveTouch: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require color inversion while in kiosk mode.
  var kioskModeRequireColorInversion: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require mono audio while in kiosk mode.
  var kioskModeRequireMonoAudio: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require voice over while in kiosk mode.
  var kioskModeRequireVoiceOver: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require zoom while in kiosk mode.
  var kioskModeRequireZoom: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using control center on the lock screen.
  var lockScreenBlockControlCenter: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using the notification view on the lock screen.
  var lockScreenBlockNotificationView: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using passbook when the device is locked.
  var lockScreenBlockPassbook: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using the Today View on the lock screen.
  var lockScreenBlockTodayView: js.UndefOr[Boolean] = js.native
  /**
    * Media content rating settings for Apps. Possible values are: allAllowed, allBlocked, agesAbove4, agesAbove9,
    * agesAbove12, agesAbove17.
    */
  var mediaContentRatingApps: js.UndefOr[RatingAppsType] = js.native
  // Media content rating settings for Australia
  var mediaContentRatingAustralia: js.UndefOr[MediaContentRatingAustralia] = js.native
  // Media content rating settings for Canada
  var mediaContentRatingCanada: js.UndefOr[MediaContentRatingCanada] = js.native
  // Media content rating settings for France
  var mediaContentRatingFrance: js.UndefOr[MediaContentRatingFrance] = js.native
  // Media content rating settings for Germany
  var mediaContentRatingGermany: js.UndefOr[MediaContentRatingGermany] = js.native
  // Media content rating settings for Ireland
  var mediaContentRatingIreland: js.UndefOr[MediaContentRatingIreland] = js.native
  // Media content rating settings for Japan
  var mediaContentRatingJapan: js.UndefOr[MediaContentRatingJapan] = js.native
  // Media content rating settings for New Zealand
  var mediaContentRatingNewZealand: js.UndefOr[MediaContentRatingNewZealand] = js.native
  // Media content rating settings for United Kingdom
  var mediaContentRatingUnitedKingdom: js.UndefOr[MediaContentRatingUnitedKingdom] = js.native
  // Media content rating settings for United States
  var mediaContentRatingUnitedStates: js.UndefOr[MediaContentRatingUnitedStates] = js.native
  // Indicates whether or not to block the user from using the Messages app on the supervised device.
  var messagesBlocked: js.UndefOr[Boolean] = js.native
  /**
    * List of managed apps and the network rules that applies to them. This collection can contain a maximum of 1000
    * elements.
    */
  var networkUsageRules: js.UndefOr[js.Array[IosNetworkUsageRule]] = js.native
  // Indicates whether or not to allow notifications settings modification (iOS 9.3 and later).
  var notificationsBlockSettingsModification: js.UndefOr[Boolean] = js.native
  // Block modification of registered Touch ID fingerprints when in supervised mode.
  var passcodeBlockFingerprintModification: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block fingerprint unlock.
  var passcodeBlockFingerprintUnlock: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow passcode modification on the supervised device (iOS 9.0 and later).
  var passcodeBlockModification: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block simple passcodes.
  var passcodeBlockSimple: js.UndefOr[Boolean] = js.native
  // Number of days before the passcode expires. Valid values 1 to 65535
  var passcodeExpirationDays: js.UndefOr[Double] = js.native
  // Number of character sets a passcode must contain. Valid values 0 to 4
  var passcodeMinimumCharacterSetCount: js.UndefOr[Double] = js.native
  // Minimum length of passcode. Valid values 4 to 14
  var passcodeMinimumLength: js.UndefOr[Double] = js.native
  // Minutes of inactivity before a passcode is required.
  var passcodeMinutesOfInactivityBeforeLock: js.UndefOr[Double] = js.native
  // Minutes of inactivity before the screen times out.
  var passcodeMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.native
  // Number of previous passcodes to block. Valid values 1 to 24
  var passcodePreviousPasscodeBlockCount: js.UndefOr[Double] = js.native
  // Indicates whether or not to require a passcode.
  var passcodeRequired: js.UndefOr[Boolean] = js.native
  // Type of passcode that is required. Possible values are: deviceDefault, alphanumeric, numeric.
  var passcodeRequiredType: js.UndefOr[RequiredPasswordType] = js.native
  // Number of sign in failures allowed before wiping the device. Valid values 4 to 11
  var passcodeSignInFailureCountBeforeWipe: js.UndefOr[Double] = js.native
  // Indicates whether or not to block the user from using podcasts on the supervised device (iOS 8.0 and later).
  var podcastsBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using Auto fill in Safari.
  var safariBlockAutofill: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block JavaScript in Safari.
  var safariBlockJavaScript: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block popups in Safari.
  var safariBlockPopups: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using Safari.
  var safariBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Cookie settings for Safari. Possible values are: browserDefault, blockAlways, allowCurrentWebSite,
    * allowFromWebsitesVisited, allowAlways.
    */
  var safariCookieSettings: js.UndefOr[WebBrowserCookieSettings] = js.native
  // URLs matching the patterns listed here will be considered managed.
  var safariManagedDomains: js.UndefOr[js.Array[String]] = js.native
  /**
    * Users can save passwords in Safari only from URLs matching the patterns listed here. Applies to devices in supervised
    * mode (iOS 9.3 and later).
    */
  var safariPasswordAutoFillDomains: js.UndefOr[js.Array[String]] = js.native
  // Indicates whether or not to require fraud warning in Safari.
  var safariRequireFraudWarning: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from taking Screenshots.
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Siri from querying user-generated content when used on a supervised device.
  var siriBlockUserGeneratedContent: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using Siri.
  var siriBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using Siri when locked.
  var siriBlockedWhenLocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to prevent Siri from dictating, or speaking profane language on supervised device.
  var siriRequireProfanityFilter: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Spotlight search from returning internet results on supervised device.
  var spotlightBlockInternetResults: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block voice dialing.
  var voiceDialingBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow wallpaper modification on supervised device (iOS 9.0 and later) .
  var wallpaperBlockModification: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to force the device to use only Wi-Fi networks from configuration profiles when the device is
    * in supervised mode.
    */
  var wiFiConnectOnlyToConfiguredNetworks: js.UndefOr[Boolean] = js.native
}

object IosGeneralDeviceConfiguration {
  @scala.inline
  def apply(): IosGeneralDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosGeneralDeviceConfiguration]
  }
  @scala.inline
  implicit class IosGeneralDeviceConfigurationOps[Self <: IosGeneralDeviceConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountBlockModification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountBlockModification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountBlockModification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountBlockModification")(js.undefined)
        ret
    }
    @scala.inline
    def withActivationLockAllowWhenSupervised(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationLockAllowWhenSupervised")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivationLockAllowWhenSupervised: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationLockAllowWhenSupervised")(js.undefined)
        ret
    }
    @scala.inline
    def withAirDropBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("airDropBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAirDropBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("airDropBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withAirDropForceUnmanagedDropTarget(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("airDropForceUnmanagedDropTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAirDropForceUnmanagedDropTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("airDropForceUnmanagedDropTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withAirPlayForcePairingPasswordForOutgoingRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("airPlayForcePairingPasswordForOutgoingRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAirPlayForcePairingPasswordForOutgoingRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("airPlayForcePairingPasswordForOutgoingRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withAppStoreBlockAutomaticDownloads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStoreBlockAutomaticDownloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppStoreBlockAutomaticDownloads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStoreBlockAutomaticDownloads")(js.undefined)
        ret
    }
    @scala.inline
    def withAppStoreBlockInAppPurchases(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStoreBlockInAppPurchases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppStoreBlockInAppPurchases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStoreBlockInAppPurchases")(js.undefined)
        ret
    }
    @scala.inline
    def withAppStoreBlockUIAppInstallation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStoreBlockUIAppInstallation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppStoreBlockUIAppInstallation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStoreBlockUIAppInstallation")(js.undefined)
        ret
    }
    @scala.inline
    def withAppStoreBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStoreBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppStoreBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStoreBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withAppStoreRequirePassword(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStoreRequirePassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppStoreRequirePassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStoreRequirePassword")(js.undefined)
        ret
    }
    @scala.inline
    def withAppleNewsBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleNewsBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppleNewsBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleNewsBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withAppleWatchBlockPairing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleWatchBlockPairing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppleWatchBlockPairing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleWatchBlockPairing")(js.undefined)
        ret
    }
    @scala.inline
    def withAppleWatchForceWristDetection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleWatchForceWristDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppleWatchForceWristDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleWatchForceWristDetection")(js.undefined)
        ret
    }
    @scala.inline
    def withAppsSingleAppModeList(value: js.Array[AppListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsSingleAppModeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppsSingleAppModeList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsSingleAppModeList")(js.undefined)
        ret
    }
    @scala.inline
    def withAppsVisibilityList(value: js.Array[AppListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsVisibilityList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppsVisibilityList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsVisibilityList")(js.undefined)
        ret
    }
    @scala.inline
    def withAppsVisibilityListType(value: AppListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsVisibilityListType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppsVisibilityListType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appsVisibilityListType")(js.undefined)
        ret
    }
    @scala.inline
    def withBluetoothBlockModification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothBlockModification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBluetoothBlockModification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothBlockModification")(js.undefined)
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
    def withCellularBlockGlobalBackgroundFetchWhileRoaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockGlobalBackgroundFetchWhileRoaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellularBlockGlobalBackgroundFetchWhileRoaming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockGlobalBackgroundFetchWhileRoaming")(js.undefined)
        ret
    }
    @scala.inline
    def withCellularBlockPerAppDataModification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockPerAppDataModification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellularBlockPerAppDataModification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockPerAppDataModification")(js.undefined)
        ret
    }
    @scala.inline
    def withCellularBlockPersonalHotspot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockPersonalHotspot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellularBlockPersonalHotspot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularBlockPersonalHotspot")(js.undefined)
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
    def withCertificatesBlockUntrustedTlsCertificates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatesBlockUntrustedTlsCertificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificatesBlockUntrustedTlsCertificates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatesBlockUntrustedTlsCertificates")(js.undefined)
        ret
    }
    @scala.inline
    def withClassroomAppBlockRemoteScreenObservation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classroomAppBlockRemoteScreenObservation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassroomAppBlockRemoteScreenObservation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classroomAppBlockRemoteScreenObservation")(js.undefined)
        ret
    }
    @scala.inline
    def withClassroomAppForceUnpromptedScreenObservation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classroomAppForceUnpromptedScreenObservation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassroomAppForceUnpromptedScreenObservation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classroomAppForceUnpromptedScreenObservation")(js.undefined)
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
    def withConfigurationProfileBlockChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationProfileBlockChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationProfileBlockChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationProfileBlockChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withDefinitionLookupBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionLookupBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinitionLookupBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionLookupBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceBlockEnableRestrictions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceBlockEnableRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceBlockEnableRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceBlockEnableRestrictions")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceBlockEraseContentAndSettings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceBlockEraseContentAndSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceBlockEraseContentAndSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceBlockEraseContentAndSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceBlockNameModification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceBlockNameModification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceBlockNameModification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceBlockNameModification")(js.undefined)
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
    def withDiagnosticDataBlockSubmissionModification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosticDataBlockSubmissionModification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagnosticDataBlockSubmissionModification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosticDataBlockSubmissionModification")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentsBlockManagedDocumentsInUnmanagedApps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentsBlockManagedDocumentsInUnmanagedApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentsBlockManagedDocumentsInUnmanagedApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentsBlockManagedDocumentsInUnmanagedApps")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentsBlockUnmanagedDocumentsInManagedApps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentsBlockUnmanagedDocumentsInManagedApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentsBlockUnmanagedDocumentsInManagedApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentsBlockUnmanagedDocumentsInManagedApps")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailInDomainSuffixes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailInDomainSuffixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailInDomainSuffixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailInDomainSuffixes")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterpriseAppBlockTrust(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseAppBlockTrust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterpriseAppBlockTrust: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseAppBlockTrust")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterpriseAppBlockTrustModification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseAppBlockTrustModification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterpriseAppBlockTrustModification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseAppBlockTrustModification")(js.undefined)
        ret
    }
    @scala.inline
    def withFaceTimeBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceTimeBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceTimeBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceTimeBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withFindMyFriendsBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findMyFriendsBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindMyFriendsBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findMyFriendsBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withGameCenterBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameCenterBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameCenterBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameCenterBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withGamingBlockGameCenterFriends(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamingBlockGameCenterFriends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGamingBlockGameCenterFriends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamingBlockGameCenterFriends")(js.undefined)
        ret
    }
    @scala.inline
    def withGamingBlockMultiplayer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamingBlockMultiplayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGamingBlockMultiplayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamingBlockMultiplayer")(js.undefined)
        ret
    }
    @scala.inline
    def withHostPairingBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPairingBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostPairingBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPairingBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withIBooksStoreBlockErotica(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iBooksStoreBlockErotica")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIBooksStoreBlockErotica: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iBooksStoreBlockErotica")(js.undefined)
        ret
    }
    @scala.inline
    def withIBooksStoreBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iBooksStoreBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIBooksStoreBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iBooksStoreBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withICloudBlockActivityContinuation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCloudBlockActivityContinuation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutICloudBlockActivityContinuation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCloudBlockActivityContinuation")(js.undefined)
        ret
    }
    @scala.inline
    def withICloudBlockBackup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCloudBlockBackup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutICloudBlockBackup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCloudBlockBackup")(js.undefined)
        ret
    }
    @scala.inline
    def withICloudBlockDocumentSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCloudBlockDocumentSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutICloudBlockDocumentSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCloudBlockDocumentSync")(js.undefined)
        ret
    }
    @scala.inline
    def withICloudBlockManagedAppsSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCloudBlockManagedAppsSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutICloudBlockManagedAppsSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCloudBlockManagedAppsSync")(js.undefined)
        ret
    }
    @scala.inline
    def withICloudBlockPhotoLibrary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCloudBlockPhotoLibrary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutICloudBlockPhotoLibrary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCloudBlockPhotoLibrary")(js.undefined)
        ret
    }
    @scala.inline
    def withICloudBlockPhotoStreamSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCloudBlockPhotoStreamSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutICloudBlockPhotoStreamSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCloudBlockPhotoStreamSync")(js.undefined)
        ret
    }
    @scala.inline
    def withICloudBlockSharedPhotoStream(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCloudBlockSharedPhotoStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutICloudBlockSharedPhotoStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCloudBlockSharedPhotoStream")(js.undefined)
        ret
    }
    @scala.inline
    def withICloudRequireEncryptedBackup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCloudRequireEncryptedBackup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutICloudRequireEncryptedBackup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCloudRequireEncryptedBackup")(js.undefined)
        ret
    }
    @scala.inline
    def withITunesBlockExplicitContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iTunesBlockExplicitContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutITunesBlockExplicitContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iTunesBlockExplicitContent")(js.undefined)
        ret
    }
    @scala.inline
    def withITunesBlockMusicService(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iTunesBlockMusicService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutITunesBlockMusicService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iTunesBlockMusicService")(js.undefined)
        ret
    }
    @scala.inline
    def withITunesBlockRadio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iTunesBlockRadio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutITunesBlockRadio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iTunesBlockRadio")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardBlockAutoCorrect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardBlockAutoCorrect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardBlockAutoCorrect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardBlockAutoCorrect")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardBlockDictation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardBlockDictation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardBlockDictation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardBlockDictation")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardBlockPredictive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardBlockPredictive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardBlockPredictive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardBlockPredictive")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardBlockShortcuts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardBlockShortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardBlockShortcuts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardBlockShortcuts")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardBlockSpellCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardBlockSpellCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardBlockSpellCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardBlockSpellCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeAllowAssistiveSpeak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowAssistiveSpeak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeAllowAssistiveSpeak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowAssistiveSpeak")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeAllowAssistiveTouchSettings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowAssistiveTouchSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeAllowAssistiveTouchSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowAssistiveTouchSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeAllowAutoLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowAutoLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeAllowAutoLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowAutoLock")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeAllowColorInversionSettings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowColorInversionSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeAllowColorInversionSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowColorInversionSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeAllowRingerSwitch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowRingerSwitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeAllowRingerSwitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowRingerSwitch")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeAllowScreenRotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowScreenRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeAllowScreenRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowScreenRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeAllowSleepButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowSleepButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeAllowSleepButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowSleepButton")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeAllowTouchscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowTouchscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeAllowTouchscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowTouchscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeAllowVoiceOverSettings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowVoiceOverSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeAllowVoiceOverSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowVoiceOverSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeAllowVolumeButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowVolumeButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeAllowVolumeButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowVolumeButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeAllowZoomSettings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowZoomSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeAllowZoomSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAllowZoomSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeAppStoreUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAppStoreUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeAppStoreUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeAppStoreUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeBuiltInAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeBuiltInAppId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeBuiltInAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeBuiltInAppId")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeManagedAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeManagedAppId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeManagedAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeManagedAppId")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeRequireAssistiveTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeRequireAssistiveTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeRequireAssistiveTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeRequireAssistiveTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeRequireColorInversion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeRequireColorInversion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeRequireColorInversion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeRequireColorInversion")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeRequireMonoAudio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeRequireMonoAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeRequireMonoAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeRequireMonoAudio")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeRequireVoiceOver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeRequireVoiceOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeRequireVoiceOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeRequireVoiceOver")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskModeRequireZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeRequireZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskModeRequireZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskModeRequireZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withLockScreenBlockControlCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenBlockControlCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockScreenBlockControlCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenBlockControlCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withLockScreenBlockNotificationView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenBlockNotificationView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockScreenBlockNotificationView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenBlockNotificationView")(js.undefined)
        ret
    }
    @scala.inline
    def withLockScreenBlockPassbook(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenBlockPassbook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockScreenBlockPassbook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenBlockPassbook")(js.undefined)
        ret
    }
    @scala.inline
    def withLockScreenBlockTodayView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenBlockTodayView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockScreenBlockTodayView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenBlockTodayView")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaContentRatingApps(value: RatingAppsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaContentRatingApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingApps")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaContentRatingAustralia(value: MediaContentRatingAustralia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingAustralia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaContentRatingAustralia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingAustralia")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaContentRatingCanada(value: MediaContentRatingCanada): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingCanada")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaContentRatingCanada: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingCanada")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaContentRatingFrance(value: MediaContentRatingFrance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingFrance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaContentRatingFrance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingFrance")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaContentRatingGermany(value: MediaContentRatingGermany): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingGermany")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaContentRatingGermany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingGermany")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaContentRatingIreland(value: MediaContentRatingIreland): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingIreland")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaContentRatingIreland: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingIreland")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaContentRatingJapan(value: MediaContentRatingJapan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingJapan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaContentRatingJapan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingJapan")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaContentRatingNewZealand(value: MediaContentRatingNewZealand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingNewZealand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaContentRatingNewZealand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingNewZealand")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaContentRatingUnitedKingdom(value: MediaContentRatingUnitedKingdom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingUnitedKingdom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaContentRatingUnitedKingdom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingUnitedKingdom")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaContentRatingUnitedStates(value: MediaContentRatingUnitedStates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingUnitedStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaContentRatingUnitedStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaContentRatingUnitedStates")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagesBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagesBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkUsageRules(value: js.Array[IosNetworkUsageRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkUsageRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkUsageRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkUsageRules")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationsBlockSettingsModification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationsBlockSettingsModification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationsBlockSettingsModification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationsBlockSettingsModification")(js.undefined)
        ret
    }
    @scala.inline
    def withPasscodeBlockFingerprintModification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeBlockFingerprintModification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasscodeBlockFingerprintModification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeBlockFingerprintModification")(js.undefined)
        ret
    }
    @scala.inline
    def withPasscodeBlockFingerprintUnlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeBlockFingerprintUnlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasscodeBlockFingerprintUnlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeBlockFingerprintUnlock")(js.undefined)
        ret
    }
    @scala.inline
    def withPasscodeBlockModification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeBlockModification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasscodeBlockModification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeBlockModification")(js.undefined)
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
    def withPasscodeMinutesOfInactivityBeforeScreenTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeMinutesOfInactivityBeforeScreenTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasscodeMinutesOfInactivityBeforeScreenTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeMinutesOfInactivityBeforeScreenTimeout")(js.undefined)
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
    def withPasscodeSignInFailureCountBeforeWipe(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeSignInFailureCountBeforeWipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasscodeSignInFailureCountBeforeWipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passcodeSignInFailureCountBeforeWipe")(js.undefined)
        ret
    }
    @scala.inline
    def withPodcastsBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podcastsBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPodcastsBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podcastsBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withSafariBlockAutofill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariBlockAutofill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafariBlockAutofill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariBlockAutofill")(js.undefined)
        ret
    }
    @scala.inline
    def withSafariBlockJavaScript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariBlockJavaScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafariBlockJavaScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariBlockJavaScript")(js.undefined)
        ret
    }
    @scala.inline
    def withSafariBlockPopups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariBlockPopups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafariBlockPopups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariBlockPopups")(js.undefined)
        ret
    }
    @scala.inline
    def withSafariBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafariBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withSafariCookieSettings(value: WebBrowserCookieSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariCookieSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafariCookieSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariCookieSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSafariManagedDomains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariManagedDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafariManagedDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariManagedDomains")(js.undefined)
        ret
    }
    @scala.inline
    def withSafariPasswordAutoFillDomains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariPasswordAutoFillDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafariPasswordAutoFillDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariPasswordAutoFillDomains")(js.undefined)
        ret
    }
    @scala.inline
    def withSafariRequireFraudWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariRequireFraudWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafariRequireFraudWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safariRequireFraudWarning")(js.undefined)
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
    def withSiriBlockUserGeneratedContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siriBlockUserGeneratedContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiriBlockUserGeneratedContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siriBlockUserGeneratedContent")(js.undefined)
        ret
    }
    @scala.inline
    def withSiriBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siriBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiriBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siriBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withSiriBlockedWhenLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siriBlockedWhenLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiriBlockedWhenLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siriBlockedWhenLocked")(js.undefined)
        ret
    }
    @scala.inline
    def withSiriRequireProfanityFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siriRequireProfanityFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiriRequireProfanityFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siriRequireProfanityFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotlightBlockInternetResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotlightBlockInternetResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotlightBlockInternetResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotlightBlockInternetResults")(js.undefined)
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
    def withWallpaperBlockModification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wallpaperBlockModification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWallpaperBlockModification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wallpaperBlockModification")(js.undefined)
        ret
    }
    @scala.inline
    def withWiFiConnectOnlyToConfiguredNetworks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wiFiConnectOnlyToConfiguredNetworks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWiFiConnectOnlyToConfiguredNetworks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wiFiConnectOnlyToConfiguredNetworks")(js.undefined)
        ret
    }
  }
  
}

