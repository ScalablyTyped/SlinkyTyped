package typingsSlinky.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateMemberAccountRequest extends js.Object {
  /**
    * The ID of the member account that you want to remove from Amazon Macie.
    */
  var memberAccountId: AWSAccountId = js.native
}

object DisassociateMemberAccountRequest {
  @scala.inline
  def apply(memberAccountId: AWSAccountId): DisassociateMemberAccountRequest = {
    val __obj = js.Dynamic.literal(memberAccountId = memberAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMemberAccountRequest]
  }
  @scala.inline
  implicit class DisassociateMemberAccountRequestOps[Self <: DisassociateMemberAccountRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMemberAccountId(value: AWSAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberAccountId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

