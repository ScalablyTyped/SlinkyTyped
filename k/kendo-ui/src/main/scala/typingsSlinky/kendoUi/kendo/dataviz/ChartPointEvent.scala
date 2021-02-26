package typingsSlinky.kendoUi.kendo.dataviz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartPointEvent extends StObject {
  
  def isDefaultPrevented(): Boolean = js.native
  
  var preventDefault: js.Function = js.native
  
  var sender: ChartPoint = js.native
}
object ChartPointEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ChartPoint): ChartPointEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPointEvent]
  }
  
  @scala.inline
  implicit class ChartPointEventMutableBuilder[Self <: ChartPointEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: ChartPoint): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
