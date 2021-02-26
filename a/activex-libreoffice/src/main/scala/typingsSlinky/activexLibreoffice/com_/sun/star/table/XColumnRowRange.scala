package typingsSlinky.activexLibreoffice.com_.sun.star.table

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access the collections of columns and rows of a cell range.
  * @see com.sun.star.table.CellRange
  */
@js.native
trait XColumnRowRange extends XInterface {
  
  /**
    * returns the collection of columns in the range.
    * @see com.sun.star.table.TableColumns
    */
  val Columns: XTableColumns = js.native
  
  /**
    * returns the collection of rows in the range.
    * @see com.sun.star.table.TableRows
    */
  val Rows: XTableRows = js.native
  
  /**
    * returns the collection of columns in the range.
    * @see com.sun.star.table.TableColumns
    */
  def getColumns(): XTableColumns = js.native
  
  /**
    * returns the collection of rows in the range.
    * @see com.sun.star.table.TableRows
    */
  def getRows(): XTableRows = js.native
}
object XColumnRowRange {
  
  @scala.inline
  def apply(
    Columns: XTableColumns,
    Rows: XTableRows,
    acquire: () => Unit,
    getColumns: () => XTableColumns,
    getRows: () => XTableRows,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XColumnRowRange = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getColumns = js.Any.fromFunction0(getColumns), getRows = js.Any.fromFunction0(getRows), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XColumnRowRange]
  }
  
  @scala.inline
  implicit class XColumnRowRangeMutableBuilder[Self <: XColumnRowRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: XTableColumns): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetColumns(value: () => XTableColumns): Self = StObject.set(x, "getColumns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRows(value: () => XTableRows): Self = StObject.set(x, "getRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRows(value: XTableRows): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
  }
}
