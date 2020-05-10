package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserProfileRequest extends js.Object {
  /**
    * The domain ID.
    */
  var DomainId: typingsSlinky.awsSdk.sagemakerMod.DomainId = js.native
  /**
    * The user profile name.
    */
  var UserProfileName: typingsSlinky.awsSdk.sagemakerMod.UserProfileName = js.native
  /**
    * A collection of settings.
    */
  var UserSettings: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.UserSettings] = js.native
}

object UpdateUserProfileRequest {
  @scala.inline
  def apply(DomainId: DomainId, UserProfileName: UserProfileName): UpdateUserProfileRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserProfileRequest]
  }
  @scala.inline
  implicit class UpdateUserProfileRequestOps[Self <: UpdateUserProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainId(value: DomainId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserProfileName(value: UserProfileName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserProfileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserSettings(value: UserSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserSettings")(js.undefined)
        ret
    }
  }
  
}

