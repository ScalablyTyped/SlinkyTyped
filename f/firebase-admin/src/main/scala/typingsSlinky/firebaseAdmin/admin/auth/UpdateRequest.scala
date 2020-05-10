package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the properties to update on the provided user.
  */
@js.native
trait UpdateRequest extends js.Object {
  /**
    * Whether or not the user is disabled: `true` for disabled;
    * `false` for enabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The user's display name.
    */
  var displayName: js.UndefOr[String | Null] = js.native
  /**
    * The user's primary email.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Whether or not the user's primary email is verified.
    */
  var emailVerified: js.UndefOr[Boolean] = js.native
  /**
    * The user's updated multi-factor related properties.
    */
  var multiFactor: js.UndefOr[MultiFactorUpdateSettings] = js.native
  /**
    * The user's unhashed password.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * The user's primary phone number.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.native
  /**
    * The user's photo URL.
    */
  var photoURL: js.UndefOr[String | Null] = js.native
}

object UpdateRequest {
  @scala.inline
  def apply(): UpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRequest]
  }
  @scala.inline
  implicit class UpdateRequestOps[Self <: UpdateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(null)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailVerified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailVerified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailVerified")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiFactor(value: MultiFactorUpdateSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumberNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(null)
        ret
    }
    @scala.inline
    def withPhotoURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotoURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoURL")(js.undefined)
        ret
    }
    @scala.inline
    def withPhotoURLNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoURL")(null)
        ret
    }
  }
  
}

