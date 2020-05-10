package typingsSlinky.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typingsSlinky.googleapis.AnonFederatedId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Respone of setting the account information.
  */
@js.native
trait SchemaSetAccountInfoResponse extends js.Object {
  /**
    * The name of the user.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The email of the user.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * If email has been verified.
    */
  var emailVerified: js.UndefOr[Boolean] = js.native
  /**
    * If idToken is STS id token, then this field will be expiration time of
    * STS id token in seconds.
    */
  var expiresIn: js.UndefOr[String] = js.native
  /**
    * The Gitkit id token to login the newly sign up user.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * The fixed string &quot;identitytoolkit#SetAccountInfoResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The local ID of the user.
    */
  var localId: js.UndefOr[String] = js.native
  /**
    * The new email the user attempts to change to.
    */
  var newEmail: js.UndefOr[String] = js.native
  /**
    * The user&#39;s hashed password.
    */
  var passwordHash: js.UndefOr[String] = js.native
  /**
    * The photo url of the user.
    */
  var photoUrl: js.UndefOr[String] = js.native
  /**
    * The user&#39;s profiles at the associated IdPs.
    */
  var providerUserInfo: js.UndefOr[js.Array[AnonFederatedId]] = js.native
  /**
    * If idToken is STS id token, then this field will be refresh token.
    */
  var refreshToken: js.UndefOr[String] = js.native
}

object SchemaSetAccountInfoResponse {
  @scala.inline
  def apply(): SchemaSetAccountInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetAccountInfoResponse]
  }
  @scala.inline
  implicit class SchemaSetAccountInfoResponseOps[Self <: SchemaSetAccountInfoResponse] (val x: Self) extends AnyVal {
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
    def withExpiresIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiresIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(js.undefined)
        ret
    }
    @scala.inline
    def withIdToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    def withNewEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEmail")(js.undefined)
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
    def withProviderUserInfo(value: js.Array[AnonFederatedId]): Self = {
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
    def withRefreshToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshToken")(js.undefined)
        ret
    }
  }
  
}

