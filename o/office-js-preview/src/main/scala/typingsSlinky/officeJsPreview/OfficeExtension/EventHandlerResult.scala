package typingsSlinky.officeJsPreview.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventHandlerResult[T] extends StObject {
  
  /** The request context associated with the object */
  var context: ClientRequestContext = js.native
  
  def remove(): Unit = js.native
}
object EventHandlerResult {
  
  @scala.inline
  def apply[T](context: ClientRequestContext, remove: () => Unit): EventHandlerResult[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[EventHandlerResult[T]]
  }
  
  @scala.inline
  implicit class EventHandlerResultMutableBuilder[Self <: EventHandlerResult[_], T] (val x: Self with EventHandlerResult[T]) extends AnyVal {
    
    @scala.inline
    def setContext(value: ClientRequestContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
