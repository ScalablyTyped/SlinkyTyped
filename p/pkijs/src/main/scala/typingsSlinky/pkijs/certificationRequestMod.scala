package typingsSlinky.pkijs

import org.scalajs.dom.crypto.CryptoKey
import typingsSlinky.asn1js.mod.BitString
import typingsSlinky.asn1js.mod.Sequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificationRequestMod {
  
  @JSImport("pkijs/src/CertificationRequest", JSImport.Default)
  @js.native
  class default () extends CertificationRequest {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/CertificationRequest", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/CertificationRequest", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/CertificationRequest", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait CertificationRequest extends StObject {
    
    var attributes: js.UndefOr[js.Array[typingsSlinky.pkijs.attributeMod.default]] = js.native
    
    /**
      * Aux function making ASN1js Sequence from current TBS
      *
      * @returns {Sequence}
      */
    def encodeTBS(): Sequence = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    /**
      * Makes signature for currect certification request
      *
      * @param {CryptoKey} privateKey WebCrypto private key
      * @param {string} [hashAlgorithm] String representing current hashing algorithm
      * @returns {PromiseLike<ArrayBuffer>}
      *
      * @memberOf CertificationRequest
      */
    def sign(privateKey: CryptoKey): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    
    var signatureAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
    
    var signatureValue: BitString = js.native
    
    var subject: typingsSlinky.pkijs.relativeDistinguishedNamesMod.default = js.native
    
    var subjectPublicKeyInfo: typingsSlinky.pkijs.publicKeyInfoMod.default = js.native
    
    var tbs: js.typedarray.ArrayBuffer = js.native
    
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
      * Verify existing certification request signature
      *
      * @returns {PromiseLike<boolean>}
      *
      * @memberOf CertificationRequest
      */
    def verify(): js.Thenable[Boolean] = js.native
    
    var version: Double = js.native
  }
}
