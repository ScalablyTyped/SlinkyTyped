package typingsSlinky.pulumiAws.spotFleetRequestMod

import typingsSlinky.pulumiAws.inputMod.ec2.SpotFleetRequestLaunchSpecification
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetRequestArgs extends js.Object {
  /**
    * Indicates how to allocate the target capacity across
    * the Spot pools specified by the Spot fleet request. The default is
    * `lowestPrice`.
    */
  val allocationStrategy: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether running Spot
    * instances should be terminated if the target capacity of the Spot fleet
    * request is decreased below the current size of the Spot fleet.
    */
  val excessCapacityTerminationPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * The type of fleet request. Indicates whether the Spot Fleet only requests the target
    * capacity or also attempts to maintain it. Default is `maintain`.
    */
  val fleetType: js.UndefOr[Input[String]] = js.native
  /**
    * Grants the Spot fleet permission to terminate
    * Spot instances on your behalf when you cancel its Spot fleet request using
    * CancelSpotFleetRequests or when the Spot fleet request expires, if you set
    * terminateInstancesWithExpiration.
    */
  val iamFleetRole: Input[String] = js.native
  /**
    * Indicates whether a Spot
    * instance stops or terminates when it is interrupted. Default is
    * `terminate`.
    */
  val instanceInterruptionBehaviour: js.UndefOr[Input[String]] = js.native
  /**
    *
    * The number of Spot pools across which to allocate your target Spot capacity.
    * Valid only when `allocationStrategy` is set to `lowestPrice`. Spot Fleet selects
    * the cheapest Spot pools and evenly allocates your target Spot capacity across
    * the number of Spot pools that you specify.
    */
  val instancePoolsToUseCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Used to define the launch configuration of the
    * spot-fleet request. Can be specified multiple times to define different bids
    * across different markets and instance types.
    */
  val launchSpecifications: Input[js.Array[Input[SpotFleetRequestLaunchSpecification]]] = js.native
  /**
    * A list of elastic load balancer names to add to the Spot fleet.
    */
  val loadBalancers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Indicates whether Spot fleet should replace unhealthy instances. Default `false`.
    */
  val replaceUnhealthyInstances: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The maximum bid price per unit hour.
    */
  val spotPrice: js.UndefOr[Input[String]] = js.native
  /**
    * The number of units to request. You can choose to set the
    * target capacity in terms of instances or a performance characteristic that is
    * important to your application workload, such as vCPUs, memory, or I/O.
    */
  val targetCapacity: Input[Double] = js.native
  /**
    * A list of `aws.alb.TargetGroup` ARNs, for use with Application Load Balancing.
    */
  val targetGroupArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Indicates whether running Spot
    * instances should be terminated when the Spot fleet request expires.
    */
  val terminateInstancesWithExpiration: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
    */
  val validFrom: js.UndefOr[Input[String]] = js.native
  /**
    * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request. Defaults to 24 hours.
    */
  val validUntil: js.UndefOr[Input[String]] = js.native
  /**
    * If set, this provider will
    * wait for the Spot Request to be fulfilled, and will throw an error if the
    * timeout of 10m is reached.
    */
  val waitForFulfillment: js.UndefOr[Input[Boolean]] = js.native
}

object SpotFleetRequestArgs {
  @scala.inline
  def apply(
    iamFleetRole: Input[String],
    launchSpecifications: Input[js.Array[Input[SpotFleetRequestLaunchSpecification]]],
    targetCapacity: Input[Double]
  ): SpotFleetRequestArgs = {
    val __obj = js.Dynamic.literal(iamFleetRole = iamFleetRole.asInstanceOf[js.Any], launchSpecifications = launchSpecifications.asInstanceOf[js.Any], targetCapacity = targetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestArgs]
  }
  @scala.inline
  implicit class SpotFleetRequestArgsOps[Self <: SpotFleetRequestArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIamFleetRole(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamFleetRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunchSpecifications(value: Input[js.Array[Input[SpotFleetRequestLaunchSpecification]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetCapacity(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllocationStrategy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocationStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocationStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocationStrategy")(js.undefined)
        ret
    }
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
    def withInstanceInterruptionBehaviour(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceInterruptionBehaviour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceInterruptionBehaviour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceInterruptionBehaviour")(js.undefined)
        ret
    }
    @scala.inline
    def withInstancePoolsToUseCount(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancePoolsToUseCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstancePoolsToUseCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancePoolsToUseCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadBalancers(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancers")(js.undefined)
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
    def withSpotPrice(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGroupArns(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroupArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroupArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroupArns")(js.undefined)
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
    def withValidFrom(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withValidUntil(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validUntil")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForFulfillment(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForFulfillment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForFulfillment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForFulfillment")(js.undefined)
        ret
    }
  }
  
}

