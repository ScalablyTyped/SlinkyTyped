package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultManagedAppProtection extends ManagedAppProtection {
  /**
    * Type of encryption which should be used for data in a managed app. (iOS Only). Possible values are: useDeviceSettings,
    * afterDeviceRestart, whenDeviceLockedExceptOpenFiles, whenDeviceLocked.
    */
  var appDataEncryptionType: js.UndefOr[ManagedAppDataEncryptionType] = js.native
  // List of apps to which the policy is deployed.
  var apps: js.UndefOr[js.Array[ManagedMobileApp]] = js.native
  // A set of string key and string value pairs to be sent to the affected users, unalterned by this service
  var customSettings: js.UndefOr[js.Array[KeyValuePair]] = js.native
  // Count of apps to which the current policy is deployed.
  var deployedAppCount: js.UndefOr[Double] = js.native
  // Navigation property to deployment summary of the configuration.
  var deploymentSummary: js.UndefOr[ManagedAppPolicyDeploymentSummary] = js.native
  // When this setting is enabled, app level encryption is disabled if device level encryption is enabled. (Android only)
  var disableAppEncryptionIfDeviceEncryptionIsEnabled: js.UndefOr[Boolean] = js.native
  // Indicates whether managed-app data should be encrypted. (Android only)
  var encryptAppData: js.UndefOr[Boolean] = js.native
  // Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True. (iOS Only)
  var faceIdBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Define the oldest required Android security patch level a user can have to gain secure access to the app. (Android
    * only)
    */
  var minimumRequiredPatchVersion: js.UndefOr[String] = js.native
  // Versions less than the specified version will block the managed app from accessing company data. (iOS Only)
  var minimumRequiredSdkVersion: js.UndefOr[String] = js.native
  // Define the oldest recommended Android security patch level a user can have for secure access to the app. (Android only)
  var minimumWarningPatchVersion: js.UndefOr[String] = js.native
  // Indicates whether screen capture is blocked. (Android only)
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.native
}

object DefaultManagedAppProtection {
  @scala.inline
  def apply(): DefaultManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultManagedAppProtection]
  }
  @scala.inline
  implicit class DefaultManagedAppProtectionOps[Self <: DefaultManagedAppProtection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppDataEncryptionType(value: ManagedAppDataEncryptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appDataEncryptionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppDataEncryptionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appDataEncryptionType")(js.undefined)
        ret
    }
    @scala.inline
    def withApps(value: js.Array[ManagedMobileApp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apps")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSettings(value: js.Array[KeyValuePair]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDeployedAppCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployedAppCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeployedAppCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployedAppCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentSummary(value: ManagedAppPolicyDeploymentSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAppEncryptionIfDeviceEncryptionIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAppEncryptionIfDeviceEncryptionIsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAppEncryptionIfDeviceEncryptionIsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAppEncryptionIfDeviceEncryptionIsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptAppData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptAppData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptAppData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptAppData")(js.undefined)
        ret
    }
    @scala.inline
    def withFaceIdBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceIdBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaceIdBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceIdBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumRequiredPatchVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumRequiredPatchVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumRequiredPatchVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumRequiredPatchVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumRequiredSdkVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumRequiredSdkVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumRequiredSdkVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumRequiredSdkVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumWarningPatchVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumWarningPatchVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumWarningPatchVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumWarningPatchVersion")(js.undefined)
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
  }
  
}

