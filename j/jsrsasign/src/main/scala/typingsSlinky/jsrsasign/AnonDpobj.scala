package typingsSlinky.jsrsasign

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDpobj extends js.Object {
  var dpobj: ASN1Object = js.native
}

object AnonDpobj {
  @scala.inline
  def apply(dpobj: ASN1Object): AnonDpobj = {
    val __obj = js.Dynamic.literal(dpobj = dpobj.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDpobj]
  }
  @scala.inline
  implicit class AnonDpobjOps[Self <: AnonDpobj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDpobj(value: ASN1Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpobj")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

