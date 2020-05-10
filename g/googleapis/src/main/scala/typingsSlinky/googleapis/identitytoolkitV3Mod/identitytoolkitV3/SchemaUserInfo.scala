package typingsSlinky.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typingsSlinky.googleapis.AnonPhoneNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template for an individual account info.
  */
@js.native
trait SchemaUserInfo extends js.Object {
  /**
    * User creation timestamp.
    */
  var createdAt: js.UndefOr[String] = js.native
  /**
    * The custom attributes to be set in the user&#39;s id token.
    */
  var customAttributes: js.UndefOr[String] = js.native
  /**
    * Whether the user is authenticated by the developer.
    */
  var customAuth: js.UndefOr[Boolean] = js.native
  /**
    * Whether the user is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of the user.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The email of the user.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Whether the email has been verified.
    */
  var emailVerified: js.UndefOr[Boolean] = js.native
  /**
    * last login timestamp.
    */
  var lastLoginAt: js.UndefOr[String] = js.native
  /**
    * The local ID of the user.
    */
  var localId: js.UndefOr[String] = js.native
  /**
    * The user&#39;s hashed password.
    */
  var passwordHash: js.UndefOr[String] = js.native
  /**
    * The timestamp when the password was last updated.
    */
  var passwordUpdatedAt: js.UndefOr[Double] = js.native
  /**
    * User&#39;s phone number.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  /**
    * The URL of the user profile photo.
    */
  var photoUrl: js.UndefOr[String] = js.native
  /**
    * The IDP of the user.
    */
  var providerUserInfo: js.UndefOr[js.Array[AnonPhoneNumber]] = js.native
  /**
    * The user&#39;s plain text password.
    */
  var rawPassword: js.UndefOr[String] = js.native
  /**
    * The user&#39;s password salt.
    */
  var salt: js.UndefOr[String] = js.native
  /**
    * User&#39;s screen name at Twitter or login name at Github.
    */
  var screenName: js.UndefOr[String] = js.native
  /**
    * Timestamp in seconds for valid login token.
    */
  var validSince: js.UndefOr[String] = js.native
  /**
    * Version of the user&#39;s password.
    */
  var version: js.UndefOr[Double] = js.native
}

object SchemaUserInfo {
  @scala.inline
  def apply(): SchemaUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserInfo]
  }
  @scala.inline
  implicit class SchemaUserInfoOps[Self <: SchemaUserInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAttributes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAuth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAuth")(js.undefined)
        ret
    }
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
    def withLastLoginAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastLoginAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastLoginAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastLoginAt")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localId")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordHash")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordUpdatedAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordUpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordUpdatedAt")(js.undefined)
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
    def withPhotoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderUserInfo(value: js.Array[AnonPhoneNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerUserInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderUserInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerUserInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withRawPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withSalt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenName")(js.undefined)
        ret
    }
    @scala.inline
    def withValidSince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validSince")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

