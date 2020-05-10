package typingsSlinky.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentStrategy extends js.Object {
  /**
    * Total amount of time the deployment lasted.
    */
  var DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.native
  /**
    * The description of the deployment strategy.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.appconfigMod.Description] = js.native
  /**
    * The amount of time AppConfig monitored for alarms before considering the deployment to be complete and no longer eligible for automatic roll back.
    */
  var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.native
  /**
    * The percentage of targets that received a deployed configuration during each interval.
    */
  var GrowthFactor: js.UndefOr[Percentage] = js.native
  /**
    * The algorithm used to define how percentage grew over time.
    */
  var GrowthType: js.UndefOr[typingsSlinky.awsSdk.appconfigMod.GrowthType] = js.native
  /**
    * The deployment strategy ID.
    */
  var Id: js.UndefOr[typingsSlinky.awsSdk.appconfigMod.Id] = js.native
  /**
    * The name of the deployment strategy.
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.appconfigMod.Name] = js.native
  /**
    * Save the deployment strategy to a Systems Manager (SSM) document.
    */
  var ReplicateTo: js.UndefOr[typingsSlinky.awsSdk.appconfigMod.ReplicateTo] = js.native
}

object DeploymentStrategy {
  @scala.inline
  def apply(): DeploymentStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentStrategy]
  }
  @scala.inline
  implicit class DeploymentStrategyOps[Self <: DeploymentStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
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
    def withId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicateTo(value: ReplicateTo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicateTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicateTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicateTo")(js.undefined)
        ret
    }
  }
  
}

