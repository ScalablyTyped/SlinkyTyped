package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificate extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/certificate
  /**
    * PEM encoded data
    */
  var data: String = js.native
  /**
    * Fingerprint of the certificate
    */
  var fingerprint: String = js.native
  /**
    * Issuer principal
    */
  var issuer: CertificatePrincipal = js.native
  /**
    * Issuer certificate (if not self-signed)
    */
  var issuerCert: Certificate = js.native
  /**
    * Issuer's Common Name
    */
  var issuerName: String = js.native
  /**
    * Hex value represented string
    */
  var serialNumber: String = js.native
  /**
    * Subject principal
    */
  var subject: CertificatePrincipal = js.native
  /**
    * Subject's Common Name
    */
  var subjectName: String = js.native
  /**
    * End date of the certificate being valid in seconds
    */
  var validExpiry: Double = js.native
  /**
    * Start date of the certificate being valid in seconds
    */
  var validStart: Double = js.native
}

object Certificate {
  @scala.inline
  def apply(
    data: String,
    fingerprint: String,
    issuer: CertificatePrincipal,
    issuerCert: Certificate,
    issuerName: String,
    serialNumber: String,
    subject: CertificatePrincipal,
    subjectName: String,
    validExpiry: Double,
    validStart: Double
  ): Certificate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], issuerCert = issuerCert.asInstanceOf[js.Any], issuerName = issuerName.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectName = subjectName.asInstanceOf[js.Any], validExpiry = validExpiry.asInstanceOf[js.Any], validStart = validStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificate]
  }
  @scala.inline
  implicit class CertificateOps[Self <: Certificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuer(value: CertificatePrincipal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuerCert(value: Certificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuerCert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: CertificatePrincipal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubjectName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidExpiry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validExpiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

