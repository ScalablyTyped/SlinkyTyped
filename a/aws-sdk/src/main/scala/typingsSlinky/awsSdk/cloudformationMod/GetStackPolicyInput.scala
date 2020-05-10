package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStackPolicyInput extends js.Object {
  /**
    * The name or unique stack ID that is associated with the stack whose policy you want to get.
    */
  var StackName: typingsSlinky.awsSdk.cloudformationMod.StackName = js.native
}

object GetStackPolicyInput {
  @scala.inline
  def apply(StackName: StackName): GetStackPolicyInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStackPolicyInput]
  }
  @scala.inline
  implicit class GetStackPolicyInputOps[Self <: GetStackPolicyInput] (val x: Self) extends AnyVal {
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
  }
  
}

