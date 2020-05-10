package typingsSlinky.pulumiAws.fleetMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.FleetLaunchTemplateConfig
import typingsSlinky.pulumiAws.inputMod.ec2.FleetOnDemandOptions
import typingsSlinky.pulumiAws.inputMod.ec2.FleetSpotOptions
import typingsSlinky.pulumiAws.inputMod.ec2.FleetTargetCapacitySpecification
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetState extends js.Object {
  /**
    * Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
    */
  val excessCapacityTerminationPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * Nested argument containing EC2 Launch Template configurations. Defined below.
    */
  val launchTemplateConfig: js.UndefOr[Input[FleetLaunchTemplateConfig]] = js.native
  /**
    * Nested argument containing On-Demand configurations. Defined below.
    */
  val onDemandOptions: js.UndefOr[Input[FleetOnDemandOptions]] = js.native
  /**
    * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
    */
  val replaceUnhealthyInstances: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Nested argument containing Spot configurations. Defined below.
    */
  val spotOptions: js.UndefOr[Input[FleetSpotOptions]] = js.native
  /**
    * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Nested argument containing target capacity configurations. Defined below.
    */
  val targetCapacitySpecification: js.UndefOr[Input[FleetTargetCapacitySpecification]] = js.native
  /**
    * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
    */
  val terminateInstances: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
    */
  val terminateInstancesWithExpiration: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object FleetState {
  @scala.inline
  def apply(): FleetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetState]
  }
  @scala.inline
  implicit class FleetStateOps[Self <: FleetState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcessCapacityTerminationPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excessCapacityTerminationPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcessCapacityTerminationPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excessCapacityTerminationPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTemplateConfig(value: Input[FleetLaunchTemplateConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchTemplateConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTemplateConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchTemplateConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDemandOptions(value: Input[FleetOnDemandOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDemandOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDemandOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceUnhealthyInstances(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceUnhealthyInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceUnhealthyInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceUnhealthyInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotOptions(value: Input[FleetSpotOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetCapacitySpecification(value: Input[FleetTargetCapacitySpecification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCapacitySpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetCapacitySpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCapacitySpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminateInstances(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminateInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminateInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminateInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminateInstancesWithExpiration(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminateInstancesWithExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminateInstancesWithExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminateInstancesWithExpiration")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

