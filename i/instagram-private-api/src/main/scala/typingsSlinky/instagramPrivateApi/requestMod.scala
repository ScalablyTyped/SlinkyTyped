package typingsSlinky.instagramPrivateApi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.instagramPrivateApi.anon.AcceptEncoding
import typingsSlinky.instagramPrivateApi.anon.PartialAttemptOptionsany
import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.commonTypesMod.IgResponse
import typingsSlinky.instagramPrivateApi.errorsMod.IgClientError
import typingsSlinky.request.mod.Options
import typingsSlinky.rxjs.mod.Subject
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @JSImport("instagram-private-api/dist/core/request", "Request")
  @js.native
  class Request protected () extends StObject {
    def this(client: IgApiClient) = this()
    
    var attemptOptions: PartialAttemptOptionsany = js.native
    
    var client: js.Any = js.native
    
    var defaults: Partial[Options] = js.native
    
    @JSName("end$")
    var end$: Subject[_] = js.native
    
    @JSName("error$")
    var error$: Subject[IgClientError] = js.native
    
    /* protected */ def faultTolerantRequest(options: Options): js.Promise[_] = js.native
    
    def getDefaultHeaders(): AcceptEncoding = js.native
    
    var handleResponseError: js.Any = js.native
    
    def send[T](userOptions: Options): js.Promise[IgResponse[T]] = js.native
    def send[T](userOptions: Options, onlyCheckHttpStatus: Boolean): js.Promise[IgResponse[T]] = js.native
    
    def sign(payload: Payload): SignedPost = js.native
    
    def signature(data: String): String = js.native
    
    var updateState: js.Any = js.native
    
    def userBreadcrumb(size: Double): String = js.native
  }
  /* static members */
  object Request {
    
    @JSImport("instagram-private-api/dist/core/request", "Request")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("instagram-private-api/dist/core/request", "Request.requestDebug")
    @js.native
    def requestDebug: js.Any = js.native
    @scala.inline
    def requestDebug_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestDebug")(x.asInstanceOf[js.Any])
    
    @JSImport("instagram-private-api/dist/core/request", "Request.requestTransform")
    @js.native
    def requestTransform: js.Any = js.native
    @scala.inline
    def requestTransform_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestTransform")(x.asInstanceOf[js.Any])
  }
  
  type Payload = StringDictionary[js.Any] | String
  
  @js.native
  trait SignedPost extends StObject {
    
    var ig_sig_key_version: String = js.native
    
    var signed_body: String = js.native
  }
  object SignedPost {
    
    @scala.inline
    def apply(ig_sig_key_version: String, signed_body: String): SignedPost = {
      val __obj = js.Dynamic.literal(ig_sig_key_version = ig_sig_key_version.asInstanceOf[js.Any], signed_body = signed_body.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignedPost]
    }
    
    @scala.inline
    implicit class SignedPostMutableBuilder[Self <: SignedPost] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIg_sig_key_version(value: String): Self = StObject.set(x, "ig_sig_key_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigned_body(value: String): Self = StObject.set(x, "signed_body", value.asInstanceOf[js.Any])
    }
  }
}
