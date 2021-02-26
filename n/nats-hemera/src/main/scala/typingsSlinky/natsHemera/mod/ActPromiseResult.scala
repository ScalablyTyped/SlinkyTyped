package typingsSlinky.natsHemera.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActPromiseResult[T] extends StObject {
  
  var context: Hemera[ClientRequest, ClientResponse] = js.native
  
  var data: T = js.native
}
object ActPromiseResult {
  
  @scala.inline
  def apply[T](context: Hemera[ClientRequest, ClientResponse], data: T): ActPromiseResult[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActPromiseResult[T]]
  }
  
  @scala.inline
  implicit class ActPromiseResultMutableBuilder[Self <: ActPromiseResult[_], T] (val x: Self with ActPromiseResult[T]) extends AnyVal {
    
    @scala.inline
    def setContext(value: Hemera[ClientRequest, ClientResponse]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
