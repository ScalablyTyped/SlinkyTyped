package typingsSlinky.firebaseInstallations.apiResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateAuthTokenResponse extends js.Object {
  /**
    * Encoded as a string with the suffix 's' (indicating seconds), preceded by
    * the number of seconds.
    *
    * Example: "604800s".
    */
  val expiresIn: String = js.native
  val token: String = js.native
}

object GenerateAuthTokenResponse {
  @scala.inline
  def apply(expiresIn: String, token: String): GenerateAuthTokenResponse = {
    val __obj = js.Dynamic.literal(expiresIn = expiresIn.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateAuthTokenResponse]
  }
  @scala.inline
  implicit class GenerateAuthTokenResponseOps[Self <: GenerateAuthTokenResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiresIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

