package typingsSlinky.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLifecyclePolicyRequest extends js.Object {
  /**
    * A description of the lifecycle policy.
    */
  var Description: js.UndefOr[PolicyDescription] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
    */
  var ExecutionRoleArn: js.UndefOr[typingsSlinky.awsSdk.dlmMod.ExecutionRoleArn] = js.native
  /**
    * The configuration of the lifecycle policy. You cannot update the policy type or the resource type.
    */
  var PolicyDetails: js.UndefOr[typingsSlinky.awsSdk.dlmMod.PolicyDetails] = js.native
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: typingsSlinky.awsSdk.dlmMod.PolicyId = js.native
  /**
    * The desired activation state of the lifecycle policy after creation.
    */
  var State: js.UndefOr[SettablePolicyStateValues] = js.native
}

object UpdateLifecyclePolicyRequest {
  @scala.inline
  def apply(PolicyId: PolicyId): UpdateLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLifecyclePolicyRequest]
  }
  @scala.inline
  implicit class UpdateLifecyclePolicyRequestOps[Self <: UpdateLifecyclePolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyId(value: PolicyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: PolicyDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionRoleArn(value: ExecutionRoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyDetails(value: PolicyDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: SettablePolicyStateValues): Self = {
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
  }
  
}

