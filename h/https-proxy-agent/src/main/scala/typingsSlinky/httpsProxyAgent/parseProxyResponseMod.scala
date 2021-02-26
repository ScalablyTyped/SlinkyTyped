package typingsSlinky.httpsProxyAgent

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseProxyResponseMod {
  
  @JSImport("https-proxy-agent/dist/parse-proxy-response", JSImport.Default)
  @js.native
  def default(socket: Readable): js.Promise[ProxyResponse] = js.native
  
  @js.native
  trait ProxyResponse extends StObject {
    
    var buffered: Buffer = js.native
    
    var statusCode: Double = js.native
  }
  object ProxyResponse {
    
    @scala.inline
    def apply(buffered: Buffer, statusCode: Double): ProxyResponse = {
      val __obj = js.Dynamic.literal(buffered = buffered.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyResponse]
    }
    
    @scala.inline
    implicit class ProxyResponseMutableBuilder[Self <: ProxyResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffered(value: Buffer): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
