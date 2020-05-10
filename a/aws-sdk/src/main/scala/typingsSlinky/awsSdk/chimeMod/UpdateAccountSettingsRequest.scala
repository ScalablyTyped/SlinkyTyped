package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAccountSettingsRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The Amazon Chime account settings to update.
    */
  var AccountSettings: typingsSlinky.awsSdk.chimeMod.AccountSettings = js.native
}

object UpdateAccountSettingsRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, AccountSettings: AccountSettings): UpdateAccountSettingsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], AccountSettings = AccountSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccountSettingsRequest]
  }
  @scala.inline
  implicit class UpdateAccountSettingsRequestOps[Self <: UpdateAccountSettingsRequest] (val x: Self) extends AnyVal {
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
    def withAccountSettings(value: AccountSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountSettings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

