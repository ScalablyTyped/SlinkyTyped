package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.csr.CertificationRequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Csrinfo extends js.Object {
  var csrinfo: CertificationRequestInfo = js.native
}

object Csrinfo {
  @scala.inline
  def apply(csrinfo: CertificationRequestInfo): Csrinfo = {
    val __obj = js.Dynamic.literal(csrinfo = csrinfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Csrinfo]
  }
  @scala.inline
  implicit class CsrinfoOps[Self <: Csrinfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCsrinfo(value: CertificationRequestInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csrinfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

