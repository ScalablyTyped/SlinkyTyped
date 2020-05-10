package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthority extends js.Object {
  // Required. The base64 encoded string representing the public certificate.
  var certificate: js.UndefOr[Double] = js.native
  // The URL of the certificate revocation list.
  var certificateRevocationListUrl: js.UndefOr[String] = js.native
  /**
    * The URL contains the list of all revoked certificates since the last time a full certificate revocaton list was
    * created.
    */
  var deltaCertificateRevocationListUrl: js.UndefOr[String] = js.native
  /**
    * Required. true if the trusted certificate is a root authority, false if the trusted certificate is an intermediate
    * authority.
    */
  var isRootAuthority: js.UndefOr[Boolean] = js.native
  // The issuer of the certificate, calculated from the certificate value. Read-only.
  var issuer: js.UndefOr[String] = js.native
  // The subject key identifier of the certificate, calculated from the certificate value. Read-only.
  var issuerSki: js.UndefOr[String] = js.native
}

object CertificateAuthority {
  @scala.inline
  def apply(): CertificateAuthority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthority]
  }
  @scala.inline
  implicit class CertificateAuthorityOps[Self <: CertificateAuthority] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificate(value: Double): Self = {
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
    def withCertificateRevocationListUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateRevocationListUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateRevocationListUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateRevocationListUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDeltaCertificateRevocationListUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaCertificateRevocationListUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaCertificateRevocationListUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaCertificateRevocationListUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRootAuthority(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRootAuthority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRootAuthority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRootAuthority")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuerSki(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuerSki")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuerSki: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuerSki")(js.undefined)
        ret
    }
  }
  
}

