package typingsSlinky.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateAuthorityCsrResponse extends js.Object {
  /**
    * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
    */
  var Csr: js.UndefOr[CsrBody] = js.native
}

object GetCertificateAuthorityCsrResponse {
  @scala.inline
  def apply(): GetCertificateAuthorityCsrResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCertificateAuthorityCsrResponse]
  }
  @scala.inline
  implicit class GetCertificateAuthorityCsrResponseOps[Self <: GetCertificateAuthorityCsrResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCsr(value: CsrBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Csr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Csr")(js.undefined)
        ret
    }
  }
  
}

