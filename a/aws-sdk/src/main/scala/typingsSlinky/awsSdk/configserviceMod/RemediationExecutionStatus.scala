package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemediationExecutionStatus extends js.Object {
  /**
    * Start time when the remediation was executed.
    */
  var InvocationTime: js.UndefOr[js.Date] = js.native
  /**
    * The time when the remediation execution was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.native
  var ResourceKey: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ResourceKey] = js.native
  /**
    * ENUM of the values.
    */
  var State: js.UndefOr[RemediationExecutionState] = js.native
  /**
    * Details of every step.
    */
  var StepDetails: js.UndefOr[RemediationExecutionSteps] = js.native
}

object RemediationExecutionStatus {
  @scala.inline
  def apply(): RemediationExecutionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemediationExecutionStatus]
  }
  @scala.inline
  implicit class RemediationExecutionStatusOps[Self <: RemediationExecutionStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvocationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvocationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvocationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvocationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceKey(value: ResourceKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceKey")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: RemediationExecutionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStepDetails(value: RemediationExecutionSteps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepDetails")(js.undefined)
        ret
    }
  }
  
}

