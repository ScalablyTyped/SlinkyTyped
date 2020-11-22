package typingsSlinky.awsSdkProtocolHttp

import typingsSlinky.awsSdkProtocolHttp.httpRequestMod.HttpRequest
import typingsSlinky.awsSdkProtocolHttp.httpResponseMod.HttpResponse
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.transferMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/protocol-http/dist/cjs/httpHandler", JSImport.Namespace)
@js.native
object httpHandlerMod extends js.Object {
  
  type HttpHandler = RequestHandler[HttpRequest, HttpResponse, HttpHandlerOptions]
}
