package typingsSlinky.jsrsasign

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStatus extends js.Object {
  var status: AnonFailinfo = js.native
  var tst: ASN1Object = js.native
}

object AnonStatus {
  @scala.inline
  def apply(status: AnonFailinfo, tst: ASN1Object): AnonStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], tst = tst.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStatus]
  }
  @scala.inline
  implicit class AnonStatusOps[Self <: AnonStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: AnonFailinfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTst(value: ASN1Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tst")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

