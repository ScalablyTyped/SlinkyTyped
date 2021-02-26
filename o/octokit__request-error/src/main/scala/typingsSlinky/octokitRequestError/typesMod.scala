package typingsSlinky.octokitRequestError

import typingsSlinky.octokitTypes.requestOptionsMod.RequestOptions
import typingsSlinky.octokitTypes.responseHeadersMod.ResponseHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait RequestErrorOptions extends StObject {
    
    var headers: js.UndefOr[ResponseHeaders] = js.native
    
    var request: RequestOptions = js.native
  }
  object RequestErrorOptions {
    
    @scala.inline
    def apply(request: RequestOptions): RequestErrorOptions = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestErrorOptions]
    }
    
    @scala.inline
    implicit class RequestErrorOptionsMutableBuilder[Self <: RequestErrorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: ResponseHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setRequest(value: RequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
}
