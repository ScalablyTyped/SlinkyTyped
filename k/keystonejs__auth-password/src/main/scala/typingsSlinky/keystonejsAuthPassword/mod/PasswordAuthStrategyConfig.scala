package typingsSlinky.keystonejsAuthPassword.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordAuthStrategyConfig extends js.Object {
  var identityField: String = js.native
  var secretField: String = js.native
}

object PasswordAuthStrategyConfig {
  @scala.inline
  def apply(identityField: String, secretField: String): PasswordAuthStrategyConfig = {
    val __obj = js.Dynamic.literal(identityField = identityField.asInstanceOf[js.Any], secretField = secretField.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordAuthStrategyConfig]
  }
  @scala.inline
  implicit class PasswordAuthStrategyConfigOps[Self <: PasswordAuthStrategyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentityField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretField")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

