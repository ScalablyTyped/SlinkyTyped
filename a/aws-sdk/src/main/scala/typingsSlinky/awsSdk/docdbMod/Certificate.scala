package typingsSlinky.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the certificate. Example: arn:aws:rds:us-east-1::cert:rds-ca-2019 
    */
  var CertificateArn: js.UndefOr[String] = js.native
  /**
    * The unique key that identifies a certificate. Example: rds-ca-2019 
    */
  var CertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * The type of the certificate. Example: CA 
    */
  var CertificateType: js.UndefOr[String] = js.native
  /**
    * The thumbprint of the certificate.
    */
  var Thumbprint: js.UndefOr[String] = js.native
  /**
    * The starting date-time from which the certificate is valid. Example: 2019-07-31T17:57:09Z 
    */
  var ValidFrom: js.UndefOr[js.Date] = js.native
  /**
    * The date-time after which the certificate is no longer valid. Example: 2024-07-31T17:57:09Z 
    */
  var ValidTill: js.UndefOr[js.Date] = js.native
}

object Certificate {
  @scala.inline
  def apply(): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificate]
  }
  @scala.inline
  implicit class CertificateOps[Self <: Certificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateType")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Thumbprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Thumbprint")(js.undefined)
        ret
    }
    @scala.inline
    def withValidFrom(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withValidTill(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidTill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidTill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidTill")(js.undefined)
        ret
    }
  }
  
}

