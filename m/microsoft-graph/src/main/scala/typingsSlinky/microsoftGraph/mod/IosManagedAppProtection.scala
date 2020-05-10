package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosManagedAppProtection extends TargetedManagedAppProtection {
  /**
    * Type of encryption which should be used for data in a managed app. Possible values are: useDeviceSettings,
    * afterDeviceRestart, whenDeviceLockedExceptOpenFiles, whenDeviceLocked.
    */
  var appDataEncryptionType: js.UndefOr[ManagedAppDataEncryptionType] = js.native
  // List of apps to which the policy is deployed.
  var apps: js.UndefOr[js.Array[ManagedMobileApp]] = js.native
  // Count of apps to which the current policy is deployed.
  var deployedAppCount: js.UndefOr[Double] = js.native
  // Navigation property to deployment summary of the configuration.
  var deploymentSummary: js.UndefOr[ManagedAppPolicyDeploymentSummary] = js.native
  // Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True.
  var faceIdBlocked: js.UndefOr[Boolean] = js.native
  // Versions less than the specified version will block the managed app from accessing company data.
  var minimumRequiredSdkVersion: js.UndefOr[String] = js.native
}

object IosManagedAppProtection {
  @scala.inline
  def apply(): IosManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosManagedAppProtection]
  }
  @scala.inline
  implicit class IosManagedAppProtectionOps[Self <: IosManagedAppProtection] (val x: Self) extends AnyVal {
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
  }
  
}

