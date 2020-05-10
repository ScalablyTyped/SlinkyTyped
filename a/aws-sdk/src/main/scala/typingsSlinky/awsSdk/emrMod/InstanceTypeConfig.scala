package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceTypeConfig extends js.Object {
  /**
    * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD. If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%. 
    */
  var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by InstanceType. Expressed as a number (for example, 20 specifies 20%). If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%.
    */
  var BidPriceAsPercentageOfOnDemandPrice: js.UndefOr[NonNegativeDouble] = js.native
  /**
    * A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.native
  /**
    * The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by InstanceType. 
    */
  var EbsConfiguration: js.UndefOr[typingsSlinky.awsSdk.emrMod.EbsConfiguration] = js.native
  /**
    * An EC2 instance type, such as m3.xlarge. 
    */
  var InstanceType: typingsSlinky.awsSdk.emrMod.InstanceType = js.native
  /**
    * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in InstanceFleetConfig. This value is 1 for a master instance fleet, and must be 1 or greater for core and task instance fleets. Defaults to 1 if not specified. 
    */
  var WeightedCapacity: js.UndefOr[WholeNumber] = js.native
}

object InstanceTypeConfig {
  @scala.inline
  def apply(InstanceType: InstanceType): InstanceTypeConfig = {
    val __obj = js.Dynamic.literal(InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceTypeConfig]
  }
  @scala.inline
  implicit class InstanceTypeConfigOps[Self <: InstanceTypeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withEbsConfiguration(value: EbsConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsConfiguration")(js.undefined)
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

