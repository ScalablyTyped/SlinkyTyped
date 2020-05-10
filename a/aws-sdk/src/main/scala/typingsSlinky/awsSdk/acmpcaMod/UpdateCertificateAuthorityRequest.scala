package typingsSlinky.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCertificateAuthorityRequest extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the private CA that issued the certificate to be revoked. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
    */
  var CertificateAuthorityArn: Arn = js.native
  /**
    * Revocation information for your private CA.
    */
  var RevocationConfiguration: js.UndefOr[typingsSlinky.awsSdk.acmpcaMod.RevocationConfiguration] = js.native
  /**
    * Status of your private CA.
    */
  var Status: js.UndefOr[CertificateAuthorityStatus] = js.native
}

object UpdateCertificateAuthorityRequest {
  @scala.inline
  def apply(CertificateAuthorityArn: Arn): UpdateCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCertificateAuthorityRequest]
  }
  @scala.inline
  implicit class UpdateCertificateAuthorityRequestOps[Self <: UpdateCertificateAuthorityRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateAuthorityArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateAuthorityArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevocationConfiguration(value: RevocationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevocationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevocationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevocationConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: CertificateAuthorityStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

