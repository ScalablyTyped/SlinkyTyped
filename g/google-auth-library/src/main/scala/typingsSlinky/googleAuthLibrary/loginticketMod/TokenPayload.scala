package typingsSlinky.googleAuthLibrary.loginticketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenPayload extends js.Object {
  /**
    * Access token hash. Provides validation that the access token is tied to the
    * identity token. If the ID token is issued with an access token in the
    * server flow, this is always included. This can be used as an alternate
    * mechanism to protect against cross-site request forgery attacks, but if you
    * follow Step 1 and Step 3 it is not necessary to verify the access token.
    */
  var at_hash: js.UndefOr[String] = js.native
  /**
    * Identifies the audience that this ID token is intended for. It must be one
    * of the OAuth 2.0 client IDs of your application.
    */
  var aud: String = js.native
  /**
    * The client_id of the authorized presenter. This claim is only needed when
    * the party requesting the ID token is not the same as the audience of the ID
    * token. This may be the case at Google for hybrid apps where a web
    * application and Android app have a different client_id but share the same
    * project.
    */
  var azp: js.UndefOr[String] = js.native
  /**
    * The user's email address. This may not be unique and is not suitable for
    * use as a primary key. Provided only if your scope included the string
    * "email".
    */
  var email: js.UndefOr[String] = js.native
  /**
    * True if the user's e-mail address has been verified; otherwise false.
    */
  var email_verified: js.UndefOr[Boolean] = js.native
  /**
    * The time the ID token expires, represented in Unix time (integer seconds).
    */
  var exp: Double = js.native
  /**
    * The user's family name, in a displayable form. Might be provided when:
    * - The request scope included the string "profile"
    * - The ID token is returned from a token refresh
    * - When name claims are present, you can use them to update your app's user
    * records. Note that this claim is never guaranteed to be present.
    */
  var family_name: js.UndefOr[String] = js.native
  /**
    * The user's given name, in a displayable form. Might be provided when:
    * - The request scope included the string "profile"
    * - The ID token is returned from a token refresh
    * - When name claims are present, you can use them to update your app's user
    * records. Note that this claim is never guaranteed to be present.
    */
  var given_name: js.UndefOr[String] = js.native
  /**
    * The hosted G Suite domain of the user. Provided only if the user belongs to
    * a hosted domain.
    */
  var hd: js.UndefOr[String] = js.native
  /**
    * The time the ID token was issued, represented in Unix time (integer
    * seconds).
    */
  var iat: Double = js.native
  /**
    * The Issuer Identifier for the Issuer of the response. Always
    * https://accounts.google.com or accounts.google.com for Google ID tokens.
    */
  var iss: String = js.native
  /**
    * The user's full name, in a displayable form. Might be provided when:
    * - The request scope included the string "profile"
    * - The ID token is returned from a token refresh
    * - When name claims are present, you can use them to update your app's user
    * records. Note that this claim is never guaranteed to be present.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The value of the nonce supplied by your app in the authentication request.
    * You should enforce protection against replay attacks by ensuring it is
    * presented only once.
    */
  var nonce: js.UndefOr[String] = js.native
  /**
    * The URL of the user's profile picture. Might be provided when:
    * - The request scope included the string "profile"
    * - The ID token is returned from a token refresh
    * - When picture claims are present, you can use them to update your app's
    * user records. Note that this claim is never guaranteed to be present.
    */
  var picture: js.UndefOr[String] = js.native
  /**
    * The URL of the user's profile page. Might be provided when:
    * - The request scope included the string "profile"
    * - The ID token is returned from a token refresh
    * - When profile claims are present, you can use them to update your app's
    * user records. Note that this claim is never guaranteed to be present.
    */
  var profile: js.UndefOr[String] = js.native
  /**
    * An identifier for the user, unique among all Google accounts and never
    * reused. A Google account can have multiple emails at different points in
    * time, but the sub value is never changed. Use sub within your application
    * as the unique-identifier key for the user.
    */
  var sub: String = js.native
}

object TokenPayload {
  @scala.inline
  def apply(aud: String, exp: Double, iat: Double, iss: String, sub: String): TokenPayload = {
    val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenPayload]
  }
  @scala.inline
  implicit class TokenPayloadOps[Self <: TokenPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAud(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSub(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAt_hash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at_hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAt_hash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at_hash")(js.undefined)
        ret
    }
    @scala.inline
    def withAzp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azp")(js.undefined)
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
    def withEmail_verified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email_verified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail_verified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email_verified")(js.undefined)
        ret
    }
    @scala.inline
    def withFamily_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family_name")(js.undefined)
        ret
    }
    @scala.inline
    def withGiven_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("given_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGiven_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("given_name")(js.undefined)
        ret
    }
    @scala.inline
    def withHd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hd")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(js.undefined)
        ret
    }
    @scala.inline
    def withPicture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPicture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picture")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
  }
  
}

