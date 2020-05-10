package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedPCConfiguration extends DeviceConfiguration {
  // Specifies how accounts are managed on a shared PC. Only applies when disableAccountManager is false.
  var accountManagerPolicy: js.UndefOr[SharedPCAccountManagerPolicy] = js.native
  // Specifies whether local storage is allowed on a shared PC.
  var allowLocalStorage: js.UndefOr[Boolean] = js.native
  // Indicates which type of accounts are allowed to use on a shared PC. Possible values are: guest, domain.
  var allowedAccounts: js.UndefOr[SharedPCAllowedAccountType] = js.native
  // Disables the account manager for shared PC mode.
  var disableAccountManager: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the default shared PC education environment policies should be disabled. For Windows 10 RS2 and
    * later, this policy will be applied without setting Enabled to true.
    */
  var disableEduPolicies: js.UndefOr[Boolean] = js.native
  // Specifies whether the default shared PC power policies should be disabled.
  var disablePowerPolicies: js.UndefOr[Boolean] = js.native
  // Disables the requirement to sign in whenever the device wakes up from sleep mode.
  var disableSignInOnResume: js.UndefOr[Boolean] = js.native
  // Enables shared PC mode and applies the shared pc policies.
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the time in seconds that a device must sit idle before the PC goes to sleep. Setting this value to 0 prevents
    * the sleep timeout from occurring.
    */
  var idleTimeBeforeSleepInSeconds: js.UndefOr[Double] = js.native
  /**
    * Specifies the display text for the account shown on the sign-in screen which launches the app specified by
    * SetKioskAppUserModelId. Only applies when KioskAppUserModelId is set.
    */
  var kioskAppDisplayName: js.UndefOr[String] = js.native
  // Specifies the application user model ID of the app to use with assigned access.
  var kioskAppUserModelId: js.UndefOr[String] = js.native
  // Specifies the daily start time of maintenance hour.
  var maintenanceStartTime: js.UndefOr[String] = js.native
}

object SharedPCConfiguration {
  @scala.inline
  def apply(): SharedPCConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedPCConfiguration]
  }
  @scala.inline
  implicit class SharedPCConfigurationOps[Self <: SharedPCConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountManagerPolicy(value: SharedPCAccountManagerPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountManagerPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountManagerPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountManagerPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowLocalStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLocalStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowLocalStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLocalStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedAccounts(value: SharedPCAllowedAccountType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAccountManager(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAccountManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAccountManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAccountManager")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableEduPolicies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEduPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableEduPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEduPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withDisablePowerPolicies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePowerPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePowerPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePowerPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableSignInOnResume(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSignInOnResume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSignInOnResume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSignInOnResume")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIdleTimeBeforeSleepInSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeBeforeSleepInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdleTimeBeforeSleepInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleTimeBeforeSleepInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskAppDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskAppDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskAppDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskAppDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withKioskAppUserModelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskAppUserModelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKioskAppUserModelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kioskAppUserModelId")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintenanceStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenanceStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceStartTime")(js.undefined)
        ret
    }
  }
  
}

