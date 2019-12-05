package typingsSlinky.pkijs.srcSignedDataMod

import org.scalajs.dom.crypto.CryptoKey
import typingsSlinky.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignedData extends js.Object {
  var certificates: js.UndefOr[
    js.Array[
      typingsSlinky.pkijs.srcCertificateMod.default | typingsSlinky.pkijs.srcOtherCertificateFormatMod.default
    ]
  ] = js.native
  var crls: js.UndefOr[
    js.Array[
      typingsSlinky.pkijs.srcCertificateRevocationListMod.default | typingsSlinky.pkijs.srcOtherRevocationInfoFormatMod.default
    ]
  ] = js.native
  var digestAlgorithms: js.Array[typingsSlinky.pkijs.srcAlgorithmIdentifierMod.default] = js.native
  var encapContentInfo: typingsSlinky.pkijs.srcEncapsulatedContentInfoMod.default = js.native
  var signerInfos: js.Array[typingsSlinky.pkijs.srcSignerInfoMod.default] = js.native
  var version: Double = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  /**
    * Signing current SignedData
    * 
    * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
    * @param {number} signerIndex Index number (starting from 0) of signer index to make signature for
    * @param {string} [hashAlgorithm] Hashing algorithm. Default SHA-1
    * @param {BufferSource} [data] Detached data
    * @returns {ArrayBuffer}
    * 
    * @memberOf SignedData
    */
  def sign(privateKey: CryptoKey, signerIndex: Double): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def sign(privateKey: CryptoKey, signerIndex: Double, hashAlgorithm: String): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def sign(privateKey: CryptoKey, signerIndex: Double, hashAlgorithm: String, data: BufferSource): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def toJSON(): js.Any = js.native
  /**
    * Convert current object to asn1js object and set correct values
    * 
    * @param {boolean} [encodeFlag]
    * @returns {*}
    */
  def toSchema(): js.Any = js.native
  def toSchema(encodeFlag: Boolean): js.Any = js.native
  def verify(options: VerifyParams): js.Thenable[VerifyResult] = js.native
}

