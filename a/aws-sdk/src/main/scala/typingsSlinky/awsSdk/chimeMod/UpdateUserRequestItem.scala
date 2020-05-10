package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserRequestItem extends js.Object {
  /**
    * The Alexa for Business metadata.
    */
  var AlexaForBusinessMetadata: js.UndefOr[typingsSlinky.awsSdk.chimeMod.AlexaForBusinessMetadata] = js.native
  /**
    * The user license type.
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

object UpdateUserRequestItem {
  @scala.inline
  def apply(UserId: NonEmptyString): UpdateUserRequestItem = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequestItem]
  }
  @scala.inline
  implicit class UpdateUserRequestItemOps[Self <: UpdateUserRequestItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

