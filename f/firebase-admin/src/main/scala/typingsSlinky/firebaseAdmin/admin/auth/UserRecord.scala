package typingsSlinky.firebaseAdmin.admin.auth

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a user.
  */
@js.native
trait UserRecord extends js.Object {
  /**
    * The user's custom claims object if available, typically used to define
    * user roles and propagated to an authenticated user's ID token.
    * This is set via
    * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#setCustomUserClaims `setCustomUserClaims()`}
    */
  var customClaims: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Whether or not the user is disabled: `true` for disabled; `false` for
    * enabled.
    */
  var disabled: Boolean = js.native
  /**
    * The user's display name.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The user's primary email, if set.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Whether or not the user's primary email is verified.
    */
  var emailVerified: Boolean = js.native
  /**
    * Additional metadata about the user.
    */
  var metadata: UserMetadata = js.native
  /**
    * The multi-factor related properties for the current user, if available.
    */
  var multiFactor: js.UndefOr[MultiFactorSettings] = js.native
  /**
    * The user's hashed password (base64-encoded), only if Firebase Auth hashing
    * algorithm (SCRYPT) is used. If a different hashing algorithm had been used
    * when uploading this user, as is typical when migrating from another Auth
    * system, this will be an empty string. If no password is set, this is
    * null. This is only available when the user is obtained from
    * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#listUsers `listUsers()`}.
    *
    */
  var passwordHash: js.UndefOr[String] = js.native
  /**
    * The user's password salt (base64-encoded), only if Firebase Auth hashing
    * algorithm (SCRYPT) is used. If a different hashing algorithm had been used to
    * upload this user, typical when migrating from another Auth system, this will
    * be an empty string. If no password is set, this is null. This is only
    * available when the user is obtained from
    * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#listUsers `listUsers()`}.
    *
    */
  var passwordSalt: js.UndefOr[String] = js.native
  /**
    * The user's primary phone number, if set.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  /**
    * The user's photo URL.
    */
  var photoURL: js.UndefOr[String] = js.native
  /**
    * An array of providers (for example, Google, Facebook) linked to the user.
    */
  var providerData: js.Array[UserInfo] = js.native
  /**
    * The ID of the tenant the user belongs to, if available.
    */
  var tenantId: js.UndefOr[String | Null] = js.native
  /**
    * The date the user's tokens are valid after, formatted as a UTC string.
    * This is updated every time the user's refresh token are revoked either
    * from the {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#revokeRefreshTokens `revokeRefreshTokens()`}
    * API or from the Firebase Auth backend on big account changes (password
    * resets, password or email updates, etc).
    */
  var tokensValidAfterTime: js.UndefOr[String] = js.native
  /**
    * The user's `uid`.
    */
  var uid: String = js.native
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object = js.native
}

object UserRecord {
  @scala.inline
  def apply(
    disabled: Boolean,
    emailVerified: Boolean,
    metadata: UserMetadata,
    providerData: js.Array[UserInfo],
    toJSON: () => js.Object,
    uid: String
  ): UserRecord = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], emailVerified = emailVerified.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], providerData = providerData.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRecord]
  }
  @scala.inline
  implicit class UserRecordOps[Self <: UserRecord] (val x: Self) extends AnyVal {
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
    def withEmailVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailVerified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: UserMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderData(value: js.Array[UserInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerData")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withCustomClaims(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClaims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomClaims: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClaims")(js.undefined)
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
    def withMultiFactor(value: MultiFactorSettings): Self = {
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
    def withPasswordSalt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordSalt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordSalt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordSalt")(js.undefined)
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
    def withTenantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantId")(js.undefined)
        ret
    }
    @scala.inline
    def withTenantIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantId")(null)
        ret
    }
    @scala.inline
    def withTokensValidAfterTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokensValidAfterTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokensValidAfterTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokensValidAfterTime")(js.undefined)
        ret
    }
  }
  
}

