package typingsSlinky.reactNativePermissions

import typingsSlinky.reactNative.mod.Rationale
import typingsSlinky.reactNativePermissions.anon.ReadonlyreadonlyACCEPTHAN
import typingsSlinky.reactNativePermissions.anon.ReadonlyreadonlyACCESSORY
import typingsSlinky.reactNativePermissions.anon.ReadonlyreadonlyANDROIDRe
import typingsSlinky.reactNativePermissions.anon.ReadonlyreadonlyAPPTRACKI
import typingsSlinky.reactNativePermissions.anon.ReadonlyreadonlyUNAVAILAB
import typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.blocked
import typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.denied
import typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.granted
import typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.limited
import typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.unavailable
import typingsSlinky.reactNativePermissions.typesMod.LocationAccuracy
import typingsSlinky.reactNativePermissions.typesMod.LocationAccuracyOptions
import typingsSlinky.reactNativePermissions.typesMod.NotificationOption
import typingsSlinky.reactNativePermissions.typesMod.NotificationsResponse
import typingsSlinky.reactNativePermissions.typesMod.Permission
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-permissions", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-permissions", "default.PERMISSIONS")
    @js.native
    def PERMISSIONS: ReadonlyreadonlyANDROIDRe = js.native
    @scala.inline
    def PERMISSIONS_=(x: ReadonlyreadonlyANDROIDRe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERMISSIONS")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-permissions", "default.RESULTS")
    @js.native
    def RESULTS: ReadonlyreadonlyUNAVAILAB = js.native
    @scala.inline
    def RESULTS_=(x: ReadonlyreadonlyUNAVAILAB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESULTS")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-permissions", "default.check")
    @js.native
    def check(permission: Permission): js.Promise[unavailable | blocked | denied | granted | limited] = js.native
    
    @JSImport("react-native-permissions", "default.checkLocationAccuracy")
    @js.native
    def checkLocationAccuracy(): js.Promise[LocationAccuracy] = js.native
    
    @JSImport("react-native-permissions", "default.checkMultiple")
    @js.native
    def checkMultiple[P /* <: js.Array[Permission] */](permissions: P): js.Promise[
        Record[
          /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any, 
          unavailable | blocked | denied | granted | limited
        ]
      ] = js.native
    
    @JSImport("react-native-permissions", "default.checkNotifications")
    @js.native
    def checkNotifications(): js.Promise[NotificationsResponse] = js.native
    
    @JSImport("react-native-permissions", "default.openLimitedPhotoLibraryPicker")
    @js.native
    def openLimitedPhotoLibraryPicker(): js.Promise[Unit] = js.native
    
    @JSImport("react-native-permissions", "default.openSettings")
    @js.native
    def openSettings(): js.Promise[Unit] = js.native
    
    @JSImport("react-native-permissions", "default.request")
    @js.native
    def request(permission: Permission): js.Promise[unavailable | blocked | denied | granted | limited] = js.native
    @JSImport("react-native-permissions", "default.request")
    @js.native
    def request(permission: Permission, rationale: Rationale): js.Promise[unavailable | blocked | denied | granted | limited] = js.native
    
    @JSImport("react-native-permissions", "default.requestLocationAccuracy")
    @js.native
    def requestLocationAccuracy(options: LocationAccuracyOptions): js.Promise[LocationAccuracy] = js.native
    
    @JSImport("react-native-permissions", "default.requestMultiple")
    @js.native
    def requestMultiple[P_1 /* <: js.Array[Permission] */](permissions: P_1): js.Promise[
        Record[
          /* import warning: importer.ImportType#apply Failed type conversion: P_1[number] */ js.Any, 
          unavailable | blocked | denied | granted | limited
        ]
      ] = js.native
    
    @JSImport("react-native-permissions", "default.requestNotifications")
    @js.native
    def requestNotifications(options: js.Array[NotificationOption]): js.Promise[NotificationsResponse] = js.native
  }
  
  /* Inlined std.Readonly<{ readonly ANDROID :std.Readonly<{ readonly ACCEPT_HANDOVER :'android.permission.ACCEPT_HANDOVER',  readonly ACCESS_BACKGROUND_LOCATION :'android.permission.ACCESS_BACKGROUND_LOCATION',  readonly ACCESS_COARSE_LOCATION :'android.permission.ACCESS_COARSE_LOCATION',  readonly ACCESS_FINE_LOCATION :'android.permission.ACCESS_FINE_LOCATION',  readonly ACTIVITY_RECOGNITION :'android.permission.ACTIVITY_RECOGNITION',  readonly ADD_VOICEMAIL :'com.android.voicemail.permission.ADD_VOICEMAIL',  readonly ANSWER_PHONE_CALLS :'android.permission.ANSWER_PHONE_CALLS',  readonly BODY_SENSORS :'android.permission.BODY_SENSORS',  readonly CALL_PHONE :'android.permission.CALL_PHONE',  readonly CAMERA :'android.permission.CAMERA',  readonly GET_ACCOUNTS :'android.permission.GET_ACCOUNTS',  readonly PROCESS_OUTGOING_CALLS :'android.permission.PROCESS_OUTGOING_CALLS',  readonly READ_CALENDAR :'android.permission.READ_CALENDAR',  readonly READ_CALL_LOG :'android.permission.READ_CALL_LOG',  readonly READ_CONTACTS :'android.permission.READ_CONTACTS',  readonly READ_EXTERNAL_STORAGE :'android.permission.READ_EXTERNAL_STORAGE',  readonly READ_PHONE_NUMBERS :'android.permission.READ_PHONE_NUMBERS',  readonly READ_PHONE_STATE :'android.permission.READ_PHONE_STATE',  readonly READ_SMS :'android.permission.READ_SMS',  readonly RECEIVE_MMS :'android.permission.RECEIVE_MMS',  readonly RECEIVE_SMS :'android.permission.RECEIVE_SMS',  readonly RECEIVE_WAP_PUSH :'android.permission.RECEIVE_WAP_PUSH',  readonly RECORD_AUDIO :'android.permission.RECORD_AUDIO',  readonly SEND_SMS :'android.permission.SEND_SMS',  readonly USE_SIP :'android.permission.USE_SIP',  readonly WRITE_CALENDAR :'android.permission.WRITE_CALENDAR',  readonly WRITE_CALL_LOG :'android.permission.WRITE_CALL_LOG',  readonly WRITE_CONTACTS :'android.permission.WRITE_CONTACTS',  readonly WRITE_EXTERNAL_STORAGE :'android.permission.WRITE_EXTERNAL_STORAGE'}>,  readonly IOS :std.Readonly<{ readonly APP_TRACKING_TRANSPARENCY :'ios.permission.APP_TRACKING_TRANSPARENCY',  readonly BLUETOOTH_PERIPHERAL :'ios.permission.BLUETOOTH_PERIPHERAL',  readonly CALENDARS :'ios.permission.CALENDARS',  readonly CAMERA :'ios.permission.CAMERA',  readonly CONTACTS :'ios.permission.CONTACTS',  readonly FACE_ID :'ios.permission.FACE_ID',  readonly LOCATION_ALWAYS :'ios.permission.LOCATION_ALWAYS',  readonly LOCATION_WHEN_IN_USE :'ios.permission.LOCATION_WHEN_IN_USE',  readonly MEDIA_LIBRARY :'ios.permission.MEDIA_LIBRARY',  readonly MICROPHONE :'ios.permission.MICROPHONE',  readonly MOTION :'ios.permission.MOTION',  readonly PHOTO_LIBRARY :'ios.permission.PHOTO_LIBRARY',  readonly PHOTO_LIBRARY_ADD_ONLY :'ios.permission.PHOTO_LIBRARY_ADD_ONLY',  readonly REMINDERS :'ios.permission.REMINDERS',  readonly SIRI :'ios.permission.SIRI',  readonly SPEECH_RECOGNITION :'ios.permission.SPEECH_RECOGNITION',  readonly STOREKIT :'ios.permission.STOREKIT'}>,  readonly WINDOWS :std.Readonly<{ readonly ACCESSORY_MANAGER :'windows.permission.accessoryManager',  readonly ACTIVITY :'windows.permission.activity',  readonly ALLOW_ELEVATION :'windows.permission.allowElevation',  readonly ALL_APP_MODS :'windows.permission.allAppMods',  readonly ALL_JOYN :'windows.permission.allJoyn',  readonly APPOINTMENTS :'windows.permission.appointments',  readonly APPOINTMENTS_SYSTEM :'windows.permission.appointmentsSystem',  readonly APP_BROADCAST_SERVICES :'windows.permission.appBroadcastServices',  readonly APP_CAPTURE_SERVICES :'windows.permission.appCaptureServices',  readonly APP_CAPTURE_SETTINGS :'windows.permission.appCaptureSettings',  readonly APP_DIAGNOSTICS :'windows.permission.appDiagnostics',  readonly APP_LICENSING :'windows.permission.appLicensing',  readonly AUDIO_DEVICE_CONFIGURATION :'windows.permission.audioDeviceConfiguration',  readonly BACKGROUND_MEDIA_PLAYBACK :'windows.permission.backgroundMediaPlayback',  readonly BACKGROUND_MEDIA_RECORDING :'windows.permission.backgroundMediaRecording',  readonly BACKGROUND_SPATIAL_PERCEPTION :'windows.permission.backgroundSpatialPerception',  readonly BACKGROUND_VOIP :'windows.permission.backgroundVoIP',  readonly BLOCKED_CHAT_MESSAGES :'windows.permission.blockedChatMessages',  readonly BLUETOOTH :'windows.permission.bluetooth',  readonly BROAD_FILE_SYSTEM_ACCESS :'windows.permission.broadFileSystemAccess',  readonly CAMERA_PROCESSING_EXTENSION :'windows.permission.cameraProcessingExtension',  readonly CELLULAR_DEVICE_CONTROL :'windows.permission.cellularDeviceControl',  readonly CELLULAR_DEVICE_IDENTITY :'windows.permission.cellularDeviceIdentity',  readonly CELLULAR_MESSAGING :'windows.permission.cellularMessaging',  readonly CHAT_SYSTEM :'windows.permission.chatSystem',  readonly CODE_GENERATION :'windows.permission.codeGeneration',  readonly CONFIRM_APP_CLOSE :'windows.permission.confirmAppClose',  readonly CONTACTS :'windows.permission.contacts',  readonly CONTACTS_SYSTEM :'windows.permission.contactsSystem',  readonly CORTANA_PERMISSIONS :'windows.permission.cortanaPermissions',  readonly CORTANA_SPEECH_ACCESSORY :'windows.permission.cortanaSpeechAccessory',  readonly CUSTOM_INSTALL_ACTIONS :'windows.permission.customInstallActions',  readonly DEVELOPMENT_MODE_NETWORK :'windows.permission.developmentModeNetwork',  readonly DEVICE_MANAGEMENT_DM_ACCOUNT :'windows.permission.deviceManagementDmAccount',  readonly DEVICE_MANAGEMENT_EMAIL_ACCOUNT :'windows.permission.deviceManagementEmailAccount',  readonly DEVICE_MANAGEMENT_FOUNDATION :'windows.permission.deviceManagementFoundation',  readonly DEVICE_MANAGEMENT_WAP_SECURITY_POLICIES :'windows.permission.deviceManagementWapSecurityPolicies',  readonly DEVICE_PORTAL_PROVIDER :'windows.permission.devicePortalProvider',  readonly DEVICE_UNLOCK :'windows.permission.deviceUnlock',  readonly DOCUMENTS_LIBRARY :'windows.permission.documentsLibrary',  readonly DUAL_SIM_TILES :'windows.permission.dualSimTiles',  readonly EMAIL :'windows.permission.email',  readonly EMAIL_SYSTEM :'windows.permission.emailSystem',  readonly ENTERPRISE_AUTHENTICATION :'windows.permission.enterpriseAuthentication',  readonly ENTERPRISE_CLOUD_S_S_O :'windows.permission.enterpriseCloudSSO',  readonly ENTERPRISE_DATA_POLICY :'windows.permission.enterpriseDataPolicy',  readonly ENTERPRISE_DEVICE_LOCKDOWN :'windows.permission.enterpriseDeviceLockdown',  readonly EXPANDED_RESOURCES :'windows.permission.expandedResources',  readonly EXTENDED_BACKGROUND_TASK_TIME :'windows.permission.extendedBackgroundTaskTime',  readonly EXTENDED_EXECUTION_BACKGROUND_AUDIO :'windows.permission.extendedExecutionBackgroundAudio',  readonly EXTENDED_EXECUTION_CRITICAL :'windows.permission.extendedExecutionCritical',  readonly EXTENDED_EXECUTION_UNCONSTRAINED :'windows.permission.extendedExecutionUnconstrained',  readonly FIRST_SIGN_IN_SETTINGS :'windows.permission.firstSignInSettings',  readonly GAME_BAR_SERVICES :'windows.permission.gameBarServices',  readonly GAME_LIST :'windows.permission.gameList',  readonly GAME_MONITOR :'windows.permission.gameMonitor',  readonly GAZE_INPUT :'windows.permission.gazeInput',  readonly GLOBAL_MEDIA_CONTROL :'windows.permission.globalMediaControl',  readonly HUMANINTERFACEDEVICE :'windows.permission.humaninterfacedevice',  readonly INPUT_FOREGROUND_OBSERVATION :'windows.permission.inputForegroundObservation',  readonly INPUT_INJECTION_BROKERED :'windows.permission.inputInjectionBrokered',  readonly INPUT_OBSERVATION :'windows.permission.inputObservation',  readonly INPUT_SUPPRESSION :'windows.permission.inputSuppression',  readonly INTERNET_CLIENT :'windows.permission.internetClient',  readonly INTERNET_CLIENT_SERVER :'windows.permission.internetClientServer',  readonly INTEROP_SERVICES :'windows.permission.interopServices',  readonly IOT :'windows.permission.iot',  readonly LOCAL_SYSTEM_SERVICES :'windows.permission.localSystemServices',  readonly LOCATION :'windows.permission.location',  readonly LOCATION_HISTORY :'windows.permission.locationHistory',  readonly LOCATION_SYSTEM :'windows.permission.locationSystem',  readonly LOW_LEVEL :'windows.permission.lowLevel',  readonly LOW_LEVEL_DEVICES :'windows.permission.lowLevelDevices',  readonly MICROPHONE :'windows.permission.microphone',  readonly MOBILE :'windows.permission.mobile',  readonly MODIFIABLE_APP :'windows.permission.modifiableApp',  readonly MUSIC_LIBRARY :'windows.permission.musicLibrary',  readonly NETWORKING_VPN_PROVIDER :'windows.permission.networkingVpnProvider',  readonly NETWORK_CONNECTION_MANAGER_PROVISIONING :'windows.permission.networkConnectionManagerProvisioning',  readonly NETWORK_DATA_PLAN_PROVISIONING :'windows.permission.networkDataPlanProvisioning',  readonly NETWORK_DATA_USAGE_MANAGEMENT :'windows.permission.networkDataUsageManagement',  readonly OEM_DEPLOYMENT :'windows.permission.oemDeployment',  readonly OEM_PUBLIC_DIRECTORY :'windows.permission.oemPublicDirectory',  readonly ONE_PROCESS_VOIP :'windows.permission.oneProcessVoIP',  readonly OPTICAL :'windows.permission.optical',  readonly PACKAGED_SERVICES :'windows.permission.packagedServices',  readonly PACKAGES_SERVICES :'windows.permission.packagesServices',  readonly PACKAGE_MANAGEMENT :'windows.permission.packageManagement',  readonly PACKAGE_POLICY_SYSTEM :'windows.permission.packagePolicySystem',  readonly PACKAGE_QUERY :'windows.permission.packageQuery',  readonly PACKAGE_WRITE_REDIRECTION_COMPATIBILITY_SHIM :'windows.permission.packageWriteRedirectionCompatibilityShim',  readonly PHONE_CALL :'windows.permission.phoneCall',  readonly PHONE_CALL_HISTORY :'windows.permission.phoneCallHistory',  readonly PHONE_CALL_HISTORY_SYSTEM :'windows.permission.phoneCallHistorySystem',  readonly PHONE_LINE_TRANSPORT_MANAGEMENT :'windows.permission.phoneLineTransportManagement',  readonly PICTURES_LIBRARY :'windows.permission.picturesLibrary',  readonly POINT_OF_SERVICE :'windows.permission.pointOfService',  readonly PREVIEW_INK_WORKSPACE :'windows.permission.previewInkWorkspace',  readonly PREVIEW_PEN_WORKSPACE :'windows.permission.previewPenWorkspace',  readonly PREVIEW_STORE :'windows.permission.previewStore',  readonly PREVIEW_UI_COMPOSITION :'windows.permission.previewUiComposition',  readonly PRIVATE_NETWORK_CLIENT_SERVER :'windows.permission.privateNetworkClientServer',  readonly PROTECTED_APP :'windows.permission.protectedApp',  readonly PROXIMITY :'windows.permission.proximity',  readonly RADIOS :'windows.permission.radios',  readonly RECORDED_CALLS_FOLDER :'windows.permission.recordedCallsFolder',  readonly REMOTE_PASSPORT_AUTHENTICATION :'windows.permission.remotePassportAuthentication',  readonly REMOTE_SYSTEM :'windows.permission.remoteSystem',  readonly REMOVABLE_STORAGE :'windows.permission.removableStorage',  readonly RESCAP :'windows.permission.rescap',  readonly RUN_FULL_TRUST :'windows.permission.runFullTrust',  readonly SCREEN_DUPLICATION :'windows.permission.screenDuplication',  readonly SECONDARY_AUTHENTICATION_FACTOR :'windows.permission.secondaryAuthenticationFactor',  readonly SECURE_ASSESSMENT :'windows.permission.secureAssessment',  readonly SERIALCOMMUNICATION :'windows.permission.serialcommunication',  readonly SHARED_USER_CERTIFICATES :'windows.permission.sharedUserCertificates',  readonly SLAPI_QUERY_LICENSE_VALUE :'windows.permission.slapiQueryLicenseValue',  readonly SMBIOS :'windows.permission.smbios',  readonly SMS_SEND :'windows.permission.smsSend',  readonly SPATIAL_PERCEPTION :'windows.permission.spatialPerception',  readonly START_SCREEN_MANAGEMENT :'windows.permission.startScreenManagement',  readonly STORE_LICENSE_MANAGEMENT :'windows.permission.storeLicenseManagement',  readonly SYSTEM_MANAGEMENT :'windows.permission.systemManagement',  readonly TARGETED_CONTENT :'windows.permission.targetedContent',  readonly TEAM_EDITION_DEVICE_CREDENTIAL :'windows.permission.teamEditionDeviceCredential',  readonly TEAM_EDITION_EXPERIENCE :'windows.permission.teamEditionExperience',  readonly TEAM_EDITION_VIEW :'windows.permission.teamEditionView',  readonly UAP :'windows.permission.uap',  readonly UI_AUTOMATION :'windows.permission.uiAutomation',  readonly UNVIRTUALIZED_RESOURCES :'windows.permission.unvirtualizedResources',  readonly USB :'windows.permission.usb',  readonly USER_ACCOUNT_INFORMATION :'windows.permission.userAccountInformation',  readonly USER_DATA_ACCOUNTS_PROVIDER :'windows.permission.userDataAccountsProvider',  readonly USER_DATA_SYSTEM :'windows.permission.userDataSystem',  readonly USER_PRINCIPAL_NAME :'windows.permission.userPrincipalName',  readonly USER_SYSTEM_ID :'windows.permission.userSystemId',  readonly VIDEOS_LIBRARY :'windows.permission.videosLibrary',  readonly VOIP_CALL :'windows.permission.voipCall',  readonly WALLET_SYSTEM :'windows.permission.walletSystem',  readonly WEBCAM :'windows.permission.webcam',  readonly WIFI_CONTROL :'windows.permission.wiFiControl',  readonly XBOX_ACCESSORY_MANAGEMENT :'windows.permission.xboxAccessoryManagement'}>}> */
  object PERMISSIONS {
    
    @JSImport("react-native-permissions", "PERMISSIONS.ANDROID")
    @js.native
    val ANDROID: ReadonlyreadonlyACCEPTHAN = js.native
    
    @JSImport("react-native-permissions", "PERMISSIONS.IOS")
    @js.native
    val IOS: ReadonlyreadonlyAPPTRACKI = js.native
    
    @JSImport("react-native-permissions", "PERMISSIONS.WINDOWS")
    @js.native
    val WINDOWS: ReadonlyreadonlyACCESSORY = js.native
  }
  
  /* Inlined std.Readonly<{ readonly UNAVAILABLE :'unavailable',  readonly BLOCKED :'blocked',  readonly DENIED :'denied',  readonly GRANTED :'granted',  readonly LIMITED :'limited'}> */
  object RESULTS {
    
    @JSImport("react-native-permissions", "RESULTS.BLOCKED")
    @js.native
    val BLOCKED: blocked = js.native
    
    @JSImport("react-native-permissions", "RESULTS.DENIED")
    @js.native
    val DENIED: denied = js.native
    
    @JSImport("react-native-permissions", "RESULTS.GRANTED")
    @js.native
    val GRANTED: granted = js.native
    
    @JSImport("react-native-permissions", "RESULTS.LIMITED")
    @js.native
    val LIMITED: limited = js.native
    
    @JSImport("react-native-permissions", "RESULTS.UNAVAILABLE")
    @js.native
    val UNAVAILABLE: unavailable = js.native
  }
  
  @JSImport("react-native-permissions", "check")
  @js.native
  def check(permission: Permission): js.Promise[unavailable | blocked | denied | granted | limited] = js.native
  
  @JSImport("react-native-permissions", "checkLocationAccuracy")
  @js.native
  def checkLocationAccuracy(): js.Promise[LocationAccuracy] = js.native
  
  @JSImport("react-native-permissions", "checkMultiple")
  @js.native
  def checkMultiple[P /* <: js.Array[Permission] */](permissions: P): js.Promise[
    Record[
      /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any, 
      unavailable | blocked | denied | granted | limited
    ]
  ] = js.native
  
  @JSImport("react-native-permissions", "checkNotifications")
  @js.native
  def checkNotifications(): js.Promise[NotificationsResponse] = js.native
  
  @JSImport("react-native-permissions", "openLimitedPhotoLibraryPicker")
  @js.native
  def openLimitedPhotoLibraryPicker(): js.Promise[Unit] = js.native
  
  @JSImport("react-native-permissions", "openSettings")
  @js.native
  def openSettings(): js.Promise[Unit] = js.native
  
  @JSImport("react-native-permissions", "request")
  @js.native
  def request(permission: Permission): js.Promise[unavailable | blocked | denied | granted | limited] = js.native
  @JSImport("react-native-permissions", "request")
  @js.native
  def request(permission: Permission, rationale: Rationale): js.Promise[unavailable | blocked | denied | granted | limited] = js.native
  
  @JSImport("react-native-permissions", "requestLocationAccuracy")
  @js.native
  def requestLocationAccuracy(options: LocationAccuracyOptions): js.Promise[LocationAccuracy] = js.native
  
  @JSImport("react-native-permissions", "requestMultiple")
  @js.native
  def requestMultiple[P /* <: js.Array[Permission] */](permissions: P): js.Promise[
    Record[
      /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any, 
      unavailable | blocked | denied | granted | limited
    ]
  ] = js.native
  
  @JSImport("react-native-permissions", "requestNotifications")
  @js.native
  def requestNotifications(options: js.Array[NotificationOption]): js.Promise[NotificationsResponse] = js.native
}
