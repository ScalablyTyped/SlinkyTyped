package typingsSlinky.pulumiKubernetes.inputMod.certificates.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var certificate: js.UndefOr[Input[String]] = js.native
  /**
    * Conditions applied to the request, such as approval or denial.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[CertificateSigningRequestCondition]]]] = js.native
}

object CertificateSigningRequestStatus {
  @scala.inline
  def apply(): CertificateSigningRequestStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateSigningRequestStatus]
  }
  @scala.inline
  implicit class CertificateSigningRequestStatusOps[Self <: CertificateSigningRequestStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(js.undefined)
        ret
    }
    @scala.inline
    def withConditions(value: Input[js.Array[Input[CertificateSigningRequestCondition]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
  }
  
}

