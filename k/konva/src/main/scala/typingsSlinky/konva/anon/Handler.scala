package typingsSlinky.konva.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handler extends StObject {
  
  var handler: js.Function = js.native
  
  var name: String = js.native
}
object Handler {
  
  @scala.inline
  def apply(handler: js.Function, name: String): Handler = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
  
  @scala.inline
  implicit class HandlerMutableBuilder[Self <: Handler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: js.Function): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
