package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateObject extends js.Object {
  val ExpirationDate: String = js.native
  @JSName("InfoPath.CertificateObject_typekey")
  var InfoPathDotCertificateObject_typekey: CertificateObject = js.native
  val IssuedBy: String = js.native
  val IssuedTo: String = js.native
  val Status: XdCertificateStatus = js.native
}

object CertificateObject {
  @scala.inline
  def apply(
    ExpirationDate: String,
    InfoPathDotCertificateObject_typekey: CertificateObject,
    IssuedBy: String,
    IssuedTo: String,
    Status: XdCertificateStatus
  ): CertificateObject = {
    val __obj = js.Dynamic.literal(ExpirationDate = ExpirationDate.asInstanceOf[js.Any], IssuedBy = IssuedBy.asInstanceOf[js.Any], IssuedTo = IssuedTo.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.CertificateObject_typekey")(InfoPathDotCertificateObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateObject]
  }
  @scala.inline
  implicit class CertificateObjectOps[Self <: CertificateObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpirationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoPathDotCertificateObject_typekey(value: CertificateObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.CertificateObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IssuedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuedTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IssuedTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: XdCertificateStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

