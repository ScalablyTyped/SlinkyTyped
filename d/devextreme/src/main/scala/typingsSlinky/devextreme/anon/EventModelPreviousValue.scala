package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.events.event
import typingsSlinky.devextreme.mod.DevExpress.viz.dxRangeSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventModelPreviousValue extends StObject {
  
  var component: js.UndefOr[dxRangeSelector] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var event: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.events.event] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var previousValue: js.UndefOr[js.Array[Double | String | js.Date]] = js.native
  
  var value: js.UndefOr[js.Array[Double | String | js.Date]] = js.native
}
object EventModelPreviousValue {
  
  @scala.inline
  def apply(): EventModelPreviousValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventModelPreviousValue]
  }
  
  @scala.inline
  implicit class EventModelPreviousValueMutableBuilder[Self <: EventModelPreviousValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxRangeSelector): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setPreviousValue(value: js.Array[Double | String | js.Date]): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousValueUndefined: Self = StObject.set(x, "previousValue", js.undefined)
    
    @scala.inline
    def setPreviousValueVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "previousValue", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[Double | String | js.Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
