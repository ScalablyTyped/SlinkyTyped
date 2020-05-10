package typingsSlinky.gapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKeyCertificate extends js.Object {
  /** The certificate data. */
  var certificate: js.UndefOr[String] = js.native
  /** The certificate format. */
  var format: js.UndefOr[String] = js.native
  /** [Output only] The certificate details. Used only for X.509 certificates. */
  var x509Details: js.UndefOr[X509CertificateDetails] = js.native
}

object PublicKeyCertificate {
  @scala.inline
  def apply(): PublicKeyCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicKeyCertificate]
  }
  @scala.inline
  implicit class PublicKeyCertificateOps[Self <: PublicKeyCertificate] (val x: Self) extends AnyVal {
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
    def withoutCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withX509Details(value: X509CertificateDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x509Details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX509Details: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x509Details")(js.undefined)
        ret
    }
  }
  
}

