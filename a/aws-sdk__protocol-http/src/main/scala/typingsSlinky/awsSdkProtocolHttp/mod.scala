package typingsSlinky.awsSdkProtocolHttp

import typingsSlinky.awsSdkProtocolHttp.httpRequestMod.HttpRequestOptions
import typingsSlinky.awsSdkProtocolHttp.httpResponseMod.HttpResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/protocol-http", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def isValidHostname(hostname: String): Boolean = js.native
  
  @js.native
  class HttpRequest protected ()
    extends typingsSlinky.awsSdkProtocolHttp.httpRequestMod.HttpRequest {
    def this(options: HttpRequestOptions) = this()
  }
  /* static members */
  @js.native
  object HttpRequest extends js.Object {
    
    def isInstance(request: js.Any): /* is @aws-sdk/protocol-http.@aws-sdk/protocol-http/dist/cjs/httpRequest.HttpRequest */ Boolean = js.native
  }
  
  @js.native
  class HttpResponse protected ()
    extends typingsSlinky.awsSdkProtocolHttp.httpResponseMod.HttpResponse {
    def this(options: HttpResponseOptions) = this()
  }
  /* static members */
  @js.native
  object HttpResponse extends js.Object {
    
    def isInstance(response: js.Any): /* is @aws-sdk/protocol-http.@aws-sdk/protocol-http/dist/cjs/httpResponse.HttpResponse */ Boolean = js.native
  }
}
