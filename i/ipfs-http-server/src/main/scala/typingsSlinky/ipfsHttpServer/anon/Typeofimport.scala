package typingsSlinky.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofimport extends StObject {
  
  def handler_4(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  val options_8: Typeofoptions8 = js.native
}
object Typeofimport {
  
  @scala.inline
  def apply(handler_4: (js.Any, js.Any) => js.Promise[_], options_8: Typeofoptions8): Typeofimport = {
    val __obj = js.Dynamic.literal(handler_4 = js.Any.fromFunction2(handler_4), options_8 = options_8.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofimport]
  }
  
  @scala.inline
  implicit class TypeofimportMutableBuilder[Self <: Typeofimport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler_4(value: (js.Any, js.Any) => js.Promise[_]): Self = StObject.set(x, "handler_4", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_8(value: Typeofoptions8): Self = StObject.set(x, "options_8", value.asInstanceOf[js.Any])
  }
}
