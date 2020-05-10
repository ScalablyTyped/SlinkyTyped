package typingsSlinky.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromoteResourceShareCreatedFromPolicyRequest extends js.Object {
  /**
    * The ARN of the resource share to promote.
    */
  var resourceShareArn: String = js.native
}

object PromoteResourceShareCreatedFromPolicyRequest {
  @scala.inline
  def apply(resourceShareArn: String): PromoteResourceShareCreatedFromPolicyRequest = {
    val __obj = js.Dynamic.literal(resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromoteResourceShareCreatedFromPolicyRequest]
  }
  @scala.inline
  implicit class PromoteResourceShareCreatedFromPolicyRequestOps[Self <: PromoteResourceShareCreatedFromPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceShareArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

