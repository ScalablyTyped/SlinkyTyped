package typingsSlinky.firebaseAdmin.admin.auth

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a user to import to Firebase Auth via the
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#importUsers `importUsers()`} method.
  */
@js.native
trait UserImportRecord extends js.Object {
  /**
    * The user's custom claims object if available, typically used to define
    * user roles and propagated to an authenticated user's ID token.
    */
  var customClaims: js.UndefOr[js.Object] = js.native
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
    * The multi-factor related properties for the imported user if available.
    */
  var multiFactor: js.UndefOr[MultiFactorSettings] = js.native
  /**
    * The buffer of bytes representing the user's hashed password.
    * When a user is to be imported with a password hash,
    * {@link admin.auth.UserImportOptions `UserImportOptions`} are required to be
    * specified to identify the hashing algorithm used to generate this hash.
    */
  var passwordHash: js.UndefOr[Buffer] = js.native
  /**
    * The buffer of bytes representing the user's password salt.
    */
  var passwordSalt: js.UndefOr[Buffer] = js.native
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
  var providerData: js.UndefOr[js.Array[UserInfo]] = js.native
  /**
    * The identifier of the tenant where user is to be imported to.
    * When not provided in an `admin.auth.Auth` context, the user is uploaded to
    * the default parent project.
    * When not provided in an `admin.auth.TenantAwareAuth` context, the user is uploaded
    * to the tenant corresponding to that `TenantAwareAuth` instance's tenant ID.
    */
  var tenantId: js.UndefOr[String | Null] = js.native
  /**
    * The user's `uid`.
    */
  var uid: String = js.native
}

object UserImportRecord {
  @scala.inline
  def apply(disabled: Boolean, emailVerified: Boolean, metadata: UserMetadata, uid: String): UserImportRecord = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], emailVerified = emailVerified.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserImportRecord]
  }
  @scala.inline
  implicit class UserImportRecordOps[Self <: UserImportRecord] (val x: Self) extends AnyVal {
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
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomClaims(value: js.Object): Self = {
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
    def withPasswordHash(value: Buffer): Self = {
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
    def withPasswordSalt(value: Buffer): Self = {
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
    def withProviderData(value: js.Array[UserInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerData")(js.undefined)
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
  }
  
}

