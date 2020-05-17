package typingsSlinky.pkijs.basicOCSPResponseMod

import org.scalajs.dom.crypto.CryptoKey
import typingsSlinky.asn1js.mod.BitString
import typingsSlinky.pkijs.anon.TrustedCerts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicOCSPResponse extends js.Object {
  var certs: js.UndefOr[js.Array[typingsSlinky.pkijs.certificateMod.default]] = js.native
  var signature: BitString = js.native
  var signatureAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
  var tbsResponseData: typingsSlinky.pkijs.responseDataMod.default = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  /**
    * Get OCSP response status for specific certificate
    * @param {Certificate} certificate Certificate to be checked
    * @param {Certificate} issuerCertificate Certificate of issuer for certificate to be checked
    * @returns {PromiseLike<GetCertificateStatusResult>}
    */
  def getCertificateStatus(
    certificate: typingsSlinky.pkijs.certificateMod.default,
    issuerCertificate: typingsSlinky.pkijs.certificateMod.default
  ): js.Thenable[GetCertificateStatusResult] = js.native
  /**
    * Make signature for current OCSP Basic Response
    *
    * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
    * @param {string} [hashAlgorithm] Hashing algorithm. Default SHA-1
    * @returns {PromiseLike<ArrayBuffer>}
    */
  def sign(privateKey: CryptoKey): js.Thenable[js.typedarray.ArrayBuffer] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Thenable[js.typedarray.ArrayBuffer] = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
  /**
    * Verify existing OCSP Basic Response
    *
    * @param {{ trustedCerts?: Certificate[] }} parameters Additional parameters
    * @returns {PromiseLike<boolean>}
    */
  def verify(): js.Thenable[Boolean] = js.native
  def verify(parameters: TrustedCerts): js.Thenable[Boolean] = js.native
}

