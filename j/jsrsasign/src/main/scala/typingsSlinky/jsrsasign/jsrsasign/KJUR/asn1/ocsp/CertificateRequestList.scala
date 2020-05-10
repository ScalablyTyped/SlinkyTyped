package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ocsp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateRequestList extends js.Object {
  var reqList: js.Array[CertificateRequest] = js.native
}

object CertificateRequestList {
  @scala.inline
  def apply(reqList: js.Array[CertificateRequest]): CertificateRequestList = {
    val __obj = js.Dynamic.literal(reqList = reqList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateRequestList]
  }
  @scala.inline
  implicit class CertificateRequestListOps[Self <: CertificateRequestList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReqList(value: js.Array[CertificateRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

