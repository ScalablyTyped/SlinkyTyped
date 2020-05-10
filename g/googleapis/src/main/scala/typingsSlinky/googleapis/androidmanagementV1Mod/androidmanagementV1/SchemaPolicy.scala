package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A policy resources represents a group settings that govern the behavior of
  * a managed device and the apps installed on it.
  */
@js.native
trait SchemaPolicy extends js.Object {
  /**
    * Account types that can&#39;t be managed by the user.
    */
  var accountTypesWithManagementDisabled: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether adding new users and profiles is disabled.
    */
  var addUserDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether adjusting the master volume is disabled.
    */
  var adjustVolumeDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Configuration for an always-on VPN connection. Use with
    * vpn_config_disabled to prevent modification of this setting.
    */
  var alwaysOnVpnPackage: js.UndefOr[SchemaAlwaysOnVpnPackage] = js.native
  /**
    * The app tracks for Android Device Policy the device can access. The
    * device receives the latest version among all accessible tracks. If no
    * tracks are specified, then the device only uses the production track.
    */
  var androidDevicePolicyTracks: js.UndefOr[js.Array[String]] = js.native
  /**
    * The app auto update policy, which controls when automatic app updates can
    * be applied.
    */
  var appAutoUpdatePolicy: js.UndefOr[String] = js.native
  /**
    * Policy applied to apps.
    */
  var applications: js.UndefOr[js.Array[SchemaApplicationPolicy]] = js.native
  /**
    * Whether auto time is required, which prevents the user from manually
    * setting the date and time.
    */
  var autoTimeRequired: js.UndefOr[Boolean] = js.native
  /**
    * Whether applications other than the ones configured in applications are
    * blocked from being installed. When set, applications that were installed
    * under a previous policy but no longer appear in the policy are
    * automatically uninstalled.
    */
  var blockApplicationsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether configuring bluetooth is disabled.
    */
  var bluetoothConfigDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether bluetooth contact sharing is disabled.
    */
  var bluetoothContactSharingDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether bluetooth is disabled. Prefer this setting over
    * bluetooth_config_disabled because bluetooth_config_disabled can be
    * bypassed by the user.
    */
  var bluetoothDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether all cameras on the device are disabled.
    */
  var cameraDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether configuring cell broadcast is disabled.
    */
  var cellBroadcastsConfigDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Rules for automatically choosing a private key and certificate to
    * authenticate the device to a server. The rules are ordered by increasing
    * precedence, so if an outgoing request matches more than one rule, the
    * last rule defines which private key to use.
    */
  var choosePrivateKeyRules: js.UndefOr[js.Array[SchemaChoosePrivateKeyRule]] = js.native
  /**
    * Rules declaring which mitigating actions to take when a device is not
    * compliant with its policy. When the conditions for multiple rules are
    * satisfied, all of the mitigating actions for the rules are taken. There
    * is a maximum limit of 100 rules.
    */
  var complianceRules: js.UndefOr[js.Array[SchemaComplianceRule]] = js.native
  /**
    * Whether creating windows besides app windows is disabled.
    */
  var createWindowsDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether configuring user credentials is disabled.
    */
  var credentialsConfigDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether roaming data services are disabled.
    */
  var dataRoamingDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the user is allowed to enable debugging features.
    */
  var debuggingFeaturesAllowed: js.UndefOr[Boolean] = js.native
  /**
    * The default permission policy for runtime permission requests.
    */
  var defaultPermissionPolicy: js.UndefOr[String] = js.native
  /**
    * The device owner information to be shown on the lock screen.
    */
  var deviceOwnerLockScreenInfo: js.UndefOr[SchemaUserFacingMessage] = js.native
  /**
    * Whether encryption is enabled
    */
  var encryptionPolicy: js.UndefOr[String] = js.native
  /**
    * Whether app verification is force-enabled.
    */
  var ensureVerifyAppsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether factory resetting from settings is disabled.
    */
  var factoryResetDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Email addresses of device administrators for factory reset protection.
    * When the device is factory reset, it will require one of these admins to
    * log in with the Google account email and password to unlock the device.
    * If no admins are specified, the device won&#39;t provide factory reset
    * protection.
    */
  var frpAdminEmails: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether the user is allowed to have fun. Controls whether the Easter egg
    * game in Settings is disabled.
    */
  var funDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether user installation of apps is disabled.
    */
  var installAppsDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the user is allowed to enable the &quot;Unknown Sources&quot;
    * setting, which allows installation of apps from unknown sources.
    */
  var installUnknownSourcesAllowed: js.UndefOr[Boolean] = js.native
  /**
    * Whether the keyguard is disabled.
    */
  var keyguardDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Disabled keyguard customizations, such as widgets.
    */
  var keyguardDisabledFeatures: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether the kiosk custom launcher is enabled. This replaces the home
    * screen with a launcher that locks down the device to the apps installed
    * via the applications setting. The apps appear on a single page in
    * alphabetical order. It is recommended to also use status_bar_disabled to
    * block access to device settings.
    */
  var kioskCustomLauncherEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The degree of location detection enabled. The user may change the value
    * unless the user is otherwise blocked from accessing device settings.
    */
  var locationMode: js.UndefOr[String] = js.native
  /**
    * A message displayed to the user in the device administators settings
    * screen.
    */
  var longSupportMessage: js.UndefOr[SchemaUserFacingMessage] = js.native
  /**
    * Maximum time in milliseconds for user activity until the device locks. A
    * value of 0 means there is no restriction.
    */
  var maximumTimeToLock: js.UndefOr[String] = js.native
  /**
    * Whether configuring mobile networks is disabled.
    */
  var mobileNetworksConfigDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether adding or removing accounts is disabled.
    */
  var modifyAccountsDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the user mounting physical external media is disabled.
    */
  var mountPhysicalMediaDisabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of the policy in the form
    * enterprises/{enterpriseId}/policies/{policyId}.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether the network escape hatch is enabled. If a network connection
    * can&#39;t be made at boot time, the escape hatch prompts the user to
    * temporarily connect to a network in order to refresh the device policy.
    * After applying policy, the temporary network will be forgotten and the
    * device will continue booting. This prevents being unable to connect to a
    * network if there is no suitable network in the last policy and the device
    * boots into an app in lock task mode, or the user is otherwise unable to
    * reach device settings.
    */
  var networkEscapeHatchEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether resetting network settings is disabled.
    */
  var networkResetDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Network configuration for the device. See configure networks for more
    * information.
    */
  var openNetworkConfiguration: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Whether using NFC to beam data from apps is disabled.
    */
  var outgoingBeamDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether outgoing calls are disabled.
    */
  var outgoingCallsDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Password requirement policies. Different policies can be set for work
    * profile or fully managed devices by setting the password_scope field in
    * the policy.
    */
  var passwordPolicies: js.UndefOr[js.Array[SchemaPasswordRequirements]] = js.native
  /**
    * Password requirements. DEPRECATED - Use password_policies
    */
  var passwordRequirements: js.UndefOr[SchemaPasswordRequirements] = js.native
  /**
    * Explicit permission or group grants or denials for all apps. These values
    * override the default_permission_policy.
    */
  var permissionGrants: js.UndefOr[js.Array[SchemaPermissionGrant]] = js.native
  /**
    * If present, only the input methods provided by packages in this list are
    * permitted. If this field is present, but the list is empty, then only
    * system input methods are permitted.
    */
  var permittedInputMethods: js.UndefOr[SchemaPackageNameList] = js.native
  /**
    * Default intent handler activities.
    */
  var persistentPreferredActivities: js.UndefOr[js.Array[SchemaPersistentPreferredActivity]] = js.native
  /**
    * This mode controls which apps are available to the user in the Play Store
    * and the behavior on the device when apps are removed from the policy.
    */
  var playStoreMode: js.UndefOr[String] = js.native
  /**
    * Allows showing UI on a device for a user to choose a private key alias if
    * there are no matching rules in ChoosePrivateKeyRules. For devices below
    * Android P, setting this may leave enterprise keys vulnerable.
    */
  var privateKeySelectionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The network-independent global HTTP proxy. Typically proxies should be
    * configured per-network in open_network_configuration. However for unusual
    * configurations like general internal filtering a global HTTP proxy may be
    * useful. If the proxy is not accessible, network access may break. The
    * global proxy is only a recommendation and some apps may ignore it.
    */
  var recommendedGlobalProxy: js.UndefOr[SchemaProxyInfo] = js.native
  /**
    * Whether removing other users is disabled.
    */
  var removeUserDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether rebooting the device into safe boot is disabled.
    */
  var safeBootDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether screen capture is disabled.
    */
  var screenCaptureDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether changing the user icon is disabled.
    */
  var setUserIconDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether changing the wallpaper is disabled.
    */
  var setWallpaperDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Actions to take during the setup process.
    */
  var setupActions: js.UndefOr[js.Array[SchemaSetupAction]] = js.native
  /**
    * Whether location sharing is disabled.
    */
  var shareLocationDisabled: js.UndefOr[Boolean] = js.native
  /**
    * A message displayed to the user in the settings screen wherever
    * functionality has been disabled by the admin.
    */
  var shortSupportMessage: js.UndefOr[SchemaUserFacingMessage] = js.native
  /**
    * Flag to skip hints on the first use. Enterprise admin can enable the
    * system recommendation for apps to skip their user tutorial and other
    * introductory hints on first start-up.
    */
  var skipFirstUseHintsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether sending and receiving SMS messages is disabled.
    */
  var smsDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the status bar is disabled. This disables notifications, quick
    * settings, and other screen overlays that allow escape from full-screen
    * mode.
    */
  var statusBarDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Status reporting settings
    */
  var statusReportingSettings: js.UndefOr[SchemaStatusReportingSettings] = js.native
  /**
    * The battery plugged in modes for which the device stays on. When using
    * this setting, it is recommended to clear maximum_time_to_lock so that the
    * device doesn&#39;t lock itself while it stays on.
    */
  var stayOnPluggedModes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The system update policy, which controls how OS updates are applied. If
    * the update type is WINDOWED, the update window will automatically apply
    * to Play app updates as well.
    */
  var systemUpdate: js.UndefOr[SchemaSystemUpdate] = js.native
  /**
    * Whether configuring tethering and portable hotspots is disabled.
    */
  var tetheringConfigDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether user uninstallation of applications is disabled.
    */
  var uninstallAppsDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the microphone is muted and adjusting microphone volume is
    * disabled.
    */
  var unmuteMicrophoneDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether transferring files over USB is disabled.
    */
  var usbFileTransferDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether USB storage is enabled. Deprecated.
    */
  var usbMassStorageEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The version of the policy. This is a read-only field. The version is
    * incremented each time the policy is updated.
    */
  var version: js.UndefOr[String] = js.native
  /**
    * Whether configuring VPN is disabled.
    */
  var vpnConfigDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether configuring Wi-Fi access points is disabled.
    */
  var wifiConfigDisabled: js.UndefOr[Boolean] = js.native
  /**
    * DEPRECATED - Use wifi_config_disabled.
    */
  var wifiConfigsLockdownEnabled: js.UndefOr[Boolean] = js.native
}

