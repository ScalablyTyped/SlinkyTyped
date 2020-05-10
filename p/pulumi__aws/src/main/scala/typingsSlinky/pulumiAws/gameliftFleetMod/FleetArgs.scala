package typingsSlinky.pulumiAws.gameliftFleetMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.gamelift.FleetEc2InboundPermission
import typingsSlinky.pulumiAws.inputMod.gamelift.FleetResourceCreationLimitPolicy
import typingsSlinky.pulumiAws.inputMod.gamelift.FleetRuntimeConfiguration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetArgs extends js.Object {
  /**
    * ID of the Gamelift Build to be deployed on the fleet.
    */
  val buildId: Input[String] = js.native
  /**
    * Human-readable description of the fleet.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
    */
  val ec2InboundPermissions: js.UndefOr[Input[js.Array[Input[FleetEc2InboundPermission]]]] = js.native
  /**
    * Name of an EC2 instance type. e.g. `t2.micro`
    */
  val ec2InstanceType: Input[String] = js.native
  /**
    * Type of fleet. This value must be `ON_DEMAND` or `SPOT`. Defaults to `ON_DEMAND`.
    */
  val fleetType: js.UndefOr[Input[String]] = js.native
  /**
    * ARN of an IAM role that instances in the fleet can assume.
    */
  val instanceRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
    */
  val metricGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of the fleet.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Game session protection policy to apply to all instances in this fleet. e.g. `FullProtection`. Defaults to `NoProtection`.
    */
  val newGameSessionProtectionPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
    */
  val resourceCreationLimitPolicy: js.UndefOr[Input[FleetResourceCreationLimitPolicy]] = js.native
  /**
    * Instructions for launching server processes on each instance in the fleet. See below.
    */
  val runtimeConfiguration: js.UndefOr[Input[FleetRuntimeConfiguration]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object FleetArgs {
  @scala.inline
  def apply(buildId: Input[String], ec2InstanceType: Input[String]): FleetArgs = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], ec2InstanceType = ec2InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetArgs]
  }
  @scala.inline
  implicit class FleetArgsOps[Self <: FleetArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEc2InstanceType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEc2InboundPermissions(value: Input[js.Array[Input[FleetEc2InboundPermission]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2InboundPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2InboundPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2InboundPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withFleetType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fleetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fleetType")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricGroups(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
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
    def withNewGameSessionProtectionPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGameSessionProtectionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewGameSessionProtectionPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGameSessionProtectionPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceCreationLimitPolicy(value: Input[FleetResourceCreationLimitPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceCreationLimitPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceCreationLimitPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceCreationLimitPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimeConfiguration(value: Input[FleetRuntimeConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeConfiguration")(js.undefined)
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
  }
  
}

