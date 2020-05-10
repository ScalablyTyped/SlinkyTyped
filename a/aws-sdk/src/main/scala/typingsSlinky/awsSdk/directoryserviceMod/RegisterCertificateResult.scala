package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterCertificateResult extends js.Object {
  /**
    * The identifier of the certificate.
    */
  var CertificateId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.CertificateId] = js.native
}

object RegisterCertificateResult {
  @scala.inline
  def apply(): RegisterCertificateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterCertificateResult]
  }
  @scala.inline
  implicit class RegisterCertificateResultOps[Self <: RegisterCertificateResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateId(value: CertificateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateId")(js.undefined)
        ret
    }
  }
  
}

