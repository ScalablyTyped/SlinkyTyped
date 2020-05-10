package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceTypeSpecification extends js.Object {
  /**
    * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD.
    */
  var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by InstanceType. Expressed as a number (for example, 20 specifies 20%).
    */
  var BidPriceAsPercentageOfOnDemandPrice: js.UndefOr[NonNegativeDouble] = js.native
  /**
    * A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software bundled with Amazon EMR.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.native
  /**
    * The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by InstanceType.
    */
  var EbsBlockDevices: js.UndefOr[EbsBlockDeviceList] = js.native
  /**
    * Evaluates to TRUE when the specified InstanceType is EBS-optimized.
    */
  var EbsOptimized: js.UndefOr[BooleanObject] = js.native
  /**
    * The EC2 instance type, for example m3.xlarge.
    */
  var InstanceType: js.UndefOr[typingsSlinky.awsSdk.emrMod.InstanceType] = js.native
  /**
    * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in InstanceFleetConfig. Capacity values represent performance characteristics such as vCPUs, memory, or I/O. If not specified, the default value is 1.
    */
  var WeightedCapacity: js.UndefOr[WholeNumber] = js.native
}

object InstanceTypeSpecification {
  @scala.inline
  def apply(): InstanceTypeSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTypeSpecification]
  }
  @scala.inline
  implicit class InstanceTypeSpecificationOps[Self <: InstanceTypeSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBidPrice(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BidPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBidPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BidPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withBidPriceAsPercentageOfOnDemandPrice(value: NonNegativeDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BidPriceAsPercentageOfOnDemandPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBidPriceAsPercentageOfOnDemandPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BidPriceAsPercentageOfOnDemandPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurations(value: ConfigurationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configurations")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsBlockDevices(value: EbsBlockDeviceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsBlockDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsBlockDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsBlockDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsOptimized(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsOptimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsOptimized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsOptimized")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightedCapacity(value: WholeNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WeightedCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightedCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WeightedCapacity")(js.undefined)
        ret
    }
  }
  
}

