package typingsSlinky.pem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateKeyCreationOptions extends js.Object {
  var cipher: PrivateKeyCipher = js.native
  var password: String = js.native
}

object PrivateKeyCreationOptions {
  @scala.inline
  def apply(cipher: PrivateKeyCipher, password: String): PrivateKeyCreationOptions = {
    val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyCreationOptions]
  }
  @scala.inline
  implicit class PrivateKeyCreationOptionsOps[Self <: PrivateKeyCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCipher(value: PrivateKeyCipher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cipher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

