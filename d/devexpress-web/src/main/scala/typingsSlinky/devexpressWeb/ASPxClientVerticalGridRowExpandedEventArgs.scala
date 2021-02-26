package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.RowExpandedChanged event.
  */
@js.native
trait ASPxClientVerticalGridRowExpandedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the expanded row.
    */
  var row: ASPxClientVerticalGridRow = js.native
}
object ASPxClientVerticalGridRowExpandedEventArgs {
  
  @scala.inline
  def apply(row: ASPxClientVerticalGridRow): ASPxClientVerticalGridRowExpandedEventArgs = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridRowExpandedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientVerticalGridRowExpandedEventArgsMutableBuilder[Self <: ASPxClientVerticalGridRowExpandedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRow(value: ASPxClientVerticalGridRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
