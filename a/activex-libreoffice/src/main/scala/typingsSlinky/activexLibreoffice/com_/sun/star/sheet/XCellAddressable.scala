package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a cell which can be addressed with a {@link com.sun.star.table.CellAddress} . */
@js.native
trait XCellAddressable extends XInterface {
  
  /**
    * returns the address of the cell in the spreadsheet document.
    *
    * The {@link com.sun.star.table.CellAddress} can be used to address the cell within its document.
    */
  val CellAddress: typingsSlinky.activexLibreoffice.com_.sun.star.table.CellAddress = js.native
  
  /**
    * returns the address of the cell in the spreadsheet document.
    *
    * The {@link com.sun.star.table.CellAddress} can be used to address the cell within its document.
    */
  def getCellAddress(): typingsSlinky.activexLibreoffice.com_.sun.star.table.CellAddress = js.native
}
object XCellAddressable {
  
  @scala.inline
  def apply(
    CellAddress: CellAddress,
    acquire: () => Unit,
    getCellAddress: () => CellAddress,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCellAddressable = {
    val __obj = js.Dynamic.literal(CellAddress = CellAddress.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCellAddress = js.Any.fromFunction0(getCellAddress), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCellAddressable]
  }
  
  @scala.inline
  implicit class XCellAddressableMutableBuilder[Self <: XCellAddressable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellAddress(value: CellAddress): Self = StObject.set(x, "CellAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCellAddress(value: () => CellAddress): Self = StObject.set(x, "getCellAddress", js.Any.fromFunction0(value))
  }
}
