package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUnsuspendUserRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The request containing the user IDs to unsuspend.
    */
  var UserIdList: typingsSlinky.awsSdk.chimeMod.UserIdList = js.native
}

object BatchUnsuspendUserRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, UserIdList: UserIdList): BatchUnsuspendUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserIdList = UserIdList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUnsuspendUserRequest]
  }
  @scala.inline
  implicit class BatchUnsuspendUserRequestOps[Self <: BatchUnsuspendUserRequest] (val x: Self) extends AnyVal {
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
    def withUserIdList(value: UserIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserIdList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

