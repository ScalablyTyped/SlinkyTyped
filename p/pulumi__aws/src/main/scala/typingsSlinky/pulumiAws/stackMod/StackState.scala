package typingsSlinky.pulumiAws.stackMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackState extends js.Object {
  /**
    * A list of capabilities.
    * Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, or `CAPABILITY_AUTO_EXPAND`
    */
  val capabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Set to true to disable rollback of the stack if stack creation failed.
    * Conflicts with `onFailure`.
    */
  val disableRollback: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ARN of an IAM role that AWS CloudFormation assumes to create the stack. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
    */
  val iamRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * Stack name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of SNS topic ARNs to publish stack related events.
    */
  val notificationArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Action to be taken if stack creation fails. This must be
    * one of: `DO_NOTHING`, `ROLLBACK`, or `DELETE`. Conflicts with `disableRollback`.
    */
  val onFailure: js.UndefOr[Input[String]] = js.native
  /**
    * A map of outputs from the stack.
    */
  val outputs: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * A map of Parameter structures that specify input parameters for the stack.
    */
  val parameters: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Structure containing the stack policy body.
    * Conflicts w/ `policyUrl`.
    */
  val policyBody: js.UndefOr[Input[String]] = js.native
  /**
    * Location of a file containing the stack policy.
    * Conflicts w/ `policyBody`.
    */
  val policyUrl: js.UndefOr[Input[String]] = js.native
  /**
    * A list of tags to associate with this stack.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Structure containing the template body (max size: 51,200 bytes).
    */
  val templateBody: js.UndefOr[Input[String]] = js.native
  /**
    * Location of a file containing the template body (max size: 460,800 bytes).
    */
  val templateUrl: js.UndefOr[Input[String]] = js.native
  /**
    * The amount of time that can pass before the stack status becomes `CREATE_FAILED`.
    */
  val timeoutInMinutes: js.UndefOr[Input[Double]] = js.native
}

object StackState {
  @scala.inline
  def apply(): StackState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackState]
  }
  @scala.inline
  implicit class StackStateOps[Self <: StackState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapabilities(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableRollback(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRollback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableRollback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRollback")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationArns(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationArns")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFailure(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputs(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyBody(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyBody")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyUrl(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyUrl")(js.undefined)
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
    @scala.inline
    def withTemplateBody(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateBody")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateUrl(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutInMinutes(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInMinutes")(js.undefined)
        ret
    }
  }
  
}

