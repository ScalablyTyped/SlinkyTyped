package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateSigninDelegateGroupsWithAccountRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The sign-in delegate groups.
    */
  var SigninDelegateGroups: SigninDelegateGroupList = js.native
}

object AssociateSigninDelegateGroupsWithAccountRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, SigninDelegateGroups: SigninDelegateGroupList): AssociateSigninDelegateGroupsWithAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], SigninDelegateGroups = SigninDelegateGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateSigninDelegateGroupsWithAccountRequest]
  }
  @scala.inline
  implicit class AssociateSigninDelegateGroupsWithAccountRequestOps[Self <: AssociateSigninDelegateGroupsWithAccountRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigninDelegateGroups(value: SigninDelegateGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigninDelegateGroups")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

