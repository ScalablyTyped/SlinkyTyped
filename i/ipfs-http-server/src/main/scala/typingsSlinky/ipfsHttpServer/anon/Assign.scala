package typingsSlinky.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assign extends StObject {
  
  var assign: String = js.native
  
  def method(request: js.Any, _h: js.Any): js.Promise[Data] = js.native
}
object Assign {
  
  @scala.inline
  def apply(assign: String, method: (js.Any, js.Any) => js.Promise[Data]): Assign = {
    val __obj = js.Dynamic.literal(assign = assign.asInstanceOf[js.Any], method = js.Any.fromFunction2(method))
    __obj.asInstanceOf[Assign]
  }
  
  @scala.inline
  implicit class AssignMutableBuilder[Self <: Assign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssign(value: String): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: (js.Any, js.Any) => js.Promise[Data]): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
  }
}
