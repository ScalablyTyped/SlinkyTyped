package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASN1ObjectParam extends js.Object {
  var obj: ASN1Object = js.native
}

object ASN1ObjectParam {
  @scala.inline
  def apply(obj: ASN1Object): ASN1ObjectParam = {
    val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASN1ObjectParam]
  }
  @scala.inline
  implicit class ASN1ObjectParamOps[Self <: ASN1ObjectParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObj(value: ASN1Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obj")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

