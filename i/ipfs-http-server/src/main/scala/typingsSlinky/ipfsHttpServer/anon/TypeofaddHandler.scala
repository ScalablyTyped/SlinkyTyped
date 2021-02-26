package typingsSlinky.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofaddHandler extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Any = js.native
  
  val options_4: Typeofoptions4Validate2 = js.native
}
object TypeofaddHandler {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Any, options_4: Typeofoptions4Validate2): TypeofaddHandler = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_4 = options_4.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofaddHandler]
  }
  
  @scala.inline
  implicit class TypeofaddHandlerMutableBuilder[Self <: TypeofaddHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_4(value: Typeofoptions4Validate2): Self = StObject.set(x, "options_4", value.asInstanceOf[js.Any])
  }
}
