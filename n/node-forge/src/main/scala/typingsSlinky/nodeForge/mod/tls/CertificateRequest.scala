package typingsSlinky.nodeForge.mod.tls

import typingsSlinky.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateRequest extends js.Object {
  var certificate_authorities: ByteBuffer = js.native
  var certificate_types: ByteBuffer = js.native
}

object CertificateRequest {
  @scala.inline
  def apply(certificate_authorities: ByteBuffer, certificate_types: ByteBuffer): CertificateRequest = {
    val __obj = js.Dynamic.literal(certificate_authorities = certificate_authorities.asInstanceOf[js.Any], certificate_types = certificate_types.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateRequest]
  }
  @scala.inline
  implicit class CertificateRequestOps[Self <: CertificateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificate_authorities(value: ByteBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate_authorities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificate_types(value: ByteBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate_types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

