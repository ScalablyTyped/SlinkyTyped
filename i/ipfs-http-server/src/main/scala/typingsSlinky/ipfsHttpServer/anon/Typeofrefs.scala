package typingsSlinky.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofrefs extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  val options_8: Typeofoptions8 = js.native
}
object Typeofrefs {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Promise[_], options_8: Typeofoptions8): Typeofrefs = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_8 = options_8.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofrefs]
  }
  
  @scala.inline
  implicit class TypeofrefsMutableBuilder[Self <: Typeofrefs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: (js.Any, js.Any) => js.Promise[_]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_8(value: Typeofoptions8): Self = StObject.set(x, "options_8", value.asInstanceOf[js.Any])
  }
}
