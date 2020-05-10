package typingsSlinky.pulumiKubernetes.outputMod.certificates.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  */
@js.native
trait CertificateSigningRequestStatus extends js.Object {
  /**
    * If request was approved, the controller will place the issued certificate here.
    */
  val certificate: String = js.native
  /**
    * Conditions applied to the request, such as approval or denial.
    */
  val conditions: js.Array[CertificateSigningRequestCondition] = js.native
}

object CertificateSigningRequestStatus {
  @scala.inline
  def apply(certificate: String, conditions: js.Array[CertificateSigningRequestCondition]): CertificateSigningRequestStatus = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateSigningRequestStatus]
  }
  @scala.inline
  implicit class CertificateSigningRequestStatusOps[Self <: CertificateSigningRequestStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditions(value: js.Array[CertificateSigningRequestCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

