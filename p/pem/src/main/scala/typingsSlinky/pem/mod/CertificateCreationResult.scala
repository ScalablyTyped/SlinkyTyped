package typingsSlinky.pem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateCreationResult extends js.Object {
  var certificate: js.Any = js.native
  var clientKey: String = js.native
  var csr: String = js.native
  var serviceKey: String = js.native
}

object CertificateCreationResult {
  @scala.inline
  def apply(certificate: js.Any, clientKey: String, csr: String, serviceKey: String): CertificateCreationResult = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], clientKey = clientKey.asInstanceOf[js.Any], csr = csr.asInstanceOf[js.Any], serviceKey = serviceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateCreationResult]
  }
  @scala.inline
  implicit class CertificateCreationResultOps[Self <: CertificateCreationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

