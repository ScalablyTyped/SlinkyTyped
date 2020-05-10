package typingsSlinky.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLifecyclePolicyRequest extends js.Object {
  /**
    * A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
    */
  var Description: PolicyDescription = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
    */
  var ExecutionRoleArn: typingsSlinky.awsSdk.dlmMod.ExecutionRoleArn = js.native
  /**
    * The configuration details of the lifecycle policy.
    */
  var PolicyDetails: typingsSlinky.awsSdk.dlmMod.PolicyDetails = js.native
  /**
    * The desired activation state of the lifecycle policy after creation.
    */
  var State: SettablePolicyStateValues = js.native
  /**
    * The tags to apply to the lifecycle policy during creation.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object CreateLifecyclePolicyRequest {
  @scala.inline
  def apply(
    Description: PolicyDescription,
    ExecutionRoleArn: ExecutionRoleArn,
    PolicyDetails: PolicyDetails,
    State: SettablePolicyStateValues
  ): CreateLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], PolicyDetails = PolicyDetails.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLifecyclePolicyRequest]
  }
  @scala.inline
  implicit class CreateLifecyclePolicyRequestOps[Self <: CreateLifecyclePolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: PolicyDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionRoleArn(value: ExecutionRoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyDetails(value: PolicyDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: SettablePolicyStateValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: TagMap): Self = {
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

