package typingsSlinky.pulumiAws.logResourcePolicyMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogResourcePolicyState extends js.Object {
  /**
    * Details of the resource policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. Maximum length of 5120 characters.
    */
  val policyDocument: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the resource policy.
    */
  val policyName: js.UndefOr[Input[String]] = js.native
}

object LogResourcePolicyState {
  @scala.inline
  def apply(): LogResourcePolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogResourcePolicyState]
  }
  @scala.inline
  implicit class LogResourcePolicyStateOps[Self <: LogResourcePolicyState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyDocument(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyName")(js.undefined)
        ret
    }
  }
  
}

