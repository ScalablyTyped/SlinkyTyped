package typingsSlinky.pulumiAws.flowLogMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowLogState extends js.Object {
  /**
    * Elastic Network Interface ID to attach to
    */
  val eniId: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN for the IAM role that's used to post flow logs to a CloudWatch Logs log group
    */
  val iamRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the logging destination.
    */
  val logDestination: js.UndefOr[Input[String]] = js.native
  /**
    * The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
    */
  val logDestinationType: js.UndefOr[Input[String]] = js.native
  /**
    * The fields to include in the flow log record, in the order in which they should appear.
    */
  val logFormat: js.UndefOr[Input[String]] = js.native
  /**
    * *Deprecated:* Use `logDestination` instead. The name of the CloudWatch log group.
    *
    * @deprecated use 'log_destination' argument instead
    */
  val logGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * Subnet ID to attach to
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
  /**
    * The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
    */
  val trafficType: js.UndefOr[Input[String]] = js.native
  /**
    * VPC ID to attach to
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object FlowLogState {
  @scala.inline
  def apply(): FlowLogState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowLogState]
  }
  @scala.inline
  implicit class FlowLogStateOps[Self <: FlowLogState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEniId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eniId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEniId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eniId")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLogDestination(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logDestination")(js.undefined)
        ret
    }
    @scala.inline
    def withLogDestinationType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logDestinationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogDestinationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logDestinationType")(js.undefined)
        ret
    }
    @scala.inline
    def withLogFormat(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLogGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(js.undefined)
        ret
    }
    @scala.inline
    def withTrafficType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficType")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(js.undefined)
        ret
    }
  }
  
}

