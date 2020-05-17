package typingsSlinky.activexLibreoffice.com_.sun.star.security

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of a PKI Certificate
  *
  * This interface represents a x509 certificate.
  */
@js.native
trait XCertificate extends XInterface {
  /**
    * get the certificate usage. The return value is a set of bits, as defined in RFC3280 for the {@link KeyUsage} BIT STRING. Note the bit and byte order
    * used in ASN.1, so for instance the bit dataEncipherment in {@link KeyUsage} , "bit 3", corresponds to CERT_DATA_ENCIPHERMENT_KEY_USAGE in Win32 and
    * KU_DATA_ENCIPHERMENT in NSS, both with value 0x10.
    */
  val CertificateUsage: Double = js.native
  /** the DER encoded form of the certificate */
  var Encoded: SafeArray[Double] = js.native
  /** all extensions of a certificate. */
  var Extensions: SafeArray[XCertificateExtension] = js.native
  /** the issuer name attribute of the certificate. */
  var IssuerName: String = js.native
  /** the issuer unique ID attribute of the certificate. */
  var IssuerUniqueID: SafeArray[Double] = js.native
  /** the MD5 thumbprint */
  var MD5Thumbprint: SafeArray[Double] = js.native
  /** the validity NotAfter date attribute of the certificate. */
  var NotValidAfter: DateTime = js.native
  /** the validity NotBefore date attribute of the certificate. */
  var NotValidBefore: DateTime = js.native
  /** the SHA-1 thumbprint */
  var SHA1Thumbprint: SafeArray[Double] = js.native
  /** the serial number attribute of the certificate. */
  var SerialNumber: SafeArray[Double] = js.native
  /** the signature algorithm */
  var SignatureAlgorithm: String = js.native
  /** the subject name attribute of the certificate. */
  var SubjectName: String = js.native
  /** the algorithm of the subject public key */
  var SubjectPublicKeyAlgorithm: String = js.native
  /** the value of the subject public key */
  var SubjectPublicKeyValue: SafeArray[Double] = js.native
  /** the subject unique ID attribute of the certificate. */
  var SubjectUniqueID: SafeArray[Double] = js.native
  /** the version number attribute of the certificate. */
  var Version: Double = js.native
  /** Find a extension with a object identifier. */
  def findCertificateExtension(oid: SeqEquiv[Double]): XCertificateExtension = js.native
  /**
    * get the certificate usage. The return value is a set of bits, as defined in RFC3280 for the {@link KeyUsage} BIT STRING. Note the bit and byte order
    * used in ASN.1, so for instance the bit dataEncipherment in {@link KeyUsage} , "bit 3", corresponds to CERT_DATA_ENCIPHERMENT_KEY_USAGE in Win32 and
    * KU_DATA_ENCIPHERMENT in NSS, both with value 0x10.
    */
  def getCertificateUsage(): Double = js.native
}

object XCertificate {
  @scala.inline
  def apply(
    CertificateUsage: Double,
    Encoded: SafeArray[Double],
    Extensions: SafeArray[XCertificateExtension],
    IssuerName: String,
    IssuerUniqueID: SafeArray[Double],
    MD5Thumbprint: SafeArray[Double],
    NotValidAfter: DateTime,
    NotValidBefore: DateTime,
    SHA1Thumbprint: SafeArray[Double],
    SerialNumber: SafeArray[Double],
    SignatureAlgorithm: String,
    SubjectName: String,
    SubjectPublicKeyAlgorithm: String,
    SubjectPublicKeyValue: SafeArray[Double],
    SubjectUniqueID: SafeArray[Double],
    Version: Double,
    acquire: () => Unit,
    findCertificateExtension: SeqEquiv[Double] => XCertificateExtension,
    getCertificateUsage: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCertificate = {
    val __obj = js.Dynamic.literal(CertificateUsage = CertificateUsage.asInstanceOf[js.Any], Encoded = Encoded.asInstanceOf[js.Any], Extensions = Extensions.asInstanceOf[js.Any], IssuerName = IssuerName.asInstanceOf[js.Any], IssuerUniqueID = IssuerUniqueID.asInstanceOf[js.Any], MD5Thumbprint = MD5Thumbprint.asInstanceOf[js.Any], NotValidAfter = NotValidAfter.asInstanceOf[js.Any], NotValidBefore = NotValidBefore.asInstanceOf[js.Any], SHA1Thumbprint = SHA1Thumbprint.asInstanceOf[js.Any], SerialNumber = SerialNumber.asInstanceOf[js.Any], SignatureAlgorithm = SignatureAlgorithm.asInstanceOf[js.Any], SubjectName = SubjectName.asInstanceOf[js.Any], SubjectPublicKeyAlgorithm = SubjectPublicKeyAlgorithm.asInstanceOf[js.Any], SubjectPublicKeyValue = SubjectPublicKeyValue.asInstanceOf[js.Any], SubjectUniqueID = SubjectUniqueID.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), findCertificateExtension = js.Any.fromFunction1(findCertificateExtension), getCertificateUsage = js.Any.fromFunction0(getCertificateUsage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCertificate]
  }
  @scala.inline
  implicit class XCertificateOps[Self <: XCertificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoded(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encoded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensions(value: SafeArray[XCertificateExtension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IssuerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuerUniqueID(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IssuerUniqueID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMD5Thumbprint(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MD5Thumbprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotValidAfter(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotValidAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotValidBefore(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotValidBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHA1Thumbprint(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHA1Thumbprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialNumber(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SerialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubjectName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubjectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubjectPublicKeyAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubjectPublicKeyAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubjectPublicKeyValue(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubjectPublicKeyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubjectUniqueID(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubjectUniqueID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindCertificateExtension(value: SeqEquiv[Double] => XCertificateExtension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findCertificateExtension")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCertificateUsage(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCertificateUsage")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

