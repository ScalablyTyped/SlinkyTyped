package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a cell which can be addressed with a {@link com.sun.star.table.CellRangeAddress} . */
@js.native
trait XCellRangeAddressable extends XInterface {
  
  /**
    * returns the address of the cell range in the spreadsheet document.
    *
    * The {@link com.sun.star.table.CellRangeAddress} can be used to address the range within its document.
    */
  val RangeAddress: CellRangeAddress = js.native
  
  /**
    * returns the address of the cell range in the spreadsheet document.
    *
    * The {@link com.sun.star.table.CellRangeAddress} can be used to address the range within its document.
    */
  def getRangeAddress(): CellRangeAddress = js.native
}
object XCellRangeAddressable {
  
  @scala.inline
  def apply(
    RangeAddress: CellRangeAddress,
    acquire: () => Unit,
    getRangeAddress: () => CellRangeAddress,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCellRangeAddressable = {
    val __obj = js.Dynamic.literal(RangeAddress = RangeAddress.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getRangeAddress = js.Any.fromFunction0(getRangeAddress), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCellRangeAddressable]
  }
  
  @scala.inline
  implicit class XCellRangeAddressableMutableBuilder[Self <: XCellRangeAddressable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRangeAddress(value: () => CellRangeAddress): Self = StObject.set(x, "getRangeAddress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRangeAddress(value: CellRangeAddress): Self = StObject.set(x, "RangeAddress", value.asInstanceOf[js.Any])
  }
}
