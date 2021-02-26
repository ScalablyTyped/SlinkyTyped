package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ItemSelectionChanged event.
  */
@js.native
trait ASPxClientDashboardItemSelectionChangedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets currently selected elements.
    */
  def GetCurrentSelection(): js.Array[ASPxClientDashboardItemDataAxisPointTuple] = js.native
  
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  var ItemName: String = js.native
}
object ASPxClientDashboardItemSelectionChangedEventArgs {
  
  @scala.inline
  def apply(GetCurrentSelection: () => js.Array[ASPxClientDashboardItemDataAxisPointTuple], ItemName: String): ASPxClientDashboardItemSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(GetCurrentSelection = js.Any.fromFunction0(GetCurrentSelection), ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemSelectionChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardItemSelectionChangedEventArgsMutableBuilder[Self <: ASPxClientDashboardItemSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCurrentSelection(value: () => js.Array[ASPxClientDashboardItemDataAxisPointTuple]): Self = StObject.set(x, "GetCurrentSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItemName(value: String): Self = StObject.set(x, "ItemName", value.asInstanceOf[js.Any])
  }
}
