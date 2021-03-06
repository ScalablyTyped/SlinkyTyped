package typingsSlinky.nextAuth

import typingsSlinky.jose.mod.JWE.DecryptOptions
import typingsSlinky.jose.mod.JWT.SignOptions
import typingsSlinky.jose.mod.JWT.VerifyOptions
import typingsSlinky.nextAuth.anon.CookieName
import typingsSlinky.nextAuth.anon.JWTDecodeParamstokenstrin
import typingsSlinky.nextAuth.anon.reqNextApiRequestsecureCo
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jwtMod {
  
  @JSImport("next-auth/jwt", "decode")
  @js.native
  def decode(): js.Promise[js.Object] = js.native
  @JSImport("next-auth/jwt", "decode")
  @js.native
  def decode(args: JWTDecodeParamstokenstrin): js.Promise[js.Object] = js.native
  
  @JSImport("next-auth/jwt", "encode")
  @js.native
  def encode(): js.Promise[String] = js.native
  @JSImport("next-auth/jwt", "encode")
  @js.native
  def encode(args: JWTEncodeParams): js.Promise[String] = js.native
  
  @JSImport("next-auth/jwt", "getToken")
  @js.native
  def getToken(): js.Promise[String] = js.native
  @JSImport("next-auth/jwt", "getToken")
  @js.native
  def getToken(args: CookieName): js.Promise[String] = js.native
  @JSImport("next-auth/jwt", "getToken")
  @js.native
  def getToken(args: reqNextApiRequestsecureCo): js.Promise[js.Object] = js.native
  
  @js.native
  trait JWTDecodeParams extends StObject {
    
    var decryptionKey: js.UndefOr[String] = js.native
    
    var decryptionOptions: js.UndefOr[DecryptOptions] = js.native
    
    var encryption: js.UndefOr[Boolean] = js.native
    
    var encryptionKey: js.UndefOr[String] = js.native
    
    var maxAge: js.UndefOr[Double] = js.native
    
    var secret: String | Buffer = js.native
    
    var signingKey: js.UndefOr[String] = js.native
    
    var token: js.UndefOr[String] = js.native
    
    var verificationKey: js.UndefOr[String] = js.native
    
    var verificationOptions: js.UndefOr[VerifyOptions] = js.native
  }
  object JWTDecodeParams {
    
    @scala.inline
    def apply(secret: String | Buffer): JWTDecodeParams = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWTDecodeParams]
    }
    
    @scala.inline
    implicit class JWTDecodeParamsMutableBuilder[Self <: JWTDecodeParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecryptionKey(value: String): Self = StObject.set(x, "decryptionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecryptionKeyUndefined: Self = StObject.set(x, "decryptionKey", js.undefined)
      
      @scala.inline
      def setDecryptionOptions(value: DecryptOptions): Self = StObject.set(x, "decryptionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecryptionOptionsUndefined: Self = StObject.set(x, "decryptionOptions", js.undefined)
      
      @scala.inline
      def setEncryption(value: Boolean): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionKey(value: String): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
      
      @scala.inline
      def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setSecret(value: String | Buffer): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningKey(value: String): Self = StObject.set(x, "signingKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningKeyUndefined: Self = StObject.set(x, "signingKey", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      @scala.inline
      def setVerificationKey(value: String): Self = StObject.set(x, "verificationKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerificationKeyUndefined: Self = StObject.set(x, "verificationKey", js.undefined)
      
      @scala.inline
      def setVerificationOptions(value: VerifyOptions): Self = StObject.set(x, "verificationOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerificationOptionsUndefined: Self = StObject.set(x, "verificationOptions", js.undefined)
    }
  }
  
  @js.native
  trait JWTEncodeParams extends StObject {
    
    var encryption: js.UndefOr[Boolean] = js.native
    
    var encryptionKey: js.UndefOr[String] = js.native
    
    var encryptionOptions: js.UndefOr[js.Object] = js.native
    
    var maxAge: js.UndefOr[Double] = js.native
    
    var secret: String | Buffer = js.native
    
    var signingKey: js.UndefOr[String] = js.native
    
    var signingOptions: js.UndefOr[SignOptions] = js.native
    
    var token: js.UndefOr[js.Object] = js.native
  }
  object JWTEncodeParams {
    
    @scala.inline
    def apply(secret: String | Buffer): JWTEncodeParams = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWTEncodeParams]
    }
    
    @scala.inline
    implicit class JWTEncodeParamsMutableBuilder[Self <: JWTEncodeParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryption(value: Boolean): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionKey(value: String): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
      
      @scala.inline
      def setEncryptionOptions(value: js.Object): Self = StObject.set(x, "encryptionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionOptionsUndefined: Self = StObject.set(x, "encryptionOptions", js.undefined)
      
      @scala.inline
      def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setSecret(value: String | Buffer): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningKey(value: String): Self = StObject.set(x, "signingKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningKeyUndefined: Self = StObject.set(x, "signingKey", js.undefined)
      
      @scala.inline
      def setSigningOptions(value: SignOptions): Self = StObject.set(x, "signingOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningOptionsUndefined: Self = StObject.set(x, "signingOptions", js.undefined)
      
      @scala.inline
      def setToken(value: js.Object): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
