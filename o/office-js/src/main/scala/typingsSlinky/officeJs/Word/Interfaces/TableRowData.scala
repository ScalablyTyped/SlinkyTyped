package typingsSlinky.officeJs.Word.Interfaces

import typingsSlinky.officeJs.Word.Alignment
import typingsSlinky.officeJs.Word.VerticalAlignment
import typingsSlinky.officeJs.officeJsStrings.Bottom
import typingsSlinky.officeJs.officeJsStrings.Center
import typingsSlinky.officeJs.officeJsStrings.Centered
import typingsSlinky.officeJs.officeJsStrings.Justified
import typingsSlinky.officeJs.officeJsStrings.Left
import typingsSlinky.officeJs.officeJsStrings.Mixed
import typingsSlinky.officeJs.officeJsStrings.Right
import typingsSlinky.officeJs.officeJsStrings.Top
import typingsSlinky.officeJs.officeJsStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tableRow.toJSON()`. */
@js.native
trait TableRowData extends js.Object {
  
  /**
    *
    * Gets the number of cells in the row. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var cellCount: js.UndefOr[Double] = js.native
  
  /**
    *
    * Gets cells. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var cells: js.UndefOr[js.Array[TableCellData]] = js.native
  
  /**
    *
    * Gets the font. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var font: js.UndefOr[FontData] = js.native
  
  /**
    *
    * Gets and sets the horizontal alignment of every cell in the row. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified] = js.native
  
  /**
    *
    * Checks whether the row is a header row. Read-only. To set the number of header rows, use HeaderRowCount on the Table object.
    *
    * [Api set: WordApi 1.3]
    */
  var isHeader: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets and sets the preferred height of the row in points.
    *
    * [Api set: WordApi 1.3]
    */
  var preferredHeight: js.UndefOr[Double] = js.native
  
  /**
    *
    * Gets the index of the row in its parent table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var rowIndex: js.UndefOr[Double] = js.native
  
  /**
    *
    * Gets and sets the shading color. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets and sets the text values in the row, as a 2D Javascript array.
    *
    * [Api set: WordApi 1.3]
    */
  var values: js.UndefOr[js.Array[js.Array[String]]] = js.native
  
  /**
    *
    * Gets and sets the vertical alignment of the cells in the row. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | Mixed | Top | Center | Bottom] = js.native
}
object TableRowData {
  
  @scala.inline
  def apply(): TableRowData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowData]
  }
  
  @scala.inline
  implicit class TableRowDataOps[Self <: TableRowData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCellCount(value: Double): Self = this.set("cellCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellCount: Self = this.set("cellCount", js.undefined)
    
    @scala.inline
    def setCellsVarargs(value: TableCellData*): Self = this.set("cells", js.Array(value :_*))
    
    @scala.inline
    def setCells(value: js.Array[TableCellData]): Self = this.set("cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCells: Self = this.set("cells", js.undefined)
    
    @scala.inline
    def setFont(value: FontData): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    
    @scala.inline
    def setIsHeader(value: Boolean): Self = this.set("isHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHeader: Self = this.set("isHeader", js.undefined)
    
    @scala.inline
    def setPreferredHeight(value: Double): Self = this.set("preferredHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredHeight: Self = this.set("preferredHeight", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    
    @scala.inline
    def setShadingColor(value: String): Self = this.set("shadingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadingColor: Self = this.set("shadingColor", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Array[String]*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[js.Array[String]]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: VerticalAlignment | Mixed | Top | Center | Bottom): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
  }
}
