package typingsSlinky.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a cell in a OneNote table.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait TableCellLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the index of the cell in its row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var cellIndex: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the ID of the cell. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the collection of Paragraph objects in the TableCell.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[ParagraphCollectionLoadOptions] = js.native
  
  /**
    *
    * Gets the parent row of the cell.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentRow: js.UndefOr[TableRowLoadOptions] = js.native
  
  /**
    *
    * Gets the index of the cell's row in the table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var rowIndex: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets and sets the shading color of the cell
    *
    * [Api set: OneNoteApi 1.1]
    */
  var shadingColor: js.UndefOr[Boolean] = js.native
}
object TableCellLoadOptions {
  
  @scala.inline
  def apply(): TableCellLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellLoadOptions]
  }
  
  @scala.inline
  implicit class TableCellLoadOptionsMutableBuilder[Self <: TableCellLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setCellIndex(value: Boolean): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setParagraphs(value: ParagraphCollectionLoadOptions): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphsUndefined: Self = StObject.set(x, "paragraphs", js.undefined)
    
    @scala.inline
    def setParentRow(value: TableRowLoadOptions): Self = StObject.set(x, "parentRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRowUndefined: Self = StObject.set(x, "parentRow", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Boolean): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    @scala.inline
    def setShadingColor(value: Boolean): Self = StObject.set(x, "shadingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadingColorUndefined: Self = StObject.set(x, "shadingColor", js.undefined)
  }
}
