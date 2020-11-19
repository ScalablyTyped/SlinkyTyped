package typingsSlinky.pkijs

import org.scalajs.dom.crypto.CryptoKey
import typingsSlinky.asn1js.mod.BitString
import typingsSlinky.asn1js.mod.Sequence
import typingsSlinky.pkijs.anon.IssuerCertificate
import typingsSlinky.std.AlgorithmIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pkijs/src/CertificateRevocationList", JSImport.Namespace)
@js.native
object certificateRevocationListMod extends js.Object {
  
  @js.native
  trait CertificateRevocationList extends js.Object {
    
    var crlExtension: js.UndefOr[js.Array[typingsSlinky.pkijs.extensionMod.default]] = js.native
    
    def encodeTBS(): Sequence = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    def isCertificateRevoked(certificate: typingsSlinky.pkijs.certificateMod.default): Boolean = js.native
    
    var issuer: typingsSlinky.pkijs.relativeDistinguishedNamesMod.default = js.native
    
    var nextUpdate: js.UndefOr[typingsSlinky.pkijs.timeMod.default] = js.native
    
    var revokedCertificates: js.UndefOr[js.Array[typingsSlinky.pkijs.revokedCertificateMod.default]] = js.native
    
    /**
      * Make a signature for existing CRL data
      * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
      * @param {string} [hashAlgorithm] Hashing algorithm. Default SHA-1
      */
    def sign(privateKey: CryptoKey): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    
    var signature: AlgorithmIdentifier = js.native
    
    var signatureAlgorithm: AlgorithmIdentifier = js.native
    
    var signatureValue: BitString = js.native
    
    var tbs: js.typedarray.ArrayBuffer = js.native
    
    var thisUpdate: typingsSlinky.pkijs.timeMod.default = js.native
    
    def toJSON(): js.Any = js.native
    
    /**
      * Convert current object to asn1js object and set correct values
      *
      * @param {boolean} [encodeFlag]
      * @returns {*}
      */
    def toSchema(): js.Any = js.native
    def toSchema(encodeFlag: Boolean): js.Any = js.native
    
    /**
      * Verify existing signature
      * @param {{[issuerCertificate]: Certificate, [publicKeyInfo]: PublicKeyInfo}} parameters
      * @returns {*}
      */
    def verify(parameters: IssuerCertificate): js.Thenable[Boolean] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
  
  @js.native
  class default () extends CertificateRevocationList {
    def this(params: js.Any) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def defaultValues(memberName: String): js.Any = js.native
    
    def schema(): js.Any = js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
}
