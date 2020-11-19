package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a method to apply a Multiple Operations Table to the cell range. */
@js.native
trait XMultipleOperation extends XInterface {
  
  /**
    * creates a table of formulas (a "Multiple Operations Table").
    *
    * The specified formulas are repeated, with references to the specified cells replaced by references to values in the first column and/or row of the
    * range.
    * @param aFormulaRange the range that contains formula cells (modes TableOperationMode::ROW or TableOperationMode::COLUMN) or a single formula cell (mode
    * @param nMode specifies the calculation mode to fill the cells.
    * @param aColumnCell contains the address of the cell that is referenced by formulas in a row (mode TableOperationMode::ROW) or by the formula cell used f
    * @param aRowCell contains the address of the cell that is referenced by formulas in a column (mode TableOperationMode::COLUMN) or by the formula cell use
    */
  def setTableOperation(
    aFormulaRange: CellRangeAddress,
    nMode: TableOperationMode,
    aColumnCell: CellAddress,
    aRowCell: CellAddress
  ): Unit = js.native
}
object XMultipleOperation {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTableOperation: (CellRangeAddress, TableOperationMode, CellAddress, CellAddress) => Unit
  ): XMultipleOperation = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTableOperation = js.Any.fromFunction4(setTableOperation))
    __obj.asInstanceOf[XMultipleOperation]
  }
  
  @scala.inline
  implicit class XMultipleOperationOps[Self <: XMultipleOperation] (val x: Self) extends AnyVal {
    
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
    def setSetTableOperation(value: (CellRangeAddress, TableOperationMode, CellAddress, CellAddress) => Unit): Self = this.set("setTableOperation", js.Any.fromFunction4(value))
  }
}
