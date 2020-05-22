package typingsSlinky.pkijs

import org.scalajs.dom.crypto.AesCbcParams
import org.scalajs.dom.crypto.AesCfbParams
import org.scalajs.dom.crypto.AesCmacParams
import org.scalajs.dom.crypto.AesCtrParams
import org.scalajs.dom.crypto.AesGcmParams
import org.scalajs.dom.crypto.Algorithm
import org.scalajs.dom.crypto.CryptoKey
import org.scalajs.dom.crypto.CryptoKeyPair
import org.scalajs.dom.crypto.DhImportKeyParams
import org.scalajs.dom.crypto.EcKeyImportParams
import org.scalajs.dom.crypto.EcdsaParams
import org.scalajs.dom.crypto.HmacImportParams
import org.scalajs.dom.crypto.JsonWebKey
import org.scalajs.dom.crypto.RsaHashedImportParams
import org.scalajs.dom.crypto.RsaOaepParams
import org.scalajs.dom.crypto.RsaPssParams
import typingsSlinky.pkijs.pkijsStrings.jwk
import typingsSlinky.pkijs.pkijsStrings.pkcs8
import typingsSlinky.pkijs.pkijsStrings.raw
import typingsSlinky.pkijs.pkijsStrings.spki
import typingsSlinky.std.AlgorithmIdentifier
import typingsSlinky.std.BufferSource
import typingsSlinky.std.SubtleCrypto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/CryptoEngine", JSImport.Namespace)
@js.native
object cryptoEngineMod extends js.Object {
  @js.native
  trait CryptoEngine extends SubtleCrypto {
    var crypto: org.scalajs.dom.crypto.SubtleCrypto = js.native
    var name: String = js.native
    /**
      * Convert WebCrypto keys between different export formats
      * @param {string} inputFormat
      * @param {string} outputFormat
      * @param {ArrayBuffer|JsonWebKey} keyData
      * @param {Algorithm} algorithm
      * @param {boolean} extractable
      * @param {Array} keyUsages
      * @returns {Promise}
      */
    def convert(
      inputFormat: String,
      outputFormat: String,
      keyData: BufferSource,
      algorithm: Algorithm,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[BufferSource | JsonWebKey] = js.native
    def convert(
      inputFormat: String,
      outputFormat: String,
      keyData: JsonWebKey,
      algorithm: Algorithm,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[BufferSource | JsonWebKey] = js.native
    def decrypt(algorithm: String, key: CryptoKey, data: BufferSource): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def decrypt(algorithm: AesCbcParams, key: CryptoKey, data: BufferSource): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def decrypt(algorithm: AesCfbParams, key: CryptoKey, data: BufferSource): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def decrypt(algorithm: AesCmacParams, key: CryptoKey, data: BufferSource): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def decrypt(algorithm: AesCtrParams, key: CryptoKey, data: BufferSource): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def decrypt(algorithm: AesGcmParams, key: CryptoKey, data: BufferSource): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def decrypt(algorithm: RsaOaepParams, key: CryptoKey, data: BufferSource): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def deriveBits(algorithm: String, baseKey: CryptoKey, length: Double): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def digest(algorithm: AlgorithmIdentifier, data: BufferSource): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def encrypt(algorithm: String, key: CryptoKey, data: BufferSource): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def encrypt(algorithm: AesCbcParams, key: CryptoKey, data: BufferSource): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def encrypt(algorithm: AesCfbParams, key: CryptoKey, data: BufferSource): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def encrypt(algorithm: AesCmacParams, key: CryptoKey, data: BufferSource): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def encrypt(algorithm: AesCtrParams, key: CryptoKey, data: BufferSource): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def encrypt(algorithm: AesGcmParams, key: CryptoKey, data: BufferSource): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def encrypt(algorithm: RsaOaepParams, key: CryptoKey, data: BufferSource): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    @JSName("exportKey")
    def exportKey_jwk(format: jwk, key: CryptoKey): js.Thenable[JsonWebKey] = js.native
    @JSName("exportKey")
    def exportKey_pkcs8(format: pkcs8, key: CryptoKey): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    @JSName("exportKey")
    def exportKey_raw(format: raw, key: CryptoKey): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    @JSName("exportKey")
    def exportKey_spki(format: spki, key: CryptoKey): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def generateKey(algorithm: String, extractable: Boolean, keyUsages: js.Array[String]): js.Thenable[CryptoKeyPair | CryptoKey] = js.native
    def importKey(
      format: String,
      keyData: BufferSource,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def importKey(
      format: String,
      keyData: BufferSource,
      algorithm: DhImportKeyParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def importKey(
      format: String,
      keyData: BufferSource,
      algorithm: EcKeyImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def importKey(
      format: String,
      keyData: BufferSource,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def importKey(
      format: String,
      keyData: BufferSource,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def importKey(
      format: String,
      keyData: JsonWebKey,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def importKey(
      format: String,
      keyData: JsonWebKey,
      algorithm: DhImportKeyParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def importKey(
      format: String,
      keyData: JsonWebKey,
      algorithm: EcKeyImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def importKey(
      format: String,
      keyData: JsonWebKey,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def importKey(
      format: String,
      keyData: JsonWebKey,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_jwk(
      format: jwk,
      keyData: JsonWebKey,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_jwk(
      format: jwk,
      keyData: JsonWebKey,
      algorithm: DhImportKeyParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_jwk(
      format: jwk,
      keyData: JsonWebKey,
      algorithm: EcKeyImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_jwk(
      format: jwk,
      keyData: JsonWebKey,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_jwk(
      format: jwk,
      keyData: JsonWebKey,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_pkcs8(
      format: pkcs8,
      keyData: BufferSource,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_pkcs8(
      format: pkcs8,
      keyData: BufferSource,
      algorithm: DhImportKeyParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_pkcs8(
      format: pkcs8,
      keyData: BufferSource,
      algorithm: EcKeyImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_pkcs8(
      format: pkcs8,
      keyData: BufferSource,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_pkcs8(
      format: pkcs8,
      keyData: BufferSource,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_raw(
      format: raw,
      keyData: BufferSource,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_raw(
      format: raw,
      keyData: BufferSource,
      algorithm: DhImportKeyParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_raw(
      format: raw,
      keyData: BufferSource,
      algorithm: EcKeyImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_raw(
      format: raw,
      keyData: BufferSource,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_raw(
      format: raw,
      keyData: BufferSource,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_spki(
      format: spki,
      keyData: BufferSource,
      algorithm: String,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_spki(
      format: spki,
      keyData: BufferSource,
      algorithm: DhImportKeyParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_spki(
      format: spki,
      keyData: BufferSource,
      algorithm: EcKeyImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_spki(
      format: spki,
      keyData: BufferSource,
      algorithm: HmacImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    @JSName("importKey")
    def importKey_spki(
      format: spki,
      keyData: BufferSource,
      algorithm: RsaHashedImportParams,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def sign(algorithm: String, key: CryptoKey, data: BufferSource): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def sign(algorithm: AesCmacParams, key: CryptoKey, data: BufferSource): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def sign(algorithm: EcdsaParams, key: CryptoKey, data: BufferSource): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def sign(algorithm: RsaPssParams, key: CryptoKey, data: BufferSource): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def unwrapKey(
      format: String,
      wrappedKey: BufferSource,
      unwrappingKey: CryptoKey,
      unwrapAlgorithm: AlgorithmIdentifier,
      unwrappedKeyAlgorithm: AlgorithmIdentifier,
      extractable: Boolean,
      keyUsages: js.Array[String]
    ): js.Thenable[CryptoKey] = js.native
    def verify(algorithm: String, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Thenable[Boolean] = js.native
    def verify(algorithm: AesCmacParams, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Thenable[Boolean] = js.native
    def verify(algorithm: EcdsaParams, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Thenable[Boolean] = js.native
    def verify(algorithm: RsaPssParams, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Thenable[Boolean] = js.native
    def wrapKey(format: String, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AlgorithmIdentifier): js.Thenable[js.typedarray.ArrayBuffer] = js.native
  }
  
  @js.native
  /**
    * Constructor for CryptoEngine class
    * @param {*} [parameters={}]
    */
  class default () extends CryptoEngine {
    def this(parameters: js.Any) = this()
  }
  
}

