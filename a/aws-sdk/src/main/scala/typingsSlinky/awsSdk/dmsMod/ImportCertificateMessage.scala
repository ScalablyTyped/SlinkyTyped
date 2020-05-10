package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportCertificateMessage extends js.Object {
  /**
    * A customer-assigned name for the certificate. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    */
  var CertificateIdentifier: String = js.native
  /**
    * The contents of a .pem file, which contains an X.509 certificate.
    */
  var CertificatePem: js.UndefOr[String] = js.native
  /**
    * The location of an imported Oracle Wallet certificate for use with SSL.
    */
  var CertificateWallet: js.UndefOr[typingsSlinky.awsSdk.dmsMod.CertificateWallet] = js.native
  /**
    * The tags associated with the certificate.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ImportCertificateMessage {
  @scala.inline
  def apply(CertificateIdentifier: String): ImportCertificateMessage = {
    val __obj = js.Dynamic.literal(CertificateIdentifier = CertificateIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportCertificateMessage]
  }
  @scala.inline
  implicit class ImportCertificateMessageOps[Self <: ImportCertificateMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateIdentifier")(value.asInstanceOf[js.Any])
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
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

