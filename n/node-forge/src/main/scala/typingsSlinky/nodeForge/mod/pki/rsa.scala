package typingsSlinky.nodeForge.mod.pki

import typingsSlinky.nodeForge.mod.Bytes
import typingsSlinky.nodeForge.mod.jsbn.BigInteger
import typingsSlinky.nodeForge.mod.md.MessageDigest
import typingsSlinky.nodeForge.mod.pss.PSS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsa {
  
  @JSImport("node-forge", "pki.rsa.generateKeyPair")
  @js.native
  def generateKeyPair(): typingsSlinky.nodeForge.mod.pki.rsa.KeyPair = js.native
  @JSImport("node-forge", "pki.rsa.generateKeyPair")
  @js.native
  def generateKeyPair(
    bits: js.UndefOr[scala.Nothing],
    e: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* keypair */ typingsSlinky.nodeForge.mod.pki.rsa.KeyPair, Unit]
  ): typingsSlinky.nodeForge.mod.pki.rsa.KeyPair = js.native
  @JSImport("node-forge", "pki.rsa.generateKeyPair")
  @js.native
  def generateKeyPair(bits: js.UndefOr[scala.Nothing], e: Double): typingsSlinky.nodeForge.mod.pki.rsa.KeyPair = js.native
  @JSImport("node-forge", "pki.rsa.generateKeyPair")
  @js.native
  def generateKeyPair(
    bits: js.UndefOr[scala.Nothing],
    e: Double,
    callback: js.Function2[/* err */ js.Error, /* keypair */ typingsSlinky.nodeForge.mod.pki.rsa.KeyPair, Unit]
  ): typingsSlinky.nodeForge.mod.pki.rsa.KeyPair = js.native
  @JSImport("node-forge", "pki.rsa.generateKeyPair")
  @js.native
  def generateKeyPair(bits: Double): typingsSlinky.nodeForge.mod.pki.rsa.KeyPair = js.native
  @JSImport("node-forge", "pki.rsa.generateKeyPair")
  @js.native
  def generateKeyPair(
    bits: Double,
    e: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* keypair */ typingsSlinky.nodeForge.mod.pki.rsa.KeyPair, Unit]
  ): typingsSlinky.nodeForge.mod.pki.rsa.KeyPair = js.native
  @JSImport("node-forge", "pki.rsa.generateKeyPair")
  @js.native
  def generateKeyPair(bits: Double, e: Double): typingsSlinky.nodeForge.mod.pki.rsa.KeyPair = js.native
  @JSImport("node-forge", "pki.rsa.generateKeyPair")
  @js.native
  def generateKeyPair(
    bits: Double,
    e: Double,
    callback: js.Function2[/* err */ js.Error, /* keypair */ typingsSlinky.nodeForge.mod.pki.rsa.KeyPair, Unit]
  ): typingsSlinky.nodeForge.mod.pki.rsa.KeyPair = js.native
  @JSImport("node-forge", "pki.rsa.generateKeyPair")
  @js.native
  def generateKeyPair(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* keypair */ typingsSlinky.nodeForge.mod.pki.rsa.KeyPair, Unit]
  ): typingsSlinky.nodeForge.mod.pki.rsa.KeyPair = js.native
  @JSImport("node-forge", "pki.rsa.generateKeyPair")
  @js.native
  def generateKeyPair(options: GenerateKeyPairOptions): typingsSlinky.nodeForge.mod.pki.rsa.KeyPair = js.native
  @JSImport("node-forge", "pki.rsa.generateKeyPair")
  @js.native
  def generateKeyPair(
    options: GenerateKeyPairOptions,
    callback: js.Function2[/* err */ js.Error, /* keypair */ typingsSlinky.nodeForge.mod.pki.rsa.KeyPair, Unit]
  ): typingsSlinky.nodeForge.mod.pki.rsa.KeyPair = js.native
  
  @JSImport("node-forge", "pki.rsa.setPublicKey")
  @js.native
  def setPublicKey(n: BigInteger, e: BigInteger): typingsSlinky.nodeForge.mod.pki.rsa.PublicKey = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeForge.nodeForgeStrings.`RSAES-PKCS1-V1_5`
    - typingsSlinky.nodeForge.nodeForgeStrings.`RSA-OAEP`
    - typingsSlinky.nodeForge.nodeForgeStrings.RAW
    - typingsSlinky.nodeForge.nodeForgeStrings.NONE
    - scala.Null
  */
  type EncryptionScheme = _EncryptionScheme | Null
  
  @js.native
  trait GenerateKeyPairOptions extends StObject {
    
    var algorithm: js.UndefOr[String] = js.native
    
    var bits: js.UndefOr[Double] = js.native
    
    var e: js.UndefOr[Double] = js.native
    
    var prng: js.UndefOr[js.Any] = js.native
    
    var workLoad: js.UndefOr[Double] = js.native
    
    var workerScript: js.UndefOr[String] = js.native
    
    var workers: js.UndefOr[Double] = js.native
  }
  object GenerateKeyPairOptions {
    
    @scala.inline
    def apply(): GenerateKeyPairOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateKeyPairOptions]
    }
    
    @scala.inline
    implicit class GenerateKeyPairOptionsMutableBuilder[Self <: GenerateKeyPairOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setBits(value: Double): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
      
      @scala.inline
      def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      @scala.inline
      def setPrng(value: js.Any): Self = StObject.set(x, "prng", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrngUndefined: Self = StObject.set(x, "prng", js.undefined)
      
      @scala.inline
      def setWorkLoad(value: Double): Self = StObject.set(x, "workLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkLoadUndefined: Self = StObject.set(x, "workLoad", js.undefined)
      
      @scala.inline
      def setWorkerScript(value: String): Self = StObject.set(x, "workerScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerScriptUndefined: Self = StObject.set(x, "workerScript", js.undefined)
      
      @scala.inline
      def setWorkers(value: Double): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    }
  }
  
  @js.native
  trait KeyPair extends StObject {
    
    var privateKey: typingsSlinky.nodeForge.mod.pki.rsa.PrivateKey = js.native
    
    var publicKey: typingsSlinky.nodeForge.mod.pki.rsa.PublicKey = js.native
  }
  object KeyPair {
    
    @scala.inline
    def apply(
      privateKey: typingsSlinky.nodeForge.mod.pki.rsa.PrivateKey,
      publicKey: typingsSlinky.nodeForge.mod.pki.rsa.PublicKey
    ): typingsSlinky.nodeForge.mod.pki.rsa.KeyPair = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.nodeForge.mod.pki.rsa.KeyPair]
    }
    
    @scala.inline
    implicit class KeyPairMutableBuilder[Self <: typingsSlinky.nodeForge.mod.pki.rsa.KeyPair] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrivateKey(value: typingsSlinky.nodeForge.mod.pki.rsa.PrivateKey): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKey(value: typingsSlinky.nodeForge.mod.pki.rsa.PublicKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PrivateKey extends StObject {
    
    var d: BigInteger = js.native
    
    var dP: BigInteger = js.native
    
    var dQ: BigInteger = js.native
    
    def decrypt(data: Bytes): Bytes = js.native
    def decrypt(data: Bytes, scheme: js.UndefOr[EncryptionScheme], schemeOptions: js.Any): Bytes = js.native
    def decrypt(data: Bytes, scheme: EncryptionScheme): Bytes = js.native
    
    var e: BigInteger = js.native
    
    var n: BigInteger = js.native
    
    var p: BigInteger = js.native
    
    var q: BigInteger = js.native
    
    var qInv: BigInteger = js.native
    
    def sign(md: MessageDigest): Bytes = js.native
    def sign(md: MessageDigest, scheme: SignatureScheme): Bytes = js.native
  }
  
  @js.native
  trait PublicKey extends StObject {
    
    var e: BigInteger = js.native
    
    def encrypt(data: Bytes): Bytes = js.native
    def encrypt(data: Bytes, scheme: js.UndefOr[EncryptionScheme], schemeOptions: js.Any): Bytes = js.native
    def encrypt(data: Bytes, scheme: EncryptionScheme): Bytes = js.native
    
    var n: BigInteger = js.native
    
    def verify(digest: Bytes, signature: Bytes): Boolean = js.native
    def verify(digest: Bytes, signature: Bytes, scheme: SignatureScheme): Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeForge.nodeForgeStrings.`RSASSA-PKCS1-V1_5`
    - typingsSlinky.nodeForge.mod.pss.PSS
    - typingsSlinky.nodeForge.nodeForgeStrings.NONE
    - scala.Null
  */
  type SignatureScheme = _SignatureScheme | PSS | Null
  
  trait _EncryptionScheme extends StObject
  
  trait _SignatureScheme extends StObject
}
