package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResourcePolicyInput extends js.Object {
  /**
    *  The ARN of the resource that is associated with the resource policy. 
    */
  var resourceArn: NonEmptyString = js.native
}

object DeleteResourcePolicyInput {
  @scala.inline
  def apply(resourceArn: NonEmptyString): DeleteResourcePolicyInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourcePolicyInput]
  }
  @scala.inline
  implicit class DeleteResourcePolicyInputOps[Self <: DeleteResourcePolicyInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

