package typingsSlinky.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdTokenResult extends js.Object {
  var authTime: String = js.native
  var claims: StringDictionary[js.Any] = js.native
  var expirationTime: String = js.native
  var issuedAtTime: String = js.native
  var signInProvider: String | Null = js.native
  var signInSecondFactor: String | Null = js.native
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

