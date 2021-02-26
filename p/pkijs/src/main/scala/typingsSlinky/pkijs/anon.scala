package typingsSlinky.pkijs

import org.scalajs.dom.crypto.KeyUsage
import typingsSlinky.pkijs.certificateMod.default
import typingsSlinky.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Algorithm extends StObject {
    
    var algorithm: org.scalajs.dom.crypto.Algorithm = js.native
    
    var usages: js.Array[KeyUsage] = js.native
  }
  object Algorithm {
    
    @scala.inline
    def apply(algorithm: org.scalajs.dom.crypto.Algorithm, usages: js.Array[KeyUsage]): Algorithm = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Algorithm]
    }
    
    @scala.inline
    implicit class AlgorithmMutableBuilder[Self <: Algorithm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: org.scalajs.dom.crypto.Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsages(value: js.Array[KeyUsage]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsagesVarargs(value: KeyUsage*): Self = StObject.set(x, "usages", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ContentEncryptionAlgorithm extends StObject {
    
    var contentEncryptionAlgorithm: org.scalajs.dom.crypto.Algorithm = js.native
    
    var contentToEncrypt: BufferSource = js.native
    
    var hmacHashAlgorithm: String = js.native
    
    var iterationCount: Double = js.native
    
    var password: String = js.native
  }
  object ContentEncryptionAlgorithm {
    
    @scala.inline
    def apply(
      contentEncryptionAlgorithm: org.scalajs.dom.crypto.Algorithm,
      contentToEncrypt: BufferSource,
      hmacHashAlgorithm: String,
      iterationCount: Double,
      password: String
    ): ContentEncryptionAlgorithm = {
      val __obj = js.Dynamic.literal(contentEncryptionAlgorithm = contentEncryptionAlgorithm.asInstanceOf[js.Any], contentToEncrypt = contentToEncrypt.asInstanceOf[js.Any], hmacHashAlgorithm = hmacHashAlgorithm.asInstanceOf[js.Any], iterationCount = iterationCount.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentEncryptionAlgorithm]
    }
    
    @scala.inline
    implicit class ContentEncryptionAlgorithmMutableBuilder[Self <: ContentEncryptionAlgorithm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentEncryptionAlgorithm(value: org.scalajs.dom.crypto.Algorithm): Self = StObject.set(x, "contentEncryptionAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentToEncrypt(value: BufferSource): Self = StObject.set(x, "contentToEncrypt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentToEncryptArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "contentToEncrypt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentToEncryptArrayBufferView(value: js.typedarray.ArrayBufferView): Self = StObject.set(x, "contentToEncrypt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHmacHashAlgorithm(value: String): Self = StObject.set(x, "hmacHashAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Counter extends StObject {
    
    var counter: Double = js.native
    
    var result: js.typedarray.ArrayBuffer = js.native
  }
  object Counter {
    
    @scala.inline
    def apply(counter: Double, result: js.typedarray.ArrayBuffer): Counter = {
      val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Counter]
    }
    
    @scala.inline
    implicit class CounterMutableBuilder[Self <: Counter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HmacHashAlgorithm extends StObject {
    
    var hmacHashAlgorithm: js.UndefOr[String] = js.native
    
    var iterationCount: js.UndefOr[Double] = js.native
    
    var keyEncryptionAlgorithm: js.UndefOr[org.scalajs.dom.crypto.Algorithm] = js.native
    
    var keyEncryptionAlgorithmParams: js.UndefOr[js.Any] = js.native
    
    var keyIdentifier: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  }
  object HmacHashAlgorithm {
    
    @scala.inline
    def apply(): HmacHashAlgorithm = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HmacHashAlgorithm]
    }
    
    @scala.inline
    implicit class HmacHashAlgorithmMutableBuilder[Self <: HmacHashAlgorithm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHmacHashAlgorithm(value: String): Self = StObject.set(x, "hmacHashAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHmacHashAlgorithmUndefined: Self = StObject.set(x, "hmacHashAlgorithm", js.undefined)
      
      @scala.inline
      def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterationCountUndefined: Self = StObject.set(x, "iterationCount", js.undefined)
      
      @scala.inline
      def setKeyEncryptionAlgorithm(value: org.scalajs.dom.crypto.Algorithm): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyEncryptionAlgorithmParams(value: js.Any): Self = StObject.set(x, "keyEncryptionAlgorithmParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyEncryptionAlgorithmParamsUndefined: Self = StObject.set(x, "keyEncryptionAlgorithmParams", js.undefined)
      
      @scala.inline
      def setKeyEncryptionAlgorithmUndefined: Self = StObject.set(x, "keyEncryptionAlgorithm", js.undefined)
      
      @scala.inline
      def setKeyIdentifier(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "keyIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyIdentifierUndefined: Self = StObject.set(x, "keyIdentifier", js.undefined)
    }
  }
  
  @js.native
  trait IssuerCertificate extends StObject {
    
    var issuerCertificate: js.UndefOr[default] = js.native
    
    var publicKeyInfo: js.UndefOr[typingsSlinky.pkijs.publicKeyInfoMod.default] = js.native
  }
  object IssuerCertificate {
    
    @scala.inline
    def apply(): IssuerCertificate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IssuerCertificate]
    }
    
    @scala.inline
    implicit class IssuerCertificateMutableBuilder[Self <: IssuerCertificate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIssuerCertificate(value: default): Self = StObject.set(x, "issuerCertificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerCertificateUndefined: Self = StObject.set(x, "issuerCertificate", js.undefined)
      
      @scala.inline
      def setPublicKeyInfo(value: typingsSlinky.pkijs.publicKeyInfoMod.default): Self = StObject.set(x, "publicKeyInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKeyInfoUndefined: Self = StObject.set(x, "publicKeyInfo", js.undefined)
    }
  }
  
  @js.native
  trait KdfAlgorithm extends StObject {
    
    var kdfAlgorithm: js.UndefOr[String] = js.native
    
    var kekEncryptionLength: js.UndefOr[Double] = js.native
    
    var oaepHashAlgorithm: js.UndefOr[String] = js.native
  }
  object KdfAlgorithm {
    
    @scala.inline
    def apply(): KdfAlgorithm = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KdfAlgorithm]
    }
    
    @scala.inline
    implicit class KdfAlgorithmMutableBuilder[Self <: KdfAlgorithm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKdfAlgorithm(value: String): Self = StObject.set(x, "kdfAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKdfAlgorithmUndefined: Self = StObject.set(x, "kdfAlgorithm", js.undefined)
      
      @scala.inline
      def setKekEncryptionLength(value: Double): Self = StObject.set(x, "kekEncryptionLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKekEncryptionLengthUndefined: Self = StObject.set(x, "kekEncryptionLength", js.undefined)
      
      @scala.inline
      def setOaepHashAlgorithm(value: String): Self = StObject.set(x, "oaepHashAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOaepHashAlgorithmUndefined: Self = StObject.set(x, "oaepHashAlgorithm", js.undefined)
    }
  }
  
  @js.native
  trait Password extends StObject {
    
    var password: String = js.native
  }
  object Password {
    
    @scala.inline
    def apply(password: String): Password = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[Password]
    }
    
    @scala.inline
    implicit class PasswordMutableBuilder[Self <: Password] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RecipientCertificate extends StObject {
    
    var recipientCertificate: default = js.native
    
    var recipientPrivateKey: js.typedarray.ArrayBuffer = js.native
  }
  object RecipientCertificate {
    
    @scala.inline
    def apply(recipientCertificate: default, recipientPrivateKey: js.typedarray.ArrayBuffer): RecipientCertificate = {
      val __obj = js.Dynamic.literal(recipientCertificate = recipientCertificate.asInstanceOf[js.Any], recipientPrivateKey = recipientPrivateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecipientCertificate]
    }
    
    @scala.inline
    implicit class RecipientCertificateMutableBuilder[Self <: RecipientCertificate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecipientCertificate(value: default): Self = StObject.set(x, "recipientCertificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientPrivateKey(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "recipientPrivateKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TrustedCerts extends StObject {
    
    var trustedCerts: js.UndefOr[js.Array[default]] = js.native
  }
  object TrustedCerts {
    
    @scala.inline
    def apply(): TrustedCerts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrustedCerts]
    }
    
    @scala.inline
    implicit class TrustedCertsMutableBuilder[Self <: TrustedCerts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTrustedCerts(value: js.Array[default]): Self = StObject.set(x, "trustedCerts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrustedCertsUndefined: Self = StObject.set(x, "trustedCerts", js.undefined)
      
      @scala.inline
      def setTrustedCertsVarargs(value: default*): Self = StObject.set(x, "trustedCerts", js.Array(value :_*))
    }
  }
}
