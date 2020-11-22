package typingsSlinky.awsSdkFetchHttpHandler.fetchHttpHandlerMod

import typingsSlinky.awsSdkFetchHttpHandler.anon.Response
import typingsSlinky.awsSdkProtocolHttp.httpRequestMod.HttpRequest
import typingsSlinky.awsSdkProtocolHttp.httpResponseMod.HttpResponse
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.transferMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/fetch-http-handler/dist/cjs/fetch-http-handler", "FetchHttpHandler")
@js.native
class FetchHttpHandler () extends RequestHandler[HttpRequest, HttpResponse, HttpHandlerOptions] {
  def this(httpOptions: BrowserHttpOptions) = this()
  
  @JSName("destroy")
  def destroy_MFetchHttpHandler(): Unit = js.native
  
  def handle(request: typingsSlinky.awsSdkProtocolHttp.mod.HttpRequest, options: HttpHandlerOptions): js.Promise[Response] = js.native
  
  val httpOptions: js.Any = js.native
}
