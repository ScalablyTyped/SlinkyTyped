package typingsSlinky.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeCertificateRequest extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the private CA that issued the certificate to be revoked. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
    */
  var CertificateAuthorityArn: Arn = js.native
  /**
    * Serial number of the certificate to be revoked. This must be in hexadecimal format. You can retrieve the serial number by calling GetCertificate with the Amazon Resource Name (ARN) of the certificate you want and the ARN of your private CA. The GetCertificate action retrieves the certificate in the PEM format. You can use the following OpenSSL command to list the certificate in text format and copy the hexadecimal serial number.   openssl x509 -in file_path -text -noout  You can also copy the serial number from the console or use the DescribeCertificate action in the AWS Certificate Manager API Reference. 
    */
  var CertificateSerial: String128 = js.native
  /**
    * Specifies why you revoked the certificate.
    */
  var RevocationReason: typingsSlinky.awsSdk.acmpcaMod.RevocationReason = js.native
}

object RevokeCertificateRequest {
  @scala.inline
  def apply(CertificateAuthorityArn: Arn, CertificateSerial: String128, RevocationReason: RevocationReason): RevokeCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any], CertificateSerial = CertificateSerial.asInstanceOf[js.Any], RevocationReason = RevocationReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeCertificateRequest]
  }
  @scala.inline
  implicit class RevokeCertificateRequestOps[Self <: RevokeCertificateRequest] (val x: Self) extends AnyVal {
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
    def withCertificateSerial(value: String128): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateSerial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevocationReason(value: RevocationReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevocationReason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

