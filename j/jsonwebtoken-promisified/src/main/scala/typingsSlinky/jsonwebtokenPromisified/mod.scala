package typingsSlinky.jsonwebtokenPromisified

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsonwebtokenPromisified.anon.Key
import typingsSlinky.node.Buffer
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonwebtoken-promisified", "JsonWebTokenError")
  @js.native
  class JsonWebTokenError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, error: js.Error) = this()
    
    var inner: js.Error = js.native
  }
  
  @JSImport("jsonwebtoken-promisified", "NotBeforeError")
  @js.native
  class NotBeforeError protected () extends JsonWebTokenError {
    def this(message: String, date: js.Date) = this()
    
    var date: js.Date = js.native
  }
  
  @JSImport("jsonwebtoken-promisified", "TokenExpiredError")
  @js.native
  class TokenExpiredError protected () extends JsonWebTokenError {
    def this(message: String, expiredAt: Double) = this()
    
    var expiredAt: Double = js.native
  }
  
  @JSImport("jsonwebtoken-promisified", "decode")
  @js.native
  def decode(token: String): Null | StringDictionary[js.Any] | String = js.native
  @JSImport("jsonwebtoken-promisified", "decode")
  @js.native
  def decode(token: String, options: DecodeOptions): Null | StringDictionary[js.Any] | String = js.native
  
  @JSImport("jsonwebtoken-promisified", "sign")
  @js.native
  def sign(payload: String, secretOrPrivateKey: Secret): String = js.native
  @JSImport("jsonwebtoken-promisified", "sign")
  @js.native
  def sign(payload: String, secretOrPrivateKey: Secret, callback: SignCallback): Unit = js.native
  @JSImport("jsonwebtoken-promisified", "sign")
  @js.native
  def sign(payload: String, secretOrPrivateKey: Secret, options: SignOptions): String = js.native
  @JSImport("jsonwebtoken-promisified", "sign")
  @js.native
  def sign(payload: String, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
  @JSImport("jsonwebtoken-promisified", "sign")
  @js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret): String = js.native
  @JSImport("jsonwebtoken-promisified", "sign")
  @js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret, callback: SignCallback): Unit = js.native
  @JSImport("jsonwebtoken-promisified", "sign")
  @js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions): String = js.native
  @JSImport("jsonwebtoken-promisified", "sign")
  @js.native
  def sign(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
  @JSImport("jsonwebtoken-promisified", "sign")
  @js.native
  def sign(payload: Buffer, secretOrPrivateKey: Secret): String = js.native
  @JSImport("jsonwebtoken-promisified", "sign")
  @js.native
  def sign(payload: Buffer, secretOrPrivateKey: Secret, callback: SignCallback): Unit = js.native
  @JSImport("jsonwebtoken-promisified", "sign")
  @js.native
  def sign(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions): String = js.native
  @JSImport("jsonwebtoken-promisified", "sign")
  @js.native
  def sign(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions, callback: SignCallback): Unit = js.native
  
  @JSImport("jsonwebtoken-promisified", "signAsync")
  @js.native
  def signAsync(payload: String, secretOrPrivateKey: Secret): js.Promise[String] = js.native
  @JSImport("jsonwebtoken-promisified", "signAsync")
  @js.native
  def signAsync(payload: String, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = js.native
  @JSImport("jsonwebtoken-promisified", "signAsync")
  @js.native
  def signAsync(payload: js.Object, secretOrPrivateKey: Secret): js.Promise[String] = js.native
  @JSImport("jsonwebtoken-promisified", "signAsync")
  @js.native
  def signAsync(payload: js.Object, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = js.native
  @JSImport("jsonwebtoken-promisified", "signAsync")
  @js.native
  def signAsync(payload: Buffer, secretOrPrivateKey: Secret): js.Promise[String] = js.native
  @JSImport("jsonwebtoken-promisified", "signAsync")
  @js.native
  def signAsync(payload: Buffer, secretOrPrivateKey: Secret, options: SignOptions): js.Promise[String] = js.native
  
  @JSImport("jsonwebtoken-promisified", "verify")
  @js.native
  def verify(token: String, secretOrPublicKey: String): js.Object | String = js.native
  @JSImport("jsonwebtoken-promisified", "verify")
  @js.native
  def verify(token: String, secretOrPublicKey: String, callback: VerifyCallback): Unit = js.native
  @JSImport("jsonwebtoken-promisified", "verify")
  @js.native
  def verify(token: String, secretOrPublicKey: String, options: VerifyOptions): js.Object | String = js.native
  @JSImport("jsonwebtoken-promisified", "verify")
  @js.native
  def verify(token: String, secretOrPublicKey: String, options: VerifyOptions, callback: VerifyCallback): Unit = js.native
  @JSImport("jsonwebtoken-promisified", "verify")
  @js.native
  def verify(token: String, secretOrPublicKey: Buffer): js.Object | String = js.native
  @JSImport("jsonwebtoken-promisified", "verify")
  @js.native
  def verify(token: String, secretOrPublicKey: Buffer, callback: VerifyCallback): Unit = js.native
  @JSImport("jsonwebtoken-promisified", "verify")
  @js.native
  def verify(token: String, secretOrPublicKey: Buffer, options: VerifyOptions): js.Object | String = js.native
  @JSImport("jsonwebtoken-promisified", "verify")
  @js.native
  def verify(token: String, secretOrPublicKey: Buffer, options: VerifyOptions, callback: VerifyCallback): Unit = js.native
  
  @JSImport("jsonwebtoken-promisified", "verifyAsync")
  @js.native
  def verifyAsync(token: String, secretOrPublicKey: String): js.Promise[js.Object | String] = js.native
  @JSImport("jsonwebtoken-promisified", "verifyAsync")
  @js.native
  def verifyAsync(token: String, secretOrPublicKey: String, options: VerifyOptions): js.Promise[js.Object | String] = js.native
  @JSImport("jsonwebtoken-promisified", "verifyAsync")
  @js.native
  def verifyAsync(token: String, secretOrPublicKey: Buffer): js.Promise[js.Object | String] = js.native
  @JSImport("jsonwebtoken-promisified", "verifyAsync")
  @js.native
  def verifyAsync(token: String, secretOrPublicKey: Buffer, options: VerifyOptions): js.Promise[js.Object | String] = js.native
  
  @JSImport("jsonwebtoken-promisified", "verify")
  @js.native
  def verify_Unit(token: String, secretOrPublicKey: String): Unit = js.native
  @JSImport("jsonwebtoken-promisified", "verify")
  @js.native
  def verify_Unit(token: String, secretOrPublicKey: String, options: VerifyOptions): Unit = js.native
  @JSImport("jsonwebtoken-promisified", "verify")
  @js.native
  def verify_Unit(token: String, secretOrPublicKey: Buffer): Unit = js.native
  @JSImport("jsonwebtoken-promisified", "verify")
  @js.native
  def verify_Unit(token: String, secretOrPublicKey: Buffer, options: VerifyOptions): Unit = js.native
  
  @js.native
  trait DecodeOptions extends StObject {
    
    var complete: js.UndefOr[Boolean] = js.native
    
    var json: js.UndefOr[Boolean] = js.native
  }
  object DecodeOptions {
    
    @scala.inline
    def apply(): DecodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeOptions]
    }
    
    @scala.inline
    implicit class DecodeOptionsMutableBuilder[Self <: DecodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    }
  }
  
  type Secret = String | Buffer | Key
  
  type SignCallback = js.Function2[/* err */ js.Error, /* encoded */ String, Unit]
  
  @js.native
  trait SignOptions extends StObject {
    
    /**
      * Signature algorithm. Could be one of these values :
      * - HS256:    HMAC using SHA-256 hash algorithm (default)
      * - HS384:    HMAC using SHA-384 hash algorithm
      * - HS512:    HMAC using SHA-512 hash algorithm
      * - RS256:    RSASSA using SHA-256 hash algorithm
      * - RS384:    RSASSA using SHA-384 hash algorithm
      * - RS512:    RSASSA using SHA-512 hash algorithm
      * - ES256:    ECDSA using P-256 curve and SHA-256 hash algorithm
      * - ES384:    ECDSA using P-384 curve and SHA-384 hash algorithm
      * - ES512:    ECDSA using P-521 curve and SHA-512 hash algorithm
      * - none:     No digital signature or MAC value included
      */
    var algorithm: js.UndefOr[String] = js.native
    
    var audience: js.UndefOr[String | js.Array[String]] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    /** {string} - expressed in seconds or a string describing a time span [zeit/ms](https://github.com/zeit/ms.js).  Eg: 60, "2 days", "10h", "7d" */
    var expiresIn: js.UndefOr[String | Double] = js.native
    
    var header: js.UndefOr[js.Object] = js.native
    
    var issuer: js.UndefOr[String] = js.native
    
    var jwtid: js.UndefOr[String] = js.native
    
    var keyid: js.UndefOr[String] = js.native
    
    var noTimestamp: js.UndefOr[Boolean] = js.native
    
    /** {string} - expressed in seconds or a string describing a time span [zeit/ms](https://github.com/zeit/ms.js).  Eg: 60, "2 days", "10h", "7d" */
    var notBefore: js.UndefOr[String | Double] = js.native
    
    var subject: js.UndefOr[String] = js.native
  }
  object SignOptions {
    
    @scala.inline
    def apply(): SignOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignOptions]
    }
    
    @scala.inline
    implicit class SignOptionsMutableBuilder[Self <: SignOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      @scala.inline
      def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value :_*))
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setExpiresIn(value: String | Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      @scala.inline
      def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      @scala.inline
      def setJwtid(value: String): Self = StObject.set(x, "jwtid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJwtidUndefined: Self = StObject.set(x, "jwtid", js.undefined)
      
      @scala.inline
      def setKeyid(value: String): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyidUndefined: Self = StObject.set(x, "keyid", js.undefined)
      
      @scala.inline
      def setNoTimestamp(value: Boolean): Self = StObject.set(x, "noTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoTimestampUndefined: Self = StObject.set(x, "noTimestamp", js.undefined)
      
      @scala.inline
      def setNotBefore(value: String | Double): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  type VerifyCallback = js.Function2[
    /* err */ JsonWebTokenError | NotBeforeError | TokenExpiredError, 
    /* decoded */ js.Object | String, 
    Unit
  ]
  
  @js.native
  trait VerifyOptions extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.native
    
    var audience: js.UndefOr[String | js.Array[String]] = js.native
    
    var clockTimestamp: js.UndefOr[Double] = js.native
    
    var clockTolerance: js.UndefOr[Double] = js.native
    
    var ignoreExpiration: js.UndefOr[Boolean] = js.native
    
    var ignoreNotBefore: js.UndefOr[Boolean] = js.native
    
    var issuer: js.UndefOr[String | js.Array[String]] = js.native
    
    var jwtid: js.UndefOr[String] = js.native
    
    /**
      * @deprecated
      * {string} - Max age of token
      */
    var maxAge: js.UndefOr[String] = js.native
    
    var subject: js.UndefOr[String] = js.native
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
      def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      @scala.inline
      def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
      
      @scala.inline
      def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      @scala.inline
      def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value :_*))
      
      @scala.inline
      def setClockTimestamp(value: Double): Self = StObject.set(x, "clockTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockTimestampUndefined: Self = StObject.set(x, "clockTimestamp", js.undefined)
      
      @scala.inline
      def setClockTolerance(value: Double): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      @scala.inline
      def setIgnoreExpiration(value: Boolean): Self = StObject.set(x, "ignoreExpiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreExpirationUndefined: Self = StObject.set(x, "ignoreExpiration", js.undefined)
      
      @scala.inline
      def setIgnoreNotBefore(value: Boolean): Self = StObject.set(x, "ignoreNotBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreNotBeforeUndefined: Self = StObject.set(x, "ignoreNotBefore", js.undefined)
      
      @scala.inline
      def setIssuer(value: String | js.Array[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      @scala.inline
      def setIssuerVarargs(value: String*): Self = StObject.set(x, "issuer", js.Array(value :_*))
      
      @scala.inline
      def setJwtid(value: String): Self = StObject.set(x, "jwtid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJwtidUndefined: Self = StObject.set(x, "jwtid", js.undefined)
      
      @scala.inline
      def setMaxAge(value: String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
}
