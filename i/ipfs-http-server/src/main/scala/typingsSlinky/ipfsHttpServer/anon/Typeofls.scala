package typingsSlinky.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofls extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  val options: Typeofoptions = js.native
}
object Typeofls {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Promise[_], options: Typeofoptions): Typeofls = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofls]
  }
  
  @scala.inline
  implicit class TypeoflsMutableBuilder[Self <: Typeofls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: (js.Any, js.Any) => js.Promise[_]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions(value: Typeofoptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
