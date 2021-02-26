package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDateNavigator.SelectionChanged event.
  */
@js.native
trait ASPxClientDateNavigatorSelectionChangedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Returns the selected dates related to the event.
    */
  var selectedDates: js.Array[js.Date] = js.native
}
object ASPxClientDateNavigatorSelectionChangedEventArgs {
  
  @scala.inline
  def apply(selectedDates: js.Array[js.Date]): ASPxClientDateNavigatorSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(selectedDates = selectedDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDateNavigatorSelectionChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDateNavigatorSelectionChangedEventArgsMutableBuilder[Self <: ASPxClientDateNavigatorSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectedDates(value: js.Array[js.Date]): Self = StObject.set(x, "selectedDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedDatesVarargs(value: js.Date*): Self = StObject.set(x, "selectedDates", js.Array(value :_*))
  }
}
