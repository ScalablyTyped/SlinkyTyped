package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateKeysAndCertificateResponse extends js.Object {
  /**
    * The ARN of the certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  /**
    * The ID of the certificate. AWS IoT issues a default subject name for the certificate (for example, AWS IoT Certificate).
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.native
  /**
    * The generated key pair.
    */
  var keyPair: js.UndefOr[KeyPair] = js.native
}

object CreateKeysAndCertificateResponse {
  @scala.inline
  def apply(): CreateKeysAndCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateKeysAndCertificateResponse]
  }
  @scala.inline
  implicit class CreateKeysAndCertificateResponseOps[Self <: CreateKeysAndCertificateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateArn(value: CertificateArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateId(value: CertificateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateId")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificatePem(value: CertificatePem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificatePem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePem")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPair(value: KeyPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPair")(js.undefined)
        ret
    }
  }
  
}

