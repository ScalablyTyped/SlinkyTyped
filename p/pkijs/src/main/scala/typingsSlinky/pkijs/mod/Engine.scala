package typingsSlinky.pkijs.mod

import org.scalajs.dom.crypto.Crypto
import org.scalajs.dom.crypto.SubtleCrypto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Engine extends js.Object {
  var crypto: Crypto = js.native
  var name: String = js.native
  var subtle: SubtleCrypto = js.native
}

object Engine {
  @scala.inline
  def apply(crypto: Crypto, name: String, subtle: SubtleCrypto): Engine = {
    val __obj = js.Dynamic.literal(crypto = crypto.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtle = subtle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Engine]
  }
  @scala.inline
  implicit class EngineOps[Self <: Engine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrypto(value: Crypto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtle(value: SubtleCrypto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

