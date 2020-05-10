package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Policy extends js.Object {
  /** Whether adding new users and profiles is disabled. */
  var addUserDisabled: js.UndefOr[Boolean] = js.native
  /** Whether adjusting the master volume is disabled. */
  var adjustVolumeDisabled: js.UndefOr[Boolean] = js.native
  /** Policy applied to apps. */
  var applications: js.UndefOr[js.Array[ApplicationPolicy]] = js.native
  /** Whether auto time is required, which prevents the user from manually setting the date and time. */
  var autoTimeRequired: js.UndefOr[Boolean] = js.native
  /**
    * Whether applications other than the ones configured in applications are blocked from being installed. When set, applications that were installed under
    * a previous policy but no longer appear in the policy are automatically uninstalled.
    */
  var blockApplicationsEnabled: js.UndefOr[Boolean] = js.native
  /** Whether all cameras on the device are disabled. */
  var cameraDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Rules declaring which mitigating actions to take when a device is not compliant with its policy. When the conditions for multiple rules are satisfied,
    * all of the mitigating actions for the rules are taken. There is a maximum limit of 100 rules.
    */
  var complianceRules: js.UndefOr[js.Array[ComplianceRule]] = js.native
  /** Whether the user is allowed to enable debugging features. */
  var debuggingFeaturesAllowed: js.UndefOr[Boolean] = js.native
  /** The default permission policy for requests for runtime permissions. */
  var defaultPermissionPolicy: js.UndefOr[String] = js.native
  /** Whether factory resetting from settings is disabled. */
  var factoryResetDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Email addresses of device administrators for factory reset protection. When the device is factory reset, it will require one of these admins to log in
    * with the Google account email and password to unlock the device. If no admins are specified, the device will not provide factory reset protection.
    */
  var frpAdminEmails: js.UndefOr[js.Array[String]] = js.native
  /** Whether the user is allowed to have fun. Controls whether the Easter egg game in Settings is disabled. */
  var funDisabled: js.UndefOr[Boolean] = js.native
  /** Whether the user is allowed to enable the "Unknown Sources" setting, which allows installation of apps from unknown sources. */
  var installUnknownSourcesAllowed: js.UndefOr[Boolean] = js.native
  /** Whether the keyguard is disabled. */
  var keyguardDisabled: js.UndefOr[Boolean] = js.native
  /** Maximum time in milliseconds for user activity until the device will lock. A value of 0 means there is no restriction. */
  var maximumTimeToLock: js.UndefOr[String] = js.native
  /** Whether adding or removing accounts is disabled. */
  var modifyAccountsDisabled: js.UndefOr[Boolean] = js.native
  /** The name of the policy in the form enterprises/{enterpriseId}/policies/{policyId} */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether the network escape hatch is enabled. If a network connection can't be made at boot time, the escape hatch prompts the user to temporarily
    * connect to a network in order to refresh the device policy. After applying policy, the temporary network will be forgotten and the device will continue
    * booting. This prevents being unable to connect to a network if there is no suitable network in the last policy and the device boots into an app in lock
    * task mode, or the user is otherwise unable to reach device settings.
    */
  var networkEscapeHatchEnabled: js.UndefOr[Boolean] = js.native
  /** Network configuration for the device. See configure networks for more information. */
  var openNetworkConfiguration: js.UndefOr[Record[String, _]] = js.native
  /** Password requirements. */
  var passwordRequirements: js.UndefOr[PasswordRequirements] = js.native
  /** Default intent handler activities. */
  var persistentPreferredActivities: js.UndefOr[js.Array[PersistentPreferredActivity]] = js.native
  /** Whether removing other users is disabled. */
  var removeUserDisabled: js.UndefOr[Boolean] = js.native
  /** Whether rebooting the device into safe boot is disabled. */
  var safeBootDisabled: js.UndefOr[Boolean] = js.native
  /** Whether screen capture is disabled. */
  var screenCaptureDisabled: js.UndefOr[Boolean] = js.native
  /** Whether the status bar is disabled. This disables notifications, quick settings and other screen overlays that allow escape from full-screen mode. */
  var statusBarDisabled: js.UndefOr[Boolean] = js.native
  /** Status reporting settings */
  var statusReportingSettings: js.UndefOr[StatusReportingSettings] = js.native
  /**
    * The battery plugged in modes for which the device stays on. When using this setting, it is recommended to clear maximum_time_to_lock so that the device
    * doesn't lock itself while it stays on.
    */
  var stayOnPluggedModes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The system update policy, which controls how OS updates are applied. If the update type is WINDOWED and the device has a device account, the update
    * window will automatically apply to Play app updates as well.
    */
  var systemUpdate: js.UndefOr[SystemUpdate] = js.native
  /** Whether the microphone is muted and adjusting microphone volume is disabled. */
  var unmuteMicrophoneDisabled: js.UndefOr[Boolean] = js.native
  /** The version of the policy. This is a read-only field. The version is incremented each time the policy is updated. */
  var version: js.UndefOr[String] = js.native
  /** Whether configuring WiFi access points is disabled. */
  var wifiConfigDisabled: js.UndefOr[Boolean] = js.native
  /** Whether WiFi networks defined in Open Network Configuration are locked so they cannot be edited by the user. */
  var wifiConfigsLockdownEnabled: js.UndefOr[Boolean] = js.native
}

object Policy {
  @scala.inline
  def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  @scala.inline
  implicit class PolicyOps[Self <: Policy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withApplications(value: js.Array[ApplicationPolicy]): Self = {
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
    def withComplianceRules(value: js.Array[ComplianceRule]): Self = {
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
    def withOpenNetworkConfiguration(value: Record[String, _]): Self = {
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
    def withPasswordRequirements(value: PasswordRequirements): Self = {
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
    def withPersistentPreferredActivities(value: js.Array[PersistentPreferredActivity]): Self = {
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
    def withStatusReportingSettings(value: StatusReportingSettings): Self = {
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
    def withSystemUpdate(value: SystemUpdate): Self = {
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

