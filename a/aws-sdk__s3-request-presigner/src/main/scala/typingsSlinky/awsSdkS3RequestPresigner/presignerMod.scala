package typingsSlinky.awsSdkS3RequestPresigner

import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.signatureMod.RequestPresigner
import typingsSlinky.awsSdkTypes.utilMod.Provider
import typingsSlinky.std.Exclude
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presignerMod {
  
  @JSImport("@aws-sdk/s3-request-presigner/dist/cjs/presigner", "S3RequestPresigner")
  @js.native
  class S3RequestPresigner protected () extends RequestPresigner {
    def this(options: S3RequestPresignerOptions) = this()
    
    val signer: js.Any = js.native
  }
  
  /**
    * PartialBy<T, K> makes properties specified in K optional in interface T
    * see: https://stackoverflow.com/questions/43159887/make-a-single-property-optional-in-typescript
    * */
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type PartialBy[T, K /* <: /* keyof T */ String */] = (Omit[T, K]) with (Partial[Pick[T, K]])
  
  /* Inlined @aws-sdk/s3-request-presigner.@aws-sdk/s3-request-presigner/dist/cjs/presigner.PartialBy<@aws-sdk/signature-v4.@aws-sdk/signature-v4.SignatureV4Init & @aws-sdk/signature-v4.@aws-sdk/signature-v4.SignatureV4CryptoInit, 'service' | 'uriEscapePath'> & {  signingName :string | undefined} */
  @js.native
  trait S3RequestPresignerOptions extends StObject {
    
    var applyChecksum: js.UndefOr[Boolean] = js.native
    
    var credentials: Credentials | Provider[Credentials] = js.native
    
    var region: String | Provider[String] = js.native
    
    var service: js.UndefOr[String] = js.native
    
    var sha256: js.UndefOr[HashConstructor] = js.native
    
    var signingName: js.UndefOr[String] = js.native
    
    var uriEscapePath: js.UndefOr[Boolean] = js.native
  }
  object S3RequestPresignerOptions {
    
    @scala.inline
    def apply(credentials: Credentials | Provider[Credentials], region: String | Provider[String]): S3RequestPresignerOptions = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3RequestPresignerOptions]
    }
    
    @scala.inline
    implicit class S3RequestPresignerOptionsMutableBuilder[Self <: S3RequestPresignerOptions] (val x: Self) extends AnyVal {
      
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
      def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      @scala.inline
      def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
      
      @scala.inline
      def setSigningName(value: String): Self = StObject.set(x, "signingName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningNameUndefined: Self = StObject.set(x, "signingName", js.undefined)
      
      @scala.inline
      def setUriEscapePath(value: Boolean): Self = StObject.set(x, "uriEscapePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriEscapePathUndefined: Self = StObject.set(x, "uriEscapePath", js.undefined)
    }
  }
}
