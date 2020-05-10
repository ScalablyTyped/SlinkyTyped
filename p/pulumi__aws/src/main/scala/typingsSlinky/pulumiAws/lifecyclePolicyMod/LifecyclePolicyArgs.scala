package typingsSlinky.pulumiAws.lifecyclePolicyMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.dlm.LifecyclePolicyPolicyDetails
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyArgs extends js.Object {
  /**
    * A description for the DLM lifecycle policy.
    */
  val description: Input[String] = js.native
  /**
    * The ARN of an IAM role that is able to be assumed by the DLM service.
    */
  val executionRoleArn: Input[String] = js.native
  /**
    * See the `policyDetails` configuration block. Max of 1.
    */
  val policyDetails: Input[LifecyclePolicyPolicyDetails] = js.native
  /**
    * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object LifecyclePolicyArgs {
  @scala.inline
  def apply(
    description: Input[String],
    executionRoleArn: Input[String],
    policyDetails: Input[LifecyclePolicyPolicyDetails]
  ): LifecyclePolicyArgs = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], executionRoleArn = executionRoleArn.asInstanceOf[js.Any], policyDetails = policyDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyArgs]
  }
  @scala.inline
  implicit class LifecyclePolicyArgsOps[Self <: LifecyclePolicyArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicyDetails(value: Input[LifecyclePolicyPolicyDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyDetails")(value.asInstanceOf[js.Any])
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

