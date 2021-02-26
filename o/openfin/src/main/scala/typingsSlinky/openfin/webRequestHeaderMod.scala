package typingsSlinky.openfin

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webRequestHeaderMod {
  
  type WebRequestHeader = StringDictionary[String]
  
  @js.native
  trait WebRequestHeaderConfig extends StObject {
    
    var headers: js.Array[WebRequestHeader] = js.native
    
    var urlPatterns: js.Array[String] = js.native
  }
  object WebRequestHeaderConfig {
    
    @scala.inline
    def apply(headers: js.Array[WebRequestHeader], urlPatterns: js.Array[String]): WebRequestHeaderConfig = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], urlPatterns = urlPatterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebRequestHeaderConfig]
    }
    
    @scala.inline
    implicit class WebRequestHeaderConfigMutableBuilder[Self <: WebRequestHeaderConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Array[WebRequestHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersVarargs(value: WebRequestHeader*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "urlPatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlPatternsVarargs(value: String*): Self = StObject.set(x, "urlPatterns", js.Array(value :_*))
    }
  }
}
