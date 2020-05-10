package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupConfig extends js.Object {
  /**
    * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
    */
  var AutoScalingPolicy: js.UndefOr[typingsSlinky.awsSdk.emrMod.AutoScalingPolicy] = js.native
  /**
    * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD. If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%.
    */
  var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    *  Amazon EMR releases 4.x or later.  The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration for each instance group (master, core, and task).
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.native
  /**
    * EBS configurations that will be attached to each EC2 instance in the instance group.
    */
  var EbsConfiguration: js.UndefOr[typingsSlinky.awsSdk.emrMod.EbsConfiguration] = js.native
  /**
    * Target number of instances for the instance group.
    */
  var InstanceCount: Integer = js.native
  /**
    * The role of the instance group in the cluster.
    */
  var InstanceRole: InstanceRoleType = js.native
  /**
    * The EC2 instance type for all instances in the instance group.
    */
  var InstanceType: typingsSlinky.awsSdk.emrMod.InstanceType = js.native
  /**
    * Market type of the EC2 instances used to create a cluster node.
    */
  var Market: js.UndefOr[MarketType] = js.native
  /**
    * Friendly name given to the instance group.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.native
}

object InstanceGroupConfig {
  @scala.inline
  def apply(InstanceCount: Integer, InstanceRole: InstanceRoleType, InstanceType: InstanceType): InstanceGroupConfig = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], InstanceRole = InstanceRole.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupConfig]
  }
  @scala.inline
  implicit class InstanceGroupConfigOps[Self <: InstanceGroupConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceRole(value: InstanceRoleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoScalingPolicy(value: AutoScalingPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingPolicy")(js.undefined)
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
    def withMarket(value: MarketType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Market")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Market")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: XmlStringMaxLen256): Self = {
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
  }
  
}

