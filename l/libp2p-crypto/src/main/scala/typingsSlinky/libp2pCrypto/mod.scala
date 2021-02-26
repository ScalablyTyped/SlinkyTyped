package typingsSlinky.libp2pCrypto

import typingsSlinky.libp2pCrypto.anon.GenSharedKey
import typingsSlinky.libp2pCrypto.libp2pCryptoNumbers.`20`
import typingsSlinky.libp2pCrypto.libp2pCryptoNumbers.`32`
import typingsSlinky.libp2pCrypto.libp2pCryptoNumbers.`64`
import typingsSlinky.libp2pCrypto.libp2pCryptoStrings.Ed25519
import typingsSlinky.libp2pCrypto.libp2pCryptoStrings.RSA
import typingsSlinky.libp2pCrypto.libp2pCryptoStrings.SHA1
import typingsSlinky.libp2pCrypto.libp2pCryptoStrings.SHA256
import typingsSlinky.libp2pCrypto.libp2pCryptoStrings.SHA512
import typingsSlinky.libp2pCrypto.libp2pCryptoStrings.`pkcs-8`
import typingsSlinky.libp2pCrypto.libp2pCryptoStrings.secp256k1
import typingsSlinky.libp2pCrypto.mod.keys.supportedKeys.ed25519.Ed25519PrivateKey
import typingsSlinky.libp2pCrypto.mod.keys.supportedKeys.rsa.RsaPrivateKey
import typingsSlinky.libp2pCrypto.mod.keys.supportedKeys.secp256k1.Secp256k1PrivateKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object aes {
    
    /**
      * Create a new AES Cipher.
      * @param key The key, if length 16 then AES 128 is used. For length 32, AES 256 is used.
      * @param iv Must have length 16.
      */
    @JSImport("libp2p-crypto", "aes.create")
    @js.native
    def create(key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.Promise[Cipher] = js.native
    
    /**
      * AES Cipher in CTR mode.
      */
    @js.native
    trait Cipher extends StObject {
      
      def decrypt(data: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
      
      def encrypt(data: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
    }
    object Cipher {
      
      @scala.inline
      def apply(
        decrypt: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array],
        encrypt: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]
      ): Cipher = {
        val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
        __obj.asInstanceOf[Cipher]
      }
      
      @scala.inline
      implicit class CipherMutableBuilder[Self <: Cipher] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDecrypt(value: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "decrypt", js.Any.fromFunction1(value))
        
        @scala.inline
        def setEncrypt(value: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "encrypt", js.Any.fromFunction1(value))
      }
    }
  }
  
  object hmac {
    
    @JSImport("libp2p-crypto", "hmac.create")
    @js.native
    def create(hash: String, secret: js.typedarray.Uint8Array): js.Promise[Digest] = js.native
    /**
      * Create a new HMAC Digest.
      */
    @JSImport("libp2p-crypto", "hmac.create")
    @js.native
    def create_SHA1(hash: SHA1, secret: js.typedarray.Uint8Array): js.Promise[Digest] = js.native
    @JSImport("libp2p-crypto", "hmac.create")
    @js.native
    def create_SHA256(hash: SHA256, secret: js.typedarray.Uint8Array): js.Promise[Digest] = js.native
    @JSImport("libp2p-crypto", "hmac.create")
    @js.native
    def create_SHA512(hash: SHA512, secret: js.typedarray.Uint8Array): js.Promise[Digest] = js.native
    
    /**
      * HMAC Digest.
      */
    @js.native
    trait Digest extends StObject {
      
      def digest(data: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
      
      var length: `20` | `32` | `64` | Double = js.native
    }
    object Digest {
      
      @scala.inline
      def apply(
        digest: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array],
        length: `20` | `32` | `64` | Double
      ): Digest = {
        val __obj = js.Dynamic.literal(digest = js.Any.fromFunction1(digest), length = length.asInstanceOf[js.Any])
        __obj.asInstanceOf[Digest]
      }
      
      @scala.inline
      implicit class DigestMutableBuilder[Self <: Digest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDigest(value: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "digest", js.Any.fromFunction1(value))
        
        @scala.inline
        def setLength(value: `20` | `32` | `64` | Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object keys {
    
    @JSImport("libp2p-crypto", "keys.generateEphemeralKeyPair")
    @js.native
    def generateEphemeralKeyPair(curve: String): js.Promise[GenSharedKey] = js.native
    @JSImport("libp2p-crypto", "keys.generateEphemeralKeyPair")
    @js.native
    def generateEphemeralKeyPair(curve: CurveType): js.Promise[GenSharedKey] = js.native
    
    @JSImport("libp2p-crypto", "keys.generateKeyPair")
    @js.native
    def generateKeyPair(`type`: String, bits: Double): js.Promise[PrivateKey] = js.native
    @JSImport("libp2p-crypto", "keys.generateKeyPair")
    @js.native
    def generateKeyPair(`type`: KeyType, bits: Double): js.Promise[PrivateKey] = js.native
    
    @JSImport("libp2p-crypto", "keys.generateKeyPairFromSeed")
    @js.native
    def generateKeyPairFromSeed(`type`: String, seed: js.typedarray.Uint8Array, bits: Double): js.Promise[PrivateKey] = js.native
    @JSImport("libp2p-crypto", "keys.generateKeyPairFromSeed")
    @js.native
    def generateKeyPairFromSeed(`type`: KeyType, seed: js.typedarray.Uint8Array, bits: Double): js.Promise[PrivateKey] = js.native
    @JSImport("libp2p-crypto", "keys.generateKeyPairFromSeed")
    @js.native
    def generateKeyPairFromSeed_Ed25519(`type`: Ed25519, seed: js.typedarray.Uint8Array, bits: Double): js.Promise[Ed25519PrivateKey] = js.native
    
    @JSImport("libp2p-crypto", "keys.generateKeyPair")
    @js.native
    def generateKeyPair_Ed25519(`type`: Ed25519): js.Promise[Ed25519PrivateKey] = js.native
    @JSImport("libp2p-crypto", "keys.generateKeyPair")
    @js.native
    def generateKeyPair_RSA(`type`: RSA, bits: Double): js.Promise[RsaPrivateKey] = js.native
    @JSImport("libp2p-crypto", "keys.generateKeyPair")
    @js.native
    def generateKeyPair_secp256k1(`type`: secp256k1): js.Promise[Secp256k1PrivateKey] = js.native
    
    @JSImport("libp2p-crypto", "keys.keyStretcher")
    @js.native
    def keyStretcher(cipherType: String, hashType: String, secret: String): js.Promise[StretchPair] = js.native
    @JSImport("libp2p-crypto", "keys.keyStretcher")
    @js.native
    def keyStretcher(cipherType: String, hashType: String, secret: js.typedarray.Uint8Array): js.Promise[StretchPair] = js.native
    @JSImport("libp2p-crypto", "keys.keyStretcher")
    @js.native
    def keyStretcher(cipherType: String, hashType: HashType, secret: String): js.Promise[StretchPair] = js.native
    @JSImport("libp2p-crypto", "keys.keyStretcher")
    @js.native
    def keyStretcher(cipherType: String, hashType: HashType, secret: js.typedarray.Uint8Array): js.Promise[StretchPair] = js.native
    @JSImport("libp2p-crypto", "keys.keyStretcher")
    @js.native
    def keyStretcher(cipherType: CipherType, hashType: String, secret: String): js.Promise[StretchPair] = js.native
    @JSImport("libp2p-crypto", "keys.keyStretcher")
    @js.native
    def keyStretcher(cipherType: CipherType, hashType: String, secret: js.typedarray.Uint8Array): js.Promise[StretchPair] = js.native
    @JSImport("libp2p-crypto", "keys.keyStretcher")
    @js.native
    def keyStretcher(cipherType: CipherType, hashType: HashType, secret: String): js.Promise[StretchPair] = js.native
    @JSImport("libp2p-crypto", "keys.keyStretcher")
    @js.native
    def keyStretcher(cipherType: CipherType, hashType: HashType, secret: js.typedarray.Uint8Array): js.Promise[StretchPair] = js.native
    
    @JSImport("libp2p-crypto", "keys.keysPBM")
    @js.native
    val keysPBM: js.Any = js.native
    
    @JSImport("libp2p-crypto", "keys.marshalPrivateKey")
    @js.native
    def marshalPrivateKey(key: PrivateKey): js.typedarray.Uint8Array = js.native
    @JSImport("libp2p-crypto", "keys.marshalPrivateKey")
    @js.native
    def marshalPrivateKey(key: PrivateKey, `type`: String): js.typedarray.Uint8Array = js.native
    @JSImport("libp2p-crypto", "keys.marshalPrivateKey")
    @js.native
    def marshalPrivateKey(key: PrivateKey, `type`: KeyType): js.typedarray.Uint8Array = js.native
    
    @JSImport("libp2p-crypto", "keys.marshalPublicKey")
    @js.native
    def marshalPublicKey(key: PublicKey): js.typedarray.Uint8Array = js.native
    @JSImport("libp2p-crypto", "keys.marshalPublicKey")
    @js.native
    def marshalPublicKey(key: PublicKey, `type`: String): js.typedarray.Uint8Array = js.native
    @JSImport("libp2p-crypto", "keys.marshalPublicKey")
    @js.native
    def marshalPublicKey(key: PublicKey, `type`: KeyType): js.typedarray.Uint8Array = js.native
    
    object supportedKeys {
      
      object ed25519 {
        
        @JSImport("libp2p-crypto", "keys.supportedKeys.ed25519.Ed25519PrivateKey")
        @js.native
        class Ed25519PrivateKey protected () extends PrivateKey {
          def this(key: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array) = this()
          
          @JSName("public")
          val public_Ed25519PrivateKey: Ed25519PublicKey = js.native
        }
        
        @JSImport("libp2p-crypto", "keys.supportedKeys.ed25519.Ed25519PublicKey")
        @js.native
        class Ed25519PublicKey protected () extends PublicKey {
          def this(key: js.typedarray.Uint8Array) = this()
          
          def encrypt(bytes: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
        }
        
        @JSImport("libp2p-crypto", "keys.supportedKeys.ed25519.generateKeyPair")
        @js.native
        def generateKeyPair(): js.Promise[Ed25519PrivateKey] = js.native
        
        @JSImport("libp2p-crypto", "keys.supportedKeys.ed25519.generateKeyPairFromSeed")
        @js.native
        def generateKeyPairFromSeed(seed: js.typedarray.Uint8Array): js.Promise[Ed25519PrivateKey] = js.native
        
        @JSImport("libp2p-crypto", "keys.supportedKeys.ed25519.unmarshalEd25519PrivateKey")
        @js.native
        def unmarshalEd25519PrivateKey(buf: js.typedarray.Uint8Array): js.Promise[Ed25519PrivateKey] = js.native
        
        @JSImport("libp2p-crypto", "keys.supportedKeys.ed25519.unmarshalEd25519PublicKey")
        @js.native
        def unmarshalEd25519PublicKey(buf: js.typedarray.Uint8Array): Ed25519PublicKey = js.native
      }
      
      object rsa {
        
        @JSImport("libp2p-crypto", "keys.supportedKeys.rsa.RsaPrivateKey")
        @js.native
        class RsaPrivateKey protected () extends PrivateKey {
          def this(key: js.Any, publicKey: js.typedarray.Uint8Array) = this()
          
          def decrypt(bytes: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
          
          def genSecret(): js.typedarray.Uint8Array = js.native
          
          @JSName("public")
          val public_RsaPrivateKey: RsaPublicKey = js.native
        }
        
        @JSImport("libp2p-crypto", "keys.supportedKeys.rsa.RsaPublicKey")
        @js.native
        class RsaPublicKey protected () extends PublicKey {
          def this(key: js.typedarray.Uint8Array) = this()
          
          def encrypt(bytes: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
        }
        
        @JSImport("libp2p-crypto", "keys.supportedKeys.rsa.fromJwk")
        @js.native
        def fromJwk(jwk: js.typedarray.Uint8Array): js.Promise[RsaPrivateKey] = js.native
        
        @JSImport("libp2p-crypto", "keys.supportedKeys.rsa.generateKeyPair")
        @js.native
        def generateKeyPair(bits: Double): js.Promise[RsaPrivateKey] = js.native
        
        @JSImport("libp2p-crypto", "keys.supportedKeys.rsa.unmarshalRsaPrivateKey")
        @js.native
        def unmarshalRsaPrivateKey(buf: js.typedarray.Uint8Array): js.Promise[RsaPrivateKey] = js.native
        
        @JSImport("libp2p-crypto", "keys.supportedKeys.rsa.unmarshalRsaPublicKey")
        @js.native
        def unmarshalRsaPublicKey(buf: js.typedarray.Uint8Array): RsaPublicKey = js.native
      }
      
      object secp256k1 {
        
        @JSImport("libp2p-crypto", "keys.supportedKeys.secp256k1.Secp256k1PrivateKey")
        @js.native
        class Secp256k1PrivateKey protected () extends PrivateKey {
          def this(key: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array) = this()
          
          @JSName("public")
          val public_Secp256k1PrivateKey: Secp256k1PublicKey = js.native
        }
        
        @JSImport("libp2p-crypto", "keys.supportedKeys.secp256k1.Secp256k1PublicKey")
        @js.native
        class Secp256k1PublicKey protected () extends PublicKey {
          def this(key: js.typedarray.Uint8Array) = this()
          
          def encrypt(bytes: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
        }
        
        @JSImport("libp2p-crypto", "keys.supportedKeys.secp256k1.generateKeyPair")
        @js.native
        def generateKeyPair(): js.Promise[Secp256k1PrivateKey] = js.native
        
        @JSImport("libp2p-crypto", "keys.supportedKeys.secp256k1.unmarshalSecp256k1PrivateKey")
        @js.native
        def unmarshalSecp256k1PrivateKey(bytes: js.typedarray.Uint8Array): js.Promise[Secp256k1PrivateKey] = js.native
        
        @JSImport("libp2p-crypto", "keys.supportedKeys.secp256k1.unmarshalSecp256k1PublicKey")
        @js.native
        def unmarshalSecp256k1PublicKey(bytes: js.typedarray.Uint8Array): Secp256k1PublicKey = js.native
      }
    }
    
    @JSImport("libp2p-crypto", "keys.unmarshalPrivateKey")
    @js.native
    def unmarshalPrivateKey(buf: js.typedarray.Uint8Array): js.Promise[PrivateKey] = js.native
    
    @JSImport("libp2p-crypto", "keys.unmarshalPublicKey")
    @js.native
    def unmarshalPublicKey(buf: js.typedarray.Uint8Array): PublicKey = js.native
    
    /**
      * Converts a PEM password protected private key into its representative object.
      * @param pem Password protected private key in PEM format.
      * @param password The password used to protect the key.
      */
    @JSImport("libp2p-crypto", "keys._import")
    @js.native
    def `import`(pem: String, password: String): js.Promise[RsaPrivateKey] = js.native
    @JSImport("libp2p-crypto", "keys._import")
    @js.native
    def `import`(pem: String, password: String, format: String): js.Promise[RsaPrivateKey] = js.native
  }
  
  @JSImport("libp2p-crypto", "pbkdf2")
  @js.native
  def pbkdf2(password: String, salt: String, iterations: Double, keySize: Double, hash: String): js.typedarray.Uint8Array = js.native
  @JSImport("libp2p-crypto", "pbkdf2")
  @js.native
  def pbkdf2(
    password: String,
    salt: js.typedarray.Uint8Array,
    iterations: Double,
    keySize: Double,
    hash: String
  ): js.typedarray.Uint8Array = js.native
  @JSImport("libp2p-crypto", "pbkdf2")
  @js.native
  def pbkdf2(
    password: js.typedarray.Uint8Array,
    salt: String,
    iterations: Double,
    keySize: Double,
    hash: String
  ): js.typedarray.Uint8Array = js.native
  @JSImport("libp2p-crypto", "pbkdf2")
  @js.native
  def pbkdf2(
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    iterations: Double,
    keySize: Double,
    hash: String
  ): js.typedarray.Uint8Array = js.native
  
  @JSImport("libp2p-crypto", "randomBytes")
  @js.native
  def randomBytes(number: Double): js.typedarray.Uint8Array = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.libp2pCrypto.libp2pCryptoStrings.`AES-128`
    - typingsSlinky.libp2pCrypto.libp2pCryptoStrings.`AES-256`
    - typingsSlinky.libp2pCrypto.libp2pCryptoStrings.Blowfish
  */
  trait CipherType extends StObject
  object CipherType {
    
    @scala.inline
    def `AES-128`: typingsSlinky.libp2pCrypto.libp2pCryptoStrings.`AES-128` = "AES-128".asInstanceOf[typingsSlinky.libp2pCrypto.libp2pCryptoStrings.`AES-128`]
    
    @scala.inline
    def `AES-256`: typingsSlinky.libp2pCrypto.libp2pCryptoStrings.`AES-256` = "AES-256".asInstanceOf[typingsSlinky.libp2pCrypto.libp2pCryptoStrings.`AES-256`]
    
    @scala.inline
    def Blowfish: typingsSlinky.libp2pCrypto.libp2pCryptoStrings.Blowfish = "Blowfish".asInstanceOf[typingsSlinky.libp2pCrypto.libp2pCryptoStrings.Blowfish]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.libp2pCrypto.libp2pCryptoStrings.`P-256`
    - typingsSlinky.libp2pCrypto.libp2pCryptoStrings.`P-384`
    - typingsSlinky.libp2pCrypto.libp2pCryptoStrings.`P-521`
  */
  trait CurveType extends StObject
  object CurveType {
    
    @scala.inline
    def `P-256`: typingsSlinky.libp2pCrypto.libp2pCryptoStrings.`P-256` = "P-256".asInstanceOf[typingsSlinky.libp2pCrypto.libp2pCryptoStrings.`P-256`]
    
    @scala.inline
    def `P-384`: typingsSlinky.libp2pCrypto.libp2pCryptoStrings.`P-384` = "P-384".asInstanceOf[typingsSlinky.libp2pCrypto.libp2pCryptoStrings.`P-384`]
    
    @scala.inline
    def `P-521`: typingsSlinky.libp2pCrypto.libp2pCryptoStrings.`P-521` = "P-521".asInstanceOf[typingsSlinky.libp2pCrypto.libp2pCryptoStrings.`P-521`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.libp2pCrypto.libp2pCryptoStrings.SHA1
    - typingsSlinky.libp2pCrypto.libp2pCryptoStrings.SHA256
    - typingsSlinky.libp2pCrypto.libp2pCryptoStrings.SHA512
  */
  trait HashType extends StObject
  object HashType {
    
    @scala.inline
    def SHA1: typingsSlinky.libp2pCrypto.libp2pCryptoStrings.SHA1 = "SHA1".asInstanceOf[typingsSlinky.libp2pCrypto.libp2pCryptoStrings.SHA1]
    
    @scala.inline
    def SHA256: typingsSlinky.libp2pCrypto.libp2pCryptoStrings.SHA256 = "SHA256".asInstanceOf[typingsSlinky.libp2pCrypto.libp2pCryptoStrings.SHA256]
    
    @scala.inline
    def SHA512: typingsSlinky.libp2pCrypto.libp2pCryptoStrings.SHA512 = "SHA512".asInstanceOf[typingsSlinky.libp2pCrypto.libp2pCryptoStrings.SHA512]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.libp2pCrypto.libp2pCryptoStrings.Ed25519
    - typingsSlinky.libp2pCrypto.libp2pCryptoStrings.RSA
    - typingsSlinky.libp2pCrypto.libp2pCryptoStrings.secp256k1
  */
  trait KeyType extends StObject
  object KeyType {
    
    @scala.inline
    def Ed25519: typingsSlinky.libp2pCrypto.libp2pCryptoStrings.Ed25519 = "Ed25519".asInstanceOf[typingsSlinky.libp2pCrypto.libp2pCryptoStrings.Ed25519]
    
    @scala.inline
    def RSA: typingsSlinky.libp2pCrypto.libp2pCryptoStrings.RSA = "RSA".asInstanceOf[typingsSlinky.libp2pCrypto.libp2pCryptoStrings.RSA]
    
    @scala.inline
    def secp256k1: typingsSlinky.libp2pCrypto.libp2pCryptoStrings.secp256k1 = "secp256k1".asInstanceOf[typingsSlinky.libp2pCrypto.libp2pCryptoStrings.secp256k1]
  }
  
  @js.native
  trait Keystretcher extends StObject {
    
    def apply(res: js.typedarray.Uint8Array): Keystretcher = js.native
    
    var cipherKey: js.typedarray.Uint8Array = js.native
    
    var iv: js.typedarray.Uint8Array = js.native
    
    var macKey: js.typedarray.Uint8Array = js.native
  }
  
  @js.native
  trait PrivateKey extends StObject {
    
    val bytes: js.typedarray.Uint8Array = js.native
    
    def equals(key: PrivateKey): Boolean = js.native
    
    /**
      * Exports the password protected key in the format specified.
      */
    def export(password: String): js.Promise[String] = js.native
    def export(password: String, format: String): js.Promise[String] = js.native
    @JSName("export")
    def export_pkcs8(password: String, format: `pkcs-8`): js.Promise[String] = js.native
    
    def hash(): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * Gets the ID of the key.
      *
      * The key id is the base58 encoding of the SHA-256 multihash of its public key.
      * The public key is a protobuf encoding containing a type and the DER encoding
      * of the PKCS SubjectPublicKeyInfo.
      */
    def id(): js.Promise[String] = js.native
    
    def marshal(): js.typedarray.Uint8Array = js.native
    
    val public: PublicKey = js.native
    
    def sign(data: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
  }
  
  @js.native
  trait PublicKey extends StObject {
    
    val bytes: js.typedarray.Uint8Array = js.native
    
    def equals(key: PublicKey): Boolean = js.native
    
    def hash(): js.Promise[js.typedarray.Uint8Array] = js.native
    
    def marshal(): js.typedarray.Uint8Array = js.native
    
    def verify(data: js.typedarray.Uint8Array, sig: js.typedarray.Uint8Array): js.Promise[Boolean] = js.native
  }
  object PublicKey {
    
    @scala.inline
    def apply(
      bytes: js.typedarray.Uint8Array,
      equals_ : PublicKey => Boolean,
      hash: () => js.Promise[js.typedarray.Uint8Array],
      marshal: () => js.typedarray.Uint8Array,
      verify: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.Promise[Boolean]
    ): PublicKey = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], hash = js.Any.fromFunction0(hash), marshal = js.Any.fromFunction0(marshal), verify = js.Any.fromFunction2(verify))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[PublicKey]
    }
    
    @scala.inline
    implicit class PublicKeyMutableBuilder[Self <: PublicKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEquals_(value: PublicKey => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHash(value: () => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "hash", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMarshal(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "marshal", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVerify(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.Promise[Boolean]): Self = StObject.set(x, "verify", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait StretchPair extends StObject {
    
    def k1(res: js.typedarray.Uint8Array): Keystretcher = js.native
    @JSName("k1")
    var k1_Original: Keystretcher = js.native
    
    def k2(res: js.typedarray.Uint8Array): Keystretcher = js.native
    @JSName("k2")
    var k2_Original: Keystretcher = js.native
  }
}
