package typingsSlinky.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends StObject {
  
  def handle(requestOptions: js.Any, next: js.Function): Unit = js.native
}
object Filter {
  
  @scala.inline
  def apply(handle: (js.Any, js.Function) => Unit): Filter = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction2(handle))
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandle(value: (js.Any, js.Function) => Unit): Self = StObject.set(x, "handle", js.Any.fromFunction2(value))
  }
}
