package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDateNavigator.VisibleMonthChanged event.
  */
@js.native
trait ASPxClientDateNavigatorVisibleMonthChangedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Returns the end date of the latest visible month.
    */
  var endDate: js.Date = js.native
  
  /**
    * Returns the start date of the latest visible month.
    */
  var startDate: js.Date = js.native
}
object ASPxClientDateNavigatorVisibleMonthChangedEventArgs {
  
  @scala.inline
  def apply(endDate: js.Date, startDate: js.Date): ASPxClientDateNavigatorVisibleMonthChangedEventArgs = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDateNavigatorVisibleMonthChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDateNavigatorVisibleMonthChangedEventArgsMutableBuilder[Self <: ASPxClientDateNavigatorVisibleMonthChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
  }
}
