package typingsSlinky.kdbxweb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArgon2 extends js.Object {
  var Aes: String = js.native
  var Argon2: String = js.native
}

object AnonArgon2 {
  @scala.inline
  def apply(Aes: String, Argon2: String): AnonArgon2 = {
    val __obj = js.Dynamic.literal(Aes = Aes.asInstanceOf[js.Any], Argon2 = Argon2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgon2]
  }
  @scala.inline
  implicit class AnonArgon2Ops[Self <: AnonArgon2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgon2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Argon2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

