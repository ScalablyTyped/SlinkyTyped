package typingsSlinky.awsSdkSignatureV4

import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.signatureMod.EventSigner
import typingsSlinky.awsSdkTypes.signatureMod.RequestPresigner
import typingsSlinky.awsSdkTypes.signatureMod.RequestSigner
import typingsSlinky.awsSdkTypes.signatureMod.StringSigner
import typingsSlinky.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureV4Mod {
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/SignatureV4", "SignatureV4")
  @js.native
  class SignatureV4 protected ()
    extends RequestPresigner
       with RequestSigner
       with StringSigner
       with EventSigner {
    def this(hasApplyChecksumCredentialsRegionServiceSha256UriEscapePath: SignatureV4Init with SignatureV4CryptoInit) = this()
    
    val applyChecksum: js.Any = js.native
    
    var createCanonicalRequest: js.Any = js.native
    
    var createStringToSign: js.Any = js.native
    
    val credentialProvider: js.Any = js.native
    
    var getCanonicalPath: js.Any = js.native
    
    var getSignature: js.Any = js.native
    
    var getSigningKey: js.Any = js.native
    
    val regionProvider: js.Any = js.native
    
    val service: js.Any = js.native
    
    val sha256: js.Any = js.native
    
    var signEvent: js.Any = js.native
    
    var signRequest: js.Any = js.native
    
    var signString: js.Any = js.native
    
    val uriEscapePath: js.Any = js.native
  }
  
  @js.native
  trait SignatureV4CryptoInit extends StObject {
    
    var sha256: HashConstructor = js.native
  }
  object SignatureV4CryptoInit {
    
    @scala.inline
    def apply(sha256: HashConstructor): SignatureV4CryptoInit = {
      val __obj = js.Dynamic.literal(sha256 = sha256.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignatureV4CryptoInit]
    }
    
    @scala.inline
    implicit class SignatureV4CryptoInitMutableBuilder[Self <: SignatureV4CryptoInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SignatureV4Init extends StObject {
    
    /**
      * Whether to calculate a checksum of the request body and include it as
      * either a request header (when signing) or as a query string parameter
      * (when presigning). This is required for AWS Glacier and Amazon S3 and optional for
      * every other AWS service as of late 2017.
      *
      * @default [true]
      */
    var applyChecksum: js.UndefOr[Boolean] = js.native
    
    /**
      * The credentials with which the request should be signed or a function
      * that returns a promise that will be resolved with credentials.
      */
    var credentials: Credentials | Provider[Credentials] = js.native
    
    /**
      * The region name or a function that returns a promise that will be
      * resolved with the region name.
      */
    var region: String | Provider[String] = js.native
    
    /**
      * The service signing name.
      */
    var service: String = js.native
    
    /**
      * A constructor function for a hash object that will calculate SHA-256 HMAC
      * checksums.
      */
    var sha256: js.UndefOr[HashConstructor] = js.native
    
    /**
      * Whether to uri-escape the request URI path as part of computing the
      * canonical request string. This is required for every AWS service, except
      * Amazon S3, as of late 2017.
      *
      * @default [true]
      */
    var uriEscapePath: js.UndefOr[Boolean] = js.native
  }
  object SignatureV4Init {
    
    @scala.inline
    def apply(
      credentials: Credentials | Provider[Credentials],
      region: String | Provider[String],
      service: String
    ): SignatureV4Init = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignatureV4Init]
    }
    
    @scala.inline
    implicit class SignatureV4InitMutableBuilder[Self <: SignatureV4Init] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyChecksum(value: Boolean): Self = StObject.set(x, "applyChecksum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyChecksumUndefined: Self = StObject.set(x, "applyChecksum", js.undefined)
      
      @scala.inline
      def setCredentials(value: Credentials | Provider[Credentials]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsFunction0(value: () => js.Promise[Credentials]): Self = StObject.set(x, "credentials", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
      
      @scala.inline
      def setUriEscapePath(value: Boolean): Self = StObject.set(x, "uriEscapePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriEscapePathUndefined: Self = StObject.set(x, "uriEscapePath", js.undefined)
    }
  }
}
