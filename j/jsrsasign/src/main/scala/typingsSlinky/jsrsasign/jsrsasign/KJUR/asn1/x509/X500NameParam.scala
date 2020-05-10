package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait X500NameParam extends js.Object {
  var C: String = js.native
  var CN: String = js.native
  var O: String = js.native
}

object X500NameParam {
  @scala.inline
  def apply(C: String, CN: String, O: String): X500NameParam = {
    val __obj = js.Dynamic.literal(C = C.asInstanceOf[js.Any], CN = CN.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any])
    __obj.asInstanceOf[X500NameParam]
  }
  @scala.inline
  implicit class X500NameParamOps[Self <: X500NameParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("C")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withO(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("O")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

