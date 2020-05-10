package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowDefinitionSummary extends js.Object {
  /**
    * The timestamp when SageMaker created the flow definition.
    */
  var CreationTime: js.Date = js.native
  /**
    * The reason why the flow definition creation failed. A failure reason is returned only when the flow definition status is Failed.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * The Amazon Resource Name (ARN) of the flow definition.
    */
  var FlowDefinitionArn: typingsSlinky.awsSdk.sagemakerMod.FlowDefinitionArn = js.native
  /**
    * The name of the flow definition.
    */
  var FlowDefinitionName: typingsSlinky.awsSdk.sagemakerMod.FlowDefinitionName = js.native
  /**
    * The status of the flow definition. Valid values:
    */
  var FlowDefinitionStatus: typingsSlinky.awsSdk.sagemakerMod.FlowDefinitionStatus = js.native
}

object FlowDefinitionSummary {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    FlowDefinitionArn: FlowDefinitionArn,
    FlowDefinitionName: FlowDefinitionName,
    FlowDefinitionStatus: FlowDefinitionStatus
  ): FlowDefinitionSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any], FlowDefinitionStatus = FlowDefinitionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDefinitionSummary]
  }
  @scala.inline
  implicit class FlowDefinitionSummaryOps[Self <: FlowDefinitionSummary] (val x: Self) extends AnyVal {
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
  }
  
}

