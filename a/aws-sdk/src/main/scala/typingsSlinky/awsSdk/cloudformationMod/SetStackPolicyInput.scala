package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetStackPolicyInput extends js.Object {
  /**
    * The name or unique stack ID that you want to associate a policy with.
    */
  var StackName: typingsSlinky.awsSdk.cloudformationMod.StackName = js.native
  /**
    * Structure containing the stack policy body. For more information, go to  Prevent Updates to Stack Resources in the AWS CloudFormation User Guide. You can specify either the StackPolicyBody or the StackPolicyURL parameter, but not both.
    */
  var StackPolicyBody: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackPolicyBody] = js.native
  /**
    * Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB) located in an S3 bucket in the same region as the stack. You can specify either the StackPolicyBody or the StackPolicyURL parameter, but not both.
    */
  var StackPolicyURL: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackPolicyURL] = js.native
}

object SetStackPolicyInput {
  @scala.inline
  def apply(StackName: StackName): SetStackPolicyInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStackPolicyInput]
  }
  @scala.inline
  implicit class SetStackPolicyInputOps[Self <: SetStackPolicyInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackName(value: StackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackPolicyBody(value: StackPolicyBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackPolicyBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackPolicyBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackPolicyBody")(js.undefined)
        ret
    }
    @scala.inline
    def withStackPolicyURL(value: StackPolicyURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackPolicyURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackPolicyURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackPolicyURL")(js.undefined)
        ret
    }
  }
  
}

