package typingsSlinky.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2UiElementsTableCardRow extends StObject {
  
  /**
    * Cells in this row. The first 3 cells are guaranteed to be shown but
    * others might be cut on certain surfaces. Please test with the simulator
    * to see which cells will be shown for a given surface.
    */
  var cells: js.UndefOr[js.Array[GoogleActionsV2UiElementsTableCardCell]] = js.native
  
  /**
    * Indicates whether there should be a divider after each row.
    */
  var dividerAfter: js.UndefOr[Boolean] = js.native
}
object GoogleActionsV2UiElementsTableCardRow {
  
  @scala.inline
  def apply(): GoogleActionsV2UiElementsTableCardRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsTableCardRow]
  }
  
  @scala.inline
  implicit class GoogleActionsV2UiElementsTableCardRowMutableBuilder[Self <: GoogleActionsV2UiElementsTableCardRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCells(value: js.Array[GoogleActionsV2UiElementsTableCardCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    @scala.inline
    def setCellsVarargs(value: GoogleActionsV2UiElementsTableCardCell*): Self = StObject.set(x, "cells", js.Array(value :_*))
    
    @scala.inline
    def setDividerAfter(value: Boolean): Self = StObject.set(x, "dividerAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDividerAfterUndefined: Self = StObject.set(x, "dividerAfter", js.undefined)
  }
}
