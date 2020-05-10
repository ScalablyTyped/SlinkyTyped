package typingsSlinky.csrf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokensOptions extends js.Object {
  /**
    * The string length of the salt (default: 8)
    */
  var saltLength: Double = js.native
  /**
    * The byte length of the secret key (default: 18)
    */
  var secretLength: Double = js.native
}

object TokensOptions {
  @scala.inline
  def apply(saltLength: Double, secretLength: Double): TokensOptions = {
    val __obj = js.Dynamic.literal(saltLength = saltLength.asInstanceOf[js.Any], secretLength = secretLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokensOptions]
  }
  @scala.inline
  implicit class TokensOptionsOps[Self <: TokensOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSaltLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saltLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

