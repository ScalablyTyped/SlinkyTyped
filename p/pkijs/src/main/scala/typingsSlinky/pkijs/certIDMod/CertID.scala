package typingsSlinky.pkijs.certIDMod

import typingsSlinky.asn1js.mod.Integer
import typingsSlinky.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertID extends js.Object {
  var hashAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
  var issuerKeyHash: OctetString = js.native
  var issuerNameHash: OctetString = js.native
  var serialNumber: Integer = js.native
  /**
    * Making OCSP certificate identifier for specific certificate
    * @param {Certificate} certificate Certificate making OCSP Request for
    * @param {CreateFroCertificateParams} parameters Additional parameters
    * @returns {Promise}
    */
  def createForCertificate(certificate: typingsSlinky.pkijs.certificateMod.default, parameters: CreateFroCertificateParams): js.Thenable[Unit] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  /**
    * Check that two "CertIDs" are equal
    * @param {CertID} certificateID Identifier of the certificate to be checked
    * @returns {boolean}
    */
  def isEqual(certificateID: CertID): Boolean = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object CertID {
  @scala.inline
  def apply(
    createForCertificate: (typingsSlinky.pkijs.certificateMod.default, CreateFroCertificateParams) => js.Thenable[Unit],
    fromSchema: js.Any => Unit,
    hashAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default,
    isEqual: CertID => Boolean,
    issuerKeyHash: OctetString,
    issuerNameHash: OctetString,
    serialNumber: Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): CertID = {
    val __obj = js.Dynamic.literal(createForCertificate = js.Any.fromFunction2(createForCertificate), fromSchema = js.Any.fromFunction1(fromSchema), hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), issuerKeyHash = issuerKeyHash.asInstanceOf[js.Any], issuerNameHash = issuerNameHash.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[CertID]
  }
  @scala.inline
  implicit class CertIDOps[Self <: CertID] (val x: Self) extends AnyVal {
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
    def withHashAlgorithm(value: typingsSlinky.pkijs.algorithmIdentifierMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEqual(value: CertID => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIssuerKeyHash(value: OctetString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuerKeyHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuerNameHash(value: OctetString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuerNameHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialNumber(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(value.asInstanceOf[js.Any])
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
  }
  
}

