package typingsSlinky.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHumanLoopResponse extends js.Object {
  /**
    * The creation time when Amazon Augmented AI created the human loop.
    */
  var CreationTime: js.Date = js.native
  /**
    * A failure code denoting a specific type of failure.
    */
  var FailureCode: js.UndefOr[String] = js.native
  /**
    * The reason why a human loop has failed. The failure reason is returned when the human loop status is Failed.
    */
  var FailureReason: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the flow definition.
    */
  var FlowDefinitionArn: typingsSlinky.awsSdk.augmentedairuntimeMod.FlowDefinitionArn = js.native
  /**
    * The Amazon Resource Name (ARN) of the human loop.
    */
  var HumanLoopArn: typingsSlinky.awsSdk.augmentedairuntimeMod.HumanLoopArn = js.native
  /**
    * The name of the human loop.
    */
  var HumanLoopName: typingsSlinky.awsSdk.augmentedairuntimeMod.HumanLoopName = js.native
  /**
    * An object containing information about the output of the human loop.
    */
  var HumanLoopOutput: js.UndefOr[typingsSlinky.awsSdk.augmentedairuntimeMod.HumanLoopOutput] = js.native
  /**
    * The status of the human loop. Valid values:
    */
  var HumanLoopStatus: typingsSlinky.awsSdk.augmentedairuntimeMod.HumanLoopStatus = js.native
}

object DescribeHumanLoopResponse {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    FlowDefinitionArn: FlowDefinitionArn,
    HumanLoopArn: HumanLoopArn,
    HumanLoopName: HumanLoopName,
    HumanLoopStatus: HumanLoopStatus
  ): DescribeHumanLoopResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], HumanLoopArn = HumanLoopArn.asInstanceOf[js.Any], HumanLoopName = HumanLoopName.asInstanceOf[js.Any], HumanLoopStatus = HumanLoopStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHumanLoopResponse]
  }
  @scala.inline
  implicit class DescribeHumanLoopResponseOps[Self <: DescribeHumanLoopResponse] (val x: Self) extends AnyVal {
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
    def withHumanLoopArn(value: HumanLoopArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHumanLoopName(value: HumanLoopName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHumanLoopStatus(value: HumanLoopStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureCode")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: String): Self = {
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
    def withHumanLoopOutput(value: HumanLoopOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHumanLoopOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopOutput")(js.undefined)
        ret
    }
  }
  
}

