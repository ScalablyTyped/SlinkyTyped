package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFlowDefinitionResponse extends js.Object {
  /**
    * The timestamp when the flow definition was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * 
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * The Amazon Resource Name (ARN) of the flow defintion.
    */
  var FlowDefinitionArn: typingsSlinky.awsSdk.sagemakerMod.FlowDefinitionArn = js.native
  /**
    * The Amazon Resource Name (ARN) of the flow definition.
    */
  var FlowDefinitionName: typingsSlinky.awsSdk.sagemakerMod.FlowDefinitionName = js.native
  /**
    * The status of the flow definition. Valid values are listed below.
    */
  var FlowDefinitionStatus: typingsSlinky.awsSdk.sagemakerMod.FlowDefinitionStatus = js.native
  /**
    * An object containing information about what triggers a human review workflow.
    */
  var HumanLoopActivationConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.HumanLoopActivationConfig] = js.native
  /**
    * An object containing information about who works on the task, the workforce task price, and other task details.
    */
  var HumanLoopConfig: typingsSlinky.awsSdk.sagemakerMod.HumanLoopConfig = js.native
  /**
    * An object containing information about the output file.
    */
  var OutputConfig: FlowDefinitionOutputConfig = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) execution role for the flow definition.
    */
  var RoleArn: typingsSlinky.awsSdk.sagemakerMod.RoleArn = js.native
}

object DescribeFlowDefinitionResponse {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    FlowDefinitionArn: FlowDefinitionArn,
    FlowDefinitionName: FlowDefinitionName,
    FlowDefinitionStatus: FlowDefinitionStatus,
    HumanLoopConfig: HumanLoopConfig,
    OutputConfig: FlowDefinitionOutputConfig,
    RoleArn: RoleArn
  ): DescribeFlowDefinitionResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any], FlowDefinitionStatus = FlowDefinitionStatus.asInstanceOf[js.Any], HumanLoopConfig = HumanLoopConfig.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFlowDefinitionResponse]
  }
  @scala.inline
  implicit class DescribeFlowDefinitionResponseOps[Self <: DescribeFlowDefinitionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlowDefinitionArn(value: FlowDefinitionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowDefinitionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlowDefinitionName(value: FlowDefinitionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowDefinitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlowDefinitionStatus(value: FlowDefinitionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowDefinitionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHumanLoopConfig(value: HumanLoopConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputConfig(value: FlowDefinitionOutputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureReason(value: FailureReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withHumanLoopActivationConfig(value: HumanLoopActivationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopActivationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHumanLoopActivationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopActivationConfig")(js.undefined)
        ret
    }
  }
  
}

