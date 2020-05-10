package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsUpdateForBusinessConfiguration extends DeviceConfiguration {
  /**
    * Automatic update mode. Possible values are: userDefined, notifyDownload, autoInstallAtMaintenanceTime,
    * autoInstallAndRebootAtMaintenanceTime, autoInstallAndRebootAtScheduledTime, autoInstallAndRebootWithoutEndUserControl.
    */
  var automaticUpdateMode: js.UndefOr[AutomaticUpdateMode] = js.native
  /**
    * Determines which branch devices will receive their updates from. Possible values are: userDefined, all,
    * businessReadyOnly, windowsInsiderBuildFast, windowsInsiderBuildSlow, windowsInsiderBuildRelease.
    */
  var businessReadyUpdatesOnly: js.UndefOr[WindowsUpdateType] = js.native
  /**
    * Delivery Optimization Mode. Possible values are: userDefined, httpOnly, httpWithPeeringNat,
    * httpWithPeeringPrivateGroup, httpWithInternetPeering, simpleDownload, bypassMode.
    */
  var deliveryOptimizationMode: js.UndefOr[WindowsDeliveryOptimizationMode] = js.native
  // Exclude Windows update Drivers
  var driversExcluded: js.UndefOr[Boolean] = js.native
  // Defer Feature Updates by these many days
  var featureUpdatesDeferralPeriodInDays: js.UndefOr[Double] = js.native
  // Feature Updates Pause Expiry datetime
  var featureUpdatesPauseExpiryDateTime: js.UndefOr[String] = js.native
  // Pause Feature Updates
  var featureUpdatesPaused: js.UndefOr[Boolean] = js.native
  // Installation schedule
  var installationSchedule: js.UndefOr[WindowsUpdateInstallScheduleType] = js.native
  // Allow Microsoft Update Service
  var microsoftUpdateServiceAllowed: js.UndefOr[Boolean] = js.native
  // The pre-release features. Possible values are: userDefined, settingsOnly, settingsAndExperimentations, notAllowed.
  var prereleaseFeatures: js.UndefOr[PrereleaseFeatures] = js.native
  // Defer Quality Updates by these many days
  var qualityUpdatesDeferralPeriodInDays: js.UndefOr[Double] = js.native
  // Quality Updates Pause Expiry datetime
  var qualityUpdatesPauseExpiryDateTime: js.UndefOr[String] = js.native
  // Pause Quality Updates
  var qualityUpdatesPaused: js.UndefOr[Boolean] = js.native
}

object WindowsUpdateForBusinessConfiguration {
  @scala.inline
  def apply(): WindowsUpdateForBusinessConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUpdateForBusinessConfiguration]
  }
  @scala.inline
  implicit class WindowsUpdateForBusinessConfigurationOps[Self <: WindowsUpdateForBusinessConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomaticUpdateMode(value: AutomaticUpdateMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticUpdateMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticUpdateMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticUpdateMode")(js.undefined)
        ret
    }
    @scala.inline
    def withBusinessReadyUpdatesOnly(value: WindowsUpdateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessReadyUpdatesOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessReadyUpdatesOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessReadyUpdatesOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryOptimizationMode(value: WindowsDeliveryOptimizationMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryOptimizationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryOptimizationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryOptimizationMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDriversExcluded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driversExcluded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriversExcluded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driversExcluded")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureUpdatesDeferralPeriodInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureUpdatesDeferralPeriodInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureUpdatesDeferralPeriodInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureUpdatesDeferralPeriodInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureUpdatesPauseExpiryDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureUpdatesPauseExpiryDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureUpdatesPauseExpiryDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureUpdatesPauseExpiryDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureUpdatesPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureUpdatesPaused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureUpdatesPaused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureUpdatesPaused")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallationSchedule(value: WindowsUpdateInstallScheduleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationSchedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallationSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationSchedule")(js.undefined)
        ret
    }
    @scala.inline
    def withMicrosoftUpdateServiceAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsoftUpdateServiceAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicrosoftUpdateServiceAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsoftUpdateServiceAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withPrereleaseFeatures(value: PrereleaseFeatures): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prereleaseFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrereleaseFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prereleaseFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withQualityUpdatesDeferralPeriodInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualityUpdatesDeferralPeriodInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualityUpdatesDeferralPeriodInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualityUpdatesDeferralPeriodInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withQualityUpdatesPauseExpiryDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualityUpdatesPauseExpiryDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualityUpdatesPauseExpiryDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualityUpdatesPauseExpiryDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withQualityUpdatesPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualityUpdatesPaused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualityUpdatesPaused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualityUpdatesPaused")(js.undefined)
        ret
    }
  }
  
}

