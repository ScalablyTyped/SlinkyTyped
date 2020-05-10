package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepDetail extends js.Object {
  /**
    * The description of the step status.
    */
  var ExecutionStatusDetail: StepExecutionStatusDetail = js.native
  /**
    * The step configuration.
    */
  var StepConfig: typingsSlinky.awsSdk.emrMod.StepConfig = js.native
}

object StepDetail {
  @scala.inline
  def apply(ExecutionStatusDetail: StepExecutionStatusDetail, StepConfig: StepConfig): StepDetail = {
    val __obj = js.Dynamic.literal(ExecutionStatusDetail = ExecutionStatusDetail.asInstanceOf[js.Any], StepConfig = StepConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepDetail]
  }
  @scala.inline
  implicit class StepDetailOps[Self <: StepDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionStatusDetail(value: StepExecutionStatusDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionStatusDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepConfig(value: StepConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepConfig")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

