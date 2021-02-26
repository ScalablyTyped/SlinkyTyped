package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsEventsOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
    * is added to the chart.
    */
  var add: js.UndefOr[EventCallbackFunction[Annotation]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
    * is updated (e.g. drag and droppped or resized by control points).
    */
  var afterUpdate: js.UndefOr[EventCallbackFunction[Annotation]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Event callback when annotation
    * is removed from the chart.
    */
  var remove: js.UndefOr[EventCallbackFunction[Annotation]] = js.native
}
object AnnotationsEventsOptions {
  
  @scala.inline
  def apply(): AnnotationsEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsEventsOptions]
  }
  
  @scala.inline
  implicit class AnnotationsEventsOptionsMutableBuilder[Self <: AnnotationsEventsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: EventCallbackFunction[Annotation]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setAfterUpdate(value: EventCallbackFunction[Annotation]): Self = StObject.set(x, "afterUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUpdateUndefined: Self = StObject.set(x, "afterUpdate", js.undefined)
    
    @scala.inline
    def setRemove(value: EventCallbackFunction[Annotation]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
  }
}
