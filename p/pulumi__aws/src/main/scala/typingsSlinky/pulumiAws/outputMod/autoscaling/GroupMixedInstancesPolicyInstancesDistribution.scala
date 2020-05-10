package typingsSlinky.pulumiAws.outputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupMixedInstancesPolicyInstancesDistribution extends js.Object {
  /**
    * Strategy to use when launching on-demand instances. Valid values: `prioritized`. Default: `prioritized`.
    */
  var onDemandAllocationStrategy: js.UndefOr[String] = js.native
  /**
    * Absolute minimum amount of desired capacity that must be fulfilled by on-demand instances. Default: `0`.
    */
  var onDemandBaseCapacity: js.UndefOr[Double] = js.native
  /**
    * Percentage split between on-demand and Spot instances above the base on-demand capacity. Default: `100`.
    */
  var onDemandPercentageAboveBaseCapacity: js.UndefOr[Double] = js.native
  /**
    * How to allocate capacity across the Spot pools. Valid values: `lowest-price`, `capacity-optimized`. Default: `lowest-price`.
    */
  var spotAllocationStrategy: js.UndefOr[String] = js.native
  /**
    * Number of Spot pools per availability zone to allocate capacity. EC2 Auto Scaling selects the cheapest Spot pools and evenly allocates Spot capacity across the number of Spot pools that you specify. Default: `2`.
    */
  var spotInstancePools: Double = js.native
  /**
    * Maximum price per unit hour that the user is willing to pay for the Spot instances. Default: an empty string which means the on-demand price.
    */
  var spotMaxPrice: js.UndefOr[String] = js.native
}

object GroupMixedInstancesPolicyInstancesDistribution {
  @scala.inline
  def apply(spotInstancePools: Double): GroupMixedInstancesPolicyInstancesDistribution = {
    val __obj = js.Dynamic.literal(spotInstancePools = spotInstancePools.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMixedInstancesPolicyInstancesDistribution]
  }
  @scala.inline
  implicit class GroupMixedInstancesPolicyInstancesDistributionOps[Self <: GroupMixedInstancesPolicyInstancesDistribution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpotInstancePools(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotInstancePools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDemandAllocationStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDemandAllocationStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandAllocationStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDemandAllocationStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDemandBaseCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDemandBaseCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandBaseCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDemandBaseCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDemandPercentageAboveBaseCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDemandPercentageAboveBaseCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandPercentageAboveBaseCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDemandPercentageAboveBaseCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotAllocationStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotAllocationStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotAllocationStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotAllocationStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotMaxPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotMaxPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotMaxPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotMaxPrice")(js.undefined)
        ret
    }
  }
  
}

