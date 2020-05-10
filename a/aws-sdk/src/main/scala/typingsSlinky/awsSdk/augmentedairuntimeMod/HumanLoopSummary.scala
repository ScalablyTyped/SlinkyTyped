package typingsSlinky.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopSummary extends js.Object {
  /**
    * When Amazon Augmented AI created the human loop.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The reason why the human loop failed. A failure reason is returned only when the status of the human loop is Failed.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.augmentedairuntimeMod.FailureReason] = js.native
  /**
    * The Amazon Resource Name (ARN) of the flow definition.
    */
  var FlowDefinitionArn: js.UndefOr[typingsSlinky.awsSdk.augmentedairuntimeMod.FlowDefinitionArn] = js.native
  /**
    * The name of the human loop.
    */
  var HumanLoopName: js.UndefOr[typingsSlinky.awsSdk.augmentedairuntimeMod.HumanLoopName] = js.native
  /**
    * The status of the human loop. Valid values:
    */
  var HumanLoopStatus: js.UndefOr[typingsSlinky.awsSdk.augmentedairuntimeMod.HumanLoopStatus] = js.native
}

object HumanLoopSummary {
  @scala.inline
  def apply(): HumanLoopSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HumanLoopSummary]
  }
  @scala.inline
  implicit class HumanLoopSummaryOps[Self <: HumanLoopSummary] (val x: Self) extends AnyVal {
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
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
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
    def withFlowDefinitionArn(value: FlowDefinitionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowDefinitionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowDefinitionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowDefinitionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withHumanLoopName(value: HumanLoopName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHumanLoopName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopName")(js.undefined)
        ret
    }
    @scala.inline
    def withHumanLoopStatus(value: HumanLoopStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHumanLoopStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopStatus")(js.undefined)
        ret
    }
  }
  
}

