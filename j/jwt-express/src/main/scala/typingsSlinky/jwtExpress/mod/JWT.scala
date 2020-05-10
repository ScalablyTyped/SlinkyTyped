package typingsSlinky.jwtExpress.mod

import typingsSlinky.express.mod.Response_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWT extends js.Object {
  /**
    * Indicates if the JWT is expired. valid will always be false if this is true.
    */
  var expired: Boolean = js.native
  /**
    * The jwt-express options.
    */
  var options: JWTExpressOptions = js.native
  /**
    * The payload of the JWT (must be an object). jwt-express will add a stales key-value pair to the payload for stale.
    */
  var payload: js.Any = js.native
  /**
    * The secret used to sign /verify the JWT.
    */
  var secret: String = js.native
  /**
    * Indicates if the JWT is stale. The default timeout before a JWT is considered stale is 15 minutes.
    */
  var stale: Boolean = js.native
  /**
    * The signed token of the JWT.
    */
  var token: String = js.native
  /**
    * Indicates if this JWT is valid. This means that the payload hasn't been tampered with and that the JWT hasn't expired yet.
    */
  var valid: Boolean = js.native
  /**
    * Resigns this JWT Objects's payload.
    *
    * @return this
    */
  def resign(): JWT = js.native
  /**
    * Calls the revoke function defined in the jwt.init() options with this JWT Object as the first parameter.
    *
    * @return this
    */
  def revoke(): JWT = js.native
  /**
    * Generates a signed token from the payload.
    *
    * @param payload The payload of the JWT (must be an object).
    * @return this
    */
  def sign(payload: js.Any): JWT = js.native
  /**
    * Stores this JWT in the cookie (if configured to use cookies).
    *
    * @param res The response in which to store the JWT.
    * @return this
    */
  def store(res: Response_[_]): JWT = js.native
  /**
    * This function is called when the jwt is passed through JSON.stringify.
    * We don't want the secret or options to be stringified.
    *
    * @return The JSON form of the object.
    */
  def toJSON(): js.Any = js.native
  /**
    * Verify the token and load the info into this JWT.
    *
    * @param token The signed token to verify.
    * @return this
    */
  def verify(token: String): JWT = js.native
}

object JWT {
  @scala.inline
  def apply(
    expired: Boolean,
    options: JWTExpressOptions,
    payload: js.Any,
    resign: () => JWT,
    revoke: () => JWT,
    secret: String,
    sign: js.Any => JWT,
    stale: Boolean,
    store: Response_[_] => JWT,
    toJSON: () => js.Any,
    token: String,
    valid: Boolean,
    verify: String => JWT
  ): JWT = {
    val __obj = js.Dynamic.literal(expired = expired.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], resign = js.Any.fromFunction0(resign), revoke = js.Any.fromFunction0(revoke), secret = secret.asInstanceOf[js.Any], sign = js.Any.fromFunction1(sign), stale = stale.asInstanceOf[js.Any], store = js.Any.fromFunction1(store), toJSON = js.Any.fromFunction0(toJSON), token = token.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], verify = js.Any.fromFunction1(verify))
    __obj.asInstanceOf[JWT]
  }
  @scala.inline
  implicit class JWTOps[Self <: JWT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: JWTExpressOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResign(value: () => JWT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resign")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRevoke(value: () => JWT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revoke")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSign(value: js.Any => JWT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStore(value: Response_[_] => JWT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerify(value: String => JWT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

