package typingsSlinky.googleAuthLibrary.oauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenInfo extends js.Object {
  /**
    * Indicates whether your application can refresh access tokens
    * when the user is not present at the browser. Valid parameter values are
    * 'online', which is the default value, and 'offline'. Set the value to
    * 'offline' if your application needs to refresh access tokens when the user
    * is not present at the browser. This value instructs the Google
    * authorization server to return a refresh token and an access token the
    * first time that your application exchanges an authorization code for
    * tokens.
    */
  var access_type: js.UndefOr[String] = js.native
  /**
    * The application that is the intended user of the access token.
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
    * The datetime when the token becomes invalid.
    */
  var expiry_date: Double = js.native
  /**
    * An array of scopes that the user granted access to.
    */
  var scopes: js.Array[String] = js.native
  /**
    * An identifier for the user, unique among all Google accounts and never
    * reused. A Google account can have multiple emails at different points in
    * time, but the sub value is never changed. Use sub within your application
    * as the unique-identifier key for the user.
    */
  var sub: js.UndefOr[String] = js.native
  /**
    * This value lets you correlate profile information from multiple Google
    * APIs. It is only present in the response if you included the profile scope
    * in your request in step 1. The field value is an immutable identifier for
    * the logged-in user that can be used to create and manage user sessions in
    * your application. The identifier is the same regardless of which client ID
    * is used to retrieve it. This enables multiple applications in the same
    * organization to correlate profile information.
    */
  var user_id: js.UndefOr[String] = js.native
}

object TokenInfo {
  @scala.inline
  def apply(aud: String, expiry_date: Double, scopes: js.Array[String]): TokenInfo = {
    val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], expiry_date = expiry_date.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenInfo]
  }
  @scala.inline
  implicit class TokenInfoOps[Self <: TokenInfo] (val x: Self) extends AnyVal {
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
    def withExpiry_date(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiry_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccess_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_type")(js.undefined)
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
    def withSub(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(js.undefined)
        ret
    }
  }
  
}

