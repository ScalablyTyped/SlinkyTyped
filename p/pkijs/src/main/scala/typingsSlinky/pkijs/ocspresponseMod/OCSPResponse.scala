package typingsSlinky.pkijs.ocspresponseMod

import typingsSlinky.asn1js.mod.Enumerated
import typingsSlinky.pkijs.basicOCSPResponseMod.GetCertificateStatusResult
import typingsSlinky.pkijs.certIDMod.CreateFroCertificateParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OCSPResponse extends js.Object {
  var responseBytes: js.UndefOr[typingsSlinky.pkijs.responseBytesMod.default] = js.undefined
  var responseStatus: Enumerated
  /**
    * Making OCSP Request for specific certificate
    * @param {Certificate} certificate Certificate making OCSP Request for
    * @param {CreateFroCertificateParams} parameters Additional parameters
    * @returns {Promise}
    */
  def createForCertificate(certificate: typingsSlinky.pkijs.certificateMod.default, parameters: CreateFroCertificateParams): js.Thenable[Unit]
  def fromSchema(schema: js.Any): Unit
  /**
    * Get OCSP response status for specific certificate
    * @param {Certificate} certificate
    * @param {Certificate} issuerCertificate
    * @returns {*}
    */
  def getCertificateStatus(
    certificate: typingsSlinky.pkijs.certificateMod.default,
    issuerCertificate: typingsSlinky.pkijs.certificateMod.default
  ): js.Thenable[GetCertificateStatusResult]
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OCSPResponse {
  @scala.inline
  def apply(
    createForCertificate: (typingsSlinky.pkijs.certificateMod.default, CreateFroCertificateParams) => js.Thenable[Unit],
    fromSchema: js.Any => Unit,
    getCertificateStatus: (typingsSlinky.pkijs.certificateMod.default, typingsSlinky.pkijs.certificateMod.default) => js.Thenable[GetCertificateStatusResult],
    responseStatus: Enumerated,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    responseBytes: typingsSlinky.pkijs.responseBytesMod.default = null
  ): OCSPResponse = {
    val __obj = js.Dynamic.literal(createForCertificate = js.Any.fromFunction2(createForCertificate), fromSchema = js.Any.fromFunction1(fromSchema), getCertificateStatus = js.Any.fromFunction2(getCertificateStatus), responseStatus = responseStatus.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (responseBytes != null) __obj.updateDynamic("responseBytes")(responseBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OCSPResponse]
  }
}

