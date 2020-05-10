package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFlowDefinitionRequest extends js.Object {
  /**
    * The name of your flow definition.
    */
  var FlowDefinitionName: typingsSlinky.awsSdk.sagemakerMod.FlowDefinitionName = js.native
  /**
    * An object containing information about the events that trigger a human workflow.
    */
  var HumanLoopActivationConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.HumanLoopActivationConfig] = js.native
  /**
    * An object containing information about the tasks the human reviewers will perform.
    */
  var HumanLoopConfig: typingsSlinky.awsSdk.sagemakerMod.HumanLoopConfig = js.native
  /**
    * An object containing information about where the human review results will be uploaded.
    */
  var OutputConfig: FlowDefinitionOutputConfig = js.native
  /**
    * The Amazon Resource Name (ARN) of the role needed to call other services on your behalf. For example, arn:aws:iam::1234567890:role/service-role/AmazonSageMaker-ExecutionRole-20180111T151298.
    */
  var RoleArn: typingsSlinky.awsSdk.sagemakerMod.RoleArn = js.native
  /**
    * An array of key-value pairs that contain metadata to help you categorize and organize a flow definition. Each tag consists of a key and a value, both of which you define.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateFlowDefinitionRequest {
  @scala.inline
  def apply(
    FlowDefinitionName: FlowDefinitionName,
    HumanLoopConfig: HumanLoopConfig,
    OutputConfig: FlowDefinitionOutputConfig,
    RoleArn: RoleArn
  ): CreateFlowDefinitionRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any], HumanLoopConfig = HumanLoopConfig.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowDefinitionRequest]
  }
  @scala.inline
  implicit class CreateFlowDefinitionRequestOps[Self <: CreateFlowDefinitionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlowDefinitionName(value: FlowDefinitionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowDefinitionName")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

