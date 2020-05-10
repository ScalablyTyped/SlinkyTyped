package typingsSlinky.jsrsasign

import typingsSlinky.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typingsSlinky.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typingsSlinky.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonObj extends js.Object {
  var hex: String = js.native
  var obj: RSAKey | DSA | ECDSA = js.native
}

object AnonObj {
  @scala.inline
  def apply(hex: String, obj: RSAKey | DSA | ECDSA): AnonObj = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonObj]
  }
  @scala.inline
  implicit class AnonObjOps[Self <: AnonObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObj(value: RSAKey | DSA | ECDSA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obj")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

