package typingsSlinky.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcat extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  val options: Typeofoptions = js.native
}
object Typeofcat {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Promise[_], options: Typeofoptions): Typeofcat = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcat]
  }
  
  @scala.inline
  implicit class TypeofcatMutableBuilder[Self <: Typeofcat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: (js.Any, js.Any) => js.Promise[_]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions(value: Typeofoptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
