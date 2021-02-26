package typingsSlinky.httpBasic

import typingsSlinky.httpBasic.headersMod.Headers
import typingsSlinky.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cachedResponseMod {
  
  @js.native
  trait CachedResponse extends StObject {
    
    var body: ReadableStream = js.native
    
    var headers: Headers = js.native
    
    var requestHeaders: Headers = js.native
    
    var requestTimestamp: Double = js.native
    
    var statusCode: Double = js.native
  }
  object CachedResponse {
    
    @scala.inline
    def apply(
      body: ReadableStream,
      headers: Headers,
      requestHeaders: Headers,
      requestTimestamp: Double,
      statusCode: Double
    ): CachedResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], requestHeaders = requestHeaders.asInstanceOf[js.Any], requestTimestamp = requestTimestamp.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachedResponse]
    }
    
    @scala.inline
    implicit class CachedResponseMutableBuilder[Self <: CachedResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: ReadableStream): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestHeaders(value: Headers): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTimestamp(value: Double): Self = StObject.set(x, "requestTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
