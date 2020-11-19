package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ASPxClientSpreadsheetPopupMenuType extends js.Object
/**
  * Lists values that identify the context menu type.
  */
@JSGlobal("ASPxClientSpreadsheetPopupMenuType")
@js.native
object ASPxClientSpreadsheetPopupMenuType extends js.Object {
  
  /**
    * Specifies a context menu which can be invoked by clicking the AutoFilter drop-down arrow.
    */
  @js.native
  sealed trait AutoFilter extends ASPxClientSpreadsheetPopupMenuType
  
  /**
    * Specifies a context menu which can be invoked by right-clicking any cell in a worksheet.
    */
  @js.native
  sealed trait Cell extends ASPxClientSpreadsheetPopupMenuType
  
  /**
    * Specifies a context menu which can be invoked by right-clicking a chart in a worksheet.
    */
  @js.native
  sealed trait Chart extends ASPxClientSpreadsheetPopupMenuType
  
  /**
    * Specifies a context menu which can be invoked by right-clicking a column header.
    */
  @js.native
  sealed trait ColumnHeading extends ASPxClientSpreadsheetPopupMenuType
  
  /**
    * Specifies a context menu which can be invoked by right-clicking a picture embedded in a worksheet.
    */
  @js.native
  sealed trait Picture extends ASPxClientSpreadsheetPopupMenuType
  
  /**
    * Specifies a context menu which can be invoked by right-clicking any cell in a pivot table.
    */
  @js.native
  sealed trait PivotTable extends ASPxClientSpreadsheetPopupMenuType
  
  /**
    * Specifies a context menu which can be invoked by clicking the AutoFilter drop-down arrow on the row or column label of a pivot table.
    */
  @js.native
  sealed trait PivotTableAutoFilter extends ASPxClientSpreadsheetPopupMenuType
  
  /**
    * Specifies a context menu which can be invoked by right-clicking a row header.
    */
  @js.native
  sealed trait RowHeading extends ASPxClientSpreadsheetPopupMenuType
  
  /**
    * Specifies a context menu which can be invoked by right-clicking a worksheet tab.
    */
  @js.native
  sealed trait SheetTab extends ASPxClientSpreadsheetPopupMenuType
}
