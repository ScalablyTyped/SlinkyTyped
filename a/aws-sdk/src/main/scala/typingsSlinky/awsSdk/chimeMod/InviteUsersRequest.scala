package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteUsersRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The user email addresses to which to send the email invitation.
    */
  var UserEmailList: typingsSlinky.awsSdk.chimeMod.UserEmailList = js.native
  /**
    * The user type.
    */
  var UserType: js.UndefOr[typingsSlinky.awsSdk.chimeMod.UserType] = js.native
}

object InviteUsersRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, UserEmailList: UserEmailList): InviteUsersRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserEmailList = UserEmailList.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteUsersRequest]
  }
  @scala.inline
  implicit class InviteUsersRequestOps[Self <: InviteUsersRequest] (val x: Self) extends AnyVal {
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
    def withUserEmailList(value: UserEmailList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserEmailList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserType(value: UserType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserType")(js.undefined)
        ret
    }
  }
  
}

