package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAccountFromOrganizationRequest extends js.Object {
  /**
    * The unique identifier (ID) of the member account that you want to remove from the organization. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var AccountId: typingsSlinky.awsSdk.organizationsMod.AccountId = js.native
}

object RemoveAccountFromOrganizationRequest {
  @scala.inline
  def apply(AccountId: AccountId): RemoveAccountFromOrganizationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAccountFromOrganizationRequest]
  }
  @scala.inline
  implicit class RemoveAccountFromOrganizationRequestOps[Self <: RemoveAccountFromOrganizationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

