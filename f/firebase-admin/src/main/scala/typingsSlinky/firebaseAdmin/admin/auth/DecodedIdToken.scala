package typingsSlinky.firebaseAdmin.admin.auth

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebaseAdmin.AnonDictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a decoded Firebase ID token, returned from the
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#verifyIdToken `verifyIdToken()`} method.
  *
  * Firebase ID tokens are OpenID Connect spec-compliant JSON Web Tokens (JWTs).
  * See the
  * [ID Token section of the OpenID Connect spec](http://openid.net/specs/openid-connect-core-1_0.html#IDToken)
  * for more information about the specific properties below.
  */
@js.native
trait DecodedIdToken
  extends /* key */ StringDictionary[js.Any] {
  /**
    * The audience for which this token is intended.
    *
    * This value is a string equal to your Firebase project ID, the unique
    * identifier for your Firebase project, which can be found in [your project's
    * settings](https://console.firebase.google.com/project/_/settings/general/android:com.random.android).
    */
  var aud: String = js.native
  /**
    * Time, in seconds since the Unix epoch, when the end-user authentication
    * occurred.
    *
    * This value is not set when this particular ID token was created, but when the
    * user initially logged in to this session. In a single session, the Firebase
    * SDKs will refresh a user's ID tokens every hour. Each ID token will have a
    * different [`iat`](#iat) value, but the same `auth_time` value.
    */
  var auth_time: Double = js.native
  /**
    * The ID token's expiration time, in seconds since the Unix epoch. That is, the
    * time at which this ID token expires and should no longer be considered valid.
    *
    * The Firebase SDKs transparently refresh ID tokens every hour, issuing a new
    * ID token with up to a one hour expiration.
    */
  var exp: Double = js.native
  /**
    * Information about the sign in event, including which sign in provider was
    * used and provider-specific identity details.
    *
    * This data is provided by the Firebase Authentication service and is a
    * reserved claim in the ID token.
    */
  var firebase: AnonDictkey = js.native
  /**
    * The ID token's issued-at time, in seconds since the Unix epoch. That is, the
    * time at which this ID token was issued and should start to be considered
    * valid.
    *
    * The Firebase SDKs transparently refresh ID tokens every hour, issuing a new
    * ID token with a new issued-at time. If you want to get the time at which the
    * user session corresponding to the ID token initially occurred, see the
    * [`auth_time`](#auth_time) property.
    */
  var iat: Double = js.native
  /**
    * The issuer identifier for the issuer of the response.
    *
    * This value is a URL with the format
    * `https://securetoken.google.com/<PROJECT_ID>`, where `<PROJECT_ID>` is the
    * same project ID specified in the [`aud`](#aud) property.
    */
  var iss: String = js.native
  /**
    * The `uid` corresponding to the user who the ID token belonged to.
    *
    * As a convenience, this value is copied over to the [`uid`](#uid) property.
    */
  var sub: String = js.native
  /**
    * The `uid` corresponding to the user who the ID token belonged to.
    *
    * This value is not actually in the JWT token claims itself. It is added as a
    * convenience, and is set as the value of the [`sub`](#sub) property.
    */
  var uid: String = js.native
}

object DecodedIdToken {
  @scala.inline
  def apply(
    aud: String,
    auth_time: Double,
    exp: Double,
    firebase: AnonDictkey,
    iat: Double,
    iss: String,
    sub: String,
    uid: String
  ): DecodedIdToken = {
    val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], auth_time = auth_time.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], firebase = firebase.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodedIdToken]
  }
  @scala.inline
  implicit class DecodedIdTokenOps[Self <: DecodedIdToken] (val x: Self) extends AnyVal {
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
    def withAuth_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirebase(value: AnonDictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firebase")(value.asInstanceOf[js.Any])
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
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

