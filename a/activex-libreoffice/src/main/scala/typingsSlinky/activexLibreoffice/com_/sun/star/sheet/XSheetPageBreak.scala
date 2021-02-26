package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to page breaks in a sheet.
  * @deprecated Deprecated
  */
@js.native
trait XSheetPageBreak extends XInterface {
  
  /**
    * returns a sequence of descriptions of all horizontal page breaks on the sheet.
    *
    * This includes manual and automatic page breaks. To add or remove manual breaks, use the {@link com.sun.star.table.TableColumn.IsStartOfNewPage}
    * property of the column.
    * @returns a sequence of structs containing column page break data.
    */
  val ColumnPageBreaks: SafeArray[TablePageBreakData] = js.native
  
  /**
    * returns a sequence of descriptions of all vertical page breaks on the sheet.
    *
    * This includes manual and automatic page breaks. To add or remove manual breaks, use the {@link com.sun.star.table.TableRow.IsStartOfNewPage} property
    * of the row.
    * @returns a sequence of structs containing row page break data.
    */
  val RowPageBreaks: SafeArray[TablePageBreakData] = js.native
  
  /**
    * returns a sequence of descriptions of all horizontal page breaks on the sheet.
    *
    * This includes manual and automatic page breaks. To add or remove manual breaks, use the {@link com.sun.star.table.TableColumn.IsStartOfNewPage}
    * property of the column.
    * @returns a sequence of structs containing column page break data.
    */
  def getColumnPageBreaks(): SafeArray[TablePageBreakData] = js.native
  
  /**
    * returns a sequence of descriptions of all vertical page breaks on the sheet.
    *
    * This includes manual and automatic page breaks. To add or remove manual breaks, use the {@link com.sun.star.table.TableRow.IsStartOfNewPage} property
    * of the row.
    * @returns a sequence of structs containing row page break data.
    */
  def getRowPageBreaks(): SafeArray[TablePageBreakData] = js.native
  
  /** removes all manual page breaks on the sheet. */
  def removeAllManualPageBreaks(): Unit = js.native
}
object XSheetPageBreak {
  
  @scala.inline
  def apply(
    ColumnPageBreaks: SafeArray[TablePageBreakData],
    RowPageBreaks: SafeArray[TablePageBreakData],
    acquire: () => Unit,
    getColumnPageBreaks: () => SafeArray[TablePageBreakData],
    getRowPageBreaks: () => SafeArray[TablePageBreakData],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeAllManualPageBreaks: () => Unit
  ): XSheetPageBreak = {
    val __obj = js.Dynamic.literal(ColumnPageBreaks = ColumnPageBreaks.asInstanceOf[js.Any], RowPageBreaks = RowPageBreaks.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getColumnPageBreaks = js.Any.fromFunction0(getColumnPageBreaks), getRowPageBreaks = js.Any.fromFunction0(getRowPageBreaks), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAllManualPageBreaks = js.Any.fromFunction0(removeAllManualPageBreaks))
    __obj.asInstanceOf[XSheetPageBreak]
  }
  
  @scala.inline
  implicit class XSheetPageBreakMutableBuilder[Self <: XSheetPageBreak] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnPageBreaks(value: SafeArray[TablePageBreakData]): Self = StObject.set(x, "ColumnPageBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetColumnPageBreaks(value: () => SafeArray[TablePageBreakData]): Self = StObject.set(x, "getColumnPageBreaks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRowPageBreaks(value: () => SafeArray[TablePageBreakData]): Self = StObject.set(x, "getRowPageBreaks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveAllManualPageBreaks(value: () => Unit): Self = StObject.set(x, "removeAllManualPageBreaks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRowPageBreaks(value: SafeArray[TablePageBreakData]): Self = StObject.set(x, "RowPageBreaks", value.asInstanceOf[js.Any])
  }
}
