package typingsSlinky.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofgen extends StObject {
  
  def handler_3(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  val options_6: Typeofoptions6 = js.native
}
object Typeofgen {
  
  @scala.inline
  def apply(handler_3: (js.Any, js.Any) => js.Promise[_], options_6: Typeofoptions6): Typeofgen = {
    val __obj = js.Dynamic.literal(handler_3 = js.Any.fromFunction2(handler_3), options_6 = options_6.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofgen]
  }
  
  @scala.inline
  implicit class TypeofgenMutableBuilder[Self <: Typeofgen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler_3(value: (js.Any, js.Any) => js.Promise[_]): Self = StObject.set(x, "handler_3", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_6(value: Typeofoptions6): Self = StObject.set(x, "options_6", value.asInstanceOf[js.Any])
  }
}
