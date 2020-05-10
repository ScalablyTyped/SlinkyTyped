package typingsSlinky.pulumiAws.lifecyclePolicyMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.dlm.LifecyclePolicyPolicyDetails
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the DLM Lifecycle Policy.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A description for the DLM lifecycle policy.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of an IAM role that is able to be assumed by the DLM service.
    */
  val executionRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * See the `policyDetails` configuration block. Max of 1.
    */
  val policyDetails: js.UndefOr[Input[LifecyclePolicyPolicyDetails]] = js.native
  /**
    * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object LifecyclePolicyState {
  @scala.inline
  def apply(): LifecyclePolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicyState]
  }
  @scala.inline
  implicit class LifecyclePolicyStateOps[Self <: LifecyclePolicyState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyDetails(value: Input[LifecyclePolicyPolicyDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

