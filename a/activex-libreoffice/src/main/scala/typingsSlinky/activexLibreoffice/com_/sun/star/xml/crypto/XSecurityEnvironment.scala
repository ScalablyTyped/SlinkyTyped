package typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.security.XCertificate
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface of Security Environment */
@js.native
trait XSecurityEnvironment extends XInterface {
  /** Get personal certificate from the environment */
  val PersonalCertificates: SafeArray[XCertificate] = js.native
  /** Get the Environment detail infos */
  val SecurityEnvironmentInformation: String = js.native
  /** build certificate path from a certain certificate */
  def buildCertificatePath(beginCert: XCertificate): SafeArray[XCertificate] = js.native
  /** Create certificate interface from a Base64 encoded certificate. */
  def createCertificateFromAscii(asciiCertificate: String): XCertificate = js.native
  /** Create certificate interface from raw DER encoded certificate */
  def createCertificateFromRaw(rawCertificate: SeqEquiv[Double]): XCertificate = js.native
  /** Get certificate from the environment by issuer name and serial number */
  def getCertificate(issuerName: String, serialNumber: SeqEquiv[Double]): XCertificate = js.native
  /**
    * Get a certificate characters.
    *
    * The method provides a way to get certificate characters like:  1. Whether or not the certificate have a private key in the user profile. 2. Whether or
    * not the certificate is a trusted certificate. 3. Whether or not the certificate is a self-signed certificate.
    *
    * The certificate characters is defined as bit-wise long, please refer to CertificateCharacters definition.
    */
  def getCertificateCharacters(xCertificate: XCertificate): Double = js.native
  /** Get personal certificate from the environment */
  def getPersonalCertificates(): SafeArray[XCertificate] = js.native
  /** Get the Environment detail infos */
  def getSecurityEnvironmentInformation(): String = js.native
  /**
    * Verify a certificate.
    *
    * The method provides a way to verify a certificate.
    * @param xEECertificate The certificate which is to be validated.
    * @param intermediateCertificates Additional certificates which can be used by the method in constructing the certificate chain. The root certificate may
    * @returns The validation status will returned as a bit-wise long, please refer to CertificateValidity definition.
    */
  def verifyCertificate(xEECertificate: XCertificate, intermediateCertificates: SeqEquiv[XCertificate]): Double = js.native
}

object XSecurityEnvironment {
  @scala.inline
  def apply(
    PersonalCertificates: SafeArray[XCertificate],
    SecurityEnvironmentInformation: String,
    acquire: () => Unit,
    buildCertificatePath: XCertificate => SafeArray[XCertificate],
    createCertificateFromAscii: String => XCertificate,
    createCertificateFromRaw: SeqEquiv[Double] => XCertificate,
    getCertificate: (String, SeqEquiv[Double]) => XCertificate,
    getCertificateCharacters: XCertificate => Double,
    getPersonalCertificates: () => SafeArray[XCertificate],
    getSecurityEnvironmentInformation: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    verifyCertificate: (XCertificate, SeqEquiv[XCertificate]) => Double
  ): XSecurityEnvironment = {
    val __obj = js.Dynamic.literal(PersonalCertificates = PersonalCertificates.asInstanceOf[js.Any], SecurityEnvironmentInformation = SecurityEnvironmentInformation.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), buildCertificatePath = js.Any.fromFunction1(buildCertificatePath), createCertificateFromAscii = js.Any.fromFunction1(createCertificateFromAscii), createCertificateFromRaw = js.Any.fromFunction1(createCertificateFromRaw), getCertificate = js.Any.fromFunction2(getCertificate), getCertificateCharacters = js.Any.fromFunction1(getCertificateCharacters), getPersonalCertificates = js.Any.fromFunction0(getPersonalCertificates), getSecurityEnvironmentInformation = js.Any.fromFunction0(getSecurityEnvironmentInformation), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), verifyCertificate = js.Any.fromFunction2(verifyCertificate))
    __obj.asInstanceOf[XSecurityEnvironment]
  }
  @scala.inline
  implicit class XSecurityEnvironmentOps[Self <: XSecurityEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPersonalCertificates(value: SafeArray[XCertificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PersonalCertificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityEnvironmentInformation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityEnvironmentInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildCertificatePath(value: XCertificate => SafeArray[XCertificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildCertificatePath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateCertificateFromAscii(value: String => XCertificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCertificateFromAscii")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateCertificateFromRaw(value: SeqEquiv[Double] => XCertificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCertificateFromRaw")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCertificate(value: (String, SeqEquiv[Double]) => XCertificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCertificate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCertificateCharacters(value: XCertificate => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCertificateCharacters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPersonalCertificates(value: () => SafeArray[XCertificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPersonalCertificates")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSecurityEnvironmentInformation(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSecurityEnvironmentInformation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVerifyCertificate(value: (XCertificate, SeqEquiv[XCertificate]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyCertificate")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

