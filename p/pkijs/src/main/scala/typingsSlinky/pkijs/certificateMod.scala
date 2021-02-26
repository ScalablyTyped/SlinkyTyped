package typingsSlinky.pkijs

import org.scalajs.dom.crypto.CryptoKey
import typingsSlinky.asn1js.mod.BitString
import typingsSlinky.asn1js.mod.Integer
import typingsSlinky.asn1js.mod.Sequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificateMod {
  
  @JSImport("pkijs/src/Certificate", JSImport.Default)
  @js.native
  class default () extends Certificate {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/Certificate", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/Certificate", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/Certificate", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait Certificate extends StObject {
    
    /**
      * Create ASN.1 schema for existing values of TBS part for the certificate
      */
    def encodeTBS(): Sequence = js.native
    
    var extensions: js.UndefOr[js.Array[typingsSlinky.pkijs.extensionMod.default]] = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    /**
      * Get SHA-1 hash value for subject public key
      */
    def getKeyHash(): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    
    /**
      * Importing public key for current certificate
      */
    def getPublicKey(): js.Thenable[CryptoKey] = js.native
    def getPublicKey(parameters: js.Any): js.Thenable[CryptoKey] = js.native
    
    var issuer: typingsSlinky.pkijs.relativeDistinguishedNamesMod.default = js.native
    
    var issuerUniqueID: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
    
    var notAfter: typingsSlinky.pkijs.timeMod.default = js.native
    
    var notBefore: typingsSlinky.pkijs.timeMod.default = js.native
    
    var serialNumber: Integer = js.native
    
    /**
      * Make a signature for current value from TBS section
      *
      * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
      * @param {string} [hashAlgorithm="SHA-1"] Hashing algorithm
      */
    def sign(privateKey: CryptoKey): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Thenable[js.typedarray.ArrayBuffer] = js.native
    
    var signature: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
    
    var signatureAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
    
    var signatureValue: BitString = js.native
    
    var subject: typingsSlinky.pkijs.relativeDistinguishedNamesMod.default = js.native
    
    var subjectPublicKeyInfo: typingsSlinky.pkijs.publicKeyInfoMod.default = js.native
    
    var subjectUniqueID: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
    
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
    
    def verify(): js.Thenable[Boolean] = js.native
    def verify(issuerCertificate: Certificate): js.Thenable[Boolean] = js.native
    
    var version: Double = js.native
  }
}
