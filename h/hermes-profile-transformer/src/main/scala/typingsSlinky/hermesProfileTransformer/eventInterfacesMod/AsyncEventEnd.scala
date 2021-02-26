package typingsSlinky.hermesProfileTransformer.eventInterfacesMod

import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_END
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncEventEnd
  extends AsyncEvent
     with SharedEventProperties {
  
  var id: Double = js.native
  
  @JSName("ph")
  var ph_AsyncEventEnd: ASYNC_EVENTS_NESTABLE_END = js.native
  
  var scope: js.UndefOr[String] = js.native
}
object AsyncEventEnd {
  
  @scala.inline
  def apply(id: Double, ph: ASYNC_EVENTS_NESTABLE_END): AsyncEventEnd = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEventEnd]
  }
  
  @scala.inline
  implicit class AsyncEventEndMutableBuilder[Self <: AsyncEventEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPh(value: ASYNC_EVENTS_NESTABLE_END): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
