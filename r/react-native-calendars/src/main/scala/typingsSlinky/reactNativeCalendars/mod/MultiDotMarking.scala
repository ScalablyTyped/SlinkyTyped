package typingsSlinky.reactNativeCalendars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiDotMarking extends Marking {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var dots: js.Array[CalendarDot] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var selectedColor: js.UndefOr[String] = js.native
}
object MultiDotMarking {
  
  @scala.inline
  def apply(dots: js.Array[CalendarDot]): MultiDotMarking = {
    val __obj = js.Dynamic.literal(dots = dots.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiDotMarking]
  }
  
  @scala.inline
  implicit class MultiDotMarkingMutableBuilder[Self <: MultiDotMarking] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDots(value: js.Array[CalendarDot]): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotsVarargs(value: CalendarDot*): Self = StObject.set(x, "dots", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
