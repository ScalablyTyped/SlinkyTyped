package typingsSlinky.cryptoJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHex extends js.Object {
  var Hex: js.Any = js.native
  var OpenSSL: js.Any = js.native
}

object AnonHex {
  @scala.inline
  def apply(Hex: js.Any, OpenSSL: js.Any): AnonHex = {
    val __obj = js.Dynamic.literal(Hex = Hex.asInstanceOf[js.Any], OpenSSL = OpenSSL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHex]
  }
  @scala.inline
  implicit class AnonHexOps[Self <: AnonHex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHex(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenSSL(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenSSL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

