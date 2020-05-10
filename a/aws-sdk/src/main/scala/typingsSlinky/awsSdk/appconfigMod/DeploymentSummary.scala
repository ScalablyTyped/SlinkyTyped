package typingsSlinky.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentSummary extends js.Object {
  /**
    * Time the deployment completed.
    */
  var CompletedAt: js.UndefOr[js.Date] = js.native
  /**
    * The name of the configuration.
    */
  var ConfigurationName: js.UndefOr[Name] = js.native
  /**
    * The version of the configuration.
    */
  var ConfigurationVersion: js.UndefOr[Version] = js.native
  /**
    * Total amount of time the deployment lasted.
    */
  var DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.native
  /**
    * The sequence number of the deployment.
    */
  var DeploymentNumber: js.UndefOr[Integer] = js.native
  /**
    * The amount of time AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back.
    */
  var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.native
  /**
    * The percentage of targets to receive a deployed configuration during each interval.
    */
  var GrowthFactor: js.UndefOr[Percentage] = js.native
  /**
    * The algorithm used to define how percentage grows over time.
    */
  var GrowthType: js.UndefOr[typingsSlinky.awsSdk.appconfigMod.GrowthType] = js.native
  /**
    * The percentage of targets for which the deployment is available.
    */
  var PercentageComplete: js.UndefOr[Percentage] = js.native
  /**
    * Time the deployment started.
    */
  var StartedAt: js.UndefOr[js.Date] = js.native
  /**
    * The state of the deployment.
    */
  var State: js.UndefOr[DeploymentState] = js.native
}

object DeploymentSummary {
  @scala.inline
  def apply(): DeploymentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentSummary]
  }
  @scala.inline
  implicit class DeploymentSummaryOps[Self <: DeploymentSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationName")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentDurationInMinutes(value: MinutesBetween0And24Hours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentDurationInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentDurationInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentDurationInMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentNumber(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalBakeTimeInMinutes(value: MinutesBetween0And24Hours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalBakeTimeInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalBakeTimeInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinalBakeTimeInMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withGrowthFactor(value: Percentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrowthFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrowthFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrowthFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withGrowthType(value: GrowthType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrowthType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrowthType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrowthType")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentageComplete(value: Percentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PercentageComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentageComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PercentageComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withStartedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: DeploymentState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

