package typingsSlinky.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofrmAll extends StObject {
  
  def handler_2(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  val options_8: Typeofoptions8 = js.native
}
object TypeofrmAll {
  
  @scala.inline
  def apply(handler_2: (js.Any, js.Any) => js.Promise[_], options_8: Typeofoptions8): TypeofrmAll = {
    val __obj = js.Dynamic.literal(handler_2 = js.Any.fromFunction2(handler_2), options_8 = options_8.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofrmAll]
  }
  
  @scala.inline
  implicit class TypeofrmAllMutableBuilder[Self <: TypeofrmAll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler_2(value: (js.Any, js.Any) => js.Promise[_]): Self = StObject.set(x, "handler_2", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_8(value: Typeofoptions8): Self = StObject.set(x, "options_8", value.asInstanceOf[js.Any])
  }
}
