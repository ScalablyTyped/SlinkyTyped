package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The Alexa for Business metadata.
    */
  var AlexaForBusinessMetadata: js.UndefOr[typingsSlinky.awsSdk.chimeMod.AlexaForBusinessMetadata] = js.native
  /**
    * The user license type to update. This must be a supported license type for the Amazon Chime account that the user belongs to.
    */
  var LicenseType: js.UndefOr[License] = js.native
  /**
    * The user ID.
    */
  var UserId: NonEmptyString = js.native
  /**
    * The user type.
    */
  var UserType: js.UndefOr[typingsSlinky.awsSdk.chimeMod.UserType] = js.native
}

object UpdateUserRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, UserId: NonEmptyString): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
  @scala.inline
  implicit class UpdateUserRequestOps[Self <: UpdateUserRequest] (val x: Self) extends AnyVal {
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
    def withUserId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlexaForBusinessMetadata(value: AlexaForBusinessMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlexaForBusinessMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlexaForBusinessMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlexaForBusinessMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseType(value: License): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseType")(js.undefined)
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

