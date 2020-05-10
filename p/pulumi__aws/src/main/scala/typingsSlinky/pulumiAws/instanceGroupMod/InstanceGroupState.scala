package typingsSlinky.pulumiAws.instanceGroupMod

import typingsSlinky.pulumiAws.inputMod.emr.InstanceGroupEbsConfig
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupState extends js.Object {
  /**
    * The autoscaling policy document. This is a JSON formatted string. See [EMR Auto Scaling](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html)
    */
  val autoscalingPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * If set, the bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
    */
  val bidPrice: js.UndefOr[Input[String]] = js.native
  /**
    * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
    */
  val clusterId: js.UndefOr[Input[String]] = js.native
  /**
    * A JSON string for supplying list of configurations specific to the EMR instance group. Note that this can only be changed when using EMR release 5.21 or later.
    */
  val configurationsJson: js.UndefOr[Input[String]] = js.native
  /**
    * One or more `ebsConfig` blocks as defined below. Changing this forces a new resource to be created.
    */
  val ebsConfigs: js.UndefOr[Input[js.Array[Input[InstanceGroupEbsConfig]]]] = js.native
  /**
    * Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
    */
  val ebsOptimized: js.UndefOr[Input[Boolean]] = js.native
  /**
    * target number of instances for the instance group. defaults to 0.
    */
  val instanceCount: js.UndefOr[Input[Double]] = js.native
  /**
    * The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
    */
  val instanceType: js.UndefOr[Input[String]] = js.native
  /**
    * Human friendly name given to the instance group. Changing this forces a new resource to be created.
    */
  val name: js.UndefOr[Input[String]] = js.native
  val runningInstanceCount: js.UndefOr[Input[Double]] = js.native
  val status: js.UndefOr[Input[String]] = js.native
}

object InstanceGroupState {
  @scala.inline
  def apply(): InstanceGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupState]
  }
  @scala.inline
  implicit class InstanceGroupStateOps[Self <: InstanceGroupState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoscalingPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscalingPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withBidPrice(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBidPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationsJson(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationsJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationsJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationsJson")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsConfigs(value: Input[js.Array[Input[InstanceGroupEbsConfig]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsConfigs")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsOptimized(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsOptimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsOptimized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsOptimized")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceCount(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(js.undefined)
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
    def withRunningInstanceCount(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runningInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunningInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runningInstanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

