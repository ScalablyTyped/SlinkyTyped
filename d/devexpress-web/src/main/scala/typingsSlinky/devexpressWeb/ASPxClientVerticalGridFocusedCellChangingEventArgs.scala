package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.FocusedCellChanging event.
  */
@js.native
trait ASPxClientVerticalGridFocusedCellChangingEventArgs extends ASPxClientCancelEventArgs {
  
  /**
    * Provides information on a cell currently being focused.
    */
  var cellInfo: ASPxClientVerticalGridCellInfo = js.native
}
object ASPxClientVerticalGridFocusedCellChangingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, cellInfo: ASPxClientVerticalGridCellInfo): ASPxClientVerticalGridFocusedCellChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cellInfo = cellInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridFocusedCellChangingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientVerticalGridFocusedCellChangingEventArgsMutableBuilder[Self <: ASPxClientVerticalGridFocusedCellChangingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellInfo(value: ASPxClientVerticalGridCellInfo): Self = StObject.set(x, "cellInfo", value.asInstanceOf[js.Any])
  }
}
