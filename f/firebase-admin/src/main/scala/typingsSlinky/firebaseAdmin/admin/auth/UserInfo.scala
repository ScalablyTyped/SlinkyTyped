package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a user's info from a third-party identity provider
  * such as Google or Facebook.
  */
@js.native
trait UserInfo extends js.Object {
  /**
    * The display name for the linked provider.
    */
  var displayName: String = js.native
  /**
    * The email for the linked provider.
    */
  var email: String = js.native
  /**
    * The phone number for the linked provider.
    */
  var phoneNumber: String = js.native
  /**
    * The photo URL for the linked provider.
    */
  var photoURL: String = js.native
  /**
    * The linked provider ID (for example, "google.com" for the Google provider).
    */
  var providerId: String = js.native
  /**
    * The user identifier for the linked provider.
    */
  var uid: String = js.native
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object = js.native
}

object UserInfo {
  @scala.inline
  def apply(
    displayName: String,
    email: String,
    phoneNumber: String,
    photoURL: String,
    providerId: String,
    toJSON: () => js.Object,
    uid: String
  ): UserInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], photoURL = photoURL.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
  @scala.inline
  implicit class UserInfoOps[Self <: UserInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotoURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

