package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidManagedAppProtection extends TargetedManagedAppProtection {
  // List of apps to which the policy is deployed.
  var apps: js.UndefOr[js.Array[ManagedMobileApp]] = js.native
  // Count of apps to which the current policy is deployed.
  var deployedAppCount: js.UndefOr[Double] = js.native
  // Navigation property to deployment summary of the configuration.
  var deploymentSummary: js.UndefOr[ManagedAppPolicyDeploymentSummary] = js.native
  // When this setting is enabled, app level encryption is disabled if device level encryption is enabled
  var disableAppEncryptionIfDeviceEncryptionIsEnabled: js.UndefOr[Boolean] = js.native
  // Indicates whether application data for managed apps should be encrypted
  var encryptAppData: js.UndefOr[Boolean] = js.native
  // Define the oldest required Android security patch level a user can have to gain secure access to the app.
  var minimumRequiredPatchVersion: js.UndefOr[String] = js.native
  // Define the oldest recommended Android security patch level a user can have for secure access to the app.
  var minimumWarningPatchVersion: js.UndefOr[String] = js.native
  // Indicates whether a managed user can take screen captures of managed apps
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.native
}

object AndroidManagedAppProtection {
  @scala.inline
  def apply(): AndroidManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidManagedAppProtection]
  }
  @scala.inline
  implicit class AndroidManagedAppProtectionOps[Self <: AndroidManagedAppProtection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

