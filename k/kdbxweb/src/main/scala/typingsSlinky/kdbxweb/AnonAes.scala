package typingsSlinky.kdbxweb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAes extends js.Object {
  var Aes: String = js.native
  var ChaCha20: String = js.native
}

object AnonAes {
  @scala.inline
  def apply(Aes: String, ChaCha20: String): AnonAes = {
    val __obj = js.Dynamic.literal(Aes = Aes.asInstanceOf[js.Any], ChaCha20 = ChaCha20.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAes]
  }
  @scala.inline
  implicit class AnonAesOps[Self <: AnonAes] (val x: Self) extends AnyVal {
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
    def withChaCha20(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChaCha20")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

