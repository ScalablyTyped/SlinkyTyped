package typingsSlinky.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromoteResourceShareCreatedFromPolicyResponse extends js.Object {
  /**
    * Indicates whether the request succeeded.
    */
  var returnValue: js.UndefOr[Boolean] = js.native
}

object PromoteResourceShareCreatedFromPolicyResponse {
  @scala.inline
  def apply(): PromoteResourceShareCreatedFromPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromoteResourceShareCreatedFromPolicyResponse]
  }
  @scala.inline
  implicit class PromoteResourceShareCreatedFromPolicyResponseOps[Self <: PromoteResourceShareCreatedFromPolicyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReturnValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(js.undefined)
        ret
    }
  }
  
}

