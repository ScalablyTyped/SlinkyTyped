package typingsSlinky.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoflinks extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  val options_10: Typeofoptions10 = js.native
}
object Typeoflinks {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Promise[_], options_10: Typeofoptions10): Typeoflinks = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_10 = options_10.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoflinks]
  }
  
  @scala.inline
  implicit class TypeoflinksMutableBuilder[Self <: Typeoflinks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: (js.Any, js.Any) => js.Promise[_]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_10(value: Typeofoptions10): Self = StObject.set(x, "options_10", value.asInstanceOf[js.Any])
  }
}
