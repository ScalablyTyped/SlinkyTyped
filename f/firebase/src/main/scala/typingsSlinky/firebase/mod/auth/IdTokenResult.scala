package typingsSlinky.firebase.mod.auth

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing ID token result obtained from
  * {@link firebase.User.getIdTokenResult}. It contains the ID token JWT string
  * and other helper properties for getting different data associated with the
  * token as well as all the decoded payload claims.
  *
  * Note that these claims are not to be trusted as they are parsed client side.
  * Only server side verification can guarantee the integrity of the token
  * claims.
  */
@js.native
trait IdTokenResult extends js.Object {
  /**
    * The authentication time formatted as a UTC string. This is the time the
    * user authenticated (signed in) and not the time the token was refreshed.
    */
  var authTime: String = js.native
  /**
    * The entire payload claims of the ID token including the standard reserved
    * claims as well as the custom claims.
    */
  var claims: StringDictionary[js.Any] = js.native
  /**
    * The ID token expiration time formatted as a UTC string.
    */
  var expirationTime: String = js.native
  /**
    * The ID token issued at time formatted as a UTC string.
    */
  var issuedAtTime: String = js.native
  /**
    * The sign-in provider through which the ID token was obtained (anonymous,
    * custom, phone, password, etc). Note, this does not map to provider IDs.
    */
  var signInProvider: String | Null = js.native
  /**
    * The type of second factor associated with this session, provided the user
    * was multi-factor authenticated (eg. phone, etc).
    */
  var signInSecondFactor: String | Null = js.native
  /**
    * The Firebase Auth ID token JWT string.
    */
  var token: String = js.native
}

object IdTokenResult {
  @scala.inline
  def apply(
    authTime: String,
    claims: StringDictionary[js.Any],
    expirationTime: String,
    issuedAtTime: String,
    token: String
  ): IdTokenResult = {
    val __obj = js.Dynamic.literal(authTime = authTime.asInstanceOf[js.Any], claims = claims.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], issuedAtTime = issuedAtTime.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdTokenResult]
  }
  @scala.inline
  implicit class IdTokenResultOps[Self <: IdTokenResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClaims(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuedAtTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuedAtTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignInProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signInProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignInProviderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signInProvider")(null)
        ret
    }
    @scala.inline
    def withSignInSecondFactor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signInSecondFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignInSecondFactorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signInSecondFactor")(null)
        ret
    }
  }
  
}

