package typingsSlinky.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicy extends js.Object {
  /**
    * The local date and time when the lifecycle policy was created.
    */
  var DateCreated: js.UndefOr[js.Date] = js.native
  /**
    * The local date and time when the lifecycle policy was last modified.
    */
  var DateModified: js.UndefOr[js.Date] = js.native
  /**
    * The description of the lifecycle policy.
    */
  var Description: js.UndefOr[PolicyDescription] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
    */
  var ExecutionRoleArn: js.UndefOr[typingsSlinky.awsSdk.dlmMod.ExecutionRoleArn] = js.native
  /**
    * The Amazon Resource Name (ARN) of the policy.
    */
  var PolicyArn: js.UndefOr[typingsSlinky.awsSdk.dlmMod.PolicyArn] = js.native
  /**
    * The configuration of the lifecycle policy
    */
  var PolicyDetails: js.UndefOr[typingsSlinky.awsSdk.dlmMod.PolicyDetails] = js.native
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: js.UndefOr[typingsSlinky.awsSdk.dlmMod.PolicyId] = js.native
  /**
    * The activation state of the lifecycle policy.
    */
  var State: js.UndefOr[GettablePolicyStateValues] = js.native
  /**
    * The description of the status.
    */
  var StatusMessage: js.UndefOr[typingsSlinky.awsSdk.dlmMod.StatusMessage] = js.native
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object LifecyclePolicy {
  @scala.inline
  def apply(): LifecyclePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicy]
  }
  @scala.inline
  implicit class LifecyclePolicyOps[Self <: LifecyclePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateCreated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withDateModified(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateModified")(js.undefined)
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
    def withPolicyArn(value: PolicyArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyArn")(js.undefined)
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
    def withPolicyId(value: PolicyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyId")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: GettablePolicyStateValues): Self = {
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
    def withStatusMessage(value: StatusMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
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

