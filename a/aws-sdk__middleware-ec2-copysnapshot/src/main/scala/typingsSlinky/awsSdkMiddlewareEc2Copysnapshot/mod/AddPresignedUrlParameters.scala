package typingsSlinky.awsSdkMiddlewareEc2Copysnapshot.mod

import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import typingsSlinky.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddPresignedUrlParameters extends js.Object {
  
  /**
    * Encoder to encode the blob input when generate presigned URL
    */
  var base64Encoder: Encoder = js.native
  
  /**
    * Credentials provider used to sign the presigned URL
    */
  var credentials: Provider[Credentials] = js.native
  
  /**
    * Endpoint provider of the original request.
    */
  var endpoint: Provider[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ _
  ] = js.native
  
  /**
    * Region provider used to sign the presigned URL
    */
  var region: Provider[String] = js.native
  
  /**
    * Hashing class used by signer
    */
  var sha256: HashConstructor = js.native
  
  /**
    * Decoder to decode input string when generate presigned URL
    */
  var utf8Decoder: Decoder = js.native
}
object AddPresignedUrlParameters {
  
  @scala.inline
  def apply(
    base64Encoder: /* input */ js.typedarray.Uint8Array => String,
    credentials: () => js.Promise[Credentials],
    endpoint: () => js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ _
    ],
    region: () => js.Promise[String],
    sha256: HashConstructor,
    utf8Decoder: /* input */ String => js.typedarray.Uint8Array
  ): AddPresignedUrlParameters = {
    val __obj = js.Dynamic.literal(base64Encoder = js.Any.fromFunction1(base64Encoder), credentials = js.Any.fromFunction0(credentials), endpoint = js.Any.fromFunction0(endpoint), region = js.Any.fromFunction0(region), sha256 = sha256.asInstanceOf[js.Any], utf8Decoder = js.Any.fromFunction1(utf8Decoder))
    __obj.asInstanceOf[AddPresignedUrlParameters]
  }
  
  @scala.inline
  implicit class AddPresignedUrlParametersOps[Self <: AddPresignedUrlParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBase64Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = this.set("base64Encoder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCredentials(value: () => js.Promise[Credentials]): Self = this.set("credentials", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndpoint(
      value: () => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ _
        ]
    ): Self = this.set("endpoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegion(value: () => js.Promise[String]): Self = this.set("region", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSha256(value: HashConstructor): Self = this.set("sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtf8Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = this.set("utf8Decoder", js.Any.fromFunction1(value))
  }
}
