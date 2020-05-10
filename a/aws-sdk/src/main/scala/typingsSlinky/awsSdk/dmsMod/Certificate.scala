package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.native
  /**
    * The date that the certificate was created.
    */
  var CertificateCreationDate: js.UndefOr[js.Date] = js.native
  /**
    * A customer-assigned name for the certificate. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    */
  var CertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * The owner of the certificate.
    */
  var CertificateOwner: js.UndefOr[String] = js.native
  /**
    * The contents of a .pem file, which contains an X.509 certificate.
    */
  var CertificatePem: js.UndefOr[String] = js.native
  /**
    * The location of an imported Oracle Wallet certificate for use with SSL.
    */
  var CertificateWallet: js.UndefOr[typingsSlinky.awsSdk.dmsMod.CertificateWallet] = js.native
  /**
    * The key length of the cryptographic algorithm being used.
    */
  var KeyLength: js.UndefOr[IntegerOptional] = js.native
  /**
    * The signing algorithm for the certificate.
    */
  var SigningAlgorithm: js.UndefOr[String] = js.native
  /**
    * The beginning date that the certificate is valid.
    */
  var ValidFromDate: js.UndefOr[js.Date] = js.native
  /**
    * The final date that the certificate is valid.
    */
  var ValidToDate: js.UndefOr[js.Date] = js.native
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
    def withCertificateCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateCreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateCreationDate")(js.undefined)
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
    def withCertificateOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateOwner")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificatePem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificatePem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificatePem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificatePem")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateWalletUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateWallet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateWallet(value: CertificateWallet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateWallet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateWallet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateWallet")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyLength(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyLength")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigningAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigningAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withValidFromDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidFromDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidFromDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidFromDate")(js.undefined)
        ret
    }
    @scala.inline
    def withValidToDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidToDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidToDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidToDate")(js.undefined)
        ret
    }
  }
  
}

