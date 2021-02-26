package typingsSlinky.jws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jws.jwsStrings.ES256
import typingsSlinky.jws.jwsStrings.ES384
import typingsSlinky.jws.jwsStrings.ES512
import typingsSlinky.jws.jwsStrings.HS256
import typingsSlinky.jws.jwsStrings.HS384
import typingsSlinky.jws.jwsStrings.HS512
import typingsSlinky.jws.jwsStrings.PS256
import typingsSlinky.jws.jwsStrings.PS384
import typingsSlinky.jws.jwsStrings.PS512
import typingsSlinky.jws.jwsStrings.RS256
import typingsSlinky.jws.jwsStrings.RS384
import typingsSlinky.jws.jwsStrings.RS512
import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jws", "ALGORITHMS")
  @js.native
  val ALGORITHMS: js.Tuple12[HS256, HS384, HS512, RS256, RS384, RS512, PS256, PS384, PS512, ES256, ES384, ES512] = js.native
  
  @JSImport("jws", "createSign")
  @js.native
  def createSign(options: SignOptions): SignStream = js.native
  
  @JSImport("jws", "createVerify")
  @js.native
  def createVerify(): VerifyStream = js.native
  @JSImport("jws", "createVerify")
  @js.native
  def createVerify(options: VerifyOptions): VerifyStream = js.native
  
  @JSImport("jws", "decode")
  @js.native
  def decode(signature: String): Signature = js.native
  
  @JSImport("jws", "sign")
  @js.native
  def sign(options: SignOptions): String = js.native
  
  @JSImport("jws", "verify")
  @js.native
  def verify(signature: String, algorithm: Algorithm, secretOrKey: String): Boolean = js.native
  @JSImport("jws", "verify")
  @js.native
  def verify(signature: String, algorithm: Algorithm, secretOrKey: Buffer): Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jws.jwsStrings.HS256
    - typingsSlinky.jws.jwsStrings.HS384
    - typingsSlinky.jws.jwsStrings.HS512
    - typingsSlinky.jws.jwsStrings.RS256
    - typingsSlinky.jws.jwsStrings.RS384
    - typingsSlinky.jws.jwsStrings.RS512
    - typingsSlinky.jws.jwsStrings.PS256
    - typingsSlinky.jws.jwsStrings.PS384
    - typingsSlinky.jws.jwsStrings.PS512
    - typingsSlinky.jws.jwsStrings.ES256
    - typingsSlinky.jws.jwsStrings.ES384
    - typingsSlinky.jws.jwsStrings.ES512
    - typingsSlinky.jws.jwsStrings.none
  */
  trait Algorithm extends StObject
  
  @js.native
  trait CertificateProperties extends PrivateProperties {
    
    var kid: js.UndefOr[String] = js.native
    
    var x5c: js.UndefOr[js.Array[String]] = js.native
    
    var x5t: js.UndefOr[String] = js.native
    
    @JSName("x5t#S256")
    var x5tNumbersignS256: js.UndefOr[String] = js.native
    
    var x5u: js.UndefOr[String] = js.native
  }
  object CertificateProperties {
    
    @scala.inline
    def apply(): CertificateProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateProperties]
    }
    
    @scala.inline
    implicit class CertificatePropertiesMutableBuilder[Self <: CertificateProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
      
      @scala.inline
      def setX5c(value: js.Array[String]): Self = StObject.set(x, "x5c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX5cUndefined: Self = StObject.set(x, "x5c", js.undefined)
      
      @scala.inline
      def setX5cVarargs(value: String*): Self = StObject.set(x, "x5c", js.Array(value :_*))
      
      @scala.inline
      def setX5t(value: String): Self = StObject.set(x, "x5t", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX5tNumbersignS256(value: String): Self = StObject.set(x, "x5t#S256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX5tNumbersignS256Undefined: Self = StObject.set(x, "x5t#S256", js.undefined)
      
      @scala.inline
      def setX5tUndefined: Self = StObject.set(x, "x5t", js.undefined)
      
      @scala.inline
      def setX5u(value: String): Self = StObject.set(x, "x5u", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX5uUndefined: Self = StObject.set(x, "x5u", js.undefined)
    }
  }
  
  @js.native
  trait Header extends CertificateProperties {
    
    var alg: Algorithm = js.native
    
    var crit: js.UndefOr[js.Array[String]] = js.native
    
    var cty: js.UndefOr[String] = js.native
    
    var jwk: js.UndefOr[JWK] = js.native
    
    var typ: js.UndefOr[String] = js.native
  }
  object Header {
    
    @scala.inline
    def apply(alg: Algorithm): Header = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    @scala.inline
    implicit class HeaderMutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlg(value: Algorithm): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrit(value: js.Array[String]): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
      
      @scala.inline
      def setCritVarargs(value: String*): Self = StObject.set(x, "crit", js.Array(value :_*))
      
      @scala.inline
      def setCty(value: String): Self = StObject.set(x, "cty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtyUndefined: Self = StObject.set(x, "cty", js.undefined)
      
      @scala.inline
      def setJwk(value: JWK): Self = StObject.set(x, "jwk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJwkUndefined: Self = StObject.set(x, "jwk", js.undefined)
      
      @scala.inline
      def setTyp(value: String): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypUndefined: Self = StObject.set(x, "typ", js.undefined)
    }
  }
  
  @js.native
  trait JWK extends CertificateProperties {
    
    var alg: js.UndefOr[Algorithm] = js.native
    
    var key_ops: js.UndefOr[js.Array[String]] = js.native
    
    var kty: String = js.native
    
    var use: js.UndefOr[String] = js.native
  }
  object JWK {
    
    @scala.inline
    def apply(kty: String): JWK = {
      val __obj = js.Dynamic.literal(kty = kty.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWK]
    }
    
    @scala.inline
    implicit class JWKMutableBuilder[Self <: JWK] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlg(value: Algorithm): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      @scala.inline
      def setKey_ops(value: js.Array[String]): Self = StObject.set(x, "key_ops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey_opsUndefined: Self = StObject.set(x, "key_ops", js.undefined)
      
      @scala.inline
      def setKey_opsVarargs(value: String*): Self = StObject.set(x, "key_ops", js.Array(value :_*))
      
      @scala.inline
      def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse(value: String): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    }
  }
  
  type PrivateProperties = StringDictionary[js.Any]
  
  @js.native
  trait SignOptions extends StObject {
    
    var encoding: js.UndefOr[String | Buffer | Readable] = js.native
    
    var header: Header = js.native
    
    /**
      * Can be a string, Buffer, Readable stream, or object.
      */
    var key: js.UndefOr[js.Any] = js.native
    
    /**
      * Can be a string, Buffer, Readable stream, or object.
      */
    var payload: js.UndefOr[js.Any] = js.native
    
    /**
      * Can be a string, Buffer, Readable stream, or object.
      */
    var privateKey: js.UndefOr[js.Any] = js.native
    
    /**
      * Can be a string, Buffer, Readable stream, or object.
      */
    var secret: js.UndefOr[js.Any] = js.native
  }
  object SignOptions {
    
    @scala.inline
    def apply(header: Header): SignOptions = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignOptions]
    }
    
    @scala.inline
    implicit class SignOptionsMutableBuilder[Self <: SignOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String | Buffer | Readable): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setHeader(value: Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setPrivateKey(value: js.Any): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      @scala.inline
      def setSecret(value: js.Any): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    }
  }
  
  @js.native
  trait SignStream extends Readable {
    
    /**
      * Can be a string, Buffer, Readable stream, or object.
      */
    var key: js.Any = js.native
    
    /**
      * A Writable Stream that expects the JWS payload. Do not
      * use if you passed a payload option to the constructor.
      *
      *  Example: payloadStream.pipe(signer.payload);
      */
    var payload: Writable = js.native
    
    /**
      * A Writable Stream. Expects the JWS secret for HMAC, or
      * the privateKey for ECDSA and RSA. Do not use if you
      * passed a secret or key option to the constructor.
      *
      * Example: privateKeyStream.pipe(signer.privateKey);
      */
    var privateKey: js.Any = js.native
    
    /**
      * Can be a string, Buffer, Readable stream, or object.
      */
    var secret: js.Any = js.native
  }
  
  @js.native
  trait Signature extends StObject {
    
    var header: Header = js.native
    
    var payload: js.Any = js.native
    
    var signature: String = js.native
  }
  object Signature {
    
    @scala.inline
    def apply(header: Header, payload: js.Any, signature: String): Signature = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[Signature]
    }
    
    @scala.inline
    implicit class SignatureMutableBuilder[Self <: Signature] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VerifyOptions extends StObject {
    
    var algorithm: js.UndefOr[Algorithm | Buffer | Readable] = js.native
    
    var encoding: js.UndefOr[String | Buffer | Readable] = js.native
    
    var key: js.UndefOr[String | Readable | Buffer] = js.native
    
    var publicKey: js.UndefOr[String | Readable | Buffer] = js.native
    
    var secret: js.UndefOr[String | Readable | Buffer] = js.native
    
    var signature: js.UndefOr[String | Buffer | Readable] = js.native
  }
  object VerifyOptions {
    
    @scala.inline
    def apply(): VerifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerifyOptions]
    }
    
    @scala.inline
    implicit class VerifyOptionsMutableBuilder[Self <: VerifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: Algorithm | Buffer | Readable): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setEncoding(value: String | Buffer | Readable): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setKey(value: String | Readable | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setPublicKey(value: String | Readable | Buffer): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
      
      @scala.inline
      def setSecret(value: String | Readable | Buffer): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      @scala.inline
      def setSignature(value: String | Buffer | Readable): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    }
  }
  
  @js.native
  trait VerifyStream extends EventEmitter {
    
    /**
      * Key.  Can be a string, buffer, or object.
      */
    var key: js.Any = js.native
    
    /**
      * A Writable Stream that expects a public key or secret.
      * Do not use if you passed a key or secret option to the
      * constructor.
      */
    var publicKey: Writable = js.native
    
    /**
      * Secret.  Can be a string, buffer, or object.
      */
    var secret: js.Any = js.native
    
    /**
      * A Writable Stream that expects a JWS Signature. Do not
      * use if you passed a signature option to the constructor.
      */
    var signature: Writable = js.native
  }
}
