package typingsSlinky.anyproxy

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<anyproxy.anyproxy.Response> */
  @js.native
  trait PartialResponse extends StObject {
    
    var body: js.UndefOr[js.Any] = js.native
    
    var header: js.UndefOr[Record[String, String]] = js.native
    
    var statusCode: js.UndefOr[Double] = js.native
  }
  object PartialResponse {
    
    @scala.inline
    def apply(): PartialResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialResponse]
    }
    
    @scala.inline
    implicit class PartialResponseMutableBuilder[Self <: PartialResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeader(value: Record[String, String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
}
