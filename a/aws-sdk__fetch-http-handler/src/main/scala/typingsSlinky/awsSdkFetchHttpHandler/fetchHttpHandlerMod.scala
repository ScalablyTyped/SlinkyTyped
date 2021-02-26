package typingsSlinky.awsSdkFetchHttpHandler

import typingsSlinky.awsSdkFetchHttpHandler.anon.Response
import typingsSlinky.awsSdkProtocolHttp.httpRequestMod.HttpRequest
import typingsSlinky.awsSdkProtocolHttp.httpResponseMod.HttpResponse
import typingsSlinky.awsSdkTypes.httpMod.HttpHandlerOptions
import typingsSlinky.awsSdkTypes.transferMod.RequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchHttpHandlerMod {
  
  @JSImport("@aws-sdk/fetch-http-handler/dist/cjs/fetch-http-handler", "FetchHttpHandler")
  @js.native
  class FetchHttpHandler () extends RequestHandler[HttpRequest, HttpResponse, HttpHandlerOptions] {
    def this(httpOptions: BrowserHttpOptions) = this()
    
    @JSName("destroy")
    def destroy_MFetchHttpHandler(): Unit = js.native
    
    def handle(request: typingsSlinky.awsSdkProtocolHttp.mod.HttpRequest, options: HttpHandlerOptions): js.Promise[Response] = js.native
    
    val httpOptions: js.Any = js.native
  }
  
  @js.native
  trait BrowserHttpOptions extends StObject {
    
    /**
      * The number of milliseconds a request can take before being automatically
      * terminated.
      */
    var requestTimeout: js.UndefOr[Double] = js.native
  }
  object BrowserHttpOptions {
    
    @scala.inline
    def apply(): BrowserHttpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserHttpOptions]
    }
    
    @scala.inline
    implicit class BrowserHttpOptionsMutableBuilder[Self <: BrowserHttpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    }
  }
}
