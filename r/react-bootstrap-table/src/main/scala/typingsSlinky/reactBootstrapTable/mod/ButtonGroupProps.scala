package typingsSlinky.reactBootstrapTable.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonGroupProps extends StObject {
  
  /**
    * Delete button.
    */
  var deleteBtn: ReactElement = js.native
  
  /**
    * Export to CSV button.
    */
  var exportCSVBtn: ReactElement = js.native
  
  /**
    * Insert button (to add a row).
    */
  var insertBtn: ReactElement = js.native
  
  /**
    * Toggle button to switch between showing all rows and showing selected rows only.
    */
  var showSelectedOnlyBtn: ReactElement = js.native
}
object ButtonGroupProps {
  
  @scala.inline
  def apply(
    deleteBtn: ReactElement,
    exportCSVBtn: ReactElement,
    insertBtn: ReactElement,
    showSelectedOnlyBtn: ReactElement
  ): ButtonGroupProps = {
    val __obj = js.Dynamic.literal(deleteBtn = deleteBtn.asInstanceOf[js.Any], exportCSVBtn = exportCSVBtn.asInstanceOf[js.Any], insertBtn = insertBtn.asInstanceOf[js.Any], showSelectedOnlyBtn = showSelectedOnlyBtn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupProps]
  }
  
  @scala.inline
  implicit class ButtonGroupPropsMutableBuilder[Self <: ButtonGroupProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteBtn(value: ReactElement): Self = StObject.set(x, "deleteBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportCSVBtn(value: ReactElement): Self = StObject.set(x, "exportCSVBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertBtn(value: ReactElement): Self = StObject.set(x, "insertBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSelectedOnlyBtn(value: ReactElement): Self = StObject.set(x, "showSelectedOnlyBtn", value.asInstanceOf[js.Any])
  }
}