object SchemaPolicy {
  @scala.inline
  def apply(): SchemaPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicy]
  }
  @scala.inline
  implicit class SchemaPolicyOps[Self <: SchemaPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountTypesWithManagementDisabled(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountTypesWithManagementDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountTypesWithManagementDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountTypesWithManagementDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withAddUserDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addUserDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddUserDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addUserDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withAdjustVolumeDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustVolumeDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustVolumeDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustVolumeDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysOnVpnPackage(value: SchemaAlwaysOnVpnPackage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysOnVpnPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysOnVpnPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysOnVpnPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidDevicePolicyTracks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDevicePolicyTracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidDevicePolicyTracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDevicePolicyTracks")(js.undefined)
        ret
    }
    @scala.inline
    def withAppAutoUpdatePolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appAutoUpdatePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppAutoUpdatePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appAutoUpdatePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withApplications(value: js.Array[SchemaApplicationPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applications")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoTimeRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoTimeRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoTimeRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoTimeRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockApplicationsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockApplicationsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockApplicationsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockApplicationsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withBluetoothConfigDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothConfigDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBluetoothConfigDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothConfigDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withBluetoothContactSharingDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothContactSharingDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBluetoothContactSharingDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothContactSharingDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withBluetoothDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBluetoothDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCameraDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCameraDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCellBroadcastsConfigDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellBroadcastsConfigDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellBroadcastsConfigDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellBroadcastsConfigDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withChoosePrivateKeyRules(value: js.Array[SchemaChoosePrivateKeyRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choosePrivateKeyRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChoosePrivateKeyRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choosePrivateKeyRules")(js.undefined)
        ret
    }
    @scala.inline
    def withComplianceRules(value: js.Array[SchemaComplianceRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complianceRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complianceRules")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateWindowsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWindowsDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateWindowsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWindowsDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentialsConfigDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialsConfigDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentialsConfigDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialsConfigDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDataRoamingDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRoamingDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataRoamingDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRoamingDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDebuggingFeaturesAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debuggingFeaturesAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebuggingFeaturesAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debuggingFeaturesAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPermissionPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPermissionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPermissionPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPermissionPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceOwnerLockScreenInfo(value: SchemaUserFacingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceOwnerLockScreenInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceOwnerLockScreenInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceOwnerLockScreenInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withEnsureVerifyAppsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureVerifyAppsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnsureVerifyAppsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureVerifyAppsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFactoryResetDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factoryResetDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactoryResetDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factoryResetDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFrpAdminEmails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frpAdminEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrpAdminEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frpAdminEmails")(js.undefined)
        ret
    }
    @scala.inline
    def withFunDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallAppsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installAppsDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallAppsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installAppsDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallUnknownSourcesAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installUnknownSourcesAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallUnknownSourcesAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installUnknownSourcesAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyguardDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyguardDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyguardDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyguardDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyguardDisabledFeatures(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyguardDisabledFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyguardDisabledFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyguardDisabledFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskCustomLauncherEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskCustomLauncherEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskCustomLauncherEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskCustomLauncherEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationMode")(js.undefined)
        ret
    }
    @scala.inline
    def withLongSupportMessage(value: SchemaUserFacingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longSupportMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongSupportMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longSupportMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumTimeToLock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumTimeToLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumTimeToLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumTimeToLock")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileNetworksConfigDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileNetworksConfigDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileNetworksConfigDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileNetworksConfigDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyAccountsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyAccountsDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifyAccountsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyAccountsDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMountPhysicalMediaDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountPhysicalMediaDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMountPhysicalMediaDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountPhysicalMediaDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkEscapeHatchEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkEscapeHatchEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkEscapeHatchEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkEscapeHatchEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkResetDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkResetDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkResetDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkResetDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenNetworkConfiguration(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openNetworkConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenNetworkConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openNetworkConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withOutgoingBeamDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingBeamDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutgoingBeamDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingBeamDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOutgoingCallsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingCallsDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutgoingCallsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingCallsDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordPolicies(value: js.Array[SchemaPasswordRequirements]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordRequirements(value: SchemaPasswordRequirements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordRequirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordRequirements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordRequirements")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissionGrants(value: js.Array[SchemaPermissionGrant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionGrants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionGrants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionGrants")(js.undefined)
        ret
    }
    @scala.inline
    def withPermittedInputMethods(value: SchemaPackageNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permittedInputMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermittedInputMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permittedInputMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentPreferredActivities(value: js.Array[SchemaPersistentPreferredActivity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentPreferredActivities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentPreferredActivities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentPreferredActivities")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayStoreMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playStoreMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayStoreMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playStoreMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateKeySelectionEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeySelectionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKeySelectionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeySelectionEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommendedGlobalProxy(value: SchemaProxyInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendedGlobalProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendedGlobalProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendedGlobalProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveUserDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUserDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveUserDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUserDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeBootDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeBootDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeBootDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeBootDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenCaptureDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenCaptureDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenCaptureDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenCaptureDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUserIconDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUserIconDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetUserIconDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUserIconDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWallpaperDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWallpaperDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetWallpaperDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWallpaperDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSetupActions(value: js.Array[SchemaSetupAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetupActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupActions")(js.undefined)
        ret
    }
    @scala.inline
    def withShareLocationDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareLocationDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareLocationDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareLocationDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withShortSupportMessage(value: SchemaUserFacingMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortSupportMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortSupportMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortSupportMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipFirstUseHintsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFirstUseHintsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipFirstUseHintsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFirstUseHintsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSmsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smsDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smsDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusBarDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusBarDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusReportingSettings(value: SchemaStatusReportingSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusReportingSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusReportingSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusReportingSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withStayOnPluggedModes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stayOnPluggedModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStayOnPluggedModes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stayOnPluggedModes")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemUpdate(value: SchemaSystemUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withTetheringConfigDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tetheringConfigDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTetheringConfigDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tetheringConfigDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withUninstallAppsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstallAppsDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUninstallAppsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstallAppsDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmuteMicrophoneDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmuteMicrophoneDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmuteMicrophoneDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmuteMicrophoneDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withUsbFileTransferDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usbFileTransferDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsbFileTransferDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usbFileTransferDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withUsbMassStorageEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usbMassStorageEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsbMassStorageEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usbMassStorageEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVpnConfigDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnConfigDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnConfigDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnConfigDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withWifiConfigDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiConfigDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWifiConfigDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiConfigDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withWifiConfigsLockdownEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiConfigsLockdownEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWifiConfigsLockdownEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiConfigsLockdownEnabled")(js.undefined)
        ret
    }
  }
  
}

