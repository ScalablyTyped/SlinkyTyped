package typingsSlinky.pkijs.ocspresponseMod

import typingsSlinky.asn1js.mod.Enumerated
import typingsSlinky.pkijs.basicOCSPResponseMod.GetCertificateStatusResult
import typingsSlinky.pkijs.certIDMod.CreateFroCertificateParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OCSPResponse extends js.Object {
  var responseBytes: js.UndefOr[typingsSlinky.pkijs.responseBytesMod.default] = js.native
  var responseStatus: Enumerated = js.native
  /**
    * Making OCSP Request for specific certificate
    * @param {Certificate} certificate Certificate making OCSP Request for
    * @param {CreateFroCertificateParams} parameters Additional parameters
    * @returns {Promise}
    */
  def createForCertificate(certificate: typingsSlinky.pkijs.certificateMod.default, parameters: CreateFroCertificateParams): js.Thenable[Unit] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  /**
    * Get OCSP response status for specific certificate
    * @param {Certificate} certificate
    * @param {Certificate} issuerCertificate
    * @returns {*}
    */
  def getCertificateStatus(
    certificate: typingsSlinky.pkijs.certificateMod.default,
    issuerCertificate: typingsSlinky.pkijs.certificateMod.default
  ): js.Thenable[GetCertificateStatusResult] = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object OCSPResponse {
  @scala.inline
  def apply(
    createForCertificate: (typingsSlinky.pkijs.certificateMod.default, CreateFroCertificateParams) => js.Thenable[Unit],
    fromSchema: js.Any => Unit,
    getCertificateStatus: (typingsSlinky.pkijs.certificateMod.default, typingsSlinky.pkijs.certificateMod.default) => js.Thenable[GetCertificateStatusResult],
    responseStatus: Enumerated,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OCSPResponse = {
    val __obj = js.Dynamic.literal(createForCertificate = js.Any.fromFunction2(createForCertificate), fromSchema = js.Any.fromFunction1(fromSchema), getCertificateStatus = js.Any.fromFunction2(getCertificateStatus), responseStatus = responseStatus.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[OCSPResponse]
  }
  @scala.inline
  implicit class OCSPResponseOps[Self <: OCSPResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateForCertificate(
      value: (typingsSlinky.pkijs.certificateMod.default, CreateFroCertificateParams) => js.Thenable[Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForCertificate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCertificateStatus(
      value: (typingsSlinky.pkijs.certificateMod.default, typingsSlinky.pkijs.certificateMod.default) => js.Thenable[GetCertificateStatusResult]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCertificateStatus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withResponseStatus(value: Enumerated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSchema(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSchema")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResponseBytes(value: typingsSlinky.pkijs.responseBytesMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseBytes")(js.undefined)
        ret
    }
  }
  
}

