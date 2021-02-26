package typingsSlinky.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodOptions extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Any = js.native
  
  var method: String = js.native
  
  var options: Payload = js.native
  
  var path: String = js.native
}
object MethodOptions {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Any, method: String, options: Payload, path: String): MethodOptions = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodOptions]
  }
  
  @scala.inline
  implicit class MethodOptionsMutableBuilder[Self <: MethodOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Payload): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
