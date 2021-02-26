package typingsSlinky.ethersprojectWeb

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait GetUrlResponse extends StObject {
    
    var body: js.typedarray.Uint8Array = js.native
    
    var headers: StringDictionary[String] = js.native
    
    var statusCode: Double = js.native
    
    var statusMessage: String = js.native
  }
  object GetUrlResponse {
    
    @scala.inline
    def apply(
      body: js.typedarray.Uint8Array,
      headers: StringDictionary[String],
      statusCode: Double,
      statusMessage: String
    ): GetUrlResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetUrlResponse]
    }
    
    @scala.inline
    implicit class GetUrlResponseMutableBuilder[Self <: GetUrlResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var allowGzip: js.UndefOr[Boolean] = js.native
    
    var body: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var method: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowGzip(value: Boolean): Self = StObject.set(x, "allowGzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowGzipUndefined: Self = StObject.set(x, "allowGzip", js.undefined)
      
      @scala.inline
      def setBody(value: js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
}
